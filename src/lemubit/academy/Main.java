package lemubit.academy;

public class Main {

    public static void main(String[] args) {
        var values = new String[]{"Hello", "lol"};

        var store = new Store<>(values);

        System.out.println(store.get(1));
    }
}
