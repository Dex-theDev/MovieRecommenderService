package io.datajek.spring.basics.demomovierecommendersystem.lesson4;

import io.datajek.spring.basics.demomovierecommendersystem.lesson2.Filter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie){
        //logic
        return new String[]{"Toy Story", "Cars", "Up"};
    }
}
