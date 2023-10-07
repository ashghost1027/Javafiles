class LifeStage {
    float age = 0.0f;

    public String findStage(){
        String stage = "Invalid age";
        if (age == 0){
            stage = "Foetus";
        }
        else if(age<1){
            stage = "Infant";
        }
        else if(age>1 && age<3){
            stage = "Toddler";
        }
        else if(age>3 && age<7){
            stage = "Pre-schooler";
        }
        else if(age>7 && age<13){
            stage = "Elementary";
        }
        else if(age>13 && age<19){
            stage = "Teenager";
        }
        else if(age>19 && age<56){
            stage = "Adult";
        }
        else if(age>56){
            stage = "Senior";
        }
        return stage;
    }
    public boolean isEligibleToVote(){
        boolean canVote = false;
        if (age>=18){
            canVote = true;
        }
        return canVote;
    }
    public boolean isSeniorCitizen(){
        boolean isSenior = false;
        if (age>56){
            isSenior = true;
        }
        return isSenior;
    }
    public String medicalGuidance(){
        String advice = "";
        if (age>40){
            advice = "Get a checkup as soon as possible";
        }
        else if(age>60){
            advice = "To ensure peace, please write your will. Stop sugars. Get some medical help";
        }
        return advice;
    }

    public static void main(String[] args){
        LifeStage person = new LifeStage();
        person.age = 5.1f;
        String stage = person.findStage();
        System.out.println(stage);
        person.age = 18.3f;
        boolean eligibility = person.isEligibleToVote();
        person.age = 60.0f;
        boolean seniority = person.isSeniorCitizen();
        person.age = 43.0f;
        String guidance = person.medicalGuidance();

        System.out.println(eligibility);
        System.out.println(seniority);
        System.out.println(guidance);
    }
}
