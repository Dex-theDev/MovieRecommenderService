package io.datajek.spring.basics.demomovierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {


    private Filter filter;

  @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(io.datajek.spring.basics.demomovierecommendersystem.lesson7.Filter filter){
        this.filter = filter;
        System.out.println("Setter method invoked..");
    }
    public String[] recommendMovies(String movie){

        System.out.println("Name of current filter " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }

}
