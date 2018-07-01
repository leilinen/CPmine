package Effective.teles.cons;

public class NutritionFacts {
    private  int servingSize;
    private  int servings;
    private  int calories;
    private  int fat;
    private  int sodium;
    private  int carbohydrate;


    public NutritionFacts(int servingSize, int servings){
        this.servingSize = servingSize;
        this.servings = servings;
    }

    public NutritionFacts(int servingSize){}
}


