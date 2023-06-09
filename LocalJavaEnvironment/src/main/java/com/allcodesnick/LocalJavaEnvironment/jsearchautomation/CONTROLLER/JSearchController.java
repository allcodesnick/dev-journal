package com.allcodesnick.LocalJavaEnvironment.jsearchautomation.CONTROLLER;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/JSearch")

public class JSearchController {
    private static final String apiKey = "7d5043d130mshfbbb1941d09eef2p1fef9ajsnd88f1cb190dc";
    private static final String apihost = "jsearch.p.rapidapi.com";


    @RequestMapping(value = "/j-search")
    public Response callJSearchClient() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://jsearch.p.rapidapi.com/")
                .get()
                .addHeader("X-RapidAPI-Key", apiKey)
                .addHeader("X-RapidAPI-Host", apihost)
                .build();

        Response response = client.newCall(request).execute();
        return response;
    }

    @GetMapping("/search")
    public ResponseBody search() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://jsearch.p.rapidapi.com/search?query=Python%20developer%20in%20Texas%2C%20USA&page=1&num_pages=1")
                .get()
                .addHeader("X-RapidAPI-Key", apiKey)
                .addHeader("X-RapidAPI-Host", apihost)
                .build();

        Response response = client.newCall(request).execute();
        return response.body();
    }

    @GetMapping(value = "/search-filter")
    public void searchFilters() {

    }

    @GetMapping(value = "/job-details")
    public void jobDetails() {

    }

    @GetMapping(value = "/estimated-salary")
    public void estimatedSalary() {

    }
}