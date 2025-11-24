package theater;

/**
 * Represents a play with a name and type.
 *
 * @null This class requires no additional Javadoc tags.
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
