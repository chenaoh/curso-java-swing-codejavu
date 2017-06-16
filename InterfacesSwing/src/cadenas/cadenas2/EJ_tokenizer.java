package cadenas.cadenas2;
import java.util.*;
import javax.swing.*;
public class EJ_tokenizer
{
private static String[] expresionDividida;
private static String[] divide(String cad)
{
StringTokenizer st2 = new StringTokenizer(cad,"+-*/^()",true);
int cont = 0;
while (st2.hasMoreTokens())
{
cont++;
st2.nextToken();
}
StringTokenizer st = new StringTokenizer(cad,"+-*/^()",true);
String[] aux = new String[cont];
for (int i=0; i<aux.length; i++)
aux[i] = st.nextToken();
return aux;
}
public static void main (String args[])
{
String cad = "(31.4+5^2)*7.3";
JOptionPane.showMessageDialog(null,"la cadena es "+cad);
expresionDividida = divide(cad);
for (int i=0; i < expresionDividida.length; i++)
JOptionPane.showMessageDialog(null,expresionDividida[i]);
}
}