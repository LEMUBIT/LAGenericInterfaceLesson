package lemubit.academy;

public interface Operation<T> {
    T get(int position);
    void replace(int position, T value);
}
