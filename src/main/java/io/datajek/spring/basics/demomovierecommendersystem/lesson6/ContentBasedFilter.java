package io.datajek.spring.basics.demomovierecommendersystem.lesson6;

import io.datajek.spring.basics.demomovierecommendersystem.lesson2.Filter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("CBF")
@Primary
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie){
        //logic of content based filter
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
