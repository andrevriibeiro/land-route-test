package utils;

import java.util.List;

public class ListUtils {

    /**
     * Checks if a list is Null or Empty
     *
     * @param list The list to be checked
     *
     * @return Whether or not the given list is Null or Empty
     */
    public static boolean isNullOrEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }
}
