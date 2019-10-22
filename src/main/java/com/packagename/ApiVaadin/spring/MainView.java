package com.packagename.ApiVaadin.spring;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.packagename.ApiVaadin.spring.MessageBean;;

@Route
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
public class MainView extends VerticalLayout {

    public MainView(@Autowired MessageBean bean) {
        Button button = new Button("Click me",
                e -> Notification.show(bean.getMessage()));
        Image image = new Image("http://localhost:8080/icon.png", "Algo");
        
        add(image);
        add(button);
        LoginForm component = new LoginForm();
//        component.addLoginListener(e -> {
//            boolean isAuthenticated = authenticate(e);
//            if (isAuthenticated) {
//                navigateToMainPage();
//            } else {
//                component.setError(true);
//            }
//        });
        
        add(component);
        
    }

}
