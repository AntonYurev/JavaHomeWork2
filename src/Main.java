public class Main {
    public static void main(String[] args) {
        int i = 0;
        Chel piople = new Chel(i, "erye", "gftrytr", "asdwa", "M", 12121954);
// Добавляем в файл человека, потом можем к нему добавить маму, папу, анологично можно сделать братье, сестер и т.д.
        Mathe mathe = new Mathe();
        mathe.SaveAs(piople.getFio(), piople.getBirthday(), piople.getId());
        System.out.println(piople.getFio() + " " + piople.getId());
        Chel piople1 = new Chel(piople.NextId(), "xdrcf", "isesy", "iici", "W", 23102002);
        Sister<Chel> sister = new Sister<>(piople1);
        System.out.println(sister.getFio() + " " + piople1.getId());
    }
}