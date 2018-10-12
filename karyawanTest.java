public class karyawanTest{
	public static void main(String[] args) {
		Designer a = new Designer();
		System.out.println("Designer");
		a.setNama("Raja");
		System.out.println("Nama Karyawan :" + a.getNama());
		a.setAlamat("Arab");
		System.out.println("Alamat Karyawan :" + a.getAlamat());
		a.tambahGaji(50);
		a.tambahGaji(20,"Ente Dapet Bonus, Sedekah Gih...");
		System.out.println("");

		Programmer b = new Programmer();
		System.out.println("Programmer");
		b.setNama("Ade");
		System.out.println("Nama Karyawan :" + b.getNama());
		b.setAlamat("Zimbabwe");
		System.out.println("Alamat Karyawan :" + b.getAlamat());
		b.tambahGaji(50);
		b.tambahGaji(35,"Ente Dapet Bonus, Sedekah Gih...");
		System.out.println("");

		Pm c = new Pm();
		System.out.println("Project Manager");
		c.setNama("Susian");
		System.out.println("Nama Karyawan :" + c.getNama());
		c.setAlamat("Equador");
		System.out.println("Alamat Karyawan :" + c.getAlamat());
		c.tambahGaji(50);
		c.tambahGaji(50,"Ente Dapet Bonus, Sedekah Gih...");
		c.tambahGaji(15);
		System.out.println("");

	}
}