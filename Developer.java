/**
 * Hledáme vývojáře, který nám pomůže s údržbou a rozvojem FlexiBee. 
 * Člověka do týmu co se rád zlepšuje a posouvá věci dopředu. 
 * Primárně hledá řešení a né problém.  
 * Pokud se nebojíš nastoupit do velkého projektu, rád programuješ 
 * a chceš dělat smysluplnou práci. Tak neváhej a přidej se k nám.
 *
 * @author FlexiBee Systems s.r.o.
 * @version 1.0
 * @since 2017-10-31
 */
public class Developer {

    public static class Requirements {

        final String LANGUAGE = "Java";
        final String TESTING = "JUnit";
        final String SQL_DIALECT = "Postgres";
        final String DEVELOPER_LEVEL = "Pokročilý";
        final String SKILL = "Schopnost hledat řešení";
        final String[] HUMAN_LANGUAGES = { "Česky", "English" }
    }

    public class Advantages {

        final String[] SKILLS = { "NoSQL (CouchDB)", "XML", "XSLT", "JIRA", "git", "Amazon AWS" };
        final String[] SPECIAL = { "Orientace v cizím kódu", "Znalost účetní problematiky" };

        public String getRefactoringLevel() {
            return "Ninja";
        }
    }

    public class OurJob {

        final String AGILE = "SCRUM";
        final String DAILY = "Stand up";
        final String CAPABILITY = "Volnost v návrhu řešení";
        final String FOCUS = "Na výsledek";
    }

    public static void main(String[] args) {

        System.out.println("Co ti můžeme nabínout:\n"
            + "- Přátelský kolektiv, otevřenost, výbornou firemní kulturu (a k tomu nějaké ty stravenky)\n"
            + "- Flexibilní pracovní dobu (občas můžeš pracovat z domova)\n"
            + "- Dotované kurzy angličtiny\n"
            + "- Osobní a individuální přístup\n"
            + "- 5 týdnů dovolené\n"
            + "- Práci na hlavní pracovní poměr");
    }
}
