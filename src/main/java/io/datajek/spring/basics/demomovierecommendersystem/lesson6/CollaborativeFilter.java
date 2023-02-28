package io.datajek.spring.basics.demomovierecommendersystem.lesson6;

import io.datajek.spring.basics.demomovierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CF")
//@Primary
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie){
        //logic
        return new String[]{"Toy Story", "Cars", "Up"};
    }
}
