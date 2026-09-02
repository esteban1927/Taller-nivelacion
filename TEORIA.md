# Parte Teórica - Taller de Nivelación

## Introducción

* **¿Qué es Markdown?** Es un lenguaje súper sencillo para darle formato a un texto (como poner negritas, títulos o listas) y que se convierte fácil a HTML. Usa caracteres normales como `#` o `*` y es el estándar para escribir documentos en GitHub.

## Preguntas sobre Git

* **1. Repo vs Proyecto:** Un proyecto normal es una carpeta común donde los archivos se sobrescriben y ya. Un repositorio Git tiene una carpeta oculta (`.git`) que actúa como una máquina del tiempo, guardando todo el historial de cambios.
* **2. Áreas de Git:**
  * *Working directory:* Tu carpeta donde trabajas y modificas el código.
  * *Staging area:* La "sala de espera" donde eliges qué cambios vas a empaquetar (`git add`).
  * *Repository:* Donde queda guardado todo de forma permanente (`git commit`).
* **3. Objetos en Git:** `blob` guarda el texto puro del archivo, `tree` representa las carpetas, `commit` es la foto del historial, y `tag` es una etiqueta para versiones importantes (ej: v1.0).
* **4. El Commit:** Se crea con `git commit -m "mensaje"`. Guarda qué cosas cambiaron, quién lo hizo, a qué hora y un texto explicando el porqué.
* **5. pull vs fetch:** `fetch` descarga los cambios de internet pero no toca tus archivos locales (solo miras). `pull` los descarga y de una vez los mezcla con tu código.
* **6. Ramas (Branches):** Son universos paralelos para probar cosas nuevas sin dañar el código principal. Git usa un puntero llamado `HEAD` para saber en cuál de esos universos estás trabajando.
* **7. Merge y Conflictos:** *Merge* une dos ramas. Hay conflicto si dos personas modificaron la misma línea. Se resuelve abriendo el archivo, eligiendo manualmente con qué código quedarse y haciendo un nuevo commit.
* **8. Staging (git add):** Si no pasas por esta "sala de espera" antes de hacer commit, Git simplemente no sabrá qué archivos quieres guardar y no hará nada.
* **9. .gitignore:** Un archivo donde anotas todo lo que Git debe ignorar para que NO se suba a internet (como contraseñas o carpetas pesadas).
* **10. Commit amend:** Sirve para modificar tu último punto de guardado (por si olvidaste un archivo o escribiste mal el mensaje) en lugar de crear uno nuevo.
* **11. git stash:** Guarda tus cambios a medias en un "cajón" temporal para dejar tu código limpio. Es súper útil si tienes que cambiar de rama por una urgencia y no quieres hacer un commit incompleto.
* **12. Deshacer cosas:** `reset` te devuelve en el tiempo, `revert` crea un commit nuevo que anula lo que hiciste en uno viejo (es más seguro para trabajar en equipo), y `checkout` descarta lo que no has guardado.
* **13. Remotos:** `origin` es el nombre por defecto de tu repositorio personal en la nube. `upstream` es el repositorio original de donde sacaste una copia (fork).
* **14. Ver historial:** `git log` te muestra la lista de commits, `git diff` te muestra línea por línea qué cambió, y `git show` te da los detalles de un commit específico.

## Programación en Java y POO

* **15. Tipos de datos primitivos:** Enteros (`byte`, `short`, `int`, `long`), decimales (`float`, `double`), letras (`char`) y booleanos (`boolean`).
* **16. Control de flujo:** `if/else` y `switch` sirven para tomar decisiones. `for`, `while` y `do-while` sirven para repetir código mientras se cumpla una condición.
* **17. Nombres significativos:** Un buen nombre explica qué hace el código sin tener que leerlo todo (ej: `calcularSalario()` en vez de `x()`). Ahorra tiempo y dolores de cabeza.
* **18. POO:** Es una forma de programar basada en "objetos". Cada objeto tiene características (variables) y acciones (métodos), simulando cosas del mundo real.
* **19. Los 4 Pilares:**
  * *Encapsulamiento:* Proteger los datos internos para que nadie los rompa.
  * *Abstracción:* Mostrar solo lo importante y ocultar cómo funciona por debajo.
  * *Herencia:* Reciclar código pasándolo de clases padres a hijas.
  * *Polimorfismo:* Que un mismo método haga cosas diferentes dependiendo del objeto.
* **20. Herencia:** Es usar la palabra `extends` para que una clase nueva herede todo el código de una clase que ya existe.
* **21. Modificadores de acceso:** Dicen quién puede ver tu código: `public` (lo ve cualquiera), `private` (solo esa misma clase), `protected` (la clase, sus hijas y su paquete) y `default` (solo su paquete).
* **22. Variables de entorno:** Son atajos del sistema operativo (como `PATH`). Sirven para decirle a tu computadora dónde encontrar programas importantes (como el compilador de Java) sin importar en qué carpeta estés parado.