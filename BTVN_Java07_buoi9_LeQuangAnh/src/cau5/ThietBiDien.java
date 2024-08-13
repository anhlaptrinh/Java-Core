package cau5;

public class ThietBiDien {
	protected String ten;
    protected int congSuat; // Công suất tính bằng watts

    public ThietBiDien(String ten, int congSuat) {
        this.ten = ten;
        this.congSuat = congSuat;
    }

    public void hienThiThongTin() {
        System.out.println("Tên thiết bị: " + ten);
        System.out.println("Công suất: " + congSuat + " watts");
    }

    // Phương thức này sẽ được override ở lớp con
    public void chucNang() {
        System.out.println("Chức năng của thiết bị.");
    }
}
 class DieuHoa extends ThietBiDien {
    private boolean lamLanh; // True nếu thiết bị có chức năng làm lạnh, false nếu có chức năng làm nóng
    private int congSuatLamLanh; // Công suất làm lạnh (BTU hoặc watts)
    private String cheDoDieuHoa; // Các chế độ làm việc của máy điều hòa
    private double dienTichPhucVu; // Diện tích phục vụ (m2)

    public DieuHoa(String ten, int congSuat, boolean lamLanh, int congSuatLamLanh, String cheDoDieuHoa, double dienTichPhucVu) {
        super(ten, congSuat);
        this.lamLanh = lamLanh;
        this.congSuatLamLanh = congSuatLamLanh;
        this.cheDoDieuHoa = cheDoDieuHoa;
        this.dienTichPhucVu = dienTichPhucVu;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chức năng: " + (lamLanh ? "Làm lạnh" : "Làm nóng"));
        if (lamLanh) {
            System.out.println("Công suất làm lạnh: " + congSuatLamLanh + " BTU");
            System.out.println("Chế độ điều hòa: " + cheDoDieuHoa);
            System.out.println("Diện tích phục vụ: " + dienTichPhucVu + " m2");
        }
    }

    @Override
    public void chucNang() {
        if (lamLanh) {
            System.out.println("Máy điều hòa đang làm lạnh với công suất " + congSuatLamLanh + " BTU và chế độ " + cheDoDieuHoa + ".");
        } else {
            System.out.println("Máy điều hòa đang làm nóng.");
        }
    }
}
  class MaySay extends ThietBiDien {
	    private boolean chucNangSay; // True nếu thiết bị có chức năng sấy, false nếu không
	    private String tocDoSay; // Tốc độ sấy
	    private String cheDoSay; // Chế độ sấy
	    private double dungTich; // Dung tích sấy

	    public MaySay(String ten, int congSuat, boolean chucNangSay, String tocDoSay, String cheDoSay, double dungTich) {
	        super(ten, congSuat);
	        this.chucNangSay = chucNangSay;
	        this.tocDoSay = tocDoSay;
	        this.cheDoSay = cheDoSay;
	        this.dungTich = dungTich;
	    }

	    @Override
	    public void hienThiThongTin() {
	        super.hienThiThongTin();
	        System.out.println("Chức năng: " + (chucNangSay ? "Có chức năng sấy" : "Không có chức năng sấy"));
	        if (chucNangSay) {
	            System.out.println("Tốc độ sấy: " + tocDoSay);
	            System.out.println("Chế độ sấy: " + cheDoSay);
	            System.out.println("Dung tích sấy: " + dungTich + " lít");
	        }
	    }

	    @Override
	    public void chucNang() {
	        if (chucNangSay) {
	            System.out.println("Máy sấy đang hoạt động với tốc độ " + tocDoSay + " và chế độ " + cheDoSay + ".");
	        } else {
	            System.out.println("Máy sấy không có chức năng sấy.");
	        }
	    }
	}