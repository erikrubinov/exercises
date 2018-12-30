package signatur;

public class Certificate {
	
	

	private Algorithm algorithm;
	private Pair[] schluesselwertpaare;
	private String signatur;


	public Certificate (Algorithm alg, Pair[] schluesselwertpaare, String signatur ) {
		this.algorithm= alg;
		this.schluesselwertpaare=schluesselwertpaare;
		this.signatur = signatur;
	}

	public String get(String key) {

		for(int i=0;i<schluesselwertpaare.length;i++) {

			Pair s=schluesselwertpaare[i];
			if (s.getKey().equals(key)) {
				return s.getValue();
			}

		}
		return null;
	}
	
	public static Certificate fromString(String m ) {

		String[] array=m.split(";");
		String[] schluesselwertpaare = array[1].split(",");
		
		Algorithm alg = Algorithm.valueOf(array[0]);
		
		Pair[] werte = new Pair [ schluesselwertpaare.length ];
		
	 //fromstring()
		
		String sign= array[2];
		
		return new Certificate(alg, werte, sign);
	}

	//	public Certificate (Algorithm signatur, Pair[] schluesselwertpaare ) {
	//		this.Signatur= signatur;
	//		this.Schluesselwertpaare=schluesselwertpaare;
	//	}

	//	public static Certificate create() {
	//		
	//		return new Certificate(Algorithm.HMAC_MD5, new Pair("a", "b"), new Pair("a", "b"), new Pair("a", "b"), new Pair("a", "b"));
	//	}
}
