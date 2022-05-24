package colorcoder.Implementation;

import java.util.Optional;

public abstract class IndexUtil {

    public static <T extends Enum<T> & Index<S>, S> Optional<T> get(Class<T> type, Integer index) {
        for (T t : type.getEnumConstants()) {
            if (t.getIndex() == index) {
                return Optional.of(t);
            }
        }
        return Optional.empty();
    }
}
