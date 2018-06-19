package com.example.administrador.myapplication.DBDocuments;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;


public class DBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "Registro.db";
    public static final int VERSION = 1;


    //Creación de Tabla Cliente
    public static final String CREATE_TABLE_CLIENT = "CREATE TABLE "
            + Contract.ClientEntry.TABLE_NAME+"  ( "
            + Contract.ClientEntry.CLIENT_ID+ " INTEGER PRIMARY KEY, "
            + Contract.ClientEntry.NAME+ " TEXT NOT NULL, "
            + Contract.ClientEntry.PHONE+ " INTEGER NOT NULL, "
            + Contract.ClientEntry.ADDRESS+ " TEXT NOT NULL) ";

    //Creación de Tabla Ventas
    public static final String CREATE_TABLE_SALE = "CREATE TABLE "
            + Contract.SaleEntry.TABLE_NAME+"  ( "
            +Contract.SaleEntry.SALE_ID+ " INTEGER PRIMARY KEY, "
            +Contract.SaleEntry.CLIENT_ID+ " TEXT NOT NULL, "
            +Contract.SaleEntry.DATE+ " INTEGER NOT NULL, "
            +" FOREIGN KEY ( "
            + Contract.SaleEntry.CLIENT_ID
            +") REFERENCES "
            + Contract.ClientEntry.TABLE_NAME
            + " ( "
            + Contract.ClientEntry.CLIENT_ID
            +" ) ) ";

    //Creación de Tabla Producto
    public static final String CREATE_TABLE_PRODUCT = "CREATE TABLE "
            + Contract.ProductEntry.TABLE_NAME+"  ( "
            + Contract.ProductEntry.PRODUCT_ID+ " INTEGER PRIMARY KEY, "
            + Contract.ProductEntry.DESC+ " TEXT NOT NULL, "
            + Contract.ProductEntry.PRICE+ " INTEGER NOT NULL, "
            + Contract.ProductEntry.STOCK+ " INTEGER NOT NULL) ";

    //Creación de la tabla Detalles
    public static final String CREATE_TABLE_DETAILS = "CREATE  TABLE "
            + Contract.DetailsEntry.TABLE_NAME+" ( "
            +Contract.DetailsEntry.SALE_ID+" INTEGER PRIMARY KEY, "
            +Contract.DetailsEntry.DATE+" TEXT NOT NULL, "
            +Contract.DetailsEntry.CLIENT_ID+" INT NOT NUll, "
            +" FOREIGN KEY ( "
            + Contract.DetailsEntry.SALE_ID
            +" ) REFERENCES "
            + Contract.SaleEntry.TABLE_NAME
            +" ( "
            + Contract.SaleEntry.SALE_ID
            +" ),"
            +" FOREIGN KEY ("
            + Contract.DetailsEntry.CLIENT_ID
            +") REFERENCES "
            +Contract.ClientEntry.TABLE_NAME
            +"("
            + Contract.ClientEntry.CLIENT_ID
            +") )";



    private static final String DROP_CLIENT_SQL = "DROP TABLE IF EXISTS "
            + Contract.ClientEntry.TABLE_NAME;

    private static final String DROP_SALE_SQL = "DROP TABLE IF EXISTS "
            + Contract.SaleEntry.TABLE_NAME;

    private static final String DROP_PRODUCT_SQL = "DROP TABLE IF EXISTS "
            + Contract.ProductEntry.TABLE_NAME;

    private static final String DROP_DETAILS_SQL = "DROP TABLE IF EXISTS "
            + Contract.DetailsEntry.TABLE_NAME;

    public DBHelper(Context context) {
        super(context, DB_NAME, null ,VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE_CLIENT);
        db.execSQL(CREATE_TABLE_SALE);
        db.execSQL(CREATE_TABLE_PRODUCT);
        db.execSQL(CREATE_TABLE_DETAILS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(DROP_CLIENT_SQL);
        db.execSQL(DROP_SALE_SQL);
        db.execSQL(DROP_PRODUCT_SQL);
        db.execSQL(DROP_DETAILS_SQL);

    }
    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (!db.isReadOnly()) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                db.setForeignKeyConstraintsEnabled(true);
            } else {
                db.execSQL("PRAGMA foreign_keys=ON");
            }
        }
    }

}
