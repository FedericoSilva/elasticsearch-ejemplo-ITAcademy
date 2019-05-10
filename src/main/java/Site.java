import com.sun.scenario.Settings;

import java.util.ArrayList;
import java.util.Set;

public class Site {

    private String id;
    private String name;
    private String country_id;
    private String sale_fees_mode;
    private float mercadopago_version;
    private String default_currency_id;
    private String immediate_payment;
    ArrayList< Object > payment_method_ids = new ArrayList < Object > ();
    Settings SettingsObject;
    ArrayList < Object > currencies = new ArrayList < Object > ();
    ArrayList < Object > categories = new ArrayList < Object > ();

    public Site(String id, String name) {
        this.id = id;
        this.name = name;
        this.country_id = "Argentina";
        this.sale_fees_mode = "que seraaaa";
        this.mercadopago_version = 10;
        this.default_currency_id = "Ki";
        this.immediate_payment = "Rapipago";
        this.payment_method_ids = new ArrayList<Object>();
      //  SettingsObject = new Settings();
        this.currencies = new ArrayList<Object>();
        this.categories = new ArrayList<Object>();
    }


}
