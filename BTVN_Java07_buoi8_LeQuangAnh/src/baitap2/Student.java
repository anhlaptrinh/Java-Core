package baitap2;

public class Student {
    private String name;
    private String id;
    private double mathScore;
    private double physicsScore;
    private double chemistryScore;

    public Student(String name, String id, double mathScore, double physicsScore, double chemistryScore) {
        this.name = name;
        this.id = id;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(double physicsScore) {
        this.physicsScore = physicsScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public double getAverageScore() {
        return (mathScore + physicsScore + chemistryScore) / 3;
    }

    public String getClassification() {
        double averageScore = getAverageScore();
        if (averageScore >= 9) {
            return "Xuất Sắc";
        } else if (averageScore >= 8) {
            return "Giỏi";
        } else if (averageScore >= 7) {
            return "Khá";
        } else if (averageScore >= 5) {
            return "Trung Bình";
        } else  {
            return "Yếu";
        } 
    }

    @Override
    public String toString() {
        return "Tên: " + name +
               ", Mã SV: " + id +
               ", Điểm Toán: "+mathScore+
               ", Điểm Lý: "+physicsScore+
               ", Điểm Hóa: "+ chemistryScore+
               ", Điểm TB: " + getAverageScore() +
               ", Xếp Loại: " + getClassification();
    }
}

