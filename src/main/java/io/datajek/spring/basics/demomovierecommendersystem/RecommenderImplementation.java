package io.datajek.spring.basics.demomovierecommendersystem;

import io.datajek.spring.basics.demomovierecommendersystem.lesson2.CollaborativeFilter;

public class RecommenderImplementation {

    public String[] recommendMovies(String movie){
        //use content based filter to find similiar movies
        //as we have it now if i wanted to change the way the movies get recommended i'd have to keep
        //switching between the two
      //  ContentBasedFilter filter = new ContentBasedFilter();
        CollaborativeFilter filter = new CollaborativeFilter();
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
