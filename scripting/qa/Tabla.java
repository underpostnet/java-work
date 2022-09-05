import java.io.*;

class Tabla {
    Equipo[] arreglo;
    Equipo[] XXXXXX;

    Tabla() {
        seleccion(arreglo);
    }

    Tabla(Equipo[] arreglo) {
        this.arreglo = arreglo;
        seleccion(arreglo);
    }

    void seleccion(Equipo[] arreglo) // metodo por seleccion
    {
        for (int i = 0; i < arreglo.length; i++) {
            int k = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j].ptjtotal > arreglo[k].ptjtotal)
                    k = j;
            }
            int aux = arreglo[i].ptjtotal;
            arreglo[i].ptjtotal = arreglo[k].ptjtotal;
            arreglo[k].ptjtotal = aux;
        }
    }

    void creatxt() {
        File archivo = new File("Marcador.txt");
        FileWriter escribeArchivo = new FileWriter(archivo);
        for (int i = 0; i < arreglo.length; i++) {
            escribeArchivo.write("Posicion " + (i + 1) + ":\n");
            escribeArchivo.write(arreglo[i].nombre + "\n");
            escribeArchivo.write(arreglo[i].ptjtotal + " ptos" + "\n");
        }
        escribeArchivo.close();
    }

    void creatxt() {
        File archivo = new File("Marcador.txt");
        FileWriter escribeArchivo = new FileWriter(archivo);
        for (int i = 0; i < arreglo.length; i++) {
            escribeArchivo.write("Posicion " + (i + 1) + ":\n");
            escribeArchivo.write(arreglo[i].nombre + "\n");
            escribeArchivo.write(arreglo[i].ptjtotal + " ptos" + "\n");
        }
        escribeArchivo.close();
    }
}