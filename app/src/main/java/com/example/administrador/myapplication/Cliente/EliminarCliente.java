package com.example.administrador.myapplication.Cliente;

import android.database.sqlite.SQLiteDatabase;
import com.example.administrador.myapplication.DBDocuments.Contract;
import com.example.administrador.myapplication.DBDocuments.DBHelper;

public class EliminarCliente {


    DBHelper admin =null;



    public void deleteClient(int idCliente){

        SQLiteDatabase db = admin.getWritableDatabase();
        db.delete(Contract.ClientEntry.TABLE_NAME,
                " WHERE " + Contract.ClientEntry.TABLE_NAME
                        +" = "+idCliente, null);
            db.close();

    }

}
