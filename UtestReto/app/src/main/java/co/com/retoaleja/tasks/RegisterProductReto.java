package co.com.retoaleja.tasks;

import co.com.retoaleja.userinterfaces.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SendKeys;


import co.com.retoaleja.userinterfaces.Home;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterProductReto implements Task {
    private String url;

    public RegisterProductReto(String url) {
        this.url = url;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url),
                Click.on(Home.ClOSEPOPUP),
                Click.on(Home.ClOSENOTIFICAQTION),
                SendKeys.of("dinosaurio").into(Home.SEARCHBAR),
                Click.on(Product.SELECTPRODUCT)




        );
    }
    public static RegisterProductReto makeinformation(){
        return instrumented(RegisterProductReto.class);
    }

}
