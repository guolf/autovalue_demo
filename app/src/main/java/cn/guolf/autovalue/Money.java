package cn.guolf.autovalue;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.util.Currency;


/**
 * Author：guolf on 16/4/16 11:56
 * Email ：guo@guolingfa.cn
 */
@AutoValue
public abstract class Money {

    public static Money create(String name, Currency currency, int money) {
        return new AutoValue_Money(name, currency, money);
    }

    public static TypeAdapter<Money> typeAdapter(Gson gson) {
        return new AutoValue_Money.GsonTypeAdapter(gson);
    }

    public abstract String name();

    public abstract Currency currency();

    public abstract int money();

    public String displayString() {
        return currency().getSymbol() + money();
    }
}
