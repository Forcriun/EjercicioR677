import java.util.ArrayList;

class EjercicioR677
{
    public ArrayList<String> devolverPalabraMasLarga(ArrayList<String> palabras)
    {
        // Escribe tu código a continuación...
        ArrayList<String> largas = new ArrayList<String>();
        if(palabras.size() > 0){
            String palabraMasLarga = "";
            int x = 0;
            for(String palabra : palabras) {
                if(palabra.length() >= palabraMasLarga.length()){
                    palabraMasLarga = palabra;
                    x = palabraMasLarga.length();                    
                }
            }
            for(String palabra : palabras){
                if(palabra.length() == x){
                    largas.add(palabra);
                }
            }
        }
        return largas;
    }

    // A continuación puedes escribir otros métodos si lo necesitas...
}