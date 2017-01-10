# Business rules

## ComplexTokenEvent


## Einheitliches Vokabular
Bei der Definition der Regeln ist auf ein einheitliches Vokabular zu achten.
Aus diesem Grund können die Regeln zwei Kategorien zugeordnet werden. So existieren Regeln, welche einzelne Ausdrücke, welche aus mehreren Worten bestehen, zu einem einheitlichen Vokabular zusammenzufassen. Andere Regeln können anschließend auf diesem einheitlichen Vokabular aufbauen, um aus den einzelenen Tokens sinnvolle Informationen zu generieren.

### Ausdrücke aus mehreren Worten erkennen
Um zwei zusammenhängende Worte zu erkennen, wird auf den temporalen Operator `after` zurückgegriffen.
`$prevToken` definiert dabei den Token, welcher vorangestellt ist. `$nextToken``der daran Anschließende.

```java
rule "Translate separated Google Drive"
    when
    	// Vorangestellter Token
        $prevToken : Event(
        	token == "google"
        ) from window LastEvents // Nur innerhalb der letzten beiden Events
        // Anschießender Token
        $nextToken : Event(
       		token == "drive",
       		this after $prevToken // Tokenevent muss nach $prevToken fallen
        )
    then
    	// Das Event $prevToken entfernen, da dessen Bedeutung $nextToken hinzugefügt wird
    	retract($prevToken);
    	// $nextToken bearbeiten. `modify` weißt die Rules Engine auf die Änderung des Events hin und führt zum Aufruf der eigentlichen Verständnisregel (s.u.)
    	modify($nextToken) {
    		setToken(ComplexToken.DRIVE); // Ein einheitliches Vokabular durch den Einsatz von Variablen
    	}
end
```

```java
rule "Identify Google Drive"
	// Regel im direkten Anschluss nicht erneut ausführen
	no-loop
    when
        Event(
       		token == "drive"
       		|| token == "Google drive"
       		|| token == ComplexToken.DRIVE
        ) from window CurrentEvent // Nur aktuellstes Event betrachten
        // Nur aktuellsten und damit geltenden ComplexToken beachten
       	$complexTokenEvent : ComplexTokenEvent() from window LastComplexTokenEvent
    then
    	// ComplextokenEvent mit Informationen anreichern
    	modify($complexTokenEvent) {
    		addTopic(ComplexToken.DRIVE) // Ein einheitliches Vokabular durch den Einsatz von Variablen
    	}
end
```

## Einleitende Deklarationen
Bei der Definition der Regeln sind folgende Abschnitte notwendig.

### Rolle: Event
Zur Unterstützung von `windows` müssen die Events der Rolle `Event` zugewiesen sein.

```java
declare Event
	@role(event)
end
declare ComplexTokenEvent
	@role(event)
end
```

### Windows

Das Window `CurrentEvent` wird benötigt, um die Anwendung der Regeln auf das jeweils aktuelle Event zu beschränken. `LastEvents` wird für die Kombination zweier Tokens / Events benötigt, um ein einheitliches Vokabular zu ermöglichen. Das Window `LastComplexTokenEvent` ermöglicht es, auf das jeweils aktuelle `ComplexToken`-Event zuzugreifen.

```java
declare window CurrentEvent
	Event() over window:length(1)
end

declare window LastEvents
    Event() over window:length(2)
end

declare window LastComplexTokenEvent
    ComplexTokenEvent() over window:length(1)
end
```