public class Sister <T extends Chel> {
    private String name, secondName, surname, gender;
    private int id, birthday;

    T fio;
    private T chel;

    Sister(T chel) {

        this.chel = chel;
    }

    String getFio(){
        String fio = chel.getFio();
        return fio;
        }
}
