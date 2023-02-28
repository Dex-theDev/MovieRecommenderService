package io.datajek.spring.basics.demomovierecommendersystem.lesson2;

public class RecommenderImplementation {

    //use filter interface to select Filter
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
