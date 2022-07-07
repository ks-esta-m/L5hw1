public class MainProgram {

    //×åëîâåê äîëæåí ïîêîðìèòü êîøêó è ñîáàêó
    public static void main(String[] args) {
        Human vasya = new Human();
        AnimalClass cat = new AnimalClass();
        AnimalClass dog = new AnimalClass();

        cat.setHungry();
        vasya.feed(cat);
        vasya.feed(cat); //âûâîäèëîñü, ÷òî êîò ñûòûé, æèâîòíîå íå õî÷åò åñòü

        dog.setHungry();
        vasya.feed(dog);
    }
}
