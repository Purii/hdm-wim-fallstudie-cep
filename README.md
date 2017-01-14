# hdm-wim-fallstudie-cep

*Hinweis: Bei diesem Projekt handelt es sich um ein Forschungsprojekt der Hochschule der Medien, Stuttgart.*


## Installation
Hinweise zur Installation der jeweiligen Implementierung befinden sich im entsprechenden Ordner:
*   [`Drools`](https://github.com/Purii/hdm-wim-fallstudie-cep/tree/master/drools/README.md)

## Dokumentation
Die Dokumentation findet sich im Ordner [`docs`](https://github.com/Purii/hdm-wim-fallstudie-cep/tree/master/docs). Zusätzlich können die Dokumente auf der [Webseite](https://purii.github.io/hdm-wim-fallstudie-cep/) des Projektes eingesehen werden.


## Beschreibung der Fallstudie
Die Fallstudie hat die grundlegende Aufgabe Aussagen innerhalb eines Dialoges zu verstehen (siehe Aufgabenbeschreibung der Vorlesung). Die Aussagen werden dabei isoliert betrachtet. Ein grundlegendes Verständnis durch die Verknüpfung einzelner Aussagen findet nur bedingt statt.
Die Aussagen werden in Form einzelner Tokens empfangen und weiterverarbeitet.

### Beispiele
*Die Beispiele wurde in der entsprechenden Reihenfolge ausgeführt. So konnte die erstmalige Information zum entsprechenden Projekt für die weiteren Aussagen genutzt werden.*

**Tokens:** *"lets", "talk", "about", "current",  "activities", "concerning", "HighNet", "project"*

```json
  {
    "relatedToProject":"highnet",
    "topics":["projectdocuments"]
  }
```

 **Tokens:** *"ok", "shall", "we", "look", "at", "tasks", "leading","to", "milestone", "ahead"*

```json
  {
    "relatedToProject":"highnet",
    "topics":["tasklist","milestones"]
  }
```

**Tokens:** *"that", "should", "be", "no", "problem", "i", "will", "leave", "detailed", "report", "on", "google", "drive"*

```json
  {
    "relatedToProject":"highnet",
    "topics":["google drive"]
  }
```

**Tokens:** *"let", "me", "check", "my", "calendar", "how", "about", "next", "thursday", "at", "16", "hours", "your", "time"*

```json
  {
    "relatedToDate": {
        "year":2017,
        "month":1,
        "day":19
    },
    "relatedToProject":"highnet",
    "topics":["google calender"]
  }
```

**Tokens:** *"Let", "us", "make", "an", "appointment", "for", "next", "Monday", "at", "09", "am"*

```json
  {
    "relatedToDate": {
      "year":2017,
      "month":1,
      "day":16
    },
    "relatedToProject":"highnet",
    "relatedToTime": {
      "hour":9,
      "minute":0,
      "second":0,
      "nano":0
    },
    "topics":["google calender"]
  }
```


## Contribution
Als Teil des Projektes wird eine `editorconfig` bereit gestellt. Diese erleichtert eine einheitliche Formatierung des Quelltextes. So werden einheitlich Tabs, statt Spaces bevorzugt (siehe [`Java Code Conventions`](http://www.oracle.com/technetwork/java/javase/documentation/codeconventions-136091.html)). Viele Editoren verstehen die Anweisungen dieser Datei ohne Anpassungen. Für Eclipse wird jedoch das Plugin [`editorconfig-eclipse`](https://marketplace.eclipse.org/content/editorconfig-eclipse) benötigt.
