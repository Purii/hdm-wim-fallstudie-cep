# hdm-wim-fallstudie-cep

*Hinweis: Bei diesem Projekt handelt es sich um ein Forschungsprojekt der Hochschule der Medien, Stuttgart.*

## Beschreibung der Fallstudie

*Beschreibung hinzufügen*


### Sätze
Die Anwendung hat die Aufgabe, Sätze in Form einzelner Tokens zu verstehen.
Die interpretierte Information kann anschließend an die "semantische Repräsentation" weitergeleitet werden, um konkrete Dokumente anzufragen.

### Output / Assoziatives Array
Das System soll folgende Inhalte erkennen und zur weiteren Verarbeitung ausgeben können.

```javascript
{
	"Zeitangabe" => {"Dienstag", "nächsten Montag", "letzten Donnerstag", "12.12.2016"},
	"Projekt" => {"aktuelles Projekt", "HighNet"},
	"Themen" => {"Meilenstein", "Projektdokument"},
	....
}
```

### Output / String

* "Aktueller Projektplan für Projekt HighNet"
* "Letztes Protokoll zu Projekt HighNet"



## Notes

* Recent Events vs. Recent Events with Tag: http://stackoverflow.com/questions/12090295/drools-get-the-3-most-recent-events