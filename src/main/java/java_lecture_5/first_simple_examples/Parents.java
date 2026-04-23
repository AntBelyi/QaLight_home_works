package java_lecture_5.first_simple_examples;

public class Parents extends GrandParents {

    private String mobilePhone = "ParentsMobilePhone";
    private String car = "ParentsCar";

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

}
