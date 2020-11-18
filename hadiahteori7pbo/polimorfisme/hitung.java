public class hitung extends volume 
{
	
	public hitung (double jari2){
		super(jari2);
	
	}
	protected void hasil()
	{
		System.out.println("Volume Bola= "+(4/3*PI*getjari()*getjari()*getjari()));
	}
	
	
}
