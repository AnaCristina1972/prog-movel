package primeiro.cliente.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import primeiro.cliente.meuapp.api.AppUtil;
import primeiro.cliente.meuapp.controller.ClienteController;

public class MainActivity extends AppCompatActivity {

    ClienteController cliControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(AppUtil.TAG, "onCreate: MyAppSell");
        cliControl = new ClienteController(getApplicationContext());
    }
}