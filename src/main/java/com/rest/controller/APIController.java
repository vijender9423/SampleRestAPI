package com.rest.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.model.PromotionalUpgrade;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;


@RestController
public class APIController {


    private static final String uri = "http://dolnxprodvm885.hq.emirates.com:6488/dcs/passengers/v1/onforce";

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value="/prmotionalUpgrade", method = RequestMethod.POST)
    public void getPromotionalUpgrade(@RequestBody PromotionalUpgrade req) throws IOException {




        HttpHeaders headers = new HttpHeaders();

        headers.add("Content-Type","application/json");
        headers.add("Accept","application/json,application/octet-stream");
        headers.add("X-Session-WebSessionId","Testwebsessionid");
        headers.add("X-Session-HgaCode","UAE");
        headers.add("X-Session-AppCode","ACPS_USER");
        headers.add("X-Session-ReleaseSession","Y");
        headers.add("X-Session-Stateful","N");
        headers.add("X-Session-Role","PD");
        headers.add("X-Session-City","DXB");
        headers.add("X-Session-AgentId","G@");
        headers.add("X-Client-UserId","s724833");
        headers.add("X-Client-Type","USER");
        headers.add("X-Client-TransId","TEST1231231");
        headers.add("X-Session-AirlineCode","EK");

        HttpEntity<?> httpEntity = new HttpEntity<Object>(req,headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(uri,HttpMethod.POST,httpEntity,String.class);
        responseEntity.getBody();

    }

    private void testBranchMethod1(){}

    private void testBranchMethod2(){}

    private void testBranchMethod3(){}

    private void testBranchMethod4(){}

    private void testBranchMethod5(){}
}
