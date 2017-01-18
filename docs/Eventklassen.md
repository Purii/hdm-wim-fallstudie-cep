# Eventklassen

## HelloFusion

Die HelloFusion-Klasse beinhaltet die main-Methode des Projektes. Diese wird demnach bei Programmstart ausgeführt. Zunächst werden die zu analysierenden Sätze in einen Array eingetragen.

```java
List<String> tokens1 = Arrays.asList("lets", "talk", "about", "current",  "activities", "concerning", "HighNet", "project");
List<String> tokens2 = Arrays.asList("Let's", "plan", "a", "meeting", "at", "16:00", "on", "next", "monday");
```
Diese Arrays werden zu einer Array-Liste zusammengefasst, sodass nur diese im weiteren Verlauf ausgelesen werden muss.
Die entstehende Liste wird an die Klasse TextRunner übergeben.

## TextRunner

Die Klasse TextRunner ordnet das Auslesen des Array-Liste an. 

```java
public void runAllTextArrays(KieSession kSession) {
		this.texts.stream().forEach(text -> {
			System.out.println("-----------");
			insertAndFireLifecycle(kSession, "start");
			text.stream().forEach(token -> { insertAndFire(kSession, token); });
			insertAndFireLifecycle(kSession, "end");
		});
	}
```

Die Methode insertAndFireLifecycle wird für jeden Array ausgelöst.

```java
private static void insertAndFireLifecycle(KieSession kSession, String token) {
		kSession.insert(new LifecycleEvent(token));
		kSession.fireAllRules();
	}
```
Dabei wird ein LifeCycleEvent kreiert, das jeweils einen Token enthält. Die Regeln werden nun durchgeführt (siehe hierzu die Dokumentation der Regeln).

## LifecycleEvent

Die Klasse ist eine Unterklasse der Klasse Event und übergibt dieser letztlich den Token.

```java
public LifecycleEvent(String token) {
		super(token);
	}
```

## Event

In der Event-Klasse kann ein neues Event instanziiert, ein Token gesetzt oder eingelesen werden.

## ComplexTokenEvent

In der ComplexTokenEvent-Klasse werden die globalen Variablen deklariert. 
Hierzu gehören Topics

```java
public static final String DRIVE = "google drive";
```

und Zeitbezüge

```java
public static final String DATERANGE_PREV = "previous";
```

Die Regeln können verschiedene Methoden der Klasse triggern. Beispielsweise das Hinzufügen eines Datums an die Ausgabe

```java
private String addDateToString(){		
		if(this.getRelatedToDate() == null)
			return "";
			
		return " on " + this.getRelatedToDate().toString();
	}
```

oder eines Topic

```java
private String addTopicsToString(){
		if(this.getTopics().isEmpty())
			return "";

		return String.join(", ", this.getTopics());
	}
``` 
Klassendiagramm 

![alt text](https://github.com/Purii/hdm-wim-fallstudie-cep/blob/master/docs/Kolo.png "")
