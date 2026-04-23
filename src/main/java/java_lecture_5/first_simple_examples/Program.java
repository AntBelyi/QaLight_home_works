package java_lecture_5.first_simple_examples;

public class Program {

    public static void main(String[] args) {
        GrandParents grandParents = new GrandParents();
        String grandParentsHouse = grandParents.getHouse();
        String grandParentsBicycle = grandParents.getBicycle();

        Parents parents = new Parents();
        String parentsCar = parents.getCar();
        String parentsMobile = parents.getMobilePhone();
        String parentsHouse = parents.getHouse();

        FirstChild firstChild = new FirstChild();
        String firstChildDoll = firstChild.getDoll();
        String firstChildCar = firstChild.getBicycle();

        SecondChild secondChild = new SecondChild();
        String secondChildCar = secondChild.getCar();
    }

}
