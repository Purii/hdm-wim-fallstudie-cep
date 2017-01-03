# hdm-wim-fallstudie-cep

*Hinweis: Bei diesem Projekt handelt es sich um ein Forschungsprojekt der Hochschule der Medien, Stuttgart.*

## Beschreibung der Fallstudie

*Beschreibung hinzufügen*


### Sätze
Die Anwendung hat die Aufgabe einzelne Sätze in Form einzelner Tokens zu verstehen.
Die interpretierte Information wird anschließend an die "semantische Repräsentation" weitergeleitet, um konkrete Dokumente anzufragen.

Folgende Sätze dienen dabei als repräsentative Beispiele:

* 

### Input / Assoziatives Array
Als Input wird ein assoziatives Array erwartet.

```javascript
{
	"Zeitangabe" => {"Dienstag", "nächsten Montag", "letzten Donnerstag", "12.12.2016"},
	"Projekt" => {"aktuelles Projekt", "HighNet", "Fortschritt"},
	"Teilnehmer" => {"ihr", "wir", "ich"},
	....
}
```

### Output / Anfrage "semantische Repräsentation"

* "Nächster Meilenstein für das Projekt HighNet"
* "Letztes Protokoll zu Projekt HighNet"
