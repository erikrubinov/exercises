package signatur;

public final class AlgorithmClass {

	public static final AlgorithmClass HMAC_MD5 = new AlgorithmClass();
	public static final AlgorithmClass HMAC_SHA1 = new AlgorithmClass();
	public static final AlgorithmClass HMAC_SHA256 =  new AlgorithmClass();

	private AlgorithmClass() {
	}

	public static void f(AlgorithmClass a) {
		if(a==AlgorithmClass.HMAC_MD5) {
			
		}else if(a==AlgorithmClass.HMAC_SHA1) {
			
		}
	}

}
