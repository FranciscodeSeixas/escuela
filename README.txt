1 �Cu�l es la finalidad de un constructor?
El contructor tiene la finalidad de de crear el objeto que se va a manipular en el programa.

2 �Cu�l es la finalidad de los m�todos de acceso?
Los metodos de acceso tienen la finalidad de cargar datos  y obtener el valor del atributo.

3 �Qu� es una variable global?
Una variable local es aquellas que es visible y est� disponible para todo el programa. Para ello debe ser declarada fuera de toda funci�n.

4 �Cu�l es la diferencia entre un arreglo ordinario y la clase ArrayList?
La diferencia principal entre un Array ordinario y un Arraylist, es que este ultimo es de tama�o din�mico, ademas solo puede contener objetos. Mientras que en un Array ordinario el tama�o e definido en su creaci�n y puede contener tato datos primitivos como objetos 

5 �C�al es la utilidad de la clase DefaultTableModel? 
La utilidad de de la clase DefaultTableModel es la creaci�n de un modelos por defecto de tabla que ya tiene m�todos para crear, modificar y borrar celdas.    

6 �Qu� constructores existen para el objeto dtm DefaulTableModel y cu�l estamos usando en este proyecto (consultar la API de java)?
Los constructores existentes para el DefaultTableModel:
-DefaultTableModel() //Construye un modelo de tabla con cero columnas y cero filas.
-DefaultTableModel(int�numRows, int�numColumnas) //Construye un modelo de tabla con  los valores que le pasamos a los par�metros.
-DefaultTableModel(Object[][]�data, Object[]�columnNames) //Construye un modelo de tabla y la inicializa pasando los datos y las ID de las columnas al m�todo setDataVector();
-DefaultTableModel(Object[]�columnNames, int�rowCount)//Construye un modelo de tabla con tantas columnas como elementos que contengan las columnas y el numero de filas.
-DefaultTableModel(Vector�columnNames, int�rowCount) //Construye un modelo de tabla con tantas columnas como elementos que contengan las columnas y el numero de filas
-DefaultTableModel(Vector�data, Vector�columnNames) //Construye un modelo de tabla y la inicializa pasando los datos y las ID de las columnas al m�todo setDataVector();
El contuctor utilizado es el DefaultTableModel(int�numRows, int�numColumnas).

7 �Qu� funci�n cumple el m�todo getText()?
La funci�n que cumple getText(); es obtener los datos ingresados por el usuario a traves de la interfaz.

8 �Por qu� se utiliza la variable Object[] en vez de un String[]?
Se te utiliza la variable Object[] en vez de un String[], porque que es mas f�cil de manejar, ya que si se requiere obtener un dato simplemente se hace un "getdato();", mientras que con un String al ser una cadena se deber�a buscar el dato recortarlo del String y mostrarlo.

9 Explic� la instrucci�n txtId.setText(dtm.getValueAt(row, 0).toString());
Esta instrucci�n lo que hace es obtener los datos de la fila cliqueada y la columna 0, luego se convierte a String, para ser impreso en el la etiqueta de las ID.


 





