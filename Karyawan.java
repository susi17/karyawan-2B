public class Karyawan{
	private String nama;
	private String alamat;
	protected int gaji;
	final int maxGajiDesigner = 70;
	final int maxGajiProgrammer = 90;
	final int maxGajiPm = 100;

	public void tambahGaji (int duit)
	{
		gaji += duit;
		System.out.println("Gaji yang Ente dapetin : " + gaji);
	}

	public void tambahGaji (int duit, String pesan)
	{
		gaji += duit;
		System.out.println("Gaji yang Ente dapetin : " + gaji);
		System.out.println("Pesan Buat Ente : " + pesan);
	}

	public void setNama (String name)
	{
		nama = name;
	}

	public void setAlamat (String address)
	{
		alamat = address;
	}

	public String getNama()
	{
		return nama;
	}

	public String getAlamat()
	{
		return alamat;
	}

}