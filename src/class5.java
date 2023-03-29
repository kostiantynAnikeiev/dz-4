public class class5 {
    public String toPrintString = "Heroyam Slava";
    public String print(){
        String updateValue = String.format("---<%s>---", toPrintString);
        System.out.println(updateValue);
        return updateValue;
    }
}