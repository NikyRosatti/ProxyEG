# 🚀 Proxy Pattern Exercise

## Author: Nicolle Rosatti

Este repositorio contiene un ejercicio práctico que demuestra el uso del patrón de diseño Proxy en el contexto de los patrones estructurales.

### Archivos en el Repositorio:
- `CuentaProxy.java`: Implementación del patrón Proxy.
- `CuentaBanco.java`: Implementación del objeto real que el Proxy representa.
- `ICuenta.java`: Interface que utilizan `CuentaProxy.java` y `CuentaBanco.java`, con las operaciones basicas a implementar.
- `appMain.java`: Archivo de cliente que utiliza el Proxy para acceder a los archivos remotos.
- `README.md`: Documentación del ejercicio.

### Descripción:
El ejercicio simula un sistema de operaciones de cuenta de banco, donde el Proxy actúa como intermediario entre el cliente y el objeto real, proporcionando un control sobre el acceso y la manipulación de los objetos. Estamos utilizando en gran parte un Proxy de Proteccion, para que el cliente no pueda manipular como desee la cuenta sin que el proxy revise la solicitud y la valide.

### Uso:
1. Clona este repositorio en tu máquina local.
2. Ejecuta el archivo `appMain.java` para interactuar con el sistema utilizando el patrón Proxy.

### Conclusiones:
El ejercicio demuestra cómo el patrón de diseño Proxy puede utilizarse para controlar el acceso a objetos remotos de manera transparente para el cliente. El Proxy actúa como un sustituto del objeto real y proporciona funcionalidades adicionales, como el control de acceso, la administración de recursos y la mejora del rendimiento. Al implementar el patrón Proxy, podemos separar las preocupaciones relacionadas con el acceso remoto y brindar una capa adicional de seguridad y optimización en nuestras aplicaciones.

😊

