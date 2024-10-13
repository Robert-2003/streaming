package view;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class formatarData {
    public static String formatarData(GregorianCalendar data){
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        return dataFormatada.format(data.getTime());
    }
}
