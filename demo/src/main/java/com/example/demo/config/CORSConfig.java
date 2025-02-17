package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORSConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/login")
                .allowCredentials(true)
                .exposedHeaders(HttpHeaders.AUTHORIZATION)
                .allowedMethods(
                        HttpMethod.POST.name()
                )
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
        registry.addMapping("/join")
                .allowCredentials(true)
                .allowedMethods(
                        HttpMethod.POST.name()
                )
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
        registry.addMapping("/oauthjoin")
                .allowCredentials(true)
                .allowedHeaders(HttpHeaders.CONTENT_TYPE,
                        HttpHeaders.AUTHORIZATION)
                .allowedMethods(
                        HttpMethod.POST.name()
                )
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
        registry.addMapping("/role")
                .allowCredentials(true)
                .allowedMethods(
                        HttpMethod.GET.name()
                )
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
        registry.addMapping("/checkid")
                .allowCredentials(true)
                .allowedMethods(
                        HttpMethod.POST.name()
                )
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
        registry.addMapping("/checknick")
                .allowCredentials(true)
                .allowedMethods(
                        HttpMethod.POST.name()
                )
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
        registry.addMapping("/checkauth")
                .allowCredentials(true)
                .allowedMethods(
                        HttpMethod.GET.name()
                )
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
        registry.addMapping("/verifyemail")
                .allowCredentials(true)
                .allowedMethods(
                        HttpMethod.POST.name()
                )
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
        registry.addMapping("/verifykey")
                .allowCredentials(true)
                .allowedMethods(
                        HttpMethod.POST.name()
                )
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
        registry.addMapping("/turnstile")
                .allowCredentials(true)
                .allowedMethods(
                        HttpMethod.POST.name()
                )
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
        registry.addMapping("/board/**")
                .allowCredentials(true)
                .allowedHeaders(HttpHeaders.CONTENT_TYPE,
                        HttpHeaders.AUTHORIZATION)
                .allowedMethods(HttpMethod.GET.name(),
                        HttpMethod.POST.name(),
                        HttpMethod.PUT.name(),
                        HttpMethod.DELETE.name())
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
        registry.addMapping("/board/view/*/comment")
                .allowCredentials(true)
                .allowedHeaders(HttpHeaders.CONTENT_TYPE,
                        HttpHeaders.AUTHORIZATION)
                .allowedMethods(HttpMethod.GET.name())
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
        registry.addMapping("/board/view/*/reply")
                .allowCredentials(true)
                .allowedHeaders(HttpHeaders.CONTENT_TYPE,
                        HttpHeaders.AUTHORIZATION)
                .allowedMethods(HttpMethod.GET.name())
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
        registry.addMapping("/board/view/*/comment/write")
                .allowCredentials(true)
                .allowedHeaders(HttpHeaders.CONTENT_TYPE,
                        HttpHeaders.AUTHORIZATION)
                .allowedMethods(HttpMethod.POST.name())
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
        registry.addMapping("/comment/**")
                .allowCredentials(true)
                .allowedHeaders(HttpHeaders.CONTENT_TYPE,
                        HttpHeaders.AUTHORIZATION)
                .allowedMethods(HttpMethod.PUT.name(),
                        HttpMethod.DELETE.name())
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
        registry.addMapping("/reply/**")
                .allowCredentials(true)
                .allowedHeaders(HttpHeaders.CONTENT_TYPE,
                        HttpHeaders.AUTHORIZATION)
                .allowedMethods(HttpMethod.POST.name(),
                        HttpMethod.PUT.name(),
                        HttpMethod.DELETE.name())
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );

        registry.addMapping("/todo/**")
                .allowCredentials(true)
                .allowedHeaders(HttpHeaders.CONTENT_TYPE,
                        HttpHeaders.AUTHORIZATION)
                .allowedMethods(
                        HttpMethod.GET.name(),
                        HttpMethod.POST.name(),
                        HttpMethod.PUT.name(),
                        HttpMethod.DELETE.name())
                .allowedOrigins(
                        "http://localhost:8080",
                        "http://192.168.0.123:8080",
                        "http://110.13.52.11:8080",
                        "http://localhost:3000",
                        "http://192.168.0.123:3000",
                        "http://110.13.52.11:3000",
                        "http://43.201.59.110:8080",
                        "http://43.201.59.110:3000",
                        "http://demo-project-react.s3-website.ap-northeast-2.amazonaws.com",
                        "http://d2x0bexp13nzpb.cloudfront.net"
                );
    }
}
