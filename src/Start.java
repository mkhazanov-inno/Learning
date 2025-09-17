public class Start {
    public static void main(String[] args) {
        System.out.println(toUpperCase('b'));
        System.out.println(isLowerCase('b'));
        helloName("alex");
        superHello("alex");
    }
    public static void superHello(String name){
        char ch=name.charAt(0);
        ch=toUpperCase(ch);
        name=ch+name;
        helloName(name);
    }
    public static void helloName(String name){
        System.out.println("Hello "+name+"!");
    }
    public static boolean isLowerCase(char ch){
        return ch>='a'&&ch<='z';
    }
    public static char toUpperCase(char ch){
        int diff='a'-'A';//находим разницу в кодах маленьких и больших букв
        int res=ch-diff; //уменьшаем код маленькой буквы на разницу
        return (char)res; //полученную букву возвращаем
    }
}