package io.datajek.spring.basics.demomovierecommendersystem.lesson5;

import io.datajek.spring.basics.demomovierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    //use filter interface to select Filter
    @Autowired
    private Filter contentBasedFilter;

    //constructor to initialize the filter
//    public RecommenderImplementation(Filter filter){
//        super();
//        this.contentBasedFilter = filter;
//    }
    public String[] recommendMovies(String movie){

        System.out.println("Name of current filter " + contentBasedFilter + "\n");
        String[] results = contentBasedFilter.getRecommendations("Finding Dory");
        return results;
    }
}
