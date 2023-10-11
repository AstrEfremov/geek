package org.example;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Creator {
    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {
        try {
            connect();
        //    buildTable(Cat.class);
            addObject(new Cat(1, "lol", 30));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            disconnect();
        }
    }

    public static void connect() throws SQLException {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
            statement = connection.createStatement();

        } catch (SQLException e) {
            throw new SQLException("Unable to connect");
        }
    }
    public static void buildTable(Class cl) throws SQLException{
        if (!cl.isAnnotationPresent(Table.class))
        {
            throw new RuntimeException("Из этого класса нельзя создать таблицу");
        }
        Map<Class, String> map = new HashMap<>();
        map.put(int.class, "INTEGER");
        map.put(String.class, "TEXT");

            StringBuilder stringBuilder = new StringBuilder("CREATE TABLE ");
            stringBuilder.append(((Table)cl.getAnnotation(Table.class)).title());
            stringBuilder.append(" (");
            Field [] fields = cl.getDeclaredFields();
            for (Field o: fields) {
                if (o.isAnnotationPresent(Column.class)){
                    stringBuilder.append(o.getName())
                            .append(" ")
                            .append(map.get(o.getType()))
                            .append(", ");
                }
        }
            stringBuilder.setLength(stringBuilder.length()-2);
            stringBuilder.append(");");
            statement.executeUpdate(stringBuilder.toString());

    }
    public static void addObject(Cat cat) throws SQLException {
        String name = cat.getName();
        int age = cat.getAge();
        int id = cat.getId();
        StringBuilder stringBuilder = new StringBuilder("INSERT INTO cats (id, name, age) VALUES (");
        stringBuilder.append(id);
        stringBuilder.append(",");
        stringBuilder.append("'");
        stringBuilder.append(name);
        stringBuilder.append("'");
        stringBuilder.append(",");
        stringBuilder.append(age);
        stringBuilder.append(");");
        System.out.println(stringBuilder.toString());
        statement.executeUpdate(stringBuilder.toString());

    }
    public static void disconnect(){
        try {
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}