public class MagicCalculator extends calculator {
    
    public double square_root(int num1){
        return Math.sqrt(num1);
    }

    public double sin(int num1){
        return Math.sin(num1);
    }

    public double cosine(int num1){
        return Math.cos(num1);
    }

    public double tangent(int num1){
        return Math.tan(num1);
    }

    public double factorial(int num1){
        int total = num1;
        for (int i = num1 - 1; i > 0; i--){
            total = total * i;
        }
        return total;
    
    }
}
