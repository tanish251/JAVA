class Instanceof {
    public static void main(String[] args) {
        String name = "SIT";
        Integer num = 12;
        //following will return true since name is type of String
        boolean result = num instanceof Integer;
        boolean result1 = name instanceof String;
        System.out.println(result);
        System.out.println(result1);
    }
}