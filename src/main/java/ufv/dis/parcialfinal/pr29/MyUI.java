package ufv.dis.parcialfinal.pr29;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

	
	@Override
	protected void init(VaadinRequest vaadinRequest) {
	Lista lisatado = new Lista();
	
	Grid<Usuario> gridcontactos = new Grid<>(Usuario.class); 
	
    final VerticalLayout layout = new VerticalLayout();
    
    final TextField name = new TextField();
    name.setCaption("name:");
    
    final TextField surname = new TextField();
    surname.setCaption("surname:");
    
    final TextField age = new TextField();
    age.setCaption("age:");
    
    final TextField dni = new TextField();
    dni.setCaption("dni:");
    
    final TextField email = new TextField();
    email.setCaption("email:");
    
    final TextField nacimiento = new TextField();
    nacimiento.setCaption("nacimiento:");
    

    Button button = new Button("Click Me");
    button.addClickListener(e -> {
        try {
        	Usuario p = new Usuario(name.getValue(), surname.getValue(), dni.getValue(), nacimiento.getValue(), email.getValue(),Integer.parseInt(age.getValue()));
        	lisatado.add_usuario(p);
        	GeneradorPDF.add_usuario(p);

            gridcontactos.setItems(lisatado.getListaUsuario());
        	Notification.show("documento generado");
		} catch (Exception e1) {
			// TODO Auto-generated catch block;
			e1.printStackTrace();
			Notification.show("error al generar doumento");
		}
    });
    
    layout.addComponents(name,surname,age,dni,email,nacimiento, button,gridcontactos);
    
    setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
