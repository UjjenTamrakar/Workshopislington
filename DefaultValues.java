public class DefaultValues{

    byte youByte;
    short youShort;
    int youInt;
    long youLong;
    float youFloat;
    double youDouble;
    char youChar;
    boolean youBoolean;

    public static void main(String[] args){

        DefaultValues values = new DefaultValues();

        System.out.println(values.youByte);
        System.out.println(values.youShort);
        System.out.println(values.youInt);
        System.out.println(values.youFloat);
        System.out.println(values.youDouble);
        System.out.println(values.youChar);
        System.out.println(values.youBoolean);        

    }
}