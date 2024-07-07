public class HealthRecord{
    private int weight;
    private int height;
    public static final int MIN_ALLOWED_HEIGHT = 50;
    public static final int MAX_ALLOWED_HEIGHT = 250;
    public static final int MIN_ALLOWED_WEIGHT = 0;
    public static final int MAX_ALLOWED_WEIGHT = 120;
    public static int maxHeight = 0;
    public static int maxWeight = 0;
    public static int minWeight = 0;
    public static int minHeight = 0;
    //Constructor
    HealthRecord(int height, int weight){
        if(height > MAX_ALLOWED_HEIGHT){
            this.height = MAX_ALLOWED_HEIGHT;
            maxHeight = MAX_ALLOWED_HEIGHT;
        }
        else{
            this.height = height;
            if(this.height > maxHeight){
                maxHeight = this.height;
            }
        }
        if(height < MIN_ALLOWED_HEIGHT){
            this.height = MIN_ALLOWED_HEIGHT;
            minHeight = height;
        }
        else{
            this.height = height;
            if(this.height < minHeight || minHeight == 0){
                minHeight = height;
            }
        }

        if(weight > MAX_ALLOWED_WEIGHT){
            this.weight = MAX_ALLOWED_WEIGHT;
            maxWeight = MAX_ALLOWED_WEIGHT;
        }
        else{
            this.weight = weight;
            if(this.weight > maxWeight){
                maxWeight = this.weight;
            }
        }
        if(weight < MIN_ALLOWED_WEIGHT){
            this.weight = MIN_ALLOWED_WEIGHT;
            minWeight = MIN_ALLOWED_WEIGHT;
        }
        else{
            this.weight = weight;
            if(this.weight < minWeight || minWeight == 0){
                minWeight = this.weight;
            }
        }
    }

    //Getter
    public int getHeight(){
        return height;
    }
    public int getWeight(){
        return weight;
    }

    //Setter
    public void setHeight(int height){
        if(height < MAX_ALLOWED_HEIGHT && height > MIN_ALLOWED_HEIGHT){
            this.height = height;
        }
        else{
            System.out.println("Invalid input , height doesn't change");
        }
    }
    public void setWeight(int weight){
        if(weight < MAX_ALLOWED_WEIGHT && weight > MIN_ALLOWED_WEIGHT){
            this.weight = weight;
        }
        else{
            System.out.println("Invalid input, weight doesn't change");
        }
    }
}