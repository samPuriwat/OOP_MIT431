package Lab7;

public class PetApp {
    public static void main(String[] args) {

        //create class instant (object)
        Pet pet1 = new Pet();

        pet1.setOwnerName("Sam");
        pet1.setPetName("Owen");
        pet1.setPetAge(2);

        pet1.petColor = "black";

        System.out.println(pet1.getOwnerName());
        System.out.println(pet1.getPetName());
        System.out.println(pet1.getPetAge());


        Pet pet2 = new Pet();

        pet2.setOwnerName("Sam");
        pet2.setPetName("Lulu");
        pet2.setPetAge(10);
        pet2.petColor = "blue";

        System.out.println(pet1.petColor);
        System.out.println(pet2.petColor);

        Pet pet3 = new Pet("sam","Lala",5);
        System.out.println(pet3.getOwnerName());
        System.out.println(pet3.getPetName());
        System.out.println(pet3.getPetAge());

        pet3.setOwnerName("Zin");



    }
}
