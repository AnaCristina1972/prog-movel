package primeiro.cliente.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import primeiro.cliente.meuapp.api.AppUtil;
import primeiro.cliente.meuapp.controller.ClienteController;
import primeiro.cliente.meuapp.model.Cliente;

public class MainActivity extends AppCompatActivity {

    ClienteController cliControl;
    Cliente obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(AppUtil.TAG, "onCreate: MyAppSell");
        cliControl = new ClienteController(getApplicationContext());
        obj= new Cliente();

//        obj.setNomeCliente("Ana Cristina da Silva Vieira");
//        obj.setTelefone("99253-2270");


//        obj.setNomeCliente("Thiago Paulo");
//        obj.setTelefone("99876543");

//       if(cliControl.salvar(obj)){
//            Toast.makeText(MainActivity.this, "Cliente"+obj.getNomeCliente()+" incluido com sucesso...",Toast.LENGTH_LONG).show();
//            Log.i(AppUtil.TAG, "Cliente"+obj.getNomeCliente()+" incluido com sucesso...");
//        }else{Toast.makeText(MainActivity.this, "Cliente"+obj.getNomeCliente()+"não incluido ...",Toast.LENGTH_LONG).show();
//     }

//        if(cliControl.deletar(obj.getId())){
//            Toast.makeText(MainActivity.this, "Cliente"+obj.getNomeCliente()+" excluido com sucesso...",Toast.LENGTH_LONG).show();
//            Log.i(AppUtil.TAG, "Cliente"+obj.getNomeCliente()+" excluido com sucesso...");
//        }else{Toast.makeText(MainActivity.this, "Cliente"+obj.getNomeCliente()+"não excluido ...",Toast.LENGTH_LONG).show();
//            Log.e(AppUtil.TAG, "Cliente"+obj.getNomeCliente()+" não excluido ...");
//
//
//
//        }



//        if(cliControl.alterar(obj)){
//            Toast.makeText(MainActivity.this, "Cliente"+obj.getNomeCliente()+" alterada com sucesso...",Toast.LENGTH_LONG).show();
//            Log.i(AppUtil.TAG, "Cliente  "+obj.getNomeCliente()+" alterado com sucesso...");
//        }else{Toast.makeText(MainActivity.this, "Cliente"+obj.getNomeCliente()+"não alterado ...",Toast.LENGTH_LONG).show();
//            Log.e(AppUtil.TAG, "Cliente  "+obj.getNomeCliente()+" não alterado ...");
//
//     }


        for (Cliente obj:cliControl.listar()) {
            Log.e("Retorno", "onCreate: "+obj.getId()+" "+obj.getNomeCliente()+" "+ obj.getTelefone()+" "+obj.getTelefone2());

       }
    }
}