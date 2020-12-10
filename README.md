# FacilityLocation
Algoritmos golosos (heuristicas)
La aplicacion consiste en implementar un algoritmo goloso para una variante del problema de facility location.
Tenemos un conjunto C de clientes que debemos atender, cada uno geolocalizado con su
latitud y longitud. Tenemos también un conjunto D de puntos donde podemos ubicar centros
de distribución para los clientes. Estos puntos también están geolocalizados con su latitud
y longitud. Finalmente, tenemos una cantidad k máxima de centros de distribución que
podemos abrir. Estos k centros de distribución deben ubicarse en k puntos del conjunto D.
Cada cliente será atendido desde el centro de distribución más cercano, y el costo de atenderlo
es igual a la distancia en línea recta entre el cliente y su centro de distribución
El problema consiste en determinar qué subconjunto de k puntos de D se deben seleccionar para abrir
centros de distribución, de modo tal que el costo total sea el menor posible.
La aplicación implementada contiene las siguientes funcionalidades:
• Lee los datos de latitud y longitud de los clientes desde un archivo gson
• Lee los datos de latitud y longitud de los posibles centros de distribución desde un
archivo gson.
• Resuelve el problema de determinar que centros de distribución abrir, por medio de un
algoritmo goloso.
• Mostrarle al usuario los centros de distribución que el algoritmo propone abrir, y el
costo total de esta solución.
