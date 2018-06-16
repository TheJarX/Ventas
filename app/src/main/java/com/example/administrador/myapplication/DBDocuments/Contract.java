package com.example.administrador.myapplication.DBDocuments;

import android.provider.BaseColumns;

public class Contract {

        public static abstract class ClientEntry implements BaseColumns{

            //Datos para la DB
            public static final String TABLE_NAME = "Cliente";

            public static final String CLIENT_ID ="idCliente";
            public static final String NAME = "nombre";
            public static final String PHONE = "telefono";
            public static final String ADDRESS = "direccion";




        }

    public static abstract class ProductEntry implements BaseColumns{

        //Datos para la DB
        public static final String TABLE_NAME = "producto";

        public static final String PRODUCT_ID ="idProducto";
        public static final String DESC = "Descripcion";
        public static final String PRICE = "precio";
        public static final String STOCK = "stock";



    }

    public  static abstract class SaleEntry implements BaseColumns{

        //Datos para la DB
        public static final String TABLE_NAME = "producto";

        public static final String SALE_ID ="idVenta";
        public static final String CLIENT_ID = "idCliente";
        public static final String DATE = "fecha";





    }

    public static abstract class DetailsEntry implements BaseColumns{

            //Datos para la DB
            public static final String TABLE_NAME = "detalles";

            public static final String SALE_ID = SaleEntry.SALE_ID;
            public static final String DATE = "fecha";
            public static final String CLIENT_ID = SaleEntry.CLIENT_ID;



    }

}
