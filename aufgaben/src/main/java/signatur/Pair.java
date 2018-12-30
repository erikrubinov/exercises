package signatur;

public class Pair{

	private final String key;
	private final String value;

	public Pair (String key, String value) {
		this.key=key;
		this.value=value;
	}

	public Pair (String key, int value) {
		this(key, Integer.toString(value));
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public String getString() {
		return "'"+key+"': '"+value+"'";
	}

	// "'farbe': 'rot'"
	// new Pair("farbe", "rot");
	public static Pair fromString(String s ) {

		String[] array=s.split("'");
		return new Pair(array[0],array[2]);


	}


}
