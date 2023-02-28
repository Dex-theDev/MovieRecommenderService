package io.datajek.spring.basics.demomovierecommendersystem.lesson3;

import io.datajek.spring.basics.demomovierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    //use filter interface to select Filter
    @Autowired
    private Filter filter;

    //constructor to initialize the filter
    public RecommenderImplementation(Filter filter){
        super();
        this.filter = filter;
    }
    public String[] recommendMovies(String movie){

        System.out.println("Name of current filter " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}
