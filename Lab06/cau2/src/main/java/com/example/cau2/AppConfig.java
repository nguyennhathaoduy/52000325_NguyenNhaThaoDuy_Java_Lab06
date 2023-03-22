package com.example.cau2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig 
{
    @Bean
    @Scope("prototype")
    public Product firstProduct() 
    {
        Product p = new Product();
        p.setId("P01");
        p.setName("May lanh");
        p.setPrice(10000);
        p.setDescription("Dieu hoa khong khi");
        return p;
    }

    @Bean
    @Scope("prototype")
    public Product secondProduct() 
    {
        return new Product("P02", "May giat", 20000, "Lam sach quan ao");
    }

    @Bean
    public Product thirdProduct() 
    {
        return new Product("P03", "Den", 5000, "Phat sang");
    }
}
