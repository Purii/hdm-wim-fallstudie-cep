# hdm-wim-fallstudie-cep

*Hinweis: Bei diesem Projekt handelt es sich um ein Forschungsprojekt der Hochschule der Medien, Stuttgart.*


## Installation
Hinweise zur Installation der jeweiligen Implementierung befinden sich im entsprechenden Ordner:
* [`Drools`](https://github.com/Purii/hdm-wim-fallstudie-cep/tree/master/drools/README.md)

## Dokumentation
Die Dokumentation findet sich im Ordner [`docs`](https://github.com/Purii/hdm-wim-fallstudie-cep/tree/master/docs).


## Beschreibung der Fallstudie
Die Fallstudie hat die grundlegende Aufgabe Aussagen innerhalb eines Dialoges zu verstehen (siehe Aufgabenbeschreibung der Vorlesung). Die Aussagen werden dabei isoliert betrachtet. Ein grundlegendes Verständnis durch die Verknüpfung einzelner Aussagen findet nur bedingt statt.
Die Aussagen werden in Form einzelner Tokens empfangen und weiterverarbeitet.

### Beispiele

| Tokens als Array | Verständnis |
| :------------ | ---------------|
| "lets", "talk", "about", "current activities", "concerning", "HighNet", "project" | "Get projectdocuments restricted to project HighNet" |
| "ok", "shall", "we", "look", "at", "tasks", "leading","to", "milestone", "ahead" | "Get tasklist, next milestones restricted to project HighNet" |
| "that", "sounds", "great", "what", "about", "expenses", "do", "you", "think", "you", "will", "be", "able", "to", "stay", "whithin", "limits", "we", "aggreed", "upon", "last week" | "Get documents about expenses restricted to project HighNet" |
| "that", "should", "be", "no", "problem", "i", "will", "leave", "detailed", "report", "on", "google", "drive") | "Get Google drive restricted to project HighNet |


## Contribution
Als Teil des Projektes wird eine `editorconfig` bereit gestellt. Diese erleichtert eine einheitliche Formatierung des Quelltextes. So werden einheitlich Tabs, statt Spaces bevorzugt (siehe [`Java Code Conventions`](http://www.oracle.com/technetwork/java/javase/documentation/codeconventions-136091.html)). Viele Editoren verstehen die Anweisungen dieser Datei ohne Anpassungen. Für Eclipse wird jedoch das Plugin [`editorconfig-eclipse`](https://marketplace.eclipse.org/content/editorconfig-eclipse) benötigt.

## Links

* Recent Events vs. Recent Events with Tag: http://stackoverflow.com/questions/12090295/drools-get-the-3-most-recent-events
