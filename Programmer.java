public class Programmer extends Karyawan{
	public void tambahGaji (int duit){
		System.out.println("Gaji Awal Ente : " + gaji);
		if((gaji + duit) <= maxGajiProgrammer)
		{
			gaji += duit;
			System.out.println("Gaji Ente Udah Ditambah : " + duit);
			System.out.println("Gaji Ente Sekarang : " + gaji);
		}else{
			gaji = maxGajiProgrammer;
			System.out.println("Gaji Ente Kelebihan Cuy, Sumbangin Ke Masjid Gih...");
		}
	}

	public void tambahGaji (int duit, String pesan)
	{
		if((gaji + duit) <= maxGajiProgrammer)
		{
			gaji += duit;
			System.out.println("Gaji Ente Udah Ditambah Lagi Tuh : " + duit);
			System.out.println("Gaji Ente Sekarang : " + gaji);
			System.out.println("Pesan Buat Ente : " + pesan);
		}else{
			gaji = maxGajiProgrammer;
			System.out.println("Gaji Ente Kelebihan Cuy, Sumbangin Ke Masjid Gih...");
		}
	}

}