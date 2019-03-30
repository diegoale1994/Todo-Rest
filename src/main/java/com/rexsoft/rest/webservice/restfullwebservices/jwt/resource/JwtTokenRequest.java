package com.rexsoft.rest.webservice.restfullwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;

    
//    {
//        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU1NDUxNDA3NCwiaWF0IjoxNTUzOTA5Mjc0fQ.imgKn1MHxCDjOVpKGKO2k2sd6ta4uY1frTqi13WqVS3M4SnAjCOvg8nj7AHIWXgDTAXo4fRJ8fD6lOeOKaxkDg"
//    }
    
    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

