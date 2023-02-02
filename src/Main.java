public class Main {
    public static void main(String[] args) {

        Chel piople = new Chel(1, "erye", "gftrytr", "asdwa", "M", 12121954);
// Добавляем в файл человека, потом можем к нему добавить маму, папу, анологично можно сделать братье, сестер и т.д.
        Mathe mathe = new Mathe();
        mathe.SaveAs(piople.getFio(), piople.getBirthday(), piople.getId());
        System.out.println(piople.getFio() + " " + piople.getId());
        int i = piople.NextId();
    }
}