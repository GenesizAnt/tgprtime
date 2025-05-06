//package ru.genant.tgptime.ui;
//
//import com.vaadin.flow.component.html.H1;
//import com.vaadin.flow.component.notification.Notification;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//import com.vaadin.flow.component.textfield.PasswordField;
//import com.vaadin.flow.router.PageTitle;
//import com.vaadin.flow.router.Route;
//import com.vaadin.flow.router.RouterLink;
//import com.vaadin.flow.server.auth.AnonymousAllowed;
//
//import java.awt.*;
//
//@Route("register")
//@PageTitle("Register")
//@AnonymousAllowed
//public class RegisterView extends VerticalLayout {
//
//    public RegisterView() {
//        setSizeFull();
//        setAlignItems(Alignment.CENTER);
//        setJustifyContentMode(JustifyContentMode.CENTER);
//
//        var username = new TextField("Username");
//        var password = new PasswordField("Password");
//        var confirmPassword = new PasswordField("Confirm Password");
//        var registerButton = new Button("Register", event -> {
//            // Здесь должна быть логика регистрации
//            if (password.getValue().equals(confirmPassword.getValue())) {
//                Notification.show("Registration successful");
//            } else {
//                Notification.show("Passwords don't match");
//            }
//        });
//
//        add(
//                new H1("Register"),
//                username,
//                password,
//                confirmPassword,
//                registerButton,
//                new RouterLink("Login", LoginView.class)
//        );
//    }
//}