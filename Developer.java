/**
 * Jsi JAVA vývojář, který se rád zlepšuje ve své práci a posouvá věci dopředu.
 * Primárně hledá řešení a né problém.
 * <p>
 * Pokud se nebojíš nastoupit do velkého projektu, rád programuješ a chceš dělat
 * smysluplnou práci. Tak neváhej a přidej se k nám. A pomoz nám rozvíjet
 * FlexiBee účetní online software, který používá více než 6500 firem.
 * <p>
 * Jsme mladý dynamický tým s podporou ABRA Software.
 *
 * @author FlexiBee Systems s.r.o.
 * @version 1.0
 * @since 2017-11-01
 */
public class Developer {

    public class Requirements {

        final String LANGUAGE = "Java";
        final String TESTING = "JUnit";
        final String SQL_DIALECT = "Postgres";
        final String DEVELOPER_LEVEL = "Pokročilý";
        final String SKILL = "Schopnost hledat řešení";
        final String[] HUMAN_LANGUAGES = { "Česky", "English" };
    }

    public enum SkillLevel {
        BEGINNER, INTERMEDIATE, NINJA, GOD
    }

    public class Advantages {

        final String[] SKILLS = { "NoSQL (CouchDB)", "XML", "XSLT", "JIRA", "git", "Amazon AWS" };
        final String[] SPECIAL = { "Orientace v cizím kódu", "Znalost účetní problematiky" };

        public SkillLevel getRefactoringLevel() {
            return SkillLevel.NINJA;
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
