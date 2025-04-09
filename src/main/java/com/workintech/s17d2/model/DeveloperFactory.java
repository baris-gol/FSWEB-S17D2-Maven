package com.workintech.s17d2.model;

public class DeveloperFactory {

    public static Developer createdDeveloper (Developer developer, Taxable taxable){

        Developer createdDeveloper = null;

        if(developer.getExperience().equals(Experience.JUNIOR)) {
            createdDeveloper =  new JuniorDeveloper(developer.getId(), developer.getName(),
                    developer.getSalary()- (developer.getSalary())*taxable.getSimpleTaxtRate())/100);

        }
        else if(developer.getExperience().equals(Experience.MID)) {
            createdDeveloper =  new MidDeveloper(developer.getId(), developer.getName(),
                    developer.getSalary()- (developer.getSalary())*taxable.getMiddleTaxtRate())/100);

    }

        else if(developer.getExperience().equals(Experience.SENIOR)) {
            createdDeveloper =  new SeniorDeveloper(developer.getId(), developer.getName(),
                    developer.getSalary()- (developer.getSalary())*taxable.getSeniorTaxtRate())/100);
}