
import javax.swing.JOptionPane;
public class Calorias {
    public static void main(String[] args) {
        
        int[] calorias;
        int dia=0,CaloriasMenos=0,mayor,menor;
        double suma=0;
        

        String[ ] semana = {"lunes", "martes", "miercoles","jueves","viernes","sabado","domingo"};
        

        
        
        calorias = new int[7];
        for (int i=0;i<7;i=i+1)
        {
            calorias[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite las calorias del dia "+semana[i]));
            dia=i+1;
            
        }
        mayor=calorias[0];
        for (int g = 1; g < calorias.length; g++) {
			if (calorias[g] > mayor) {
				mayor = calorias[g];
                dia=g;
			}
		}
        menor=calorias[0];
        for (int contador = 1; contador < calorias.length; contador++) {
			if (calorias[contador] < menor) {
				menor = calorias[contador];
                CaloriasMenos=contador;
			}}
        for(int s=0;s<calorias.length;s++){
            suma=suma+calorias[s];
        }
        suma=suma/calorias.length;

        

            JOptionPane.showMessageDialog(null,"El dia "+semana[dia]+" fue el dia con mas calorias.\nCalorias quemadas el dia "+semana[dia]+" fue : "+mayor);
            JOptionPane.showMessageDialog(null,"El dia "+semana[CaloriasMenos]+" fue el dia con menos calorias.\nCalorias quemadas el dia "+semana[CaloriasMenos]+" fue : "+menor);
            JOptionPane.showMessageDialog(null,"El Promedio de calorias fue : "+suma);
        
    

    

    
    

    
    
}
}
