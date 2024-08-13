package cau4;

//Lớp cơ sở PhuongTienGiaoThong
public class PhuongTienGiaoThong {
 protected String hangSanXuat;
 protected String mauSac;
 protected int namSanXuat;

 public PhuongTienGiaoThong(String hangSanXuat, String mauSac, int namSanXuat) {
     this.hangSanXuat = hangSanXuat;
     this.mauSac = mauSac;
     this.namSanXuat = namSanXuat;
 }

 public void hienThiThongTin() {
     System.out.println("Hãng sản xuất: " + hangSanXuat);
     System.out.println("Màu sắc: " + mauSac);
     System.out.println("Năm sản xuất: " + namSanXuat);
 }
}

//Lớp con XeHoi kế thừa từ PhuongTienGiaoThong
 class XeHoi extends PhuongTienGiaoThong {
    private int soCua;

    public XeHoi(String hangSanXuat, String mauSac, int namSanXuat, int soCua) {
        super(hangSanXuat, mauSac, namSanXuat);
        this.soCua = soCua;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Thông tin Xe Hơi:");
        super.hienThiThongTin();
        System.out.println("Số cửa: " + soCua);
    }
}

//Lớp con XeMay kế thừa từ PhuongTienGiaoThong
  class XeMay extends PhuongTienGiaoThong {
	    private int soBanh;

	    public XeMay(String hangSanXuat, String mauSac, int namSanXuat, int soBanh) {
	        super(hangSanXuat, mauSac, namSanXuat);
	        this.soBanh = soBanh;
	    }

	    @Override
	    public void hienThiThongTin() {
	        System.out.println("Thông tin Xe Máy:");
	        super.hienThiThongTin();
	        System.out.println("Số bánh: " + soBanh);
	    }
	}


 

