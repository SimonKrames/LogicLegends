package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionPool {
    private final List<Question> questions;
    private final Random random;

    public QuestionPool() {
        questions = new ArrayList<>();
        random = new Random();
        fillQuestions();
    }
// 550 Fragen aufgeteilt in folgende themen
// Java -40 Fragen (Sytax, Objektorientierung uvm)
// Kommunikation – 20 Fragen
// Projektmanagement – 20 Fragen
// Hardware (einfach) – 20 Fragen
// Hardware (mit Von-Neumann & PUI) – 20 Fragen
// Netzwerke  – 20 Fragen
// IT-Sicherheit – 20 Fragen
// WISO ohne ISO – 20 Fragen
// WISO mit ISO – 20 Fragen
// Betriebssysteme – 10 Fragen
// Virtualisierung – 10 Fragen
// Programmierung & Softwareentwicklung – 20 Fragen
// Software-Architektur & Design – 20 Fragen
// Testen & Qualitätssicherung – 20 Fragen
// Datenbanken & Datenzugriff – 20 Fragen
// Webentwicklung Frontend – 20 Fragen
// Webentwicklung Backend – 20 Fragen
// Versionsverwaltung & Build-Tools – 10 Fragen
// Entwicklungstools & IDEs – 10 Fragen
// App-Entwicklung – 10 Fragen
// Theoretische Grundlagen – 20 Fragen
// SQL Syntax – 40 Fragen
// Mathematik – 30 Fragen
// Nein-Fragen (alle Antworten falsch) – 20 Fragen
// Scherzfragen / lustige Fragen – 20 Fragen

    private void fillQuestions() {
//------------Scherzfragen
        questions.add(new Question("Wie viele Programmierer braucht man, um eine Glühbirne zu wechseln?",
                List.of(
                        new Answer("Keinen – das ist ein Hardware-Problem.", false),
                        new Answer("Nur einen – aber er schreibt vorher 400 Unit-Tests.", false),
                        new Answer("Zwei – einer wechselt, einer debuggt das Licht.", false),
                        new Answer("Einen – wenn er StackOverflow fragen darf.", false)
                )));

        questions.add(new Question("Was macht ein Informatiker, wenn die Mikrowelle kaputt ist?",
                List.of(
                        new Answer("Er öffnet die Konsole.", false),
                        new Answer("Er rebootet sie.", false),
                        new Answer("Er kompiliert den Toast neu.", false),
                        new Answer("Er schreibt ein Bash-Skript für Pizza.", false)
                )));

        questions.add(new Question("Ich habe mein Passwort in 'warnichtkorrekt' geändert. Warum?",
                List.of(
                        new Answer("Weil der Computer mir sagt, was es ist, wenn ich es falsch eingebe.", false),
                        new Answer("Weil ich Ironie liebe.", false),
                        new Answer("Weil das jeder Hacker erwartet.", false),
                        new Answer("Weil ich das Passwort nie vergesse, nur falsch schreibe.", false)
                )));

        questions.add(new Question("Was ist die Lieblingsbeschäftigung von Bits?",
                List.of(
                        new Answer("Busfahren.", false),
                        new Answer("Mit Bytes kuscheln.", false),
                        new Answer("Sich gegenseitig flippen.", false),
                        new Answer("Sich in Nullen verwandeln.", false)
                )));

        questions.add(new Question("Warum klebt auf Intel-PCs 'Intel inside'?",
                List.of(
                        new Answer("Ein Warnhinweis ist nötig.", false),
                        new Answer("Weil sonst keiner weiß, wo’s klappert.", false),
                        new Answer("Damit man weiß, was abstürzt.", false),
                        new Answer("Weil AMD draußen bleiben muss.", false)
                )));

        questions.add(new Question("Was bedeutet BIOS?",
                List.of(
                        new Answer("Blondes Input Output System.", false),
                        new Answer("Bin ich ohne Sinn.", false),
                        new Answer("Bestimmte Instabilität ohne Schutz.", false),
                        new Answer("Bringt immerhin Optionen, selten stabil.", false)
                )));

        questions.add(new Question("Warum trinken Informatiker keinen Kaffee?",
                List.of(
                        new Answer("Weil 'JAVA' traumatische Erinnerungen triggert.", false),
                        new Answer("Weil sie lieber Exceptions trinken.", false),
                        new Answer("Weil sie XML schon bitter genug finden.", false),
                        new Answer("Weil sie mit NullPointer aufwachen.", false)
                )));

        questions.add(new Question("Was bedeutet 'www' eigentlich?",
                List.of(
                        new Answer("Weltweites Warten.", false),
                        new Answer("Warteschleife wird weitergeleitet.", false),
                        new Answer("Warten während Webseiten laden.", false),
                        new Answer("WLAN Wird Wunderbar.", false)
                )));

        questions.add(new Question("Was antwortet ein Programmierer auf 'Bis später'?",
                List.of(
                        new Answer("'Ich bleib in der while-Schleife.'", false),
                        new Answer("'return null;'", false),
                        new Answer("'Ich bleib in der Instanz.'", false),
                        new Answer("'Ich bin nur garbage collected, nicht weg.'", false)
                )));

        questions.add(new Question("Wieso sagen Programmierer ungern 'Ich liebe dich'?",
                List.of(
                        new Answer("Weil sie lieber Boolean-Ausdrücke verwenden.", false),
                        new Answer("Weil 'true' schon vergeben ist.", false),
                        new Answer("Weil Strings zu emotional sind.", false),
                        new Answer("Weil sie lieber mit Klammern kuscheln.", false)
                )));

        questions.add(new Question("Was ist der Unterschied zwischen einem Informatiker und einem Physiker?",
                List.of(
                        new Answer("Der Physiker glaubt, 1 KB = 1000 Byte.", false),
                        new Answer("Der Informatiker misst Kilometer in 1024 Metern.", false),
                        new Answer("Beide streiten sich beim Ausdruck.", false),
                        new Answer("Nur der Informatiker versteht den Witz.", false)
                )));

        questions.add(new Question("Was ist die häufigste Ausrede bei einem IT-Fehler?",
                List.of(
                        new Answer("Bei mir ging's noch!", false),
                        new Answer("Das liegt am Benutzer.", false),
                        new Answer("Ist bestimmt ein Layer-8-Problem.", false),
                        new Answer("War wahrscheinlich ein kosmischer Strahl.", false)
                )));

        questions.add(new Question("Warum haben Tastaturen F-Tasten?",
                List.of(
                        new Answer("Damit Entwickler sich überlegen fühlen.", false),
                        new Answer("Zum Verwirren der Anwender.", false),
                        new Answer("Damit Excel sich lebendig anfühlt.", false),
                        new Answer("Weil 1–12 cooler klingt als A–L.", false)
                )));

        questions.add(new Question("Warum nutzen Hacker keine Taschenrechner?",
                List.of(
                        new Answer("Weil sie Binär atmen.", false),
                        new Answer("Weil sie Hex im Kopf rechnen.", false),
                        new Answer("Weil sie lieber mit SHIFT arbeiten.", false),
                        new Answer("Weil Taschenrechner kein Root-Recht haben.", false)
                )));

        questions.add(new Question("Warum wurde der Informatiker verhaftet?",
                List.of(
                        new Answer("Er hat ein Bit geschlagen.", false),
                        new Answer("Er hat in der Cloud geraucht.", false),
                        new Answer("Er hat eine Exception gefangen.", false),
                        new Answer("Er hat einen Stack überflutet.", false)
                )));

        questions.add(new Question("Was passiert, wenn man in Excel 'SELECT * FROM leben;' eingibt?",
                List.of(
                        new Answer("Man weint.", false),
                        new Answer("Excel stürzt mit Stil ab.", false),
                        new Answer("Man wird Consultant.", false),
                        new Answer("Clippy meldet sich zurück.", false)
                )));

        questions.add(new Question("Warum nutzen Informatiker keine Kalendereinträge?",
                List.of(
                        new Answer("Sie leben im Cache.", false),
                        new Answer("Termine sind nicht thread-safe.", false),
                        new Answer("Weil sie lieber Deadlines überschreiben.", false),
                        new Answer("Weil sie auf Java-Zeit leben.", false)
                )));

        questions.add(new Question("Was passiert, wenn du einem Informatiker ein Date gibst?",
                List.of(
                        new Answer("Er parst es.", false),
                        new Answer("Er gibt dir 'undefined'.", false),
                        new Answer("Er castet es zu String.", false),
                        new Answer("Er debuggt die Situation.", false)
                )));

        questions.add(new Question("Was passiert, wenn ein Entwickler ein Burnout hat?",
                List.of(
                        new Answer("Er wird recycelt.", false),
                        new Answer("Er merged mit der Couch.", false),
                        new Answer("Er bekommt ein Timeout.", false),
                        new Answer("Er macht ein Fork von sich selbst.", false)
                )));

        questions.add(new Question("Warum brauchen Mainframes keinen Kaffee?",
                List.of(
                        new Answer("Weil sie COBOL sprechen.", false),
                        new Answer("Weil sie eh nicht schlafen.", false),
                        new Answer("Weil sie nur Strom saufen.", false),
                        new Answer("Weil sie längst im Museum wohnen.", false)
                )));

//------------IMMER False
        questions.add(new Question("Ist JavaScript das gleiche wie Java?",
                List.of(
                        new Answer("Ja, sie sind identisch", false),
                        new Answer("JavaScript basiert auf Java", false),
                        new Answer("Beide verwenden denselben Compiler", false),
                        new Answer("JavaScript ist eine Java-Bibliothek", false)
                )));

        questions.add(new Question("Kann ein Computer ohne Strom funktionieren?",
                List.of(
                        new Answer("Ja, wenn er geladen ist", false),
                        new Answer("Mit Solar geht's immer", false),
                        new Answer("Im Ruhezustand ja", false),
                        new Answer("Nur mit BIOS-Energie", false)
                )));

        questions.add(new Question("Ist 0b1010 gleich 0xF?",
                List.of(
                        new Answer("Ja, beide sind gleich", false),
                        new Answer("0xF ist 10 im Binärsystem", false),
                        new Answer("Binärzahlen sind immer hexadezimal", false),
                        new Answer("F steht für 5 im Binärsystem", false)
                )));

        questions.add(new Question("Heißt das `main()`-Argument in Java immer `String... alles`?",
                List.of(
                        new Answer("Ja, das ist Pflicht", false),
                        new Answer("Java verlangt den Namen `alles`", false),
                        new Answer("`String...` steht für eine Zahl", false),
                        new Answer("`main` darf keine Argumente haben", false)
                )));

        questions.add(new Question("Hat ein IPv4-Netz 999 Adressen?",
                List.of(
                        new Answer("Ja, bei einem /24", false),
                        new Answer("999 ist eine Sonderadresse", false),
                        new Answer("IPv4 geht bis 999.999.999.999", false),
                        new Answer("Nur mit NAT möglich", false)
                )));

        questions.add(new Question("Ist RAM dauerhaft gespeichert?",
                List.of(
                        new Answer("Ja, auch nach dem Ausschalten", false),
                        new Answer("RAM ist wie Festplattenspeicher", false),
                        new Answer("RAM verliert nur Daten bei Hitze", false),
                        new Answer("RAM speichert nur Textdateien", false)
                )));

        questions.add(new Question("Kann man mit `SELECT * DELETE` Daten löschen?",
                List.of(
                        new Answer("Ja, das geht schneller", false),
                        new Answer("Nur mit MySQL", false),
                        new Answer("SQL kombiniert beide", false),
                        new Answer("Das ist ein Spezialbefehl", false)
                )));

        questions.add(new Question("Hat ein Switch standardmäßig eine IP-Adresse?",
                List.of(
                        new Answer("Ja, wie ein PC", false),
                        new Answer("Jeder Switch ist ein DHCP-Server", false),
                        new Answer("Switches haben MAC-Adressen als IP", false),
                        new Answer("IP ist bei Layer 2 Pflicht", false)
                )));

        questions.add(new Question("Kann man mit Paint.exe Programmcode schreiben?",
                List.of(
                        new Answer("Ja, im HEX-Modus", false),
                        new Answer("Paint hat ein Terminal versteckt", false),
                        new Answer("Nur mit Plugins", false),
                        new Answer("Paint speichert automatisch als .java", false)
                )));

        questions.add(new Question("Kann man mit einer SSD Kaffee kochen?",
                List.of(
                        new Answer("Ja, wenn sie heiß genug wird", false),
                        new Answer("Nur mit USB-Heizer", false),
                        new Answer("SSD steht für Super Steam Device", false),
                        new Answer("Bei 5V USB-Strom reicht das", false)
                )));

        questions.add(new Question("Ist ein Byte größer als ein Terabyte?",
                List.of(
                        new Answer("Ja, Byte ist die Oberklasse", false),
                        new Answer("Terabyte ist ein alter Begriff", false),
                        new Answer("Byte ist mehr wegen den Nachkommastellen", false),
                        new Answer("Beide sind gleich", false)
                )));

        questions.add(new Question("Ist ein Screenshot ein physischer Ausdruck?",
                List.of(
                        new Answer("Ja, wenn er groß genug ist", false),
                        new Answer("Screenshots entstehen auf Papier", false),
                        new Answer("Nur mit Laserdrucker", false),
                        new Answer("Nur in 300 dpi", false)
                )));

        questions.add(new Question("Ist HTML eine Programmiersprache?",
                List.of(
                        new Answer("Ja, wegen der Tags", false),
                        new Answer("HTML führt Code aus", false),
                        new Answer("HTML kann Funktionen berechnen", false),
                        new Answer("HTML ist wie Python", false)
                )));

        questions.add(new Question("Kann man mit einem USB-Stick den RAM erweitern?",
                List.of(
                        new Answer("Ja, das ist Standard", false),
                        new Answer("USB ist gleich RAM", false),
                        new Answer("Einfach reinstecken = mehr Speicher", false),
                        new Answer("Ab 64 GB funktioniert das automatisch", false)
                )));

        questions.add(new Question("Kann man ohne Monitor programmieren?",
                List.of(
                        new Answer("Ja, mit geschlossenen Augen", false),
                        new Answer("Nur per Spracheingabe", false),
                        new Answer("Der Compiler spricht das Ergebnis", false),
                        new Answer("Man fühlt den Code im Takt", false)
                )));

        questions.add(new Question("Ist ein LAN-Kabel für WLAN notwendig?",
                List.of(
                        new Answer("Ja, sonst kein WLAN", false),
                        new Answer("LAN = Wireless Access Network", false),
                        new Answer("Nur für Geschwindigkeit", false),
                        new Answer("WLAN funktioniert nur mit Kabel", false)
                )));

        questions.add(new Question("Hat eine MAC-Adresse einen Vornamen?",
                List.of(
                        new Answer("Ja, meistens von Apple", false),
                        new Answer("MAC steht für Max-Adresse", false),
                        new Answer("Die Adresse beginnt mit dem Namen", false),
                        new Answer("MAC = Mein Aktueller Code", false)
                )));

        questions.add(new Question("Ist `while` in Java eine Farbe?",
                List.of(
                        new Answer("Ja, steht für Weiß", false),
                        new Answer("Nur in Themes sichtbar", false),
                        new Answer("In der GUI-Programmierung schon", false),
                        new Answer("`while` ist für Design gedacht", false)
                )));

        questions.add(new Question("Kann man CSS auf einer Festplatte speichern?",
                List.of(
                        new Answer("Nein, CSS lebt nur im Browser", false),
                        new Answer("CSS ist flüchtig wie RAM", false),
                        new Answer("CSS braucht eigene Hardware", false),
                        new Answer("Festplatten erkennen CSS nicht", false)
                )));

        questions.add(new Question("Ist `print()` in Java gültig ohne Kontext?",
                List.of(
                        new Answer("Ja, Java erkennt das global", false),
                        new Answer("`print()` funktioniert wie `println()`", false),
                        new Answer("`print()` gibt es in jeder Sprache", false),
                        new Answer("`print()` ist das Hauptprogramm", false)
                )));

//------------Mathematik (für Fachinformatiker – einfach & praxisnah)
        questions.add(new Question("Ein Produkt kostet 80 € netto. Wie viel sind das brutto bei 19 % MwSt?",
                List.of(
                        new Answer("95,20 €", false),
                        new Answer("96,80 €", true),
                        new Answer("98,80 €", false),
                        new Answer("100,00 €", false)
                )));

        questions.add(new Question("Ein PC verbraucht 200 W und läuft 5 Stunden. Wie viel kWh verbraucht er?",
                List.of(
                        new Answer("1 kWh", true),
                        new Answer("0,5 kWh", false),
                        new Answer("2 kWh", false),
                        new Answer("10 kWh", false)
                )));

        questions.add(new Question("Ein Netzteil liefert 12 V bei 2 A. Wie viel Watt?",
                List.of(
                        new Answer("24 W", true),
                        new Answer("14 W", false),
                        new Answer("10 W", false),
                        new Answer("28 W", false)
                )));

        questions.add(new Question("Ein Artikel kostet 150 €. 10 % Rabatt. Was ist der Endpreis?",
                List.of(
                        new Answer("135 €", true),
                        new Answer("140 €", false),
                        new Answer("145 €", false),
                        new Answer("130 €", false)
                )));

        questions.add(new Question("1 GiB sind wie viele MiB?",
                List.of(
                        new Answer("1024 MiB", true),
                        new Answer("1000 MiB", false),
                        new Answer("512 MiB", false),
                        new Answer("2048 MiB", false)
                )));

        questions.add(new Question("Wie viele Kombinationen bei 4 Bit?",
                List.of(
                        new Answer("16", true),
                        new Answer("8", false),
                        new Answer("32", false),
                        new Answer("4", false)
                )));

        questions.add(new Question("Eine Datei hat 800 MB. Mit 8 MB/s – wie lange dauert der Download?",
                List.of(
                        new Answer("100 Sekunden", true),
                        new Answer("80 Sekunden", false),
                        new Answer("60 Sekunden", false),
                        new Answer("10 Sekunden", false)
                )));

        questions.add(new Question("Wie viele IPv4-Adressen in einem /24-Netz?",
                List.of(
                        new Answer("256", true),
                        new Answer("254", true),
                        new Answer("128", false),
                        new Answer("512", false)
                )));

        questions.add(new Question("Was ergibt 0b1010 + 0b0001?",
                List.of(
                        new Answer("0b1011", true),
                        new Answer("0b1111", false),
                        new Answer("0b1001", false),
                        new Answer("0b1100", false)
                )));

        questions.add(new Question("Ein Switch hat 5 Ports. Jeder benötigt 1 Gbit/s. Gesamtdurchsatz?",
                List.of(
                        new Answer("5 Gbit/s", true),
                        new Answer("500 Mbit/s", false),
                        new Answer("10 Gbit/s", false),
                        new Answer("1 Gbit/s", false)
                )));

        questions.add(new Question("Ein Gerät kostet 400 €, der Gewinnaufschlag beträgt 25 %. Verkaufspreis?",
                List.of(
                        new Answer("500 €", true),
                        new Answer("475 €", false),
                        new Answer("525 €", false),
                        new Answer("450 €", false)
                )));

        questions.add(new Question("Wieviel sind 20 % von 300 €?",
                List.of(
                        new Answer("60 €", true),
                        new Answer("30 €", false),
                        new Answer("90 €", false),
                        new Answer("75 €", false)
                )));

        questions.add(new Question("1 GHz sind wie viele MHz?",
                List.of(
                        new Answer("1000 MHz", true),
                        new Answer("1024 MHz", false),
                        new Answer("100 MHz", false),
                        new Answer("1 MHz", false)
                )));

        questions.add(new Question("Wie viel Byte sind 4 KiB?",
                List.of(
                        new Answer("4096 Byte", true),
                        new Answer("4000 Byte", false),
                        new Answer("1024 Byte", false),
                        new Answer("8192 Byte", false)
                )));

        questions.add(new Question("Was ergibt 2² × 4?",
                List.of(
                        new Answer("16", true),
                        new Answer("8", false),
                        new Answer("12", false),
                        new Answer("4", false)
                )));

        questions.add(new Question("Wenn ein Algorithmus O(n²) hat und n = 5, wie viele Schritte?",
                List.of(
                        new Answer("25", true),
                        new Answer("10", false),
                        new Answer("5", false),
                        new Answer("15", false)
                )));

        questions.add(new Question("Ein Monitor hat 1920×1080 Pixel. Wie viele Pixel insgesamt?",
                List.of(
                        new Answer("2.073.600", true),
                        new Answer("1.080.000", false),
                        new Answer("1.920.000", false),
                        new Answer("2.000.000", false)
                )));

        questions.add(new Question("Ein Rechner braucht 0,5 Sekunden für 1 Anfrage. Wie viele schafft er pro Minute?",
                List.of(
                        new Answer("120", true),
                        new Answer("60", false),
                        new Answer("30", false),
                        new Answer("180", false)
                )));

        questions.add(new Question("1000 Mbit/s sind wie viele MB/s (theoretisch)?",
                List.of(
                        new Answer("125 MB/s", true),
                        new Answer("100 MB/s", false),
                        new Answer("250 MB/s", false),
                        new Answer("1 MB/s", false)
                )));

        questions.add(new Question("Wie viele Werte kann ein Byte darstellen?",
                List.of(
                        new Answer("256", true),
                        new Answer("128", false),
                        new Answer("512", false),
                        new Answer("255", false)
                )));

        questions.add(new Question("Wenn 1 Bit für „an/aus“ steht: Wie viele Zustände mit 3 Bit?",
                List.of(
                        new Answer("8", true),
                        new Answer("6", false),
                        new Answer("4", false),
                        new Answer("2", false)
                )));

        questions.add(new Question("Ein Prozessor hat 4 Kerne mit je 2 GHz. Gesamtleistung in GHz?",
                List.of(
                        new Answer("8 GHz", true),
                        new Answer("4 GHz", false),
                        new Answer("2 GHz", false),
                        new Answer("16 GHz", false)
                )));

        questions.add(new Question("Was ist 0xA in Dezimal?",
                List.of(
                        new Answer("10", true),
                        new Answer("11", false),
                        new Answer("12", false),
                        new Answer("9", false)
                )));

        questions.add(new Question("Ein Server verbraucht 600 W. 10 Stunden Laufzeit. Verbrauch?",
                List.of(
                        new Answer("6 kWh", true),
                        new Answer("60 kWh", false),
                        new Answer("0,6 kWh", false),
                        new Answer("10 kWh", false)
                )));

        questions.add(new Question("Ein Produkt kostet 120 €, 19 % MwSt. Wie hoch ist der Steueranteil?",
                List.of(
                        new Answer("19 €", false),
                        new Answer("22,90 €", true),
                        new Answer("24 €", false),
                        new Answer("18,50 €", false)
                )));

        questions.add(new Question("Wie viel % sind 25 von 200?",
                List.of(
                        new Answer("12,5 %", true),
                        new Answer("10 %", false),
                        new Answer("15 %", false),
                        new Answer("20 %", false)
                )));

        questions.add(new Question("Du sendest 1,5 GB über 10 Mbit/s. Wie lange dauert es ungefähr?",
                List.of(
                        new Answer("20 Minuten", true),
                        new Answer("10 Minuten", false),
                        new Answer("5 Minuten", false),
                        new Answer("30 Minuten", false)
                )));

        questions.add(new Question("Ein Gerät kostet 300 €, nach 2 Jahren nur noch 180 €. Wie viel Wertverlust in %?",
                List.of(
                        new Answer("40 %", false),
                        new Answer("60 %", true),
                        new Answer("50 %", false),
                        new Answer("20 %", false)
                )));

        questions.add(new Question("Was ist 2⁵?",
                List.of(
                        new Answer("32", true),
                        new Answer("16", false),
                        new Answer("64", false),
                        new Answer("25", false)
                )));

        questions.add(new Question("Wie viele Adressen hat ein /30-Netz?",
                List.of(
                        new Answer("4", true),
                        new Answer("2", true),
                        new Answer("8", false),
                        new Answer("6", false)
                )));

        questions.add(new Question("Du hast 3 Geräte mit je 4 GB RAM. Wie viel insgesamt?",
                List.of(
                        new Answer("12 GB", true),
                        new Answer("8 GB", false),
                        new Answer("16 GB", false),
                        new Answer("10 GB", false)
                )));

//------------Datenbanken & Datenzugriff
        questions.add(new Question("Was ist ein primäres Merkmal relationaler Datenbanken?",
                List.of(
                        new Answer("Daten werden in Tabellen organisiert", true),
                        new Answer("Verzicht auf feste Strukturen", false),
                        new Answer("Beziehungen zwischen Tabellen sind möglich", true),
                        new Answer("Datensätze sind nur als JSON gespeichert", false)
                )));

        questions.add(new Question("Welche Datenbanksysteme sind relational?",
                List.of(
                        new Answer("MySQL", true),
                        new Answer("PostgreSQL", true),
                        new Answer("MongoDB", false),
                        new Answer("Oracle DB", true)
                )));

        questions.add(new Question("Was ist SQL?",
                List.of(
                        new Answer("Structured Query Language", true),
                        new Answer("Eine Sprache zur Beschreibung von Webseiten", false),
                        new Answer("Dient zur Abfrage und Manipulation von Daten", true),
                        new Answer("Ein ORM-Framework", false)
                )));

        questions.add(new Question("Welche Operationen gehören zu CRUD?",
                List.of(
                        new Answer("Create", true),
                        new Answer("Read", true),
                        new Answer("Update", true),
                        new Answer("Drop", false)
                )));

        questions.add(new Question("Was ist eine NoSQL-Datenbank?",
                List.of(
                        new Answer("Nicht-relationales Datenbanksystem", true),
                        new Answer("Verwendet meist JSON oder Key-Value-Formate", true),
                        new Answer("Unterstützt SQL-Abfragen nativ", false),
                        new Answer("Skaliert gut bei großen Datenmengen", true)
                )));

        questions.add(new Question("Welche dieser Systeme sind NoSQL-Datenbanken?",
                List.of(
                        new Answer("MongoDB", true),
                        new Answer("Redis", true),
                        new Answer("Firebase Realtime DB", true),
                        new Answer("PostgreSQL", false)
                )));

        questions.add(new Question("Was zeigt ein ER-Diagramm?",
                List.of(
                        new Answer("Beziehungen zwischen Entitäten", true),
                        new Answer("Ablauf von Programmen", false),
                        new Answer("Datenbankstruktur in grafischer Form", true),
                        new Answer("Modulbeziehungen im Quellcode", false)
                )));

        questions.add(new Question("Was beschreibt die 1. Normalform (1NF)?",
                List.of(
                        new Answer("Jedes Attribut enthält nur atomare Werte", true),
                        new Answer("Daten sind vollständig normalisiert", false),
                        new Answer("Wiederholende Gruppen sind erlaubt", false),
                        new Answer("Keine Mehrfachwerte in einem Feld", true)
                )));

        questions.add(new Question("Welche Aussagen zur 3. Normalform (3NF) sind korrekt?",
                List.of(
                        new Answer("Keine transitiven Abhängigkeiten", true),
                        new Answer("Nur funktionale Abhängigkeiten vom Primärschlüssel", true),
                        new Answer("Nur Schlüsselwerte dürfen mehrfach vorkommen", false),
                        new Answer("Verbessert Datenkonsistenz", true)
                )));

        questions.add(new Question("Was bedeutet ACID im Kontext von Transaktionen?",
                List.of(
                        new Answer("Atomicity", true),
                        new Answer("Consistency", true),
                        new Answer("Isolation", true),
                        new Answer("Durability", true)
                )));

        questions.add(new Question("Was bedeutet 'Atomicity' bei Datenbanktransaktionen?",
                List.of(
                        new Answer("Alles oder nichts wird ausgeführt", true),
                        new Answer("Teiltransaktionen bleiben bestehen", false),
                        new Answer("Fehlschläge führen zum Rollback", true),
                        new Answer("Transaktionen können unterbrochen werden", false)
                )));

        questions.add(new Question("Welche Aussage zu 'Isolation' ist korrekt?",
                List.of(
                        new Answer("Transaktionen beeinflussen sich gegenseitig nicht", true),
                        new Answer("Daten dürfen von anderen Transaktionen verändert werden", false),
                        new Answer("Erhöht Datenkonsistenz", true),
                        new Answer("Reduziert Rollback-Risiken", true)
                )));

        questions.add(new Question("Was macht JDBC in Java?",
                List.of(
                        new Answer("Ermöglicht Datenbankzugriffe mit SQL", true),
                        new Answer("Bietet objektorientierte Abfragen", false),
                        new Answer("Ist eine Schnittstelle zu relationalen DBs", true),
                        new Answer("Steuert grafische Benutzeroberflächen", false)
                )));

        questions.add(new Question("Was ist ein ORM (Object-Relational Mapping)?",
                List.of(
                        new Answer("Abbildung von Klassen auf Datenbanktabellen", true),
                        new Answer("Verbindet objektorientierten Code mit relationalen Daten", true),
                        new Answer("Ersetzt vollständig alle SQL-Anweisungen", false),
                        new Answer("Hibernate ist ein Beispiel dafür", true)
                )));

        questions.add(new Question("Was sind Vorteile von JPA/Hibernate?",
                List.of(
                        new Answer("Automatische Objekt-Persistenz", true),
                        new Answer("Datenbankabfragen direkt im Java-Code", true),
                        new Answer("Vollständiger Verzicht auf Datenbankmodelle", false),
                        new Answer("Transaktionsmanagement", true)
                )));

        questions.add(new Question("Was sind Nachteile bei unsauberer Normalisierung?",
                List.of(
                        new Answer("Redundante Daten", true),
                        new Answer("Dateninkonsistenz", true),
                        new Answer("Bessere Performance", false),
                        new Answer("Komplizierte Wartung", true)
                )));

        questions.add(new Question("Was passiert bei einem Rollback?",
                List.of(
                        new Answer("Die Transaktion wird rückgängig gemacht", true),
                        new Answer("Die Änderungen bleiben bestehen", false),
                        new Answer("Alle betroffenen Tabellen werden gelöscht", false),
                        new Answer("Zustand vor Beginn der Transaktion wird wiederhergestellt", true)
                )));

        questions.add(new Question("Was ist ein Fremdschlüssel?",
                List.of(
                        new Answer("Verweis auf einen Primärschlüssel einer anderen Tabelle", true),
                        new Answer("Macht eine Spalte zum Index", false),
                        new Answer("Ermöglicht Beziehungen zwischen Tabellen", true),
                        new Answer("Wird zur eindeutigen Identifikation in derselben Tabelle verwendet", false)
                )));

        questions.add(new Question("Welche SQL-Befehle gehören zur Datenmanipulation (DML)?",
                List.of(
                        new Answer("INSERT", true),
                        new Answer("UPDATE", true),
                        new Answer("DELETE", true),
                        new Answer("CREATE", false)
                )));

        questions.add(new Question("Was ist ein Statement in JDBC?",
                List.of(
                        new Answer("Ein Objekt zur Ausführung von SQL-Befehlen", true),
                        new Answer("Ein Wrapper für Tabellen", false),
                        new Answer("Wird über Connection erzeugt", true),
                        new Answer("Ermöglicht Abfragen und Änderungen in der DB", true)
                )));
//------------Frontend: HTML, CSS, JS, Frameworks, DOM, UX
        questions.add(new Question("Was ist ein typisches Merkmal von HTML5?",
                List.of(
                        new Answer("<section>, <article> und <nav> sind neue Tags", true),
                        new Answer("Es ersetzt JavaScript", false),
                        new Answer("Es bietet native Video- und Audioeinbindung", true),
                        new Answer("HTML5 ist rein serverseitig", false)
                )));

        questions.add(new Question("Was ist CSS?",
                List.of(
                        new Answer("Eine Sprache zur Gestaltung von Webseiten", true),
                        new Answer("Ein Datenbankprotokoll", false),
                        new Answer("Cascading Style Sheets", true),
                        new Answer("Wird direkt im Browser interpretiert", true)
                )));

        questions.add(new Question("Welche Aussagen zu JavaScript sind korrekt?",
                List.of(
                        new Answer("Wird clientseitig im Browser ausgeführt", true),
                        new Answer("Ist eine objektorientierte Sprache", true),
                        new Answer("Kann HTML-Dokumente verändern", true),
                        new Answer("Ersetzt vollständig HTML", false)
                )));

        questions.add(new Question("Was versteht man unter Responsive Design?",
                List.of(
                        new Answer("Anpassung an verschiedene Bildschirmgrößen", true),
                        new Answer("Funktioniert nur auf Desktops", false),
                        new Answer("Verwendet oft Media Queries", true),
                        new Answer("Sorgt für bessere Bedienbarkeit", true)
                )));

        questions.add(new Question("Was beschreibt UX?",
                List.of(
                        new Answer("User Experience", true),
                        new Answer("Fokus auf Benutzererlebnis", true),
                        new Answer("Wird nur bei Desktop-Anwendungen verwendet", false),
                        new Answer("Ziel ist eine intuitive Nutzung", true)
                )));

        questions.add(new Question("Welche JavaScript-Frameworks gibt es?",
                List.of(
                        new Answer("React", true),
                        new Answer("Angular", true),
                        new Answer("Vue.js", true),
                        new Answer("Bootstrap", false)
                )));

        questions.add(new Question("Welche Aussage zu React ist korrekt?",
                List.of(
                        new Answer("Verwendet JSX zur Beschreibung von Komponenten", true),
                        new Answer("Ist ein CSS-Framework", false),
                        new Answer("Basiert auf Komponentenstruktur", true),
                        new Answer("Wird oft für SPAs genutzt", true)
                )));

        questions.add(new Question("Was ist Angular?",
                List.of(
                        new Answer("Ein Frontend-Framework von Google", true),
                        new Answer("Verwendet TypeScript", true),
                        new Answer("Funktioniert nur mit PHP", false),
                        new Answer("Eignet sich für große Webanwendungen", true)
                )));

        questions.add(new Question("Was ist DOM in der Webentwicklung?",
                List.of(
                        new Answer("Document Object Model", true),
                        new Answer("Strukturierte Darstellung des HTML-Dokuments", true),
                        new Answer("Verzeichnisstruktur auf dem Server", false),
                        new Answer("Wird durch JavaScript manipulierbar", true)
                )));

        questions.add(new Question("Was ist Event Handling in JavaScript?",
                List.of(
                        new Answer("Reaktion auf Benutzeraktionen wie Klicks", true),
                        new Answer("Bezieht sich nur auf Formulare", false),
                        new Answer("Wird oft mit addEventListener() realisiert", true),
                        new Answer("Ist Teil des DOM-Manipulationsprozesses", true)
                )));

        questions.add(new Question("Was ist ein CSS Flexbox-Modell?",
                List.of(
                        new Answer("Ein Layout-Modell für flexible Container", true),
                        new Answer("Ermöglicht vertikale und horizontale Ausrichtung", true),
                        new Answer("Wird mit display: block aktiviert", false),
                        new Answer("Ersetzt Tabellenlayouts", true)
                )));

        questions.add(new Question("Was ist eine Single Page Application (SPA)?",
                List.of(
                        new Answer("Die Seite lädt Inhalte dynamisch per JavaScript", true),
                        new Answer("Die gesamte Seite wird bei jedem Klick neu geladen", false),
                        new Answer("React oder Angular werden oft dafür verwendet", true),
                        new Answer("Ist auf eine einzige HTML-Datei beschränkt", false)
                )));

        questions.add(new Question("Was ist Handlebars?",
                List.of(
                        new Answer("Ein Template-System für HTML", true),
                        new Answer("Wird mit Mustache-Syntax verwendet", true),
                        new Answer("Ein Datenbankmanagementsystem", false),
                        new Answer("Läuft clientseitig und serverseitig", true)
                )));

        questions.add(new Question("Wozu dienen Templates wie Thymeleaf oder JSP?",
                List.of(
                        new Answer("Dynamische HTML-Generierung", true),
                        new Answer("Trennung von Logik und Darstellung", true),
                        new Answer("CSS-Formatierung", false),
                        new Answer("Serverseitiges HTML-Rendering", true)
                )));

        questions.add(new Question("Was beschreibt das Box-Modell in CSS?",
                List.of(
                        new Answer("Inhalt, Padding, Border, Margin", true),
                        new Answer("Bezieht sich auf serverseitige Skripte", false),
                        new Answer("Hilft beim Layout von HTML-Elementen", true),
                        new Answer("Gilt nicht für Inline-Elemente", false)
                )));

        questions.add(new Question("Was ist der Unterschied zwischen id und class in HTML/CSS?",
                List.of(
                        new Answer("id ist eindeutig, class kann mehrfach verwendet werden", true),
                        new Answer("class ist immer numerisch", false),
                        new Answer("Beide können zur Stilzuweisung genutzt werden", true),
                        new Answer("id kann in CSS mehrfach verwendet werden", false)
                )));

        questions.add(new Question("Was ist eine Media Query in CSS?",
                List.of(
                        new Answer("Bedingte CSS-Regel basierend auf Gerät oder Bildschirm", true),
                        new Answer("Ein JavaScript-Konstrukt", false),
                        new Answer("Häufig in Responsive Design verwendet", true),
                        new Answer("Gilt nur für mobile Geräte", false)
                )));

        questions.add(new Question("Welche Dateiendungen sind typisch für Web-Frontend?",
                List.of(
                        new Answer(".html", true),
                        new Answer(".css", true),
                        new Answer(".js", true),
                        new Answer(".java", false)
                )));

        questions.add(new Question("Was ist eine Pseudoklasse in CSS?",
                List.of(
                        new Answer(":hover, :active oder :nth-child", true),
                        new Answer("Eine Variable im JavaScript", false),
                        new Answer("Definiert Zustände oder Positionen", true),
                        new Answer("Ist nur in SCSS verfügbar", false)
                )));
//------------Backend: Node.js, Spring Boot, REST, Sessions, Auth etc.
        questions.add(new Question("Was ist Node.js?",
                List.of(
                        new Answer("Ein JavaScript-Runtime für Server", true),
                        new Answer("Ein Frontend-Framework", false),
                        new Answer("Basiert auf der V8-Engine", true),
                        new Answer("Kann asynchrone Operationen ausführen", true)
                )));

        questions.add(new Question("Welche Sprache wird in Spring Boot hauptsächlich verwendet?",
                List.of(
                        new Answer("Java", true),
                        new Answer("Python", false),
                        new Answer("Kotlin (optional)", true),
                        new Answer("JavaScript", false)
                )));

        questions.add(new Question("Was ist ein Controller in einem Webframework?",
                List.of(
                        new Answer("Verarbeitet Anfragen und liefert Antworten", true),
                        new Answer("Speichert Daten dauerhaft", false),
                        new Answer("Teil der MVC-Struktur", true),
                        new Answer("Wird oft mit Annotationen versehen", true)
                )));

        questions.add(new Question("Was bedeutet Routing im Backend?",
                List.of(
                        new Answer("Zuweisung von URLs zu Funktionen/Methoden", true),
                        new Answer("Navigation auf der Webseite", false),
                        new Answer("Zentrale Steuerung der API-Endpunkte", true),
                        new Answer("Ist nur für Websockets gedacht", false)
                )));

        questions.add(new Question("Was sind Middleware-Funktionen in Node.js?",
                List.of(
                        new Answer("Funktionen, die Anfragen vor der Antwort bearbeiten", true),
                        new Answer("Nur für Fehlerbehandlung zuständig", false),
                        new Answer("Können Logging oder Authentifizierung übernehmen", true),
                        new Answer("Werden automatisch nach jedem Request ausgeführt", false)
                )));

        questions.add(new Question("Welche Aussage zu Django ist korrekt?",
                List.of(
                        new Answer("Ein Python-Webframework", true),
                        new Answer("Basiert auf dem MVC-Prinzip", true),
                        new Answer("Wird nur für Frontend verwendet", false),
                        new Answer("Enthält ORM, Admin-Panel und Routing", true)
                )));

        questions.add(new Question("Was beschreibt eine REST-API?",
                List.of(
                        new Answer("Zustandsloser Zugriff auf Ressourcen über HTTP", true),
                        new Answer("Verwendung standardisierter Methoden wie GET, POST", true),
                        new Answer("Basiert zwingend auf SOAP", false),
                        new Answer("Nutzt oft JSON als Datenformat", true)
                )));

        questions.add(new Question("Welche Formate werden typischerweise in REST-APIs verwendet?",
                List.of(
                        new Answer("JSON", true),
                        new Answer("XML", true),
                        new Answer("CSV", false),
                        new Answer("PDF", false)
                )));

        questions.add(new Question("Was ist eine Session in Webanwendungen?",
                List.of(
                        new Answer("Zustandsinformationen zwischen HTTP-Requests", true),
                        new Answer("Ein JavaScript-Modul", false),
                        new Answer("Speichert z. B. Benutzerinformationen", true),
                        new Answer("Ist immer dauerhaft gespeichert", false)
                )));

        questions.add(new Question("Was ist Authentifizierung im Web?",
                List.of(
                        new Answer("Verifizierung der Identität eines Nutzers", true),
                        new Answer("HTML-Kommentarprüfung", false),
                        new Answer("Erfolgt z. B. durch Login mit Passwort", true),
                        new Answer("Zwingt Benutzer zur Registrierung", false)
                )));

        questions.add(new Question("Was ist ein Token in der Webentwicklung?",
                List.of(
                        new Answer("Ein Zeichen-String zur Identifikation", true),
                        new Answer("Wird z. B. bei JWT verwendet", true),
                        new Answer("Ersetzt dauerhaft das Passwort", false),
                        new Answer("Kann im Header mitgesendet werden", true)
                )));

        questions.add(new Question("Was ist Laravel?",
                List.of(
                        new Answer("Ein PHP-Framework für Webentwicklung", true),
                        new Answer("Wird für komplexe Backend-Apps genutzt", true),
                        new Answer("Verwendet das MVC-Prinzip", true),
                        new Answer("Ein JavaScript-Framework", false)
                )));

        questions.add(new Question("Was ist ein RESTful Endpoint?",
                List.of(
                        new Answer("Ein definierter Pfad in einer REST-API", true),
                        new Answer("Ein statisches HTML-Dokument", false),
                        new Answer("Reagiert auf HTTP-Methoden wie GET, PUT", true),
                        new Answer("Nur mit SOAP kompatibel", false)
                )));

        questions.add(new Question("Welche Methoden sind typische HTTP-Verben in REST?",
                List.of(
                        new Answer("GET", true),
                        new Answer("POST", true),
                        new Answer("FETCH", false),
                        new Answer("DELETE", true)
                )));

        questions.add(new Question("Was beschreibt XML?",
                List.of(
                        new Answer("Auszeichnungssprache zur Darstellung strukturierter Daten", true),
                        new Answer("Veraltet gegenüber JSON", false),
                        new Answer("Streng typisiert", false),
                        new Answer("Lesbar für Mensch und Maschine", true)
                )));

        questions.add(new Question("Was sind Vorteile von JSON gegenüber XML?",
                List.of(
                        new Answer("Einfachere Syntax", true),
                        new Answer("Weniger Overhead", true),
                        new Answer("Mehr Kommentarfunktion", false),
                        new Answer("Besser geeignet für REST-APIs", true)
                )));

        questions.add(new Question("Welche Vorteile bietet Spring Boot?",
                List.of(
                        new Answer("Schneller Einstieg in Java-Backend", true),
                        new Answer("Automatisierte Konfiguration", true),
                        new Answer("Erfordert manuelle XML-Beans", false),
                        new Answer("Einbetteter Webserver (z. B. Tomcat)", true)
                )));

        questions.add(new Question("Was macht ein Backend-Framework wie ASP.NET?",
                List.of(
                        new Answer("Ermöglicht Webentwicklung mit .NET-Technologien", true),
                        new Answer("Wird in C# programmiert", true),
                        new Answer("Nur für Windows verfügbar", false),
                        new Answer("Unterstützt Routing und Controller", true)
                )));

        questions.add(new Question("Was ist das Ziel von Middleware bei Authentifizierung?",
                List.of(
                        new Answer("Nutzerzugriff prüfen, bevor Controller-Code ausgeführt wird", true),
                        new Answer("Fehlermeldungen unterdrücken", false),
                        new Answer("Token oder Cookies validieren", true),
                        new Answer("Frontend dynamisch erzeugen", false)
                )));
//------------Versionsverwaltung & Build-Tools
        questions.add(new Question("Was ist Git?",
                List.of(
                        new Answer("Ein verteiltes Versionskontrollsystem", true),
                        new Answer("Ein Cloud-Dienst", false),
                        new Answer("Erlaubt Nachverfolgung von Änderungen", true),
                        new Answer("Wird nur mit GitHub verwendet", false)
                )));

        questions.add(new Question("Welche Plattformen basieren auf Git?",
                List.of(
                        new Answer("GitHub", true),
                        new Answer("GitLab", true),
                        new Answer("Bitbucket", true),
                        new Answer("Dropbox", false)
                )));

        questions.add(new Question("Was beschreibt das Git-Branching-Modell 'Git Flow'?",
                List.of(
                        new Answer("Unterscheidet zwischen Develop-, Feature- und Release-Branches", true),
                        new Answer("Es existiert nur ein Branch (trunk)", false),
                        new Answer("Hat einen klaren Ablauf für Releases", true),
                        new Answer("Verwendet keine Tags", false)
                )));

        questions.add(new Question("Was passiert beim Merge in Git?",
                List.of(
                        new Answer("Zwei Entwicklungszweige werden zusammengeführt", true),
                        new Answer("Die Historie wird gelöscht", false),
                        new Answer("Konflikte können entstehen", true),
                        new Answer("Die Commit-ID ändert sich rückwirkend", false)
                )));

        questions.add(new Question("Was ist der Unterschied zwischen Merge und Rebase?",
                List.of(
                        new Answer("Rebase erstellt eine neue lineare Historie", true),
                        new Answer("Merge bewahrt die History mit Branchpunkten", true),
                        new Answer("Rebase ist verlustfrei für veröffentlichte Branches", false),
                        new Answer("Beide verändern nie die Commit-ID", false)
                )));

        questions.add(new Question("Was ist ein Pull Request?",
                List.of(
                        new Answer("Ein Vorschlag zur Codezusammenführung", true),
                        new Answer("Wird oft mit Code-Review verbunden", true),
                        new Answer("Direktes Einspielen in die Hauptdatenbank", false),
                        new Answer("Kommt nur in GitLab vor", false)
                )));

        questions.add(new Question("Was ist Maven?",
                List.of(
                        new Answer("Ein Build-Tool für Java-Projekte", true),
                        new Answer("Verwendet die Datei pom.xml zur Konfiguration", true),
                        new Answer("Ein Compiler für C", false),
                        new Answer("Lädt Abhängigkeiten automatisch herunter", true)
                )));

        questions.add(new Question("Was ist Gradle?",
                List.of(
                        new Answer("Ein flexibles Buildsystem", true),
                        new Answer("Ersetzt vollständig Git", false),
                        new Answer("Verwendet Groovy oder Kotlin DSL", true),
                        new Answer("Wird häufig bei Android verwendet", true)
                )));

        questions.add(new Question("Was ist npm?",
                List.of(
                        new Answer("Node Package Manager", true),
                        new Answer("Installiert Java-Bibliotheken", false),
                        new Answer("Wird mit Node.js verwendet", true),
                        new Answer("Verwaltet Abhängigkeiten von JavaScript-Projekten", true)
                )));

        questions.add(new Question("Was ist ein Paketmanager?",
                List.of(
                        new Answer("Verwaltet externe Bibliotheken und Versionen", true),
                        new Answer("npm, pip, NuGet sind Beispiele", true),
                        new Answer("Wird manuell durch Copy&Paste ersetzt", false),
                        new Answer("Hilft bei Updates und Konfliktmanagement", true)
                )));
//------------App-Entwicklung
        questions.add(new Question("Was ist Android Studio?",
                List.of(
                        new Answer("IDE für Android-Entwicklung", true),
                        new Answer("Basierend auf IntelliJ IDEA", true),
                        new Answer("Für iOS-Apps gedacht", false),
                        new Answer("Unterstützt Kotlin und Java", true)
                )));

        questions.add(new Question("Welche Sprachen werden für Android verwendet?",
                List.of(
                        new Answer("Kotlin", true),
                        new Answer("Java", true),
                        new Answer("C#", false),
                        new Answer("Swift", false)
                )));

        questions.add(new Question("Was ist ein Intent in Android?",
                List.of(
                        new Answer("Zum Starten von Aktivitäten oder Services", true),
                        new Answer("Ein Debug-Tool", false),
                        new Answer("Kann Daten zwischen Komponenten übergeben", true),
                        new Answer("Wird im Manifest konfiguriert", true)
                )));

        questions.add(new Question("Was ist der Lifecycle einer Android Activity?",
                List.of(
                        new Answer("Er beschreibt die Zustandsübergänge einer App", true),
                        new Answer("onCreate(), onPause(), onDestroy() sind Beispiele", true),
                        new Answer("Nur für Hintergrundprozesse wichtig", false),
                        new Answer("Wird vom System gesteuert", true)
                )));

        questions.add(new Question("Was ist Swift?",
                List.of(
                        new Answer("Programmiersprache für iOS und macOS", true),
                        new Answer("Wird mit Xcode verwendet", true),
                        new Answer("Verwendet Java Virtual Machine", false),
                        new Answer("Entwickelt von Apple", true)
                )));

        questions.add(new Question("Welche Frameworks sind für Cross-Plattform-Apps gedacht?",
                List.of(
                        new Answer("Flutter", true),
                        new Answer("React Native", true),
                        new Answer("Xamarin", true),
                        new Answer("JUnit", false)
                )));

        questions.add(new Question("Was ist Flutter?",
                List.of(
                        new Answer("Ein UI-Toolkit von Google", true),
                        new Answer("Verwendet Dart als Sprache", true),
                        new Answer("Für Web und Mobile geeignet", true),
                        new Answer("Ein JavaScript-Framework", false)
                )));

        questions.add(new Question("Was ist React Native?",
                List.of(
                        new Answer("Ein Framework zur App-Entwicklung mit React", true),
                        new Answer("Verwendet JavaScript", true),
                        new Answer("Erlaubt native UI-Komponenten", true),
                        new Answer("Läuft nur im Browser", false)
                )));

        questions.add(new Question("Was macht die Sensor-API in Mobilgeräten?",
                List.of(
                        new Answer("Zugriff auf Bewegung, Licht, GPS, etc.", true),
                        new Answer("Gibt Nutzer-Passwörter frei", false),
                        new Answer("Ermöglicht z. B. Schrittzähler und Kompass", true),
                        new Answer("Nur für Desktop gedacht", false)
                )));

        questions.add(new Question("Was ist bei App-Permissions zu beachten?",
                List.of(
                        new Answer("Nutzer müssen zustimmen", true),
                        new Answer("Sensible APIs erfordern explizite Freigabe", true),
                        new Answer("Zugriff erfolgt automatisch", false),
                        new Answer("Permissions können zur Laufzeit abgefragt werden", true)
                )));
//------------Theoretischen Grundlagen
        questions.add(new Question("Was ist eine Turingmaschine?",
                List.of(
                        new Answer("Ein theoretisches Modell eines Rechners", true),
                        new Answer("Ein echter Computer aus Metall", false),
                        new Answer("Sie besteht aus Band, Lesekopf und Zuständen", true),
                        new Answer("Sie wurde von Alan Turing erfunden", true)
                )));

        questions.add(new Question("Was ist ein endlicher Automat?",
                List.of(
                        new Answer("Ein Modell zur Erkennung von Zeichenfolgen", true),
                        new Answer("Ein Objekt zur Steuerung von CPU-Lüftern", false),
                        new Answer("Hat endlich viele Zustände", true),
                        new Answer("Kann keine unendlichen Sprachen erkennen", true)
                )));

        questions.add(new Question("Was ist ein deterministischer Automat (DFA)?",
                List.of(
                        new Answer("Hat für jedes Symbol nur einen Folgezustand", true),
                        new Answer("Kann sich bei einem Zeichen in mehrere Richtungen verzweigen", false),
                        new Answer("Besitzt keine Epsilon-Übergänge", true),
                        new Answer("Wird oft in Lexern verwendet", true)
                )));

        questions.add(new Question("Was beschreibt die Big-O-Notation?",
                List.of(
                        new Answer("Gibt die Laufzeit eines Algorithmus im schlimmsten Fall an", true),
                        new Answer("Zeigt die exakte Dauer in Sekunden", false),
                        new Answer("O(n^2) ist langsamer als O(n)", true),
                        new Answer("Hilft beim Vergleich von Algorithmen", true)
                )));

        questions.add(new Question("Welche Aussage zur Big-O-Notation ist korrekt?",
                List.of(
                        new Answer("O(1) ist konstanter Aufwand", true),
                        new Answer("O(n!) wächst sehr schnell", true),
                        new Answer("O(log n) ist schneller als O(n)", true),
                        new Answer("O(0) beschreibt perfekte Effizienz", false)
                )));

        questions.add(new Question("Was macht ein Compiler?",
                List.of(
                        new Answer("Übersetzt Quellcode in Maschinencode vor der Ausführung", true),
                        new Answer("Führt den Code direkt aus", false),
                        new Answer("Erkennt viele Syntaxfehler", true),
                        new Answer("Wird z. B. bei C oder Java verwendet", true)
                )));

        questions.add(new Question("Was macht ein Interpreter?",
                List.of(
                        new Answer("Führt Code Zeile für Zeile direkt aus", true),
                        new Answer("Erzeugt eine ausführbare Datei", false),
                        new Answer("Wird z. B. bei Python verwendet", true),
                        new Answer("Ist hilfreich beim schnellen Testen von Code", true)
                )));

        questions.add(new Question("Was ist der Unterschied zwischen Compiler und Interpreter?",
                List.of(
                        new Answer("Compiler übersetzt vollständig im Voraus", true),
                        new Answer("Interpreter arbeitet schrittweise zur Laufzeit", true),
                        new Answer("Interpreter ist schneller bei großen Programmen", false),
                        new Answer("Compiler erzeugt binäre Dateien", true)
                )));

        questions.add(new Question("Was ist eine kontextfreie Grammatik?",
                List.of(
                        new Answer("Regeln zur Beschreibung von Programmiersprachen", true),
                        new Answer("Wird z. B. in Parsern verwendet", true),
                        new Answer("Regeln bestehen aus einem Nichtterminal → Ausdruck", true),
                        new Answer("Kann keine rekursive Strukturen abbilden", false)
                )));

        questions.add(new Question("Was ist ein Stackautomat?",
                List.of(
                        new Answer("Ein Automat mit zusätzlichem Speicher (Stack)", true),
                        new Answer("Kann kontextfreie Sprachen erkennen", true),
                        new Answer("Ist gleichwertig mit Turingmaschinen", false),
                        new Answer("Hat typischerweise LIFO-Speicher", true)
                )));

        questions.add(new Question("Was ist eine Sprache im Kontext der Automatentheorie?",
                List.of(
                        new Answer("Eine Menge von Zeichenfolgen über einem Alphabet", true),
                        new Answer("Ein menschliches Kommunikationsmittel", false),
                        new Answer("Kann regulär oder kontextfrei sein", true),
                        new Answer("Wird durch Automaten akzeptiert", true)
                )));

        questions.add(new Question("Welche Aussagen über Algorithmen sind korrekt?",
                List.of(
                        new Answer("Ein Algorithmus ist eine endliche Folge von Anweisungen", true),
                        new Answer("Er löst ein Problem schrittweise", true),
                        new Answer("Er muss deterministisch sein", false),
                        new Answer("Er kann auch nicht abbrechen", false)
                )));

        questions.add(new Question("Was beschreibt das Wasserfallmodell?",
                List.of(
                        new Answer("Ein lineares Entwicklungsmodell", true),
                        new Answer("Jede Phase folgt strikt auf die vorige", true),
                        new Answer("Erlaubt flexible Rücksprünge", false),
                        new Answer("Oft genutzt in der klassischen Softwareentwicklung", true)
                )));

        questions.add(new Question("Was ist Scrum?",
                List.of(
                        new Answer("Ein agiler Softwareentwicklungsprozess", true),
                        new Answer("Organisiert in Sprints", true),
                        new Answer("Hat Rollen wie Product Owner und Scrum Master", true),
                        new Answer("Ist ein klassisches Planungsmodell", false)
                )));

        questions.add(new Question("Welche Merkmale hat Kanban?",
                List.of(
                        new Answer("Visualisierung des Arbeitsflusses", true),
                        new Answer("Begrenzung paralleler Aufgaben (Work in Progress)", true),
                        new Answer("Feste Rollen wie Scrum Master", false),
                        new Answer("Flexibler als das Wasserfallmodell", true)
                )));

        questions.add(new Question("Was ist das V-Modell?",
                List.of(
                        new Answer("Ein Vorgehensmodell mit Verifikation und Validierung", true),
                        new Answer("Jede Entwicklungsphase hat eine zugeordnete Testphase", true),
                        new Answer("Entstand aus agilen Prinzipien", false),
                        new Answer("Wird oft in sicherheitskritischen Systemen verwendet", true)
                )));

        questions.add(new Question("Was ist eine formale Sprache?",
                List.of(
                        new Answer("Eine künstlich definierte Sprache mit festen Regeln", true),
                        new Answer("Beispiel: Programmiersprachen", true),
                        new Answer("Basierend auf Syntax und Grammatik", true),
                        new Answer("Nur für menschliche Kommunikation gedacht", false)
                )));

        questions.add(new Question("Welche Aussage zur Komplexitätstheorie ist korrekt?",
                List.of(
                        new Answer("Sie untersucht den Aufwand von Algorithmen", true),
                        new Answer("O(n log n) ist besser als O(n^2)", true),
                        new Answer("Komplexität ist unabhängig von der Eingabegröße", false),
                        new Answer("Big-O ist Teil der Komplexitätsanalyse", true)
                )));

        questions.add(new Question("Was ist eine rekursive Sprache?",
                List.of(
                        new Answer("Eine Sprache, die von einer Turingmaschine akzeptiert wird", true),
                        new Answer("Erfordert keine Endlichkeit", false),
                        new Answer("Kann durch rekursive Regeln beschrieben werden", true),
                        new Answer("Ist immer effizient analysierbar", false)
                )));

        questions.add(new Question("Was ist das Ziel von Automatentheorie?",
                List.of(
                        new Answer("Formale Beschreibung von Berechnungsmodellen", true),
                        new Answer("Untersuchung von Erkennbarkeit und Berechenbarkeit", true),
                        new Answer("Modellierung realer Maschinen in Hardware", false),
                        new Answer("Grundlage für Compilerbau", true)
                )));

//------------Entwicklungstools & IDEs
        questions.add(new Question("Welche dieser Tools sind integrierte Entwicklungsumgebungen (IDEs)?",
                List.of(
                        new Answer("IntelliJ IDEA", true),
                        new Answer("Eclipse", true),
                        new Answer("Visual Studio Code", true),
                        new Answer("WinRAR", false)
                )));

        questions.add(new Question("Was ist ein Debugger?",
                List.of(
                        new Answer("Erlaubt schrittweises Durchlaufen von Code", true),
                        new Answer("Verhindert das Starten von Programmen", false),
                        new Answer("Setzt Breakpoints", true),
                        new Answer("Zeigt Variablenwerte während der Laufzeit", true)
                )));

        questions.add(new Question("Was ist ein Profiler?",
                List.of(
                        new Answer("Misst Laufzeitverhalten von Code", true),
                        new Answer("Findet Performance-Engpässe", true),
                        new Answer("Dient der Codeformatierung", false),
                        new Answer("Zeigt Speicherverbrauch und CPU-Last", true)
                )));

        questions.add(new Question("Was macht ein Linter?",
                List.of(
                        new Answer("Analysiert Quelltext auf Stil- und Syntaxfehler", true),
                        new Answer("Verändert automatisch Businesslogik", false),
                        new Answer("Unterstützt Coding Conventions", true),
                        new Answer("Wird oft im CI-Prozess verwendet", true)
                )));

        questions.add(new Question("Wofür werden Refactoring-Tools genutzt?",
                List.of(
                        new Answer("Verbessern internen Code, ohne Funktion zu ändern", true),
                        new Answer("Ersetzen Tests", false),
                        new Answer("Erhöhen Lesbarkeit und Wartbarkeit", true),
                        new Answer("Werden meist in IDEs eingebaut", true)
                )));

        questions.add(new Question("Was ist eine Code-Generierung?",
                List.of(
                        new Answer("Erzeugt Quelltext aus Vorlagen oder Modellen", true),
                        new Answer("Gehört zu TDD", false),
                        new Answer("Wird z. B. von Spring Initializr genutzt", true),
                        new Answer("Führt automatisch alle Tests aus", false)
                )));

        questions.add(new Question("Welche IDE wird häufig für Java verwendet?",
                List.of(
                        new Answer("IntelliJ", true),
                        new Answer("Eclipse", true),
                        new Answer("PyCharm", false),
                        new Answer("NetBeans", true)
                )));

        questions.add(new Question("Was sind gängige Erweiterungen in VS Code?",
                List.of(
                        new Answer("Prettier (Formatierung)", true),
                        new Answer("ESLint", true),
                        new Answer("Minesweeper", false),
                        new Answer("Live Server", true)
                )));

        questions.add(new Question("Was ist eine Extension/Plugin?",
                List.of(
                        new Answer("Erweitert die Funktionalität einer IDE", true),
                        new Answer("Verändert Systemdateien", false),
                        new Answer("Kann Debugger, Linter oder Themes enthalten", true),
                        new Answer("Erfordert kein Programmierwissen", false)
                )));

        questions.add(new Question("Was ist Hot Code Replace?",
                List.of(
                        new Answer("Ändert Code zur Laufzeit im Debugger", true),
                        new Answer("Ersetzt alle Unit-Tests", false),
                        new Answer("Funktioniert nicht in jeder Sprache", true),
                        new Answer("Unterstützt schnelles Testen von Änderungen", true)
                )));

//------------Testen & Qualitätssicherung
        questions.add(new Question("Was ist ein Unit-Test?",
                List.of(
                        new Answer("Ein Test einer einzelnen Funktion oder Methode", true),
                        new Answer("Ein kompletter Systemtest", false),
                        new Answer("Wird meist automatisch ausgeführt", true),
                        new Answer("Testet mehrere Systeme gleichzeitig", false)
                )));

        questions.add(new Question("Welche Frameworks werden typischerweise für Unit-Tests verwendet?",
                List.of(
                        new Answer("JUnit", true),
                        new Answer("pytest", true),
                        new Answer("Word", false),
                        new Answer("NUnit", true)
                )));

        questions.add(new Question("Was beschreibt Test Driven Development (TDD)?",
                List.of(
                        new Answer("Tests werden vor dem eigentlichen Code geschrieben", true),
                        new Answer("Code wird erst nach vollständiger Planung geschrieben", false),
                        new Answer("Es folgt dem Zyklus: Test – Code – Refactor", true),
                        new Answer("Wird nur bei Hardwaretests angewendet", false)
                )));

        questions.add(new Question("Welche Testarten gehören zu den Abnahmetests?",
                List.of(
                        new Answer("Akzeptanztests", true),
                        new Answer("Systemtests", true),
                        new Answer("Unit-Tests", false),
                        new Answer("Benutzertests", true)
                )));

        questions.add(new Question("Was ist ein Integrationstest?",
                List.of(
                        new Answer("Testet das Zusammenspiel mehrerer Module", true),
                        new Answer("Testet einzelne Methoden isoliert", false),
                        new Answer("Überprüft Schnittstellen zwischen Komponenten", true),
                        new Answer("Wird meist automatisiert durchgeführt", true)
                )));

        questions.add(new Question("Was prüft ein Systemtest?",
                List.of(
                        new Answer("Das gesamte System als Black Box", true),
                        new Answer("Nur die GUI-Funktionalität", false),
                        new Answer("Ob Anforderungen aus dem Lastenheft erfüllt werden", true),
                        new Answer("Nur Datenbankabfragen", false)
                )));

        questions.add(new Question("Was ist ein Mocking-Framework?",
                List.of(
                        new Answer("Simuliert abhängige Objekte für Tests", true),
                        new Answer("Verhindert das Testen", false),
                        new Answer("Wird z. B. mit Mockito oder Moq realisiert", true),
                        new Answer("Ersetzt Unit-Tests", false)
                )));

        questions.add(new Question("Welche Vorteile bietet das Verwenden von Mocks?",
                List.of(
                        new Answer("Reduziert externe Abhängigkeiten im Test", true),
                        new Answer("Erlaubt gezieltes Verhalten zu simulieren", true),
                        new Answer("Macht echte Datenbanktests überflüssig", true),
                        new Answer("Verhindert Refactoring", false)
                )));

        questions.add(new Question("Was ist Testabdeckung (Code Coverage)?",
                List.of(
                        new Answer("Anteil des Codes, der durch Tests überprüft wird", true),
                        new Answer("Misst die Zeit pro Testlauf", false),
                        new Answer("Wird oft mit Tools wie JaCoCo oder SonarQube gemessen", true),
                        new Answer("Höhere Testabdeckung garantiert korrekten Code", false)
                )));

        questions.add(new Question("Was prüft ein Tool wie SonarQube?",
                List.of(
                        new Answer("Testabdeckung", true),
                        new Answer("Codequalität", true),
                        new Answer("CI/CD-Konfiguration", false),
                        new Answer("Sicherheitslücken im Code", true)
                )));

        questions.add(new Question("Was bedeutet CI in CI/CD?",
                List.of(
                        new Answer("Continuous Integration", true),
                        new Answer("Code Injection", false),
                        new Answer("Laufende Zusammenführung von Code", true),
                        new Answer("Creative Implementation", false)
                )));

        questions.add(new Question("Was ist Continuous Delivery?",
                List.of(
                        new Answer("Automatisierte Bereitstellung von Software", true),
                        new Answer("Testen mit echten Benutzern", false),
                        new Answer("Teil einer CI/CD-Pipeline", true),
                        new Answer("Bezieht sich nur auf mobile Apps", false)
                )));

        questions.add(new Question("Welche dieser Tools sind typische CI/CD-Systeme?",
                List.of(
                        new Answer("Jenkins", true),
                        new Answer("GitLab CI", true),
                        new Answer("Excel", false),
                        new Answer("GitHub Actions", true)
                )));

        questions.add(new Question("Was ist ein Testfall (Test Case)?",
                List.of(
                        new Answer("Beschreibt eine konkrete Testsituation", true),
                        new Answer("Wird nur manuell dokumentiert", false),
                        new Answer("Beinhaltet Eingabe, erwartetes Ergebnis und Ablauf", true),
                        new Answer("Ist nur für Systemtests relevant", false)
                )));

        questions.add(new Question("Welche Vorteile bietet automatisiertes Testen?",
                List.of(
                        new Answer("Schnellere Rückmeldung bei Fehlern", true),
                        new Answer("Geringere Wiederholkosten", true),
                        new Answer("Erhöht manuelle Testaufwände", false),
                        new Answer("Erleichtert Refactoring", true)
                )));

        questions.add(new Question("Was gehört zu einem guten Unit-Test?",
                List.of(
                        new Answer("Er ist isoliert", true),
                        new Answer("Er testet mehrere Klassen gleichzeitig", false),
                        new Answer("Er ist wiederholbar", true),
                        new Answer("Er läuft schnell", true)
                )));

        questions.add(new Question("Was bedeutet Black-Box-Testing?",
                List.of(
                        new Answer("Test ohne Kenntnis der internen Struktur", true),
                        new Answer("Direktes Testen von Quellcode", false),
                        new Answer("Wird häufig bei Systemtests verwendet", true),
                        new Answer("Voraussetzung für TDD", false)
                )));

        questions.add(new Question("Was bedeutet Regressionstest?",
                List.of(
                        new Answer("Prüft, ob neue Änderungen alte Funktionen stören", true),
                        new Answer("Testet nur neue Features", false),
                        new Answer("Wird nach jedem Release ausgeführt", false),
                        new Answer("Hilft, Nebenwirkungen früh zu erkennen", true)
                )));

        questions.add(new Question("Was ist eine CI/CD-Pipeline?",
                List.of(
                        new Answer("Automatisierter Ablauf von Build, Test und Deployment", true),
                        new Answer("Eine Datenbankstruktur", false),
                        new Answer("Ein Teil von DevOps", true),
                        new Answer("Ein Hardware-Komponentenverbund", false)
                )));

        questions.add(new Question("Welche dieser Aussagen zu Test Driven Development sind korrekt?",
                List.of(
                        new Answer("Man beginnt mit dem Schreiben von Tests", true),
                        new Answer("Man schreibt nur Tests, keine Implementierung", false),
                        new Answer("Es hilft, Fehler früh zu erkennen", true),
                        new Answer("Es fördert modularen, testbaren Code", true)
                )));


        // — BETRIEBSSYSTEME —

        questions.add(new Question("Was sind Hauptaufgaben eines Betriebssystems?",
                List.of(
                        new Answer("Verwaltung von Speicher und Prozessen", true),
                        new Answer("Direkte Steuerung von Hardware", true),
                        new Answer("Programmierung von Apps", false),
                        new Answer("Benutzerverwaltung", true)
                )));

        questions.add(new Question("Welche Betriebssystemtypen gibt es?",
                List.of(
                        new Answer("Single-User-System", true),
                        new Answer("Mehrbenutzersystem", true),
                        new Answer("Standby-System", false),
                        new Answer("Echtzeitsystem", true)
                )));

        questions.add(new Question("Was ist ein Kernel?",
                List.of(
                        new Answer("Kern des Betriebssystems", true),
                        new Answer("Schnittstelle zur Hardware", true),
                        new Answer("Teil der CPU", false),
                        new Answer("Erste Programmkomponente beim Booten", true)
                )));

        questions.add(new Question("Welche Aussagen zu Prozessen sind korrekt?",
                List.of(
                        new Answer("Ein Prozess ist ein laufendes Programm", true),
                        new Answer("Jeder Prozess hat eigenen Speicherbereich", true),
                        new Answer("Prozesse laufen nur im Kernel-Modus", false),
                        new Answer("Ein Prozess kann Threads enthalten", true)
                )));

        questions.add(new Question("Welche dieser sind Betriebssysteme?",
                List.of(
                        new Answer("Windows 11", true),
                        new Answer("Linux", true),
                        new Answer("Google Chrome", false),
                        new Answer("macOS", true)
                )));

        questions.add(new Question("Was ist eine Datei im Betriebssystemkontext?",
                List.of(
                        new Answer("Eine Sammlung von Daten", true),
                        new Answer("Ein ausführbares Programm", false),
                        new Answer("Ein Teil des Dateisystems", true),
                        new Answer("Immer ein Textdokument", false)
                )));

        questions.add(new Question("Was passiert beim Booten eines PCs?",
                List.of(
                        new Answer("BIOS/UEFI startet", true),
                        new Answer("Betriebssystem wird geladen", true),
                        new Answer("Benutzer wird automatisch angemeldet", false),
                        new Answer("Hardware wird initialisiert", true)
                )));

        questions.add(new Question("Welche Aufgaben hat ein Treiber?",
                List.of(
                        new Answer("Ermöglicht Kommunikation zwischen OS und Hardware", true),
                        new Answer("Erstellt virtuelle Maschinen", false),
                        new Answer("Steuert ein bestimmtes Gerät", true),
                        new Answer("Gehört zum Kernel-Modul", true)
                )));

        questions.add(new Question("Was ist eine Shell?",
                List.of(
                        new Answer("Benutzerschnittstelle zum Betriebssystem", true),
                        new Answer("Nur grafisch verfügbar", false),
                        new Answer("Kann Befehle interpretieren", true),
                        new Answer("Wird oft im Terminal verwendet", true)
                )));

        questions.add(new Question("Was versteht man unter Multitasking?",
                List.of(
                        new Answer("Mehrere Prozesse laufen scheinbar gleichzeitig", true),
                        new Answer("Betriebssystem startet mehrere PCs", false),
                        new Answer("Mehrere Benutzer greifen gleichzeitig zu", false),
                        new Answer("Prozessor wechselt schnell zwischen Aufgaben", true)
                )));


// — VIRTUALISIERUNG —

        questions.add(new Question("Was ist Virtualisierung?",
                List.of(
                        new Answer("Erstellen virtueller Computer auf realer Hardware", true),
                        new Answer("Ein alternativer Bootmodus", false),
                        new Answer("Mehrere Betriebssysteme gleichzeitig betreiben", true),
                        new Answer("Simulieren von Hardware", true)
                )));

        questions.add(new Question("Welche Vorteile bietet Virtualisierung?",
                List.of(
                        new Answer("Bessere Ressourcenauslastung", true),
                        new Answer("Mehr Platz auf der Festplatte", false),
                        new Answer("Testumgebungen isolieren", true),
                        new Answer("Geringere Hardwarekosten", true)
                )));

        questions.add(new Question("Was ist ein Hypervisor?",
                List.of(
                        new Answer("Verwaltet virtuelle Maschinen", true),
                        new Answer("Ist ein Typ von Festplatte", false),
                        new Answer("Kann direkt auf Hardware laufen (Typ 1)", true),
                        new Answer("Erfordert immer ein Betriebssystem (Typ 2)", true)
                )));

        questions.add(new Question("Was ist eine virtuelle Maschine?",
                List.of(
                        new Answer("Ein simuliertes Computersystem", true),
                        new Answer("Braucht ein Hypervisor", true),
                        new Answer("Ist physisch vorhanden", false),
                        new Answer("Kann ihr eigenes OS haben", true)
                )));

        questions.add(new Question("Welche Tools unterstützen Virtualisierung?",
                List.of(
                        new Answer("VirtualBox", true),
                        new Answer("VMware", true),
                        new Answer("Steam", false),
                        new Answer("Hyper-V", true)
                )));

        questions.add(new Question("Was ist ein Snapshot in einer VM?",
                List.of(
                        new Answer("Zustandsabbild der VM", true),
                        new Answer("Sicherung eines Zeitpunkts", true),
                        new Answer("Ein Hardwaremonitor", false),
                        new Answer("Kann für Rollbacks genutzt werden", true)
                )));

        questions.add(new Question("Was ist Container-Virtualisierung (z. B. Docker)?",
                List.of(
                        new Answer("Teilt den Kernel mit dem Hostsystem", true),
                        new Answer("Benötigt eigene Betriebssysteminstallation", false),
                        new Answer("Leichtgewichtiger als klassische VMs", true),
                        new Answer("Isoliert Anwendungen in Containern", true)
                )));

        questions.add(new Question("Welche dieser Begriffe gehören zur Virtualisierung?",
                List.of(
                        new Answer("Snapshot", true),
                        new Answer("Host", true),
                        new Answer("Controller", false),
                        new Answer("Guest", true)
                )));

        questions.add(new Question("Was ist ein typisches Einsatzgebiet von VMs?",
                List.of(
                        new Answer("Testen neuer Betriebssysteme", true),
                        new Answer("Spieleentwicklung", true),
                        new Answer("Bios-Update", false),
                        new Answer("Servervirtualisierung", true)
                )));

        questions.add(new Question("Was bedeutet Live-Migration einer VM?",
                List.of(
                        new Answer("Umzug einer VM im laufenden Betrieb", true),
                        new Answer("Löschen der VM nach einem Neustart", false),
                        new Answer("Wechsel des physischen Hosts ohne Downtime", true),
                        new Answer("Wird z. B. in Rechenzentren eingesetzt", true)
                )));

//----------------WiSo
        questions.add(new Question("Was ist die gesetzliche Höchstdauer der täglichen Arbeitszeit laut Arbeitszeitgesetz?",
                List.of(
                        new Answer("8 Stunden", true),
                        new Answer("10 Stunden mit Ausgleich", true),
                        new Answer("12 Stunden generell", false),
                        new Answer("6 Stunden bei Nachtarbeit", false)
                )));

        questions.add(new Question("Welche Versicherungen gehören zur gesetzlichen Sozialversicherung?",
                List.of(
                        new Answer("Krankenversicherung", true),
                        new Answer("Pflegeversicherung", true),
                        new Answer("Unfallversicherung", true),
                        new Answer("Lebensversicherung", false)
                )));

        questions.add(new Question("Was sind Pflichten eines Auszubildenden laut BBiG?",
                List.of(
                        new Answer("Berichtsheft führen", true),
                        new Answer("Weisungen befolgen", true),
                        new Answer("Ausbilder kontrollieren", false),
                        new Answer("Lernpflicht einhalten", true)
                )));

        questions.add(new Question("Welche Aussagen zum dualen Ausbildungssystem sind korrekt?",
                List.of(
                        new Answer("Ausbildung findet im Betrieb und in der Berufsschule statt", true),
                        new Answer("Nur der Betrieb ist für den Erfolg verantwortlich", false),
                        new Answer("Berufsschule vermittelt theoretisches Wissen", true),
                        new Answer("Betriebe müssen einen Ausbildungsvertrag abschließen", true)
                )));

        questions.add(new Question("Was regelt ein Tarifvertrag?",
                List.of(
                        new Answer("Arbeitsbedingungen", true),
                        new Answer("Löhne und Gehälter", true),
                        new Answer("Private Versicherungen", false),
                        new Answer("Urlaubsanspruch", true)
                )));

        questions.add(new Question("Welche dieser Rechte gehören zu den Grundrechten im Grundgesetz?",
                List.of(
                        new Answer("Recht auf freie Meinungsäußerung", true),
                        new Answer("Recht auf Arbeit", false),
                        new Answer("Gleichbehandlung", true),
                        new Answer("Versammlungsfreiheit", true)
                )));

        questions.add(new Question("Wer zahlt die Beiträge zur gesetzlichen Rentenversicherung?",
                List.of(
                        new Answer("Arbeitgeber", true),
                        new Answer("Arbeitnehmer", true),
                        new Answer("Bundesagentur für Arbeit", false),
                        new Answer("Steuerberater", false)
                )));

        questions.add(new Question("Was bedeutet Tarifautonomie?",
                List.of(
                        new Answer("Tarifparteien regeln Löhne ohne staatlichen Einfluss", true),
                        new Answer("Der Staat legt Löhne direkt fest", false),
                        new Answer("Tarifverträge gelten unbegrenzt", false),
                        new Answer("Gewerkschaften und Arbeitgeber handeln selbstständig", true)
                )));

        questions.add(new Question("Welche Organisation vertritt die Arbeitnehmerinteressen?",
                List.of(
                        new Answer("Gewerkschaften", true),
                        new Answer("Berufsgenossenschaft", false),
                        new Answer("Arbeitgeberverband", false),
                        new Answer("Betriebsrat", true)
                )));

        questions.add(new Question("Was ist ein befristeter Arbeitsvertrag?",
                List.of(
                        new Answer("Er endet zu einem bestimmten Zeitpunkt", true),
                        new Answer("Er läuft auf unbestimmte Zeit", false),
                        new Answer("Er kann ohne Kündigung auslaufen", true),
                        new Answer("Er darf beliebig oft verlängert werden", false)
                )));

        questions.add(new Question("Was sind Merkmale der sozialen Marktwirtschaft?",
                List.of(
                        new Answer("Freier Wettbewerb", true),
                        new Answer("Sozialer Ausgleich", true),
                        new Answer("Zentrale Planwirtschaft", false),
                        new Answer("Private Eigentumsrechte", true)
                )));

        questions.add(new Question("Welche Aussagen zur Probezeit in der Ausbildung sind korrekt?",
                List.of(
                        new Answer("Darf mindestens 1 und maximal 4 Monate dauern", true),
                        new Answer("Kann währenddessen beidseitig fristlos gekündigt werden", true),
                        new Answer("Beginnt nach dem ersten Monat", false),
                        new Answer("Ist gesetzlich vorgeschrieben", true)
                )));

        questions.add(new Question("Was regelt das Jugendarbeitsschutzgesetz?",
                List.of(
                        new Answer("Arbeitszeiten für unter 18-Jährige", true),
                        new Answer("Kündigungsfristen für Erwachsene", false),
                        new Answer("Verbot gefährlicher Arbeiten", true),
                        new Answer("Mindestruhezeiten für Jugendliche", true)
                )));

        questions.add(new Question("Was gehört zu den Pflichten des Arbeitgebers?",
                List.of(
                        new Answer("Lohnzahlung", true),
                        new Answer("Fürsorgepflicht", true),
                        new Answer("Anwesenheitspflicht", false),
                        new Answer("Urlaubsgewährung", true)
                )));

        questions.add(new Question("Was versteht man unter einem Kündigungsschutz?",
                List.of(
                        new Answer("Schutz vor willkürlicher Entlassung", true),
                        new Answer("Gilt nach 6 Monaten Betriebszugehörigkeit", true),
                        new Answer("Gilt immer, auch in der Probezeit", false),
                        new Answer("Gilt nur bei Tarifverträgen", false)
                )));

        questions.add(new Question("Was sind Brutto- und Nettolohn?",
                List.of(
                        new Answer("Bruttolohn ist vor Abzügen", true),
                        new Answer("Nettolohn ist das ausgezahlte Gehalt", true),
                        new Answer("Bruttolohn ist immer steuerfrei", false),
                        new Answer("Nettolohn enthält Krankenversicherungsbeiträge", false)
                )));

        questions.add(new Question("Was ist Schwarzarbeit?",
                List.of(
                        new Answer("Arbeit ohne Anmeldung bei Behörden", true),
                        new Answer("Arbeit in Nachtzeiten", false),
                        new Answer("Arbeit ohne Lohnsteuerabführung", true),
                        new Answer("Erlaubte Nebenbeschäftigung", false)
                )));

        questions.add(new Question("Was ist das Ziel von Sozialversicherungen?",
                List.of(
                        new Answer("Existenzsicherung im Krankheits- oder Pflegefall", true),
                        new Answer("Gewinnsteigerung für Betriebe", false),
                        new Answer("Absicherung bei Alter oder Unfall", true),
                        new Answer("Verpflichtender Schutz für alle Beschäftigten", true)
                )));

        questions.add(new Question("Was ist ein Betriebsrat?",
                List.of(
                        new Answer("Interessenvertretung der Mitarbeiter", true),
                        new Answer("Gremium auf Arbeitgeberseite", false),
                        new Answer("Wird ab fünf ständigen Mitarbeitern gewählt", true),
                        new Answer("Hat Mitbestimmungsrechte", true)
                )));

        questions.add(new Question("Wann beginnt die gesetzliche Versicherungspflicht?",
                List.of(
                        new Answer("Bei Aufnahme eines sozialversicherungspflichtigen Jobs", true),
                        new Answer("Ab dem 18. Lebensjahr automatisch", false),
                        new Answer("Mit Beginn eines Ausbildungsvertrags", true),
                        new Answer("Erst nach Ablauf der Probezeit", false)
                )));
        questions.add(new Question("Wofür steht die Abkürzung ISO?",
                List.of(
                        new Answer("International Organization for Standardization", true),
                        new Answer("Integrated System Operation", false),
                        new Answer("Weltweiter Normgeber", true),
                        new Answer("Deutsches Institut für Normung", false)
                )));

        questions.add(new Question("Was ist das Ziel der ISO 9001?",
                List.of(
                        new Answer("Qualitätsmanagement systematisch verbessern", true),
                        new Answer("IT-Sicherheit erhöhen", false),
                        new Answer("Kundenzufriedenheit steigern", true),
                        new Answer("Kosten senken durch Bürokratieabbau", false)
                )));

        questions.add(new Question("Welche dieser Begriffe sind zentrale Prinzipien der ISO 9001?",
                List.of(
                        new Answer("Kundenorientierung", true),
                        new Answer("Prozessorientierung", true),
                        new Answer("Einzelfallentscheidung", false),
                        new Answer("Kontinuierliche Verbesserung", true)
                )));

        questions.add(new Question("Was ist ein internes Audit nach ISO 9001?",
                List.of(
                        new Answer("Eine interne Überprüfung des QM-Systems", true),
                        new Answer("Ein externer Zertifizierungsvorgang", false),
                        new Answer("Soll Abweichungen erkennen", true),
                        new Answer("Erfolgt ohne vorherige Ankündigung", false)
                )));

        questions.add(new Question("Was versteht man unter einem KVP (Kontinuierlicher Verbesserungsprozess)?",
                List.of(
                        new Answer("Fortlaufende Optimierung von Prozessen", true),
                        new Answer("Einmalige Prozessbewertung", false),
                        new Answer("Teil der ISO 9001", true),
                        new Answer("Nur bei Qualitätsproblemen erforderlich", false)
                )));

        questions.add(new Question("Welche Rolle spielt die Dokumentation im Qualitätsmanagement?",
                List.of(
                        new Answer("Sichert Nachvollziehbarkeit von Prozessen", true),
                        new Answer("Ersetzt Schulungen vollständig", false),
                        new Answer("Ermöglicht klare Verantwortlichkeiten", true),
                        new Answer("Ist optional in zertifizierten Systemen", false)
                )));

        questions.add(new Question("Was bedeutet Zertifizierung nach ISO 9001?",
                List.of(
                        new Answer("Unabhängige Prüfung des QM-Systems durch eine Stelle", true),
                        new Answer("Ein interner Betriebsprozess", false),
                        new Answer("Berechtigt zur Führung eines ISO-Siegels", true),
                        new Answer("Ein gesetzlich verpflichtender Schritt", false)
                )));

        questions.add(new Question("Welche dieser Begriffe gehören zur ISO-Welt?",
                List.of(
                        new Answer("Audit", true),
                        new Answer("Nichtkonformität", true),
                        new Answer("Betriebsrat", false),
                        new Answer("Korrekturmaßnahme", true)
                )));

        questions.add(new Question("Was ist ein Qualitätsmanagement-Handbuch?",
                List.of(
                        new Answer("Zentrale Dokumentation des QM-Systems", true),
                        new Answer("Ein ISO-zertifiziertes Buch", false),
                        new Answer("Enthält Prozesse, Zuständigkeiten und Ziele", true),
                        new Answer("Nur für externe Kunden gedacht", false)
                )));

        questions.add(new Question("Was ist eine Prozessbeschreibung?",
                List.of(
                        new Answer("Dokumentierte Ablaufdarstellung eines Prozesses", true),
                        new Answer("Eine Art Arbeitsvertrag", false),
                        new Answer("Wichtiger Bestandteil der ISO 9001", true),
                        new Answer("Nicht mehr notwendig bei Digitalisierung", false)
                )));

        questions.add(new Question("Was bedeutet 'Konformität' im ISO-Kontext?",
                List.of(
                        new Answer("Einhaltung von Vorgaben und Normen", true),
                        new Answer("Abweichung vom Standard", false),
                        new Answer("Zertifizierungsergebnis", false),
                        new Answer("Übereinstimmung mit definierten Anforderungen", true)
                )));

        questions.add(new Question("Welche Vorteile hat ein ISO-zertifiziertes Unternehmen?",
                List.of(
                        new Answer("Bessere Marktchancen", true),
                        new Answer("Vertrauen bei Kunden", true),
                        new Answer("Weniger Prozessqualität", false),
                        new Answer("Klarere Zuständigkeiten", true)
                )));

        questions.add(new Question("Was bedeutet PDCA im Qualitätsmanagement?",
                List.of(
                        new Answer("Plan – Do – Check – Act", true),
                        new Answer("Phasenmodell zur Verbesserung", true),
                        new Answer("Produkt-Dokumentations-Check-Ablage", false),
                        new Answer("Wird im KVP angewendet", true)
                )));

        questions.add(new Question("Welche Rolle hat die oberste Leitung im ISO 9001-System?",
                List.of(
                        new Answer("Verantwortet Zielsetzung und Qualitätspolitik", true),
                        new Answer("Führt interne Audits durch", false),
                        new Answer("Stellt Ressourcen bereit", true),
                        new Answer("Fördert kontinuierliche Verbesserung", true)
                )));

        questions.add(new Question("Was ist eine Korrekturmaßnahme in einem ISO-Prozess?",
                List.of(
                        new Answer("Maßnahme zur Beseitigung erkannter Fehler", true),
                        new Answer("Proaktive Fehlervermeidung", false),
                        new Answer("Teil einer internen Kontrolle", true),
                        new Answer("Immer schriftlich dokumentiert", true)
                )));

        questions.add(new Question("Was ist ein Managementsystem?",
                List.of(
                        new Answer("Strukturierte Methode zur Steuerung betrieblicher Abläufe", true),
                        new Answer("Eine ERP-Software", false),
                        new Answer("Grundlage für Zertifizierungen wie ISO 9001", true),
                        new Answer("Nur für Großunternehmen relevant", false)
                )));

        questions.add(new Question("Was ist eine Nichtkonformität?",
                List.of(
                        new Answer("Abweichung von einer Vorschrift oder Norm", true),
                        new Answer("Ein positiver Prüfbericht", false),
                        new Answer("Führt oft zu Korrekturmaßnahmen", true),
                        new Answer("Teil einer Kundenbeschwerde", false)
                )));

        questions.add(new Question("Welche Aussage zur Kundenorientierung nach ISO 9001 ist korrekt?",
                List.of(
                        new Answer("Kundenzufriedenheit ist zentraler Erfolgsfaktor", true),
                        new Answer("Kundenwünsche werden ignoriert", false),
                        new Answer("Reklamationen sind Bestandteil der Verbesserung", true),
                        new Answer("ISO 9001 enthält keine Kundenanforderungen", false)
                )));

        questions.add(new Question("Was ist das Ziel eines internen Auditplans?",
                List.of(
                        new Answer("Regelmäßige Prüfung aller Prozesse", true),
                        new Answer("Entlastung der Geschäftsführung", false),
                        new Answer("Vorbereitung auf externe Audits", true),
                        new Answer("Erkennung von Verbesserungspotenzial", true)
                )));

        questions.add(new Question("Welche dieser Aussagen treffen auf ISO 9001 zu?",
                List.of(
                        new Answer("Es geht um systematische Prozessqualität", true),
                        new Answer("ISO 9001 ist branchenunabhängig", true),
                        new Answer("Jedes Unternehmen muss zertifiziert sein", false),
                        new Answer("Ziel ist die kontinuierliche Optimierung", true)
                )));


//----------------IT Sicherheit
        questions.add(new Question("Was sind die drei Grundziele der IT-Sicherheit (CIA-Dreieck)?",
                List.of(
                        new Answer("Verfügbarkeit", true),
                        new Answer("Integrität", true),
                        new Answer("Authentifizierung", false),
                        new Answer("Vertraulichkeit", true)
                )));

        questions.add(new Question("Welche Methoden dienen der Authentifizierung?",
                List.of(
                        new Answer("Passwort", true),
                        new Answer("Fingerabdruck", true),
                        new Answer("Benutzername", false),
                        new Answer("Smartcard", true)
                )));

        questions.add(new Question("Was versteht man unter Malware?",
                List.of(
                        new Answer("Schädliche Software", true),
                        new Answer("Ein Verschlüsselungsstandard", false),
                        new Answer("Kann Trojaner oder Viren enthalten", true),
                        new Answer("Dient zur Systemhärtung", false)
                )));

        questions.add(new Question("Was ist ein Zero-Day-Exploit?",
                List.of(
                        new Answer("Ein Angriff auf eine unbekannte Schwachstelle", true),
                        new Answer("Ein geplantes System-Update", false),
                        new Answer("Ein Fehler, für den es noch keinen Patch gibt", true),
                        new Answer("Ein Anti-Viren-Tool", false)
                )));

        questions.add(new Question("Welche Maßnahmen erhöhen die Passwortsicherheit?",
                List.of(
                        new Answer("Groß- und Kleinschreibung verwenden", true),
                        new Answer("Wörter aus dem Wörterbuch nutzen", false),
                        new Answer("Sonderzeichen und Zahlen integrieren", true),
                        new Answer("Regelmäßige Änderung", true)
                )));

        questions.add(new Question("Was ist ein Man-in-the-Middle-Angriff?",
                List.of(
                        new Answer("Ein Angreifer liest Daten zwischen zwei Parteien mit", true),
                        new Answer("Ein physischer Angriff auf das Gerät", false),
                        new Answer("Der Angreifer verändert Daten unbemerkt", true),
                        new Answer("Erfordert direkten Zugriff auf das Netzwerk", true)
                )));

        questions.add(new Question("Was ist eine Firewall?",
                List.of(
                        new Answer("Ein System zur Filterung von Datenverkehr", true),
                        new Answer("Ein physisches Schutzschild", false),
                        new Answer("Kann eingehende und ausgehende Verbindungen kontrollieren", true),
                        new Answer("Ersetzt ein Antivirusprogramm", false)
                )));

        questions.add(new Question("Was ist Social Engineering?",
                List.of(
                        new Answer("Manipulation von Menschen zur Preisgabe sensibler Daten", true),
                        new Answer("Ein technisches Verschlüsselungsverfahren", false),
                        new Answer("Oft über E-Mail oder Telefon durchgeführt", true),
                        new Answer("Ein Hardware-Angriff", false)
                )));

        questions.add(new Question("Welche dieser Begriffe zählen zur Malware?",
                List.of(
                        new Answer("Ransomware", true),
                        new Answer("Rootkit", true),
                        new Answer("Patch", false),
                        new Answer("Spyware", true)
                )));

        questions.add(new Question("Was ist Phishing?",
                List.of(
                        new Answer("Fälschung von Websites oder E-Mails zur Datenerbeutung", true),
                        new Answer("Ein Hardware-Exploit", false),
                        new Answer("Wird oft per E-Mail durchgeführt", true),
                        new Answer("Dient der Systemoptimierung", false)
                )));

        questions.add(new Question("Welche Aussagen zur Zwei-Faktor-Authentifizierung sind korrekt?",
                List.of(
                        new Answer("Benötigt zwei verschiedene Arten von Nachweisen", true),
                        new Answer("Erhöht die Sicherheit gegenüber reinem Passwortschutz", true),
                        new Answer("Ist nur im Militärbereich erlaubt", false),
                        new Answer("Kann z. B. aus Passwort und SMS bestehen", true)
                )));

        questions.add(new Question("Was ist ein sicheres Verhalten im Umgang mit E-Mails?",
                List.of(
                        new Answer("Anhänge von unbekannten Absendern nicht öffnen", true),
                        new Answer("Misstrauen bei dringenden Zahlungsaufforderungen", true),
                        new Answer("Passwörter direkt per Mail versenden", false),
                        new Answer("Links vorher prüfen", true)
                )));

        questions.add(new Question("Was versteht man unter Verschlüsselung?",
                List.of(
                        new Answer("Umwandlung von Daten in nicht lesbare Form", true),
                        new Answer("Ein Komprimierungsverfahren", false),
                        new Answer("Nur mit Schlüssel wieder entschlüsselbar", true),
                        new Answer("Kann Vertraulichkeit erhöhen", true)
                )));

        questions.add(new Question("Welche Aussagen zur Softwareaktualisierung sind korrekt?",
                List.of(
                        new Answer("Schließt bekannte Sicherheitslücken", true),
                        new Answer("Kann neue Lücken verursachen", true),
                        new Answer("Ist nur für Server notwendig", false),
                        new Answer("Erhöht die Sicherheit von Betriebssystemen", true)
                )));

        questions.add(new Question("Was ist ein Brute-Force-Angriff?",
                List.of(
                        new Answer("Ausprobieren aller möglichen Kombinationen", true),
                        new Answer("Eine Art Malware", false),
                        new Answer("Sehr langsam bei langen Passwörtern", true),
                        new Answer("Wird durch Captchas erschwert", true)
                )));

        questions.add(new Question("Welche physischen Maßnahmen erhöhen die IT-Sicherheit?",
                List.of(
                        new Answer("Zutrittskontrolle", true),
                        new Answer("Videoüberwachung", true),
                        new Answer("Tastaturlayout ändern", false),
                        new Answer("Abschließbare Serverräume", true)
                )));

        questions.add(new Question("Was ist ein Sicherheitskonzept?",
                List.of(
                        new Answer("Dokumentierte Maßnahmen zur Gefahrenabwehr", true),
                        new Answer("Eine Projektstruktur zur IT-Erneuerung", false),
                        new Answer("Grundlage für Sicherheitsrichtlinien", true),
                        new Answer("Beinhaltet organisatorische und technische Maßnahmen", true)
                )));

        questions.add(new Question("Was zählt zu organisatorischen Sicherheitsmaßnahmen?",
                List.of(
                        new Answer("Richtlinien zum Passwortgebrauch", true),
                        new Answer("Firewall-Regeln", false),
                        new Answer("Schulung von Mitarbeitenden", true),
                        new Answer("Zugriffsregelungen in IT-Systemen", true)
                )));

        questions.add(new Question("Was ist ein Botnetz?",
                List.of(
                        new Answer("Ein Zusammenschluss infizierter Rechner", true),
                        new Answer("Wird für koordinierte Angriffe genutzt", true),
                        new Answer("Ein Teil des DNS-Systems", false),
                        new Answer("Kann unbemerkt aktiv sein", true)
                )));

        questions.add(new Question("Was ist das Ziel einer Zugriffskontrolle?",
                List.of(
                        new Answer("Nur berechtigte Personen erhalten Zugriff", true),
                        new Answer("Daten werden verschlüsselt", false),
                        new Answer("Schutz vor unbefugtem Lesen, Schreiben oder Löschen", true),
                        new Answer("Offener Zugang für alle Geräte", false)
                )));

//----------------Netzwerke
        questions.add(new Question("Was ist die Hauptaufgabe eines Routers?",
                List.of(
                        new Answer("Verbindet verschiedene Netzwerke miteinander", true),
                        new Answer("Speichert Webseiten zwischen", false),
                        new Answer("Verteilt IP-Adressen", true),
                        new Answer("Verwaltet Dateifreigaben", false)
                )));

        questions.add(new Question("Welche dieser Geräte arbeiten auf OSI-Schicht 2 (Sicherungsschicht)?",
                List.of(
                        new Answer("Switch", true),
                        new Answer("Hub", false),
                        new Answer("Bridge", true),
                        new Answer("Router", false)
                )));

        questions.add(new Question("Welche Netzwerktopologien gibt es in der Praxis?",
                List.of(
                        new Answer("Stern", true),
                        new Answer("Bus", true),
                        new Answer("Ring", true),
                        new Answer("Würfel", false)
                )));

        questions.add(new Question("Was ist eine IP-Adresse?",
                List.of(
                        new Answer("Eindeutige Adresse für ein Netzwerkgerät", true),
                        new Answer("Name des PCs im Netzwerk", false),
                        new Answer("Besteht aus vier Zahlen zwischen 0 und 255", true),
                        new Answer("Dient zur Adressierung auf Schicht 3", true)
                )));

        questions.add(new Question("Welche Aufgaben übernimmt das Protokoll TCP?",
                List.of(
                        new Answer("Verbindungsaufbau", true),
                        new Answer("Zuverlässige Datenübertragung", true),
                        new Answer("IP-Adresse zuweisen", false),
                        new Answer("Fehlerkontrolle", true)
                )));

        questions.add(new Question("Was macht ein DHCP-Server?",
                List.of(
                        new Answer("Vergibt IP-Adressen automatisch", true),
                        new Answer("Stellt Webseiten bereit", false),
                        new Answer("Erleichtert den Netzwerkeinstieg", true),
                        new Answer("Steuert den Datenverkehr zwischen PCs", false)
                )));

        questions.add(new Question("Was bedeutet LAN?",
                List.of(
                        new Answer("Local Area Network", true),
                        new Answer("Ein Netzwerk in einem lokalen Gebäude", true),
                        new Answer("Weltweites Netz", false),
                        new Answer("Drahtloses Netz", false)
                )));

        questions.add(new Question("Welche Aussagen zu MAC-Adressen sind korrekt?",
                List.of(
                        new Answer("Sind hardwaregebundene Adressen", true),
                        new Answer("Sind weltweit eindeutig", true),
                        new Answer("Werden von Routern vergeben", false),
                        new Answer("Arbeiten auf OSI-Schicht 2", true)
                )));

        questions.add(new Question("Was ist der Zweck eines Repeaters?",
                List.of(
                        new Answer("Verstärkt das Signal", true),
                        new Answer("Erhöht die Reichweite eines Netzwerks", true),
                        new Answer("Wechselt IP-Adressen aus", false),
                        new Answer("Arbeitet auf OSI-Schicht 1", true)
                )));

        questions.add(new Question("Welche Protokolle gehören zur Transportschicht (OSI-Schicht 4)?",
                List.of(
                        new Answer("TCP", true),
                        new Answer("UDP", true),
                        new Answer("IP", false),
                        new Answer("HTTP", false)
                )));

        questions.add(new Question("Was bedeutet die Abkürzung DNS?",
                List.of(
                        new Answer("Domain Name System", true),
                        new Answer("Dient zur Namensauflösung", true),
                        new Answer("Ersetzt MAC-Adressen", false),
                        new Answer("Wird für die Anzeige von Webseiten benötigt", true)
                )));

        questions.add(new Question("Was versteht man unter einem Peer-to-Peer-Netzwerk?",
                List.of(
                        new Answer("Alle Geräte sind gleichberechtigt", true),
                        new Answer("Es gibt keinen zentralen Server", true),
                        new Answer("Ein Gerät ist der Master, der Rest sind Clients", false),
                        new Answer("Dateien können direkt geteilt werden", true)
                )));

        questions.add(new Question("Was ist ein Standard-Port für HTTP?",
                List.of(
                        new Answer("Port 80", true),
                        new Answer("Port 443", false),
                        new Answer("Port 21", false),
                        new Answer("Port 8080 (alternativ)", true)
                )));

        questions.add(new Question("Was ist ein Vorteil der Stern-Topologie?",
                List.of(
                        new Answer("Zentrale Verwaltung möglich", true),
                        new Answer("Fehler in einem Kabel stören das ganze Netz", false),
                        new Answer("Einfache Erweiterbarkeit", true),
                        new Answer("Kaum Verkabelungsaufwand", false)
                )));

        questions.add(new Question("Was bedeutet Paketvermittlung im Netzwerk?",
                List.of(
                        new Answer("Daten werden in kleinen Blöcken übertragen", true),
                        new Answer("Jedes Paket hat Ziel- und Absenderadresse", true),
                        new Answer("Verbindung bleibt dauerhaft bestehen", false),
                        new Answer("Pakete können unterschiedliche Wege nehmen", true)
                )));

        questions.add(new Question("Welche dieser Begriffe gehören zur Netzwerkschicht (Schicht 3)?",
                List.of(
                        new Answer("IP", true),
                        new Answer("Routing", true),
                        new Answer("MAC-Adresse", false),
                        new Answer("Subnetzmaske", true)
                )));

        questions.add(new Question("Was ist der Unterschied zwischen Switch und Hub?",
                List.of(
                        new Answer("Ein Switch sendet gezielt", true),
                        new Answer("Ein Hub sendet an alle Ports", true),
                        new Answer("Ein Switch arbeitet auf OSI-Schicht 3", false),
                        new Answer("Ein Hub verarbeitet keine MAC-Adressen", true)
                )));

        questions.add(new Question("Welche Aussage über UDP ist korrekt?",
                List.of(
                        new Answer("Verbindungslose Übertragung", true),
                        new Answer("Zuverlässig wie TCP", false),
                        new Answer("Schneller als TCP", true),
                        new Answer("Nutzt MAC-Adressen zur Adressierung", false)
                )));

        questions.add(new Question("Was ist ein Subnetz?",
                List.of(
                        new Answer("Ein Teilnetz innerhalb eines Netzwerks", true),
                        new Answer("Wird durch Subnetzmaske definiert", true),
                        new Answer("Nur bei WLAN notwendig", false),
                        new Answer("Kann Broadcast-Bereich begrenzen", true)
                )));

        questions.add(new Question("Welche dieser Protokolle gehören zur Anwendungsschicht (OSI-Schicht 7)?",
                List.of(
                        new Answer("HTTP", true),
                        new Answer("FTP", true),
                        new Answer("DHCP", true),
                        new Answer("TCP", false)
                )));



//-----------------Hardware
        questions.add(new Question("Was beschreibt die Von-Neumann-Architektur?",
                List.of(
                        new Answer("Trennung von Programmbefehlen und Daten im Speicher", false),
                        new Answer("Ein gemeinsamer Speicher für Daten und Programme", true),
                        new Answer("Mehrkernprozessoren mit Parallelverarbeitung", false),
                        new Answer("Ein sequentielles Verarbeitungsmodell", true)
                )));

        questions.add(new Question("Welche Aussagen zur Harvard-Architektur sind korrekt?",
                List.of(
                        new Answer("Getrennte Speicherbereiche für Daten und Programme", true),
                        new Answer("Gemeinsamer Daten- und Befehlsbus", false),
                        new Answer("Schnellerer Zugriff durch Parallelität", true),
                        new Answer("Wird in klassischen PCs standardmäßig verwendet", false)
                )));

        questions.add(new Question("Welche Komponenten umfasst das EVA-Prinzip?",
                List.of(
                        new Answer("Eingabe", true),
                        new Answer("Verarbeitung", true),
                        new Answer("Ausgabe", true),
                        new Answer("Anschluss", false)
                )));

        questions.add(new Question("Was versteht man unter PUI in Bezug auf Computersysteme?",
                List.of(
                        new Answer("Peripherie, Umwelt, Interaktion", true),
                        new Answer("Prozessor, Unit, Interface", false),
                        new Answer("Bezug zum Systemkontext außerhalb des Rechners", true),
                        new Answer("Teil eines CPU-internen Protokolls", false)
                )));

        questions.add(new Question("Welche Bussysteme existieren innerhalb eines klassischen PC-Systems?",
                List.of(
                        new Answer("Datenbus", true),
                        new Answer("Adressbus", true),
                        new Answer("Kontrollbus (Steuerbus)", true),
                        new Answer("Sicherheitsbus", false)
                )));

        questions.add(new Question("Welche Funktion erfüllt der Adressbus?",
                List.of(
                        new Answer("Überträgt Speicheradressen", true),
                        new Answer("Überträgt Steuerbefehle", false),
                        new Answer("Ist meist unidirektional", true),
                        new Answer("Begrenzt die maximal adressierbare Speichergröße", true)
                )));

        questions.add(new Question("Welche Eigenschaften treffen auf Register in der CPU zu?",
                List.of(
                        new Answer("Extrem schnelle Zwischenspeicher", true),
                        new Answer("Teil des RAMs", false),
                        new Answer("Werden direkt vom Steuerwerk verwendet", true),
                        new Answer("Dienen der permanenten Datenspeicherung", false)
                )));

        questions.add(new Question("Was unterscheidet das Steuerwerk vom Rechenwerk in der CPU?",
                List.of(
                        new Answer("Steuerwerk koordiniert, Rechenwerk verarbeitet", true),
                        new Answer("Beide sind für mathematische Operationen zuständig", false),
                        new Answer("Rechenwerk nutzt das ALU", true),
                        new Answer("Steuerwerk enthält das BIOS", false)
                )));

        questions.add(new Question("Welche Aussage trifft auf die ALU (Arithmetic Logic Unit) zu?",
                List.of(
                        new Answer("Führt arithmetische Operationen aus", true),
                        new Answer("Führt logische Operationen aus", true),
                        new Answer("Speichert Ergebnisse dauerhaft", false),
                        new Answer("Teil des Steuerwerks", false)
                )));

        questions.add(new Question("Was ist der Hauptunterschied zwischen RAM und ROM?",
                List.of(
                        new Answer("RAM ist flüchtig, ROM ist nicht-flüchtig", true),
                        new Answer("ROM kann vom Nutzer beliebig beschrieben werden", false),
                        new Answer("RAM verliert Daten bei Stromausfall", true),
                        new Answer("ROM ist schneller als RAM", false)
                )));

        questions.add(new Question("Welche Speicherarten sind typischerweise flüchtig?",
                List.of(
                        new Answer("RAM", true),
                        new Answer("Cache", true),
                        new Answer("SSD", false),
                        new Answer("Register", true)
                )));

        questions.add(new Question("Welche Aussagen zum Cache-Speicher sind korrekt?",
                List.of(
                        new Answer("Liegt zwischen CPU und RAM", true),
                        new Answer("Erhöht die Zugriffszeit auf Daten", false),
                        new Answer("Ist schneller als der Hauptspeicher", true),
                        new Answer("Existiert in verschiedenen Ebenen (L1, L2, L3)", true)
                )));

        questions.add(new Question("Welche Einflüsse berücksichtigt das 'U' in PUI (Umwelt)?",
                List.of(
                        new Answer("Temperatur, Helligkeit, Feuchtigkeit", true),
                        new Answer("Interne Stromverteilung", false),
                        new Answer("Sensorik zur Umfeldwahrnehmung", true),
                        new Answer("Signalverarbeitung externer Reize", true)
                )));

        questions.add(new Question("Was ist ein typisches Merkmal moderner Mehrkernprozessoren?",
                List.of(
                        new Answer("Parallele Ausführung mehrerer Threads", true),
                        new Answer("Nutzung eines gemeinsamen Caches", true),
                        new Answer("Jeder Kern besitzt einen eigenen ALU", true),
                        new Answer("Ein Kern kann mehrere CPUs ersetzen", false)
                )));

        questions.add(new Question("Was versteht man unter einem Bus-System in der Hardware?",
                List.of(
                        new Answer("Ein Leitungssystem zur Datenübertragung", true),
                        new Answer("Eine Datenbank zur Adressverteilung", false),
                        new Answer("Ein Verbindungssystem zwischen Komponenten", true),
                        new Answer("Ein Modell zur Netzwerksicherheit", false)
                )));

        questions.add(new Question("Was bedeutet 'Fetch-Decode-Execute'-Zyklus?",
                List.of(
                        new Answer("Befehl holen", true),
                        new Answer("Befehl übersetzen", true),
                        new Answer("Befehl ausführen", true),
                        new Answer("Befehl sichern", false)
                )));

        questions.add(new Question("Was zählt zur Peripherie eines Rechners?",
                List.of(
                        new Answer("Tastatur", true),
                        new Answer("Bildschirm", true),
                        new Answer("CPU", false),
                        new Answer("Maus", true)
                )));

        questions.add(new Question("Welche dieser Aussagen zum Steuerwerk sind korrekt?",
                List.of(
                        new Answer("Steuert Reihenfolge der Befehlsverarbeitung", true),
                        new Answer("Steuert die Register direkt", true),
                        new Answer("Berechnet logische Operatoren", false),
                        new Answer("Gehört zur Ein-/Ausgabe", false)
                )));

        questions.add(new Question("Was beschreibt das Prinzip der sequentiellen Verarbeitung?",
                List.of(
                        new Answer("Befehle werden Schritt für Schritt abgearbeitet", true),
                        new Answer("Befehle laufen alle gleichzeitig", false),
                        new Answer("Zwischenergebnisse werden in Registern gehalten", true),
                        new Answer("Mehrere CPUs übernehmen dasselbe Programm", false)
                )));

        questions.add(new Question("Was beschreibt ein typisches Merkmal der Von-Neumann-Architektur?",
                List.of(
                        new Answer("Flaschenhals durch gemeinsamen Bus", true),
                        new Answer("Paralleler Zugriff auf Daten und Programm", false),
                        new Answer("Hohe Flexibilität durch Speichertrennung", false),
                        new Answer("Programmspeicher ist veränderbar", true)
                )));
        questions.add(new Question("Was ist die Hauptaufgabe der CPU?",
                List.of(
                        new Answer("Daten speichern", false),
                        new Answer("Rechenoperationen ausführen", true),
                        new Answer("Strom liefern", false),
                        new Answer("Programme steuern", true)
                )));

        questions.add(new Question("Was zählt zur internen Hardware eines PCs?",
                List.of(
                        new Answer("Arbeitsspeicher", true),
                        new Answer("Netzteil", true),
                        new Answer("Monitor", false),
                        new Answer("Grafikkarte", true)
                )));

        questions.add(new Question("Was bedeutet die Abkürzung RAM?",
                List.of(
                        new Answer("Random Access Memory", true),
                        new Answer("Read After Memory", false),
                        new Answer("RechnerArbeitsModul", false),
                        new Answer("Speicher für laufende Prozesse", true)
                )));

        questions.add(new Question("Wofür ist eine SSD zuständig?",
                List.of(
                        new Answer("Speichern von Daten", true),
                        new Answer("Anzeigen von Videos", false),
                        new Answer("Schnelles Booten", true),
                        new Answer("Netzwerkkommunikation", false)
                )));

        questions.add(new Question("Welche Anschlüsse findet man typischerweise am Mainboard?",
                List.of(
                        new Answer("USB", true),
                        new Answer("HDMI", true),
                        new Answer("LAN", true),
                        new Answer("Power-Taste", false)
                )));

        questions.add(new Question("Welche dieser Komponenten ist für die Grafikdarstellung zuständig?",
                List.of(
                        new Answer("Grafikkarte", true),
                        new Answer("Prozessor", false),
                                new Answer("Arbeitsspeicher", false),
                                new Answer("Netzteil", false)
                        )));

        questions.add(new Question("Was ist eine typische Aufgabe des Netzteils?",
                List.of(
                        new Answer("Stromversorgung aller Komponenten", true),
                        new Answer("Rechenoperationen durchführen", false),
                        new Answer("Temperatur überwachen", false),
                        new Answer("Stromspannung umwandeln", true)
                )));

        questions.add(new Question("Was versteht man unter einem Lüfter im PC?",
                List.of(
                        new Answer("Kühlt Komponenten wie CPU und GPU", true),
                        new Answer("Erhöht die Rechenleistung", false),
                        new Answer("Sorgt für Luftstrom im Gehäuse", true),
                        new Answer("Speichert Daten", false)
                )));

        questions.add(new Question("Welche dieser Geräte sind Ausgabegeräte?",
                List.of(
                        new Answer("Monitor", true),
                        new Answer("Tastatur", false),
                        new Answer("Drucker", true),
                        new Answer("Lautsprecher", true)
                )));

        questions.add(new Question("Welche Komponenten können direkt auf dem Mainboard sitzen?",
                List.of(
                        new Answer("CPU", true),
                        new Answer("RAM", true),
                        new Answer("Festplatte", false),
                        new Answer("Chipsatz", true)
                )));

        questions.add(new Question("Was ist der Zweck einer BIOS/UEFI-Firmware?",
                List.of(
                        new Answer("Startet das System", true),
                        new Answer("Ersetzt das Betriebssystem", false),
                        new Answer("Erkennt Hardware beim Einschalten", true),
                        new Answer("Steuert die Stromzufuhr", false)
                )));

        questions.add(new Question("Welche Arten von Massenspeichern gibt es typischerweise?",
                List.of(
                        new Answer("SSD", true),
                        new Answer("USB-Stick", true),
                        new Answer("CPU", false),
                        new Answer("Festplatte (HDD)", true)
                )));

        questions.add(new Question("Was bedeutet Plug and Play?",
                List.of(
                        new Answer("Geräte werden automatisch erkannt", true),
                        new Answer("Geräte müssen manuell konfiguriert werden", false),
                        new Answer("Geräte funktionieren ohne Neustart", true),
                        new Answer("Nur für Server gültig", false)
                )));

        questions.add(new Question("Was zählt zu den Peripheriegeräten?",
                List.of(
                        new Answer("Maus", true),
                        new Answer("Monitor", true),
                        new Answer("Motherboard", false),
                        new Answer("Drucker", true)
                )));

        questions.add(new Question("Welche dieser Schnittstellen dienen der Datenübertragung?",
                List.of(
                        new Answer("USB", true),
                        new Answer("HDMI", (true)), // Hauptsächlich Bild/Ton
                        new Answer("SATA", true),
                        new Answer("PCIe", true)
                )));

        questions.add(new Question("Wofür steht die Abkürzung GPU?",
                List.of(
                        new Answer("Graphics Processing Unit", true),
                        new Answer("General Power Unit", false),
                        new Answer("Grafikeinheit im Computer", true),
                        new Answer("Gerätesteuerung für Ports", false)
                )));

        questions.add(new Question("Welche dieser Aussagen zu SSDs ist korrekt?",
                List.of(
                        new Answer("SSDs haben keine beweglichen Teile", true),
                        new Answer("SSDs sind langsamer als HDDs", false),
                        new Answer("SSDs sind leiser als HDDs", true),
                        new Answer("SSDs speichern dauerhaft Daten", true)
                )));

        questions.add(new Question("Was ist ein Motherboard?",
                List.of(
                        new Answer("Zentrale Hauptplatine eines PCs", true),
                        new Answer("Ein externes Gehäuse", false),
                        new Answer("Verbindet alle Komponenten", true),
                        new Answer("Ein anderer Begriff für RAM", false)
                )));

        questions.add(new Question("Wozu dient Thermal Paste (Wärmeleitpaste)?",
                List.of(
                        new Answer("Verbessert den Kontakt zwischen CPU und Kühlkörper", true),
                        new Answer("Verhindert Stromschläge", false),
                        new Answer("Reduziert die Temperaturentwicklung", true),
                        new Answer("Speichert Hitze zwischen", false)
                )));

        questions.add(new Question("Was bedeutet der Begriff 'Overclocking'?",
                List.of(
                        new Answer("Übertakten von Komponenten", true),
                        new Answer("Reduzieren der Lüftergeschwindigkeit", false),
                        new Answer("Betreiben über der Normfrequenz", true),
                        new Answer("Verkürzen der Lebensdauer von Hardware", true)
                )));


//-----------------Projektmanagement
        questions.add(new Question("Was ist ein Projekt laut DIN 69901?",
                List.of(
                        new Answer("Eine einmalige Aufgabe mit definiertem Ziel", true),
                        new Answer("Ein dauerhafter Geschäftsprozess", false),
                        new Answer("Begrenzt in Zeit, Ressourcen und Budget", true),
                        new Answer("Nur im Bauwesen anwendbar", false)
                )));

        questions.add(new Question("Welche der folgenden Phasen gehören zum klassischen Projektverlauf?",
                List.of(
                        new Answer("Projektinitiierung", true),
                        new Answer("Projektabschluss", true),
                        new Answer("Daily Scrum", false),
                        new Answer("Ressourcenrecycling", false)
                )));

        questions.add(new Question("Welche Rollen sind typisch in einem Projektteam?",
                List.of(
                        new Answer("Projektleiter", true),
                        new Answer("Product Owner", false), // false im klassischen PM
                        new Answer("Teammitglied", true),
                        new Answer("Kunde", true)
                )));

        questions.add(new Question("Was sind Ziele eines Kick-off-Meetings?",
                List.of(
                        new Answer("Ziele und Erwartungen klären", true),
                        new Answer("Projekt abbrechen", false),
                        new Answer("Teammitglieder vorstellen", true),
                        new Answer("Technische Umsetzung starten", false)
                )));

        questions.add(new Question("Was ist ein Projektstrukturplan (PSP)?",
                List.of(
                        new Answer("Hierarchische Gliederung aller Arbeitspakete", true),
                        new Answer("Eine Excel-Tabelle für Kostenplanung", false),
                        new Answer("Grundlage für Terminplanung", true),
                        new Answer("Ein Zeitplan mit Balkendiagramm", false)
                )));

        questions.add(new Question("Was gehört zur SMART-Formel für Zieldefinition?",
                List.of(
                        new Answer("Spezifisch", true),
                        new Answer("Messbar", true),
                        new Answer("Abschätzbar", false),
                        new Answer("Terminiert", true)
                )));

        questions.add(new Question("Was ist ein Meilenstein?",
                List.of(
                        new Answer("Ein wichtiges Ereignis im Projektverlauf", true),
                        new Answer("Ein besonders langes Arbeitspaket", false),
                        new Answer("Ein Punkt zur Zielkontrolle", true),
                        new Answer("Nur in agilen Projekten relevant", false)
                )));

        questions.add(new Question("Welche Risiken können ein Projekt gefährden?",
                List.of(
                        new Answer("Ressourcenmangel", true),
                        new Answer("Kommunikationsprobleme", true),
                        new Answer("Regelmäßige Statusberichte", false),
                        new Answer("Unklare Zieldefinition", true)
                )));

        questions.add(new Question("Was ist das Ziel der Stakeholderanalyse?",
                List.of(
                        new Answer("Alle Beteiligten identifizieren", true),
                        new Answer("Einfluss und Interesse bewerten", true),
                        new Answer("Stakeholder entfernen", false),
                        new Answer("Kommunikationsstrategie ableiten", true)
                )));

        questions.add(new Question("Welche Aussagen zu Projektzielen sind korrekt?",
                List.of(
                        new Answer("Ziele sollten widerspruchsfrei sein", true),
                        new Answer("Ziele dürfen im Projektverlauf beliebig geändert werden", false),
                        new Answer("Ziele dienen als Entscheidungsgrundlage", true),
                        new Answer("Ziele müssen nicht dokumentiert werden", false)
                )));

        questions.add(new Question("Welche Aufgaben hat der Projektleiter?",
                List.of(
                        new Answer("Projekt planen und überwachen", true),
                        new Answer("Arbeitspakete abarbeiten", false),
                        new Answer("Team koordinieren", true),
                        new Answer("Budget verantworten", true)
                )));

        questions.add(new Question("Was ist die kritische Linie im Netzplan?",
                List.of(
                        new Answer("Die längste durchgehende Abfolge von Vorgängen", true),
                        new Answer("Die Reservezeit aller Arbeitspakete", false),
                        new Answer("Die kürzeste Verbindung aller Aufgaben", false),
                        new Answer("Entscheidend für die Projektdauer", true)
                )));

        questions.add(new Question("Welche dieser Werkzeuge gehören zur Projektplanung?",
                List.of(
                        new Answer("Gantt-Diagramm", true),
                        new Answer("Lastenheft", false),
                        new Answer("Netzplantechnik", true),
                        new Answer("Projektstrukturplan", true)
                )));

        questions.add(new Question("Was ist ein Change Request?",
                List.of(
                        new Answer("Ein Antrag auf Projektänderung", true),
                        new Answer("Ein informeller Vorschlag zur Kaffeepause", false),
                        new Answer("Wird im Projektverlauf eingereicht", true),
                        new Answer("Muss dokumentiert und bewertet werden", true)
                )));

        questions.add(new Question("Was ist das Ziel der Risikoanalyse?",
                List.of(
                        new Answer("Mögliche Probleme frühzeitig erkennen", true),
                        new Answer("Alle Probleme vermeiden", false),
                        new Answer("Wahrscheinlichkeit und Auswirkung bewerten", true),
                        new Answer("Projektdokumentation ersetzen", false)
                )));

        questions.add(new Question("Welche dieser Aussagen zum Projektbudget sind korrekt?",
                List.of(
                        new Answer("Muss geplant und kontrolliert werden", true),
                        new Answer("Darf beliebig überschritten werden", false),
                        new Answer("Ist Grundlage für Ressourcenplanung", true),
                        new Answer("Kann mündlich festgelegt werden", false)
                )));

        questions.add(new Question("Was ist ein Lenkungsausschuss?",
                List.of(
                        new Answer("Ein Gremium zur Projektsteuerung", true),
                        new Answer("Nur bei IT-Projekten notwendig", false),
                        new Answer("Trifft strategische Entscheidungen", true),
                        new Answer("Leitet das Projekt operativ", false)
                )));

        questions.add(new Question("Welche Aussagen zur agilen Methode Scrum sind korrekt?",
                List.of(
                        new Answer("Scrum arbeitet in Sprints", true),
                        new Answer("Es gibt keinen Projektleiter", true),
                        new Answer("Alle Entscheidungen trifft der Scrum Master", false),
                        new Answer("Daily Scrum dient dem Austausch im Team", true)
                )));

        questions.add(new Question("Welche Aufgaben gehören zum Projektabschluss?",
                List.of(
                        new Answer("Erfahrungsdokumentation", true),
                        new Answer("Teamauflösung", true),
                        new Answer("Zieldefinition", false),
                        new Answer("Abnahme durch den Auftraggeber", true)
                )));

        questions.add(new Question("Was versteht man unter dem magischen Dreieck des Projektmanagements?",
                List.of(
                        new Answer("Zeit, Kosten, Qualität", true),
                        new Answer("Budget, Moral, Strategie", false),
                        new Answer("Drei Phasen eines Projekts", false),
                        new Answer("Es zeigt den Zielkonflikt zwischen Faktoren", true)
                )));
//----------------Software-Architektur & Design
        questions.add(new Question("Was ist ein Monolith in der Softwarearchitektur?",
                List.of(
                        new Answer("Eine Anwendung, die als eine große Einheit gebaut und deployed wird", true),
                        new Answer("Ein verteiltes System mit Microservices", false),
                        new Answer("Ein architektonisches Muster zur Entkopplung", false),
                        new Answer("Kann bei großen Systemen schwer wartbar werden", true)
                )));

        questions.add(new Question("Was sind Merkmale von Microservices?",
                List.of(
                        new Answer("Jeder Service ist unabhängig deploybar", true),
                        new Answer("Alle Services greifen auf dieselbe Datenbank zu", false),
                        new Answer("Services kommunizieren über Schnittstellen", true),
                        new Answer("Skalierbarkeit auf Komponentenebene", true)
                )));

        questions.add(new Question("Was beschreibt das Layered-Architecture-Modell?",
                List.of(
                        new Answer("Trennt Software in klar definierte Schichten", true),
                        new Answer("Jede Schicht hat genau eine Methode", false),
                        new Answer("Typisch: Presentation, Logic, Data", true),
                        new Answer("Direkter Zugriff zwischen allen Schichten", false)
                )));

        questions.add(new Question("Welche Aussagen zur Modularisierung sind korrekt?",
                List.of(
                        new Answer("Fördert Wiederverwendbarkeit", true),
                        new Answer("Verbessert die Wartbarkeit", true),
                        new Answer("Erfordert globale Variablen", false),
                        new Answer("Erleichtert das Testen von Komponenten", true)
                )));

        questions.add(new Question("Was bedeutet Kapselung im Softwaredesign?",
                List.of(
                        new Answer("Verbergen interner Implementierungsdetails", true),
                        new Answer("Öffentliches Interface für Außenkommunikation", true),
                        new Answer("Direkter Zugriff auf alle Membervariablen", false),
                        new Answer("Fördert lose Kopplung", true)
                )));

        questions.add(new Question("Was sind typische Bestandteile des MVC-Musters?",
                List.of(
                        new Answer("Model", true),
                        new Answer("View", true),
                        new Answer("Control", true),
                        new Answer("Compiler", false)
                )));

        questions.add(new Question("Wofür steht MVVM im Kontext moderner GUI-Architekturen?",
                List.of(
                        new Answer("Model-View-ViewModel", true),
                        new Answer("Ein Muster für Datenbindung", true),
                        new Answer("Kommt oft in Webanwendungen zum Einsatz", true),
                        new Answer("Verzichtet vollständig auf Benutzerinteraktion", false)
                )));

        questions.add(new Question("Welche Aussage trifft auf das MVP-Muster zu?",
                List.of(
                        new Answer("Der Presenter verarbeitet Logik", true),
                        new Answer("Die View kommuniziert direkt mit dem Model", false),
                        new Answer("Trennung von Darstellung und Geschäftslogik", true),
                        new Answer("Das Model enthält nur die GUI", false)
                )));

        questions.add(new Question("Was ist eine REST-API?",
                List.of(
                        new Answer("Schnittstelle auf Basis von HTTP", true),
                        new Answer("Nutzt typische Methoden wie GET, POST, PUT, DELETE", true),
                        new Answer("Benötigt SOAP für Kommunikation", false),
                        new Answer("Ist zustandslos", true)
                )));

        questions.add(new Question("Welche Aussage zu GraphQL ist korrekt?",
                List.of(
                        new Answer("Der Client bestimmt, welche Daten er bekommt", true),
                        new Answer("Wird als Ersatz für SQL verwendet", false),
                        new Answer("Kann bei vielen Datenfeldern effizienter sein als REST", true),
                        new Answer("Sendet immer alle verfügbaren Daten", false)
                )));

        questions.add(new Question("Was ist der Unterschied zwischen REST und SOAP?",
                List.of(
                        new Answer("SOAP basiert auf XML, REST ist flexibler", true),
                        new Answer("REST ist zustandslos", true),
                        new Answer("SOAP ist meist schlanker als REST", false),
                        new Answer("SOAP nutzt strikte Protokolle und Verträge", true)
                )));

        questions.add(new Question("Welche Vorteile bietet eine gut dokumentierte API?",
                List.of(
                        new Answer("Einfachere Integration durch andere Entwickler", true),
                        new Answer("Vermeidung von Fehlbenutzung", true),
                        new Answer("Ersetzt die Programmlogik", false),
                        new Answer("Spart Supportaufwand", true)
                )));

        questions.add(new Question("Was ist Swagger/OpenAPI?",
                List.of(
                        new Answer("Ein Standard zur Beschreibung von REST-APIs", true),
                        new Answer("Ein API-Testtool für SOAP", false),
                        new Answer("Erzeugt automatisch Dokumentation aus Code", true),
                        new Answer("Wird zur Darstellung von Datenbanken verwendet", false)
                )));

        questions.add(new Question("Was beschreibt eine Schnittstelle (Interface) in der Softwarearchitektur?",
                List.of(
                        new Answer("Ein definierter Zugriffspunkt zwischen Modulen", true),
                        new Answer("Ein GUI-Element", false),
                        new Answer("Hilft bei der Entkopplung von Systemteilen", true),
                        new Answer("Stellt Implementierungsdetails dar", false)
                )));

        questions.add(new Question("Was bedeutet Loose Coupling im Designkontext?",
                List.of(
                        new Answer("Komponenten sind möglichst unabhängig voneinander", true),
                        new Answer("Eine Komponente kann direkt auf interne Felder der anderen zugreifen", false),
                        new Answer("Änderungen bleiben lokal begrenzt", true),
                        new Answer("Enge Kopplung zwischen Klassen", false)
                )));

        questions.add(new Question("Was ist Dependency Injection?",
                List.of(
                        new Answer("Ein Entwurfsmuster zur Entkopplung von Abhängigkeiten", true),
                        new Answer("Objekte werden von außen zugewiesen", true),
                        new Answer("Reduziert die Testbarkeit von Code", false),
                        new Answer("Erleichtert den Austausch von Komponenten", true)
                )));

        questions.add(new Question("Welche Aussage zu Inversion of Control (IoC) ist korrekt?",
                List.of(
                        new Answer("Der Code gibt die Kontrolle ab", true),
                        new Answer("Objekte werden manuell erstellt", false),
                        new Answer("Wird oft durch Dependency Injection umgesetzt", true),
                        new Answer("Verhindert Modularisierung", false)
                )));

        questions.add(new Question("Was ist bei der API-Gestaltung besonders wichtig?",
                List.of(
                        new Answer("Klar definierte Endpunkte", true),
                        new Answer("Dokumentation und Benennungen", true),
                        new Answer("Zufällige Rückgabewerte", false),
                        new Answer("Versionierung bei Änderungen", true)
                )));

        questions.add(new Question("Welche Architektur ist besonders geeignet für Event-Driven Design?",
                List.of(
                        new Answer("Microservices", true),
                        new Answer("Echtzeitsysteme mit asynchroner Kommunikation", true),
                        new Answer("Monolithische Desktop-Anwendung", false),
                        new Answer("Systeme mit Event-Broker (z. B. Kafka)", true)
                )));

        questions.add(new Question("Welche dieser Aussagen zu Serviceorientierung sind korrekt?",
                List.of(
                        new Answer("Services sind lose gekoppelt", true),
                        new Answer("Jeder Service ist für eine bestimmte Aufgabe zuständig", true),
                        new Answer("Alle Services teilen sich denselben Speicher", false),
                        new Answer("Services kommunizieren über standardisierte Schnittstellen", true)
                )));
//----------------Grundlegende SELECT-Syntax
        questions.add(new Question("Wie sieht ein einfacher SELECT-Befehl aus?",
                List.of(
                        new Answer("SELECT * FROM kunden;", true),
                        new Answer("GET ALL FROM kunden;", false),
                        new Answer("SHOW ALL kunden;", false),
                        new Answer("SELECT kunden ALL;", false)
                )));

        questions.add(new Question("Wie filtert man nach einer Bedingung?",
                List.of(
                        new Answer("SELECT * FROM kunden WHERE stadt = 'Berlin';", true),
                        new Answer("SELECT * FROM kunden WHEN stadt = 'Berlin';", false),
                        new Answer("SELECT * FROM kunden IF stadt = 'Berlin';", false),
                        new Answer("SELECT * FROM kunden FILTER stadt = 'Berlin';", false)
                )));

        questions.add(new Question("Wozu dient das Schlüsselwort LIKE?",
                List.of(
                        new Answer("Zum Vergleich mit Platzhaltern", true),
                        new Answer("Um eine Tabelle zu benennen", false),
                        new Answer("Für Primärschlüssel", false),
                        new Answer("Zur Datentypdeklaration", false)
                )));

        questions.add(new Question("Was gibt `SELECT DISTINCT spalte` zurück?",
                List.of(
                        new Answer("Nur unterschiedliche Werte", true),
                        new Answer("Alle Duplikate", false),
                        new Answer("Einzelne Datensätze nach Zufall", false),
                        new Answer("Leere Felder", false)
                )));

        questions.add(new Question("Wie benennt man eine Spalte um (Alias)?",
                List.of(
                        new Answer("SELECT name AS kundenname", true),
                        new Answer("SELECT name RENAME kundenname", false),
                        new Answer("SELECT kundenname <- name", false),
                        new Answer("RENAME name TO kundenname", false)
                )));

        questions.add(new Question("Wie sortiert man Ergebnisse nach einer Spalte?",
                List.of(
                        new Answer("ORDER BY preis", true),
                        new Answer("SORT preis", false),
                        new Answer("GROUP preis", false),
                        new Answer("ORDER preis BY", false)
                )));

        questions.add(new Question("Wie gibt man nur Einträge mit Preis > 100 aus?",
                List.of(
                        new Answer("SELECT * FROM produkte WHERE preis > 100;", true),
                        new Answer("SELECT preis > 100 FROM produkte;", false),
                        new Answer("SELECT * FROM produkte IF preis > 100;", false),
                        new Answer("GET * FROM produkte WHEN preis > 100;", false)
                )));

        questions.add(new Question("Wie kombiniert man mehrere Bedingungen mit AND/OR?",
                List.of(
                        new Answer("WHERE stadt = 'Berlin' AND land = 'DE'", true),
                        new Answer("IF stadt = 'Berlin' OR land = 'DE'", false),
                        new Answer("WHERE stadt = 'Berlin', land = 'DE'", false),
                        new Answer("WHERE (stadt, land) = ('Berlin', 'DE')", false)
                )));
//----------------INSERT, UPDATE, DELETE
        questions.add(new Question("Wie fügt man einen neuen Datensatz ein?",
                List.of(
                        new Answer("INSERT INTO kunden (name, stadt) VALUES ('Max', 'Köln');", true),
                        new Answer("ADD TO kunden ('Max', 'Köln');", false),
                        new Answer("INSERT ('Max', 'Köln') INTO kunden;", false),
                        new Answer("PUT INTO kunden (name, stadt) = ('Max', 'Köln');", false)
                )));

        questions.add(new Question("Wie ändert man Daten in einer Tabelle?",
                List.of(
                        new Answer("UPDATE kunden SET stadt = 'Berlin' WHERE id = 5;", true),
                        new Answer("CHANGE kunden SET stadt = 'Berlin';", false),
                        new Answer("MODIFY kunden WHERE id = 5;", false),
                        new Answer("REPLACE kunden SET stadt = 'Berlin';", false)
                )));

        questions.add(new Question("Wie löscht man einen Eintrag?",
                List.of(
                        new Answer("DELETE FROM kunden WHERE id = 1;", true),
                        new Answer("REMOVE FROM kunden (id = 1);", false),
                        new Answer("DELETE kunden ID 1;", false),
                        new Answer("DROP FROM kunden WHERE id = 1;", false)
                )));
//----------------Tabellenstruktur, Datentypen, Schlüssel
        questions.add(new Question("Wie erstellt man eine neue Tabelle?",
                List.of(
                        new Answer("CREATE TABLE kunden (id INT, name VARCHAR(100));", true),
                        new Answer("NEW TABLE kunden (id INT, name TEXT);", false),
                        new Answer("MAKE TABLE kunden...", false),
                        new Answer("TABLE kunden = (id, name);", false)
                )));

        questions.add(new Question("Was ist ein Primärschlüssel (PRIMARY KEY)?",
                List.of(
                        new Answer("Eindeutige Identifikation eines Datensatzes", true),
                        new Answer("Kann mehrfach vorkommen", false),
                        new Answer("Wird oft mit `id` bezeichnet", true),
                        new Answer("Erlaubt NULL-Werte", false)
                )));

        questions.add(new Question("Wie wird ein Primärschlüssel gesetzt?",
                List.of(
                        new Answer("id INT PRIMARY KEY", true),
                        new Answer("id INT UNIQUE NULL", false),
                        new Answer("PRIMARY id KEY", false),
                        new Answer("id PRIMARY INT", false)
                )));

        questions.add(new Question("Was ist der Datentyp VARCHAR?",
                List.of(
                        new Answer("Zeichenkette variabler Länge", true),
                        new Answer("Ganzzahl", false),
                        new Answer("Zahl mit Nachkommastellen", false),
                        new Answer("Fester String", false)
                )));

        questions.add(new Question("Wie löscht man eine ganze Tabelle?",
                List.of(
                        new Answer("DROP TABLE kunden;", true),
                        new Answer("DELETE ALL FROM kunden;", false),
                        new Answer("REMOVE TABLE kunden;", false),
                        new Answer("ERASE TABLE kunden;", false)
                )));
//----------------JOINs, GROUP BY, HAVING, Aggregatfunktionen
        questions.add(new Question("Was bewirkt ein INNER JOIN?",
                List.of(
                        new Answer("Verbindet zwei Tabellen über gemeinsame Werte", true),
                        new Answer("Gibt nur passende Paare beider Tabellen zurück", true),
                        new Answer("Zeigt alle Einträge aus beiden Tabellen", false),
                        new Answer("Erfordert keinen Schlüssel", false)
                )));

        questions.add(new Question("Was bewirkt ein LEFT JOIN?",
                List.of(
                        new Answer("Alle Zeilen der linken Tabelle, auch ohne Match", true),
                        new Answer("Nur übereinstimmende Zeilen", false),
                        new Answer("Alle Zeilen der rechten Tabelle", false),
                        new Answer("Gleiches wie CROSS JOIN", false)
                )));

        questions.add(new Question("Wofür wird GROUP BY verwendet?",
                List.of(
                        new Answer("Zum Gruppieren von Datensätzen", true),
                        new Answer("Mit Aggregatfunktionen wie COUNT()", true),
                        new Answer("Zur Sortierung", false),
                        new Answer("Zum Löschen von Duplikaten", false)
                )));

        questions.add(new Question("Was macht COUNT(*)?",
                List.of(
                        new Answer("Zählt alle Zeilen", true),
                        new Answer("Berechnet die Summe von Zahlen", false),
                        new Answer("Zählt NULL-Werte", false),
                        new Answer("Gibt alle Spaltennamen aus", false)
                )));

        questions.add(new Question("Wie filtert man Gruppenergebnisse?",
                List.of(
                        new Answer("HAVING SUM(preis) > 100", true),
                        new Answer("WHERE SUM(preis) > 100", false),
                        new Answer("FILTER SUM(preis) > 100", false),
                        new Answer("GROUP WHERE preis > 100", false)
                )));
//---------------- Zwischenwerte, Mengenvergleiche, NULL
        questions.add(new Question("Was macht BETWEEN 10 AND 20?",
                List.of(
                        new Answer("Gibt Werte im Bereich 10–20 zurück", true),
                        new Answer("Schließt nur 10 ein", false),
                        new Answer("Funktioniert nicht mit Strings", false),
                        new Answer("Ist das gleiche wie IN (10, 20)", false)
                )));

        questions.add(new Question("Was bewirkt `IN ('Berlin', 'Hamburg')`?",
                List.of(
                        new Answer("Prüft, ob ein Wert in der Liste enthalten ist", true),
                        new Answer("Funktioniert wie mehrere ODER-Bedingungen", true),
                        new Answer("Erlaubt keine Zeichenketten", false),
                        new Answer("Nur für numerische Felder", false)
                )));

        questions.add(new Question("Wie prüft man auf NULL?",
                List.of(
                        new Answer("WHERE wert IS NULL", true),
                        new Answer("WHERE wert = NULL", false),
                        new Answer("WHERE wert IS NOT NULL", true),
                        new Answer("IF wert NULL", false)
                )));

//----------------Programmierung
        questions.add(new Question("Angenommen, du hast eine Klasse 'Auto' mit privaten Attributen 'marke' und 'geschwindigkeit'. "
                            + "Welche der folgenden Aussagen beschreibt gute objektorientierte Praxis im Umgang mit diesen Attributen?",
                List.of(
                        new Answer("Die Attribute sollten direkt öffentlich gemacht werden, um einfachen Zugriff zu ermöglichen.", false),
                        new Answer("Getter- und Setter-Methoden sollten verwendet werden, um kontrollierten Zugriff auf die Attribute zu ermöglichen.", true),
                        new Answer("Private Attribute können nur von Methoden innerhalb derselben Klasse verwendet werden.", true),
                        new Answer("Getter-Methoden sollten immer static sein, um von überall erreichbar zu sein.", false)
                )));
        questions.add(new Question("Wie beginnt die Definition einer Java-Klasse korrekt?",
                List.of(
                        new Answer("public class MeineKlasse {", true),
                        new Answer("define MeineKlasse {}", false),
                        new Answer("class MeineKlasse()", false),
                        new Answer("public MeineKlasse : class", false)
                )));

        questions.add(new Question("Wie erstellt man eine neue Instanz einer Klasse?",
                List.of(
                        new Answer("MeinObjekt = new Klasse();", false),
                        new Answer("new Klasse() = MeinObjekt;", false),
                        new Answer("Klasse MeinObjekt = new Klasse();", true),
                        new Answer("MeinObjekt : Klasse();", false)
                )));

        questions.add(new Question("Wie wird eine Methode korrekt definiert?",
                List.of(
                        new Answer("public void machEtwas() { ... }", true),
                        new Answer("function machEtwas() {}", false),
                        new Answer("void machEtwas() {}", true),
                        new Answer("machEtwas() public void {}", false)
                )));

        questions.add(new Question("Wie gibt man eine Methode mit Rückgabewert zurück?",
                List.of(
                        new Answer("return wert;", true),
                        new Answer("output wert;", false),
                        new Answer("yield wert;", false),
                        new Answer("exit wert;", false)
                )));

        questions.add(new Question("Wie wird eine `if`-Bedingung in Java geschrieben?",
                List.of(
                        new Answer("if (x > 0) { ... }", true),
                        new Answer("if x > 0 then { ... }", false),
                        new Answer("falls (x > 0) { ... }", false),
                        new Answer("if x > 0 { ... }", false)
                )));

        questions.add(new Question("Wie wird eine Schleife mit fester Anzahl Wiederholungen geschrieben?",
                List.of(
                        new Answer("for (int i = 0; i < 10; i++) { ... }", true),
                        new Answer("repeat (i < 10) { ... }", false),
                        new Answer("loop i from 0 to 10 { ... }", false),
                        new Answer("while i < 10 { ... }", false)
                )));

        questions.add(new Question("Wie definiert man ein Array aus ganzen Zahlen?",
                List.of(
                        new Answer("int[] zahlen = new int[5];", true),
                        new Answer("array zahlen = int[5];", false),
                        new Answer("int zahlen[5];", false),
                        new Answer("int zahlen = {1, 2, 3};", false)
                )));

        questions.add(new Question("Wie kommentiert man eine einzelne Zeile in Java?",
                List.of(
                        new Answer("// Das ist ein Kommentar", true),
                        new Answer("<!-- Kommentar -->", false),
                        new Answer("# Kommentar", false),
                        new Answer("REM Kommentar", false)
                )));

        questions.add(new Question("Wie heißt die Einstiegsmethode in einem Java-Programm?",
                List.of(
                        new Answer("main", true),
                        new Answer("start", false),
                        new Answer("run", false),
                        new Answer("launch", false)
                )));

        questions.add(new Question("Wie sieht die korrekte Methodensignatur der `main` aus?",
                List.of(
                        new Answer("public static void main(String[] args)", true),
                        new Answer("static void main()", false),
                        new Answer("public void main(String args)", false),
                        new Answer("main(String[] args) {}", false)
                )));

        questions.add(new Question("Wie gibt man Text in der Konsole aus?",
                List.of(
                        new Answer("System.out.println(\"Text\");", true),
                        new Answer("print(\"Text\")", false),
                        new Answer("console.log(\"Text\")", false),
                        new Answer("echo \"Text\";", false)
                )));

        questions.add(new Question("Was ist ein gültiger Java-Datentyp?",
                List.of(
                        new Answer("int", true),
                        new Answer("string", false),
                        new Answer("boolean", true),
                        new Answer("double", true)
                )));

        questions.add(new Question("Wie wird eine `while`-Schleife korrekt geschrieben?",
                List.of(
                        new Answer("while (bedingung) { ... }", true),
                        new Answer("loop while { ... }", false),
                        new Answer("while bedingung { ... }", false),
                        new Answer("repeat until (bedingung) { ... }", false)
                )));

        questions.add(new Question("Wie vergleicht man zwei Werte in Java?",
                List.of(
                        new Answer("==", true),
                        new Answer("=", false),
                        new Answer("equals()", true),
                        new Answer("!=", true)
                )));

        questions.add(new Question("Was macht `break` in einer Schleife?",
                List.of(
                        new Answer("Beendet die Schleife sofort", true),
                        new Answer("Springt zur nächsten Iteration", false),
                        new Answer("Bricht das ganze Programm ab", false),
                        new Answer("Führt eine Bedingung aus", false)
                )));

        questions.add(new Question("Was ist eine Zeichenkette in Java?",
                List.of(
                        new Answer("String", true),
                        new Answer("str", false),
                        new Answer("char[]", true),
                        new Answer("text", false)
                )));

        questions.add(new Question("Wie schreibt man eine `switch`-Anweisung?",
                List.of(
                        new Answer("switch (wert) { case ... }", true),
                        new Answer("select (wert) { ... }", false),
                        new Answer("switch wert then", false),
                        new Answer("if/switch (wert) { ... }", false)
                )));

        questions.add(new Question("Was ist der Unterschied zwischen `==` und `equals()` bei Objekten?",
                List.of(
                        new Answer("== vergleicht Referenzen", true),
                        new Answer("equals() vergleicht Inhalte", true),
                        new Answer("== vergleicht Strings korrekt", false),
                        new Answer("equals() funktioniert nur bei Zahlen", false)
                )));

        questions.add(new Question("Wie erzeugt man eine Zufallszahl in Java?",
                List.of(
                        new Answer("new Random().nextInt()", true),
                        new Answer("Math.random()", true),
                        new Answer("random()", false),
                        new Answer("RND()", false)
                )));

        questions.add(new Question("Wie sieht ein Konstruktor in Java aus?",
                List.of(
                        new Answer("Hat keinen Rückgabewert", true),
                        new Answer("Heißt genauso wie die Klasse", true),
                        new Answer("Kann überladen werden", true),
                        new Answer("Hat das Schlüsselwort `construct`", false)
                )));


        questions.add(new Question("Welche dieser Programmiersprachen sind objektorientiert?",
                List.of(
                        new Answer("Java", true),
                        new Answer("Python", true),
                        new Answer("HTML", false),
                        new Answer("C#", true)
                )));

        questions.add(new Question("Was ist das Hauptmerkmal der objektorientierten Programmierung?",
                List.of(
                        new Answer("Verwendung von Klassen und Objekten", true),
                        new Answer("Globale Variablen und GOTO-Befehle", false),
                        new Answer("Kapselung von Daten und Verhalten", true),
                        new Answer("Verzicht auf Wiederverwendbarkeit", false)
                )));

        questions.add(new Question("Was beschreibt Polymorphie in Java?",
                List.of(
                        new Answer("Ein Objekt verhält sich unterschiedlich je nach Kontext", true),
                        new Answer("Eine Methode mit mehreren Parametervarianten", true),
                        new Answer("Ein Konstruktor ohne Parameter", false),
                        new Answer("Mehrere Klassen mit gleicher Superklasse", true)
                )));

        questions.add(new Question("Welche der folgenden sind typische lineare Datenstrukturen?",
                List.of(
                        new Answer("ArrayList", true),
                        new Answer("Stack", true),
                        new Answer("HashMap", false),
                        new Answer("Queue", true)
                )));

        questions.add(new Question("Was beschreibt ein Stack?",
                List.of(
                        new Answer("Last In – First Out (LIFO)", true),
                        new Answer("Erstes Element wird zuerst entnommen", false),
                        new Answer("Push und Pop sind typische Operationen", true),
                        new Answer("Wird z. B. für Methodenaufrufe verwendet", true)
                )));

        questions.add(new Question("Was bedeutet 'rekursiv' bei Algorithmen?",
                List.of(
                        new Answer("Eine Funktion ruft sich selbst auf", true),
                        new Answer("Der Code wird einmalig ausgeführt", false),
                        new Answer("Ist oft kürzer, aber speicherintensiver", true),
                        new Answer("Kann durch Schleifen ersetzt werden", true)
                )));

        questions.add(new Question("Welche dieser Sortieralgorithmen sind stabil?",
                List.of(
                        new Answer("Bubblesort", true),
                        new Answer("Mergesort", true),
                        new Answer("Quicksort", false),
                        new Answer("Insertionsort", true)
                )));

        questions.add(new Question("Was ist das Ziel des SOLID-Prinzips?",
                List.of(
                        new Answer("Bessere Wartbarkeit und Erweiterbarkeit von Code", true),
                        new Answer("Minimale CPU-Auslastung", false),
                        new Answer("Strukturierte, klare Architektur", true),
                        new Answer("Erleichterung für Entwicklerteams", true)
                )));

        questions.add(new Question("Was bedeutet das 'S' in SOLID?",
                List.of(
                        new Answer("Single Responsibility Principle", true),
                        new Answer("Schnelle Ausführung", false),
                        new Answer("Strukturierte Datenhaltung", false),
                        new Answer("Eine Klasse hat genau eine Aufgabe", true)
                )));

        questions.add(new Question("Was ist ein Singleton?",
                List.of(
                        new Answer("Ein Entwurfsmuster mit genau einer Instanz", true),
                        new Answer("Ein statisches Datenfeld", false),
                        new Answer("Typischerweise private Konstruktor + getInstance()", true),
                        new Answer("Für häufige, globale Zugriffspunkte geeignet", true)
                )));

        questions.add(new Question("Wozu dient das Factory Pattern?",
                List.of(
                        new Answer("Zur Erzeugung von Objekten über eine zentrale Stelle", true),
                        new Answer("Zur Dekoration von Klassen", false),
                        new Answer("Trennt Erzeugung vom konkreten Typ", true),
                        new Answer("Ersetzt Konstruktoren in bestimmten Fällen", true)
                )));

        questions.add(new Question("Was ist ein Observer im Observer Pattern?",
                List.of(
                        new Answer("Ein Objekt, das über Änderungen informiert wird", true),
                        new Answer("Ein Container für Daten", false),
                        new Answer("Teil eines Publish-Subscribe-Mechanismus", true),
                        new Answer("Ein Singleton", false)
                )));

        questions.add(new Question("Was beschreibt das MVC-Modell?",
                List.of(
                        new Answer("Model-View-Controller", true),
                        new Answer("Trennung von Daten, Logik und Darstellung", true),
                        new Answer("Verwendung von rekursiven Funktionen", false),
                        new Answer("Modulares Softwaredesign", true)
                )));

        questions.add(new Question("Welche Aussagen zu Exceptions in Java sind korrekt?",
                List.of(
                        new Answer("Exceptions sind Objekte", true),
                        new Answer("Man kann eigene Exceptionklassen definieren", true),
                        new Answer("Unchecked Exceptions müssen immer behandelt werden", false),
                        new Answer("Checked Exceptions erfordern try-catch oder throws", true)
                )));

        questions.add(new Question("Was ist der Unterschied zwischen 'throw' und 'throws' in Java?",
                List.of(
                        new Answer("'throw' wird zum Auslösen einer Exception genutzt", true),
                        new Answer("'throws' steht in der Methodensignatur", true),
                        new Answer("'throws' wird im Catch-Block verwendet", false),
                        new Answer("'throw' kann nur bei NullPointer verwendet werden", false)
                )));

        questions.add(new Question("Welche Tools oder Techniken helfen beim Debugging?",
                List.of(
                        new Answer("Breakpoints", true),
                        new Answer("Step-Over / Step-Into", true),
                        new Answer("Log-Ausgaben", true),
                        new Answer("final-Variablen", false)
                )));

        questions.add(new Question("Was gehört zu Clean Code nach Robert C. Martin?",
                List.of(
                        new Answer("Sprechende Variablennamen", true),
                        new Answer("Kurze Methoden", true),
                        new Answer("Globale Variablen", false),
                        new Answer("Klarer Code statt cleverer Tricks", true)
                )));

        questions.add(new Question("Was ist ein Interface in Java?",
                List.of(
                        new Answer("Eine Sammlung von Methodendeklarationen", true),
                        new Answer("Kann durch eine Klasse implementiert werden", true),
                        new Answer("Enthält Code mit Zuständen", false),
                        new Answer("Ermöglicht Polymorphie", true)
                )));

        questions.add(new Question("Was sind Vorteile funktionaler Programmierung?",
                List.of(
                        new Answer("Keine Nebenwirkungen", true),
                        new Answer("Besser testbarer Code", true),
                        new Answer("Geringe Lesbarkeit", false),
                        new Answer("Häufige Nutzung von Lambda-Ausdrücken", true)
                )));

        questions.add(new Question("Welche Aussagen zu Datenstrukturen sind korrekt?",
                List.of(
                        new Answer("HashMap speichert Schlüssel-Wert-Paare", true),
                        new Answer("Eine Queue arbeitet nach FIFO-Prinzip", true),
                        new Answer("Ein Array wächst automatisch", false),
                        new Answer("Ein Binärbaum hat max. zwei Nachfolger pro Knoten", true)
                )));


        questions.add(new Question("Was ist ein gültiger Variablenname in Java?",
                List.of(
                        new Answer("int", false),
                        new Answer("_anzahl", true),
                        new Answer("2wert", false),
                        new Answer("wert$", true)
                )));

        questions.add(new Question("Welche Aussagen zu 'public static void main(String[] args)' sind korrekt?",
                List.of(
                        new Answer("Es ist die Startmethode eines Java-Programms.", true),
                        new Answer("Sie kann beliebig heißen.", false),
                        new Answer("Sie darf nicht public sein.", false),
                        new Answer("Sie muss static sein.", true)
                )));

        questions.add(new Question("Welche der folgenden sind primitive Datentypen in Java?",
                List.of(
                        new Answer("int", true),
                        new Answer("String", false),
                        new Answer("boolean", true),
                        new Answer("Integer", false)
                )));

        questions.add(new Question("Was bewirkt der Vergleich mit '==' bei Objekten?",
                List.of(
                        new Answer("Vergleicht die Inhalte der Objekte.", false),
                        new Answer("Vergleicht die Referenzen (Speicheradressen).", true),
                        new Answer("Ist gleichwertig mit .equals().", false),
                        new Answer("Kann bei Strings zuverlässig Inhalt vergleichen.", false)
                )));

        questions.add(new Question("Was kann mit System.out.println() erreicht werden?",
                List.of(
                        new Answer("Textausgabe in der Konsole", true),
                        new Answer("Fehlerbehandlung", false),
                        new Answer("Datei speichern", false),
                        new Answer("Debug-Ausgabe", true)
                )));

        questions.add(new Question("Welche Schlüsselwörter werden für Vererbung verwendet?",
                List.of(
                        new Answer("extends", true),
                        new Answer("inherits", false),
                        new Answer("implements", true),
                        new Answer("superclass", false)
                )));

        questions.add(new Question("Welche Aussagen zu Arrays in Java sind korrekt?",
                List.of(
                        new Answer("Arrays haben eine feste Länge.", true),
                        new Answer("Array-Länge wird mit length abgefragt.", true),
                        new Answer("Arrays sind dynamisch wie ArrayList.", false),
                        new Answer("Arrays dürfen keine null-Werte enthalten.", false)
                )));

        questions.add(new Question("Welche Aussagen zur for-Schleife sind korrekt?",
                List.of(
                        new Answer("Sie kann unendlich laufen.", true),
                        new Answer("Sie benötigt zwingend einen Zähler.", false),
                        new Answer("Sie kann mit break beendet werden.", true),
                        new Answer("Sie prüft die Bedingung nach dem Schleifendurchlauf.", false)
                )));

        questions.add(new Question("Welche Klassen gehören zum Java Collections Framework?",
                List.of(
                        new Answer("ArrayList", true),
                        new Answer("HashMap", true),
                        new Answer("Hashtable", true),
                        new Answer("BufferedReader", false)
                )));

        questions.add(new Question("Welche Ausdrücke führen zu einem Compilerfehler?",
                List.of(
                        new Answer("int x = \"Hallo\";", true),
                        new Answer("String s = null;", false),
                        new Answer("double d = 3.14f;", false),
                        new Answer("boolean b = 1;", true)
                )));
        questions.add(new Question("Was beschreibt das Prinzip der Kapselung?",
                List.of(
                        new Answer("Zugriffsschutz durch Sichtbarkeiten", true),
                        new Answer("Vererbung von Methoden", false),
                        new Answer("Benutzung von Interfaces", false),
                        new Answer("Mehrere Konstruktoren", false)
                )));

        questions.add(new Question("Was ist ein Konstruktor?",
                List.of(
                        new Answer("Methode zur Initialisierung", true),
                        new Answer("Kann keinen Rückgabetyp haben", true),
                        new Answer("Hat immer static", false),
                        new Answer("Wird durch new aufgerufen", true)
                )));

        questions.add(new Question("Was bedeutet Vererbung?",
                List.of(
                        new Answer("Eine Klasse erbt von einer anderen", true),
                        new Answer("Eine Methode ruft sich selbst auf", false),
                        new Answer("Nur Interfaces können erben", false),
                        new Answer("Vererbte Methoden können überschrieben werden", true)
                )));

        questions.add(new Question("Was ist Polymorphie?",
                List.of(
                        new Answer("Gleiches Interface, unterschiedliche Implementierung", true),
                        new Answer("Nur eine Klasse pro Datei", false),
                        new Answer("Methoden mit gleichem Namen", true),
                        new Answer("Nur bei privaten Methoden möglich", false)
                )));

        questions.add(new Question("Was ist ein Interface?",
                List.of(
                        new Answer("Vertrag für Methoden", true),
                        new Answer("Kann Felder mit Werten enthalten", false),
                        new Answer("Kann keine Konstruktoren haben", true),
                        new Answer("Kann mit implements eingebunden werden", true)
                )));

        questions.add(new Question("Welche Modifizierer schränken den Zugriff ein?",
                List.of(
                        new Answer("private", true),
                        new Answer("protected", true),
                        new Answer("static", false),
                        new Answer("public", false)
                )));

        questions.add(new Question("Was ist das Ziel von Abstraktion?",
                List.of(
                        new Answer("Komplexität verbergen", true),
                        new Answer("Alles sichtbar machen", false),
                        new Answer("Vererbung verhindern", false),
                        new Answer("Nur primitive Typen verwenden", false)
                )));

        questions.add(new Question("Was bedeutet 'this' in einer Methode?",
                List.of(
                        new Answer("Referenz auf das aktuelle Objekt", true),
                        new Answer("Verweis auf die Superklasse", false),
                        new Answer("Zugriff auf statische Methoden", false),
                        new Answer("Wird automatisch gesetzt", true)
                )));

        questions.add(new Question("Welche Aussage zu abstract ist korrekt?",
                List.of(
                        new Answer("abstract-Klassen können Methoden definieren", true),
                        new Answer("abstract-Methoden haben keinen Rumpf", true),
                        new Answer("abstract-Klassen können instanziiert werden", false),
                        new Answer("abstract gilt auch für Interfaces", false)
                )));

        questions.add(new Question("Was trifft auf Methodenüberladung zu?",
                List.of(
                        new Answer("Gleicher Name, unterschiedliche Parameter", true),
                        new Answer("Nur in Interfaces erlaubt", false),
                        new Answer("Nur private Methoden dürfen überladen werden", false),
                        new Answer("Kompiliert bei unterschiedlichem Rückgabewert allein nicht", true)
                )));
//--------Kommunikation
        questions.add(new Question("Was ist eine typische Eigenschaft aktiver Zuhörer?",
                List.of(
                        new Answer("Sie unterbrechen häufig.", false),
                        new Answer("Sie nicken oder geben Feedback wie 'verstehe'.", true),
                        new Answer("Sie wechseln sofort das Thema.", false),
                        new Answer("Sie fassen das Gehörte gelegentlich zusammen.", true)
                )));

        questions.add(new Question("Was zählt zur nonverbalen Kommunikation?",
                List.of(
                        new Answer("Blickkontakt", true),
                        new Answer("Gestik", true),
                        new Answer("E-Mail", false),
                        new Answer("Körpersprache", true)
                )));

        questions.add(new Question("Was beschreibt das Sender-Empfänger-Modell?",
                List.of(
                        new Answer("Nur der Sender ist für Missverständnisse verantwortlich.", false),
                        new Answer("Es geht um die Übertragung und Interpretation von Botschaften.", true),
                        new Answer("Ein Empfänger kann nie Sender sein.", false),
                        new Answer("Kommunikation ist ein wechselseitiger Prozess.", true)
                )));

        questions.add(new Question("Welche Kommunikationskanäle gelten als verbal?",
                List.of(
                        new Answer("Gesprochene Sprache", true),
                        new Answer("Geschriebene Sprache", true),
                        new Answer("Körpersprache", false),
                        new Answer("Mimik", false)
                )));

        questions.add(new Question("Welche Aussagen zu Feedback sind korrekt?",
                List.of(
                        new Answer("Feedback sollte konkret und zeitnah sein.", true),
                        new Answer("Feedback darf nie kritisieren.", false),
                        new Answer("Ich-Botschaften sind hilfreich beim Feedbackgeben.", true),
                        new Answer("Feedback ist nur in Bewerbungsgesprächen relevant.", false)
                )));

        questions.add(new Question("Was können typische Kommunikationsstörungen sein?",
                List.of(
                        new Answer("Unklare Sprache", true),
                        new Answer("Vorurteile", true),
                        new Answer("Gleichzeitiges Sprechen", true),
                        new Answer("Gute Vorbereitung", false)
                )));

        questions.add(new Question("Was gehört zur gewaltfreien Kommunikation nach Marshall Rosenberg?",
                List.of(
                        new Answer("Beobachtung ohne Bewertung", true),
                        new Answer("Moralische Urteile", false),
                        new Answer("Gefühle ausdrücken", true),
                        new Answer("Vorwürfe machen", false)
                )));

        questions.add(new Question("Was ist ein Kommunikationsziel?",
                List.of(
                        new Answer("Was der Empfänger verstehen soll", true),
                        new Answer("Die geplante Wirkung meiner Botschaft", true),
                        new Answer("Die Anzahl der gesagten Wörter", false),
                        new Answer("Das Gespräch ohne Antwort beenden", false)
                )));

        questions.add(new Question("Wie kann man Missverständnisse vermeiden?",
                List.of(
                        new Answer("Rückfragen stellen", true),
                        new Answer("Langsam sprechen", false),
                        new Answer("Zusammenfassen, was gesagt wurde", true),
                        new Answer("Fachbegriffe möglichst häufig nutzen", false)
                )));

        questions.add(new Question("Welche dieser Gesprächstechniken fördern ein gutes Gespräch?",
                List.of(
                        new Answer("Paraphrasieren", true),
                        new Answer("Ironie einsetzen", false),
                        new Answer("Nachfragen", true),
                        new Answer("Abwertungen vermeiden", true)
                )));

        questions.add(new Question("Was ist bei Körpersprache zu beachten?",
                List.of(
                        new Answer("Sie wirkt meist stärker als gesprochene Worte.", true),
                        new Answer("Sie ist immer bewusst gesteuert.", false),
                        new Answer("Sie kann Widersprüche zur Sprache zeigen.", true),
                        new Answer("Sie ist bedeutungslos in der Kommunikation.", false)
                )));

        questions.add(new Question("Was sind Ich-Botschaften?",
                List.of(
                        new Answer("Aussagen über eigene Wahrnehmung und Gefühle", true),
                        new Answer("Schuldzuweisungen", false),
                        new Answer("Anklagende Aussagen", false),
                        new Answer("Hilfe, um Konflikte zu entschärfen", true)
                )));

        questions.add(new Question("Was versteht man unter aktivem Zuhören?",
                List.of(
                        new Answer("Aufmerksam sein", true),
                        new Answer("Inhalte bewerten", false),
                        new Answer("Mitschreiben", false),
                        new Answer("Empathisch reagieren", true)
                )));

        questions.add(new Question("Was sind typische Merkmale eines gelungenen Feedbacks?",
                List.of(
                        new Answer("Es ist beschreibend, nicht wertend.", true),
                        new Answer("Es ist konkret und situationsbezogen.", true),
                        new Answer("Es erfolgt anonym und pauschal.", false),
                        new Answer("Es ist sofort emotional", false)
                )));

        questions.add(new Question("Welche der folgenden Aussagen sind Teil der 4-Seiten-einer-Nachricht nach Schulz von Thun?",
                List.of(
                        new Answer("Sachebene", true),
                        new Answer("Appell", true),
                        new Answer("Selbstoffenbarung", true),
                        new Answer("Aggressionslevel", false)
                )));

        questions.add(new Question("Was ist eine typische Barriere in der interkulturellen Kommunikation?",
                List.of(
                        new Answer("Sprachunterschiede", true),
                        new Answer("Zeitverschiebung", false),
                        new Answer("Unterschiedliche Körpersprache", true),
                        new Answer("Abweichende Gesprächsrituale", true)
                )));

        questions.add(new Question("Was bedeutet Empathie in der Kommunikation?",
                List.of(
                        new Answer("Sich in andere hineinversetzen können", true),
                        new Answer("Die Meinung des anderen ignorieren", false),
                        new Answer("Gefühle nachempfinden", true),
                        new Answer("Ratschläge sofort geben", false)
                )));

        questions.add(new Question("Was ist ein Kommunikationsstil?",
                List.of(
                        new Answer("Ein wiederkehrendes Muster des Sprechens", true),
                        new Answer("Eine Form von Körpersprache", false),
                        new Answer("Kann aggressiv oder wertschätzend sein", true),
                        new Answer("Nur in Schriftform relevant", false)
                )));

        questions.add(new Question("Was kann in einer E-Mail als unhöflich wahrgenommen werden?",
                List.of(
                        new Answer("Großbuchstaben als SCHREIEN", true),
                        new Answer("Unpersönliche Anrede", true),
                        new Answer("Korrekte Grammatik", false),
                        new Answer("Fehlender Betreff", true)
                )));

        questions.add(new Question("Was ist beim Telefonieren im beruflichen Kontext wichtig?",
                List.of(
                        new Answer("Mit Namen melden", true),
                        new Answer("Schnell auflegen", false),
                        new Answer("Notizen machen", true),
                        new Answer("Zuhören und Rückfragen stellen", true)
                )));

        questions.add(new Question("Welche Rolle spielt Kontext in der Kommunikation?",
                List.of(
                        new Answer("Er bestimmt mit, wie eine Botschaft verstanden wird", true),
                        new Answer("Kontext ist bei klarer Sprache unwichtig", false),
                        new Answer("Er kann Missverständnisse verhindern", true),
                        new Answer("Nur der Inhalt zählt, nicht der Rahmen", false)
                )));
    }

    public Question getRandomQuestion() {
        if (questions.isEmpty()) {
            return null;
        }
        return questions.get(random.nextInt(questions.size()));
    }
}
