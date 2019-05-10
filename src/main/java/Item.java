public class Item {

    int id;
    String tittle;
    String cateogory_id;
    float price;
    String currency_id;
    int quantity;
    String condition;
    String[] pictures;

    public Item(int id) {
        this.id = id;
        tittle = "Item de ID: "+ id;
        cateogory_id = "MLA" + id;
        price = 100;
        currency_id = "XXX";
        quantity = 10;
        condition = "Nuevo";
        pictures = new String[] {"uno.png", "dos.jpg"};
    }
}
