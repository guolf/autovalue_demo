package cn.guolf.autovalue;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

/**
 * Author：guolf on 16/4/16 12:32
 * Email ：guo@guolingfa.cn
 */
public class AutoValueTypeAdapterFactory implements TypeAdapterFactory {

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        Class<? super T> rawType = type.getRawType();
        if (rawType.equals(Foo.class)) {
            return (TypeAdapter<T>) Foo.typeAdapter(gson);
        } else if (rawType.equals(Money.class)) {
            return (TypeAdapter<T>) Money.typeAdapter(gson);
        }
        return null;
    }
}
