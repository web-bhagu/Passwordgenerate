import java.util.Random;

 class Passwordgenerate {

	public static void main(String[] args)
	{
		String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String digit="0123456789";
		
		String combination=upper+lower+digit;
		 int len=9;
        
		 char[] passwordp=new char[len];
		 Random r=new Random();
		for(int i=0;i<len;i++)
		{
			 passwordp[i]=combination.charAt(r.nextInt(combination.length()));
		}
		
				System.out.println("Generated password is: "+new String(passwordp));


	}

}