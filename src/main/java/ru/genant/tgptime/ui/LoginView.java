package ru.genant.tgptime.ui;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

import java.awt.*;
import java.awt.image.ColorModel;

@Route("login")
@PageTitle("Login")
@AnonymousAllowed
public class LoginView extends Composite<LoginOverlay> {

    public LoginView() {
        getContent().setOpened(true);
        getContent().setAction("login");
    }

//public class LoginView extends VerticalLayout {




//    public LoginView() {
//        setSizeFull();
//        setAlignItems(Alignment.CENTER);
//        setJustifyContentMode(JustifyContentMode.CENTER);
//
//        var username = new TextField("Username");
//        var password = new PasswordField("Password");
//        var loginButton = new Button("Login", event -> {
//            // Здесь должна быть логика аутентификации
//            Notification.show("Login attempted");
//        });
//
//        add(
//                new H1("Welcome"),
//                username,
//                password,
//                loginButton,
//                new RouterLink("Register", RegisterView.class)
//        );
//    }
}
