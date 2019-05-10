import com.google.gson.Gson;
import org.mockserver.client.MockServerClient;
import org.mockserver.model.Delay;
import org.mockserver.model.Header;

import java.util.concurrent.TimeUnit;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;


import static org.mockserver.integration.ClientAndServer.startClientAndServer;

public class Servicio {

    static MockServerClient mockServer = startClientAndServer(8081);
    static Gson gson;


    // crear expectativa
    public static void consulta(String metodo, String ruta, int codigo, String content, String body, int delay){

        mockServer.when(
                request().withMethod(metodo)
                .withPath(ruta)

        ).respond(
                response().withStatusCode(codigo)
                .withHeader(new Header("Content-Type", content))
                .withBody(body)
                .withDelay(new Delay(TimeUnit.MILLISECONDS ,delay))
        );
    }

    public static void main(String [] arg){
        gson = new Gson();
        Item item = new Item(1234);
        Site site = new Site("MLA","Mercado Libre Argentina");
        Category [] category = new Category [3];
        category [0] = new Category("accesorio","acc");
        category [1] = new Category("accesorio1","acc1");
        category [2] = new Category("accesorio2","acc2");

        consulta("GET","/items/.*", 200, "application/json; charset=utf-8", gson.toJson(item),1000);
        consulta("GET","/sites/.*", 200, "application/json; charset=utf-8", gson.toJson(site),5);
        consulta("GET","/categories/.*", 200, "application/json; charset=utf-8", gson.toJson(category),5);
    }
}
