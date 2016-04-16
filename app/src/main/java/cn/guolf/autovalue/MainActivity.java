package cn.guolf.autovalue;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Currency;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Currency currency = Currency.getInstance(Locale.US);
        AutoValue_Money money = (AutoValue_Money) Money.create("张三", currency, 13);

        Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(new AutoValueTypeAdapterFactory())
                .create();

        ((TextView)findViewById(android.R.id.text1)).setText(gson.toJson(money));
        ((TextView)findViewById(android.R.id.text2)).setText(money.displayString()+","+money.toString());

    }


}
