package com.jskim.realworld_java.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

@Configuration
public class ServerConfig {

//  @Bean
//  public RestTemplate restTemplate(RestTemplateBuilder builder) throws Exception {
//    SSLContext sslContext = SSLContext.getInstance("SSL");
//    sslContext.init(null, new TrustManager[]{new X509TrustManager() {
//      @Override
//      public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
//      }
//
//      @Override
//      public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
//      }
//
//      @Override
//      public X509Certificate[] getAcceptedIssuers() {
//        return new X509Certificate[0];
//      }
//    }}, new java.security.SecureRandom());
//
//    // HttpComponentsClientHttpRequestFactory에 커스텀 SSL 컨텍스트를 설정합니다.
//    HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
//    factory.setHttpClient(org.apache.http.impl.client.HttpClients.custom()
//        .setSSLContext(sslContext)
//        .setSSLHostnameVerifier((hostname, session) -> true)
//        .build());
//
//    return builder.requestFactory(() -> factory).build();
//  }
}
