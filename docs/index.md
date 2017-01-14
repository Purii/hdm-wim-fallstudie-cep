# hdm-wim-fallstudie-cep

*Hinweis: Bei diesem Projekt handelt es sich um ein Forschungsprojekt der Hochschule der Medien, Stuttgart.*


## Installation
Hinweise zur Installation der jeweiligen Implementierung befinden sich im entsprechenden Ordner:
*   [`Drools`](https://github.com/Purii/hdm-wim-fallstudie-cep/tree/master/drools/README.md)

## Dokumentation
*   [Eventklassen](/hdm-wim-fallstudie-cep/Eventklassen)
*   [Definition von Regeln](/hdm-wim-fallstudie-cep/Regeln)
*   [Lizenzen genutzter Abhängigkeiten](/hdm-wim-fallstudie-cep/ThirdPartyLicenses)


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
