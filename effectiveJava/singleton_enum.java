package effectiveJava;

import java.sql.Connection;

public enum singleton_enum {
    instance;
    public static singleton_enum getInstance(){
        return instance;
    }
    private Connection connection;
    private boolean isConnected=false;

    public void connect(){
        if(!isConnected){
//set up a db connection
//set isConnected to true;
        }
    }

    public void disconnect(){
        if(isConnected){
            //disconnect db connection,set isConencted to false;
        }
    }

    public Connection getConnection(){
        return connection;
    }
}
