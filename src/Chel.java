public class Chel {
    private String name, secondName, surname, gender;
    private int id, birthday;
    int[] child = new int[100];
    int[] parent = new int[2];

    Chel(int id1, String name1, String secondName1, String surname1, String gender1, int birthday1) {
        id = id1;
        name = name1;
        secondName = secondName1;
        surname = surname1;
        gender = gender1;
        birthday = birthday1;
    }
    Chel(){
        super();
    }
    int getId(){
        return this.id;
    }
    int NextId() {
        return this.id += 1;
    }

    String getFio() {
        String fio = this.secondName + " " + this.name + " " + this.surname;
        return fio;
    }

    int getBirthday() {
        return this.birthday;
    }

    String getGender() {
        return this.gender;
    }
}
