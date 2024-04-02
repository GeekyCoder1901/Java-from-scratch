Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

class Solution {
    public String intToRoman(int num) {
        String listadoUnidad[]      = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String listadoDecena[]      = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String listadoCentena[]     = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String listadoMillar[]      = {"","M","MM","MMM"};
        int millar   =  num/1000;
        int centena  =  (num%1000)/100;
        int decena   =  (num%100)/10;
        int unidad   =  num%10;
        String millarRomana   = listadoMillar[millar];
        String centenaRomana  = listadoCentena[centena];
        String decenaRomana   = listadoDecena[decena];
        String unidadRomana   = listadoUnidad[unidad];
        return millarRomana + centenaRomana + decenaRomana + unidadRomana;
    }
}