package com.sajilni.sendgrid.rest;

import com.sajilni.sendgrid.entity.Forms;
import com.sajilni.sendgrid.entity.PaymentTypeForms;
import com.sajilni.sendgrid.mailer.SendGridMailer;
import com.sajilni.sendgrid.models.AuthenticationRequest;
import com.sajilni.sendgrid.models.AuthenticationResponse;
import com.sajilni.sendgrid.service.FormRakanService;
import com.sajilni.sendgrid.service.PaymentTypeFormRakanService;
import com.sajilni.sendgrid.service.SendGridService;
import com.sajilni.sendgrid.service.UserDetailService;
import com.sajilni.sendgrid.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
    @Autowired
    SendGridMailer sendGridMailer;

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private UserDetailService userDetailsService;
    @Autowired
    @Qualifier("FormRakanService")
    FormRakanService formRakanService;
    @Autowired
    @Qualifier("PaymentTypeFormRakanService")
    PaymentTypeFormRakanService paymentTypeFormRakanService;

    @Autowired
    private AuthenticationManager authenticationManager;

    SendGridService sendGridService;

    @GetMapping("/hello")
    private String hello() {
        Forms forms = new Forms();
        PaymentTypeForms paymentTypeForms = new PaymentTypeForms();
        paymentTypeForms.setForm(forms);
        paymentTypeForms.setLang("ar");
        forms.getPaymentTypeForms().add(paymentTypeForms);
        formRakanService.add(forms);
        return "Hello :)";
    }

    @GetMapping("/private")
    private String privatePage() {
        return "Private :(";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            authenticationRequest.getUsername(),
                            authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}