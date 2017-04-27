import java.util.NoSuchElementException;
public final class Optional<T> {
private final T value;
private Optional() {
this.value = null;
}
public static <T> Optional<T> empty() {
return new Optional<T>();
}
private Optional(T value) {
this.value = value;
}
public static <T> Optional<T> of(T value) {
return new Optional<>(value);
}
public static <T> Optional<T> ofNullable(T value) {
return (Optional<T>) (value == null ? empty() : of(value));
}
public T get() {
if (value == null) {
throw new NoSuchElementException("No value present");
}
return value;
}
public boolean isPresent() {
return value != null;
}
public T orElse(T other) {
return value != null ? value : other;
}
public String toString() {
return value == null ? "Empty" : "Some(" + value.toString() + ")";
}
}