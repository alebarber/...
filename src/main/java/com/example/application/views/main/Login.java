package com.example.application.views.main;

import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("login")
public class Login extends Div{
    public Login(){
        setHeight("91vh");

        getStyle().set("background-color", "var(--lumo-contrast-5pct)")
                .set("display", "flex").set("justify-content", "center")
                .set("padding", "var(--lumo-space-l)")
                .set("align-items", "center");

        LoginForm loginForm = new LoginForm();
        add(loginForm);
    }
}
