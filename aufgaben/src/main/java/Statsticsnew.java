
public class Statsticsnew {

	int[] array= new int [100];
	int count=0;

	
	public static void main(String[] args) {
		
		Statsticsnew s=new Statsticsnew();	
		s.addvalue(2);
		s.addvalue(12);
		s.addvalue(-13);
		s.addvalue(0);
		int x=s. getminimum();
		System.out.println(x);
		}


	public  int getminimum (){
		int x= Integer.MAX_VALUE;
		for (int i=0;i<count;i++) {
			if (array[i]< x ){
				x= array[i];
				
			}

		}
		return x;	
	}
	
	public void addvalue(int zahl) {
	array[count]=zahl;	
	count=count+1;
		
		
	}
}
