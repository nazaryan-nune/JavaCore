package Chapter5;

//Ծրագրի կատարելագործված տարբերակ, որում որոշվում է ամսվա պատկանելիությունը տարվա եղանակին
public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "ձմռան";
                break;
            case 3:
            case 4:
            case 5:
                season = "գարնան";
                break;
            case 6:
            case 7:
            case 8:
                season = "ամռան";
                break;
            case 9:
            case 10:
            case 11:
                season = "աշնան";
                break;
            default:
                season = "Հորինված ամիս";
        }
        System.out.println("Ապրիլը " + season + " ամիս է։");
    }
}