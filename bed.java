public class bed {
    
    private boolean made;
    private boolean clean;
    private String sheet_color;
    private String pillow_color;
    private int num_blankets;

    public bed(){

    }
     
    public bed(String sheet_color, String pillow_color){
        this.sheet_color = sheet_color;
        this.pillow_color = pillow_color;
    }

    public bed(boolean made, boolean clean, int num_blankets){
        this.made = made;
        this.clean = clean;
        this.num_blankets = num_blankets;
    }

    public boolean isMade() {
        return made;
    }

    public void setMade(boolean made) {
        this.made = made;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public String getSheet_color() {
        return sheet_color;
    }

    public void setSheet_color(String sheet_color) {
        this.sheet_color = sheet_color;
    }

    public String getPillow_color() {
        return pillow_color;
    }

    public void setPillow_color(String pillow_color) {
        this.pillow_color = pillow_color;
    }

    public int getNum_blankets() {
        return num_blankets;
    }

    public void setNum_blankets(int num_blankets) {
        this.num_blankets = num_blankets;
    }

    public boolean is_tidy(){
        return this.clean && this.made;
    }

    public String is_comfy(){
        return "My bed is so comfy I always fall right asleep";
    }
}
