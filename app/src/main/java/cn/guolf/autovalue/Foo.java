package cn.guolf.autovalue;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/**
 * Author：guolf on 16/4/16 12:34
 * Email ：guo@guolingfa.cn
 */
@AutoValue
public abstract class Foo {

    public static TypeAdapter<Foo> typeAdapter(Gson gson) {
        return new AutoValue_Foo.GsonTypeAdapter(gson);
    }

    abstract String bar();

    @SerializedName("Baz")
    abstract String baz();


}

