public class Main {

    public static void main(String[] args) {
        Cat firstCat = new Cat(
                "black", 3.5, 2.2, "siamese");
        Cat secondCat = new Cat(
                "white", 5, 4.2, "none");
        System.out.println(firstCat);
        System.out.println(secondCat);

        Triangle firstTriangle = new Triangle(3, 4.2, 7);
        Triangle secondTriangle = new Triangle(1, 4.2, 5.5);

        System.out.println("Площадь первого треугольника: " + firstTriangle.getArea());
        System.out.println("Площадь второго треугольника: " + secondTriangle.getArea());

        Phone callToMyFriend = new Phone("+380978530430");
        callToMyFriend.call("+380967128812");
    }
}
