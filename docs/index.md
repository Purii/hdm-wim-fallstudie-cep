# hdm-wim-fallstudie-cep

*Hinweis: Bei diesem Projekt handelt es sich um ein Forschungsprojekt der Hochschule der Medien, Stuttgart.*


## Installation
Hinweise zur Installation der jeweiligen Implementierung befinden sich im entsprechenden Ordner:
*   [`Drools`](https://github.com/Purii/hdm-wim-fallstudie-cep/tree/master/drools/README.md)
*   [`Apache Flink`](https://github.com/itsBen/hdm-wim-fallstudie-cep-flink/blob/master/README.md)


### Klonen
Die Implementierung mit `Apache Flink` wurde in einem separaten GitHub Repository entwickelt.
Dieses separate Repository wurde deshalb als Git submodule dem Hauptrepository hinzugefügt.
Um das gesamte Projekt zu klonen muss deshalb folgender Befehl genutzt werden:

```sh
git clone --recursive git@github.com:Purii/hdm-wim-fallstudie-cep.git
// Bzw.
git clone --recursive https://github.com/Purii/hdm-wim-fallstudie-cep.git
```

## Dokumentation
*   [Eventklassen](Eventklassen.md)
*   [Definition von Regeln](Regeln.md)
*   [Lizenzen genutzter Abhängigkeiten](ThirdPartyLicenses.md)

### Gesprächsprotokolle
*   [24.10.2016](2016-10/Okt-24.md)
*   [07.11.2016](2016-11/Nov-07.md)
*   [05.12.2016](2016-12/Dez-05.md)
*   [12.12.2016](2016-12/Dez-12.md)
*   [19.12.2016](2016-12/Dez-19.md)
*   [21.12.2016](2016-12/Dez-21.md)
*   [09.01.2017](2017-01/Jan-09.md)
*   [10.01.2017](2017-01/Jan-10.md)
*   [12.01.2017](2017-01/Jan-12.md)
*   [16.01.2017](2017-01/Jan-16.md)

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
