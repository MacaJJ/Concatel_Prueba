# Concatel_Prueba
Práctica Galaxia Imperio

Me gustaría explicar un poco lo que yo he entendido de la práctica.

He seleccionado la de Galaxia.

Nos pide que realicemos un servicio que desde cualquier lugar del universo se puedan registrar

He realizado un metodo que nos realiza una post request enviando el nombre del rebelde, el nombre del planeta y una fechahora que se genera
en el momento que se realiza la petición.

Para simplificar y aprovechando el metodo por defecto de toString() le he hecho un @Override para formatear la respues que nos retorna la
petición con el formato que nos solicita la práctica.

ejemplo de registro:
1. desde cualquier consumidor de API tipo POSTMAN o INSOMNIA realizamos la consulta.

2. direccion URL: http://localhost:8090/register/addRebel

3.le pasamos en el Body de la peticion un json con la estructura de nuestro modelo

{
    "name":"Marcus",
    "planet":"Boruru"
}

Resultado = rebelde Marcus en Boruru a 2020-12-09 15: 18

4. En caso de que alguno de los dos attr este vacío se generá una exceptionGalaxia para controloar que no se puedan enviar datos vacios.
