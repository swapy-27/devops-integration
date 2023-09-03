//package com.example.example_docker.config;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
//import org.springframework.stereotype.Component;
//
//import javax.naming.AuthenticationException;
//import java.io.IOException;
//import java.io.PrintWriter;
//@Component
//public class AuthEntryPoint extends BasicAuthenticationEntryPoint {
//
//    public void commence(
//            HttpServletRequest request, HttpServletResponse response, AuthenticationException authEx)
//            throws IOException, ServletException {
//        response.addHeader("WWW-Authenticate", "Basic realm=" + getRealmName() + "");
//        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//        PrintWriter writer = response.getWriter();
//        writer.println("HTTP Status 401 - " + authEx.getMessage());
//    }
//
//    @Override
//    public void afterPropertiesSet() {
//        setRealmName("Baeldung");
//        super.afterPropertiesSet();
//    }
//}
