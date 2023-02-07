# Ejercicios Charla Git - Semana de la informática 2023

## Información básica

Para probar que el código funciona puedes abrir un terminal en la carpeta demo y ejecutar `mvnw` seguido de `compile` para compilar, `test` para correr los test, `javadoc:javadoc` o `javadoc:test-javadoc` para hacer la documentación web del programa o los test y `pdf:pdf` para generar un pdf de resumen del proyecto.

## Ejercicios

En estos ejercicios es importante también probar los casos erróneos: ¿Qué pasa si un test da error?, ¿Qué pasa si hago que el proyecto no compile?, ¿Qué pasa si me 'suspenden' una review?

1. Añadir colaboradores al repositorio desde la web.
2. Hacer cada uno una rama propia para implementar una nueva función.
3. Hacer un pull request para unir las ramas y que un compañero tenga que verificar el código mediante una code review.
4. Hacer una plantilla de issue y crear un issue usando esa plantilla.
5. Usando [este ejemplo](https://github.com/actions/setup-java#caching-maven-dependencies), crea un archivo build.yml en la carpeta .github/workflows para compilar el proyecto cuando haya un push o una pull request.
6. Usando el ejemplo anterior, crea un archivo test.yml en la misma carpeta para correr los test.
7. Usando el ejemplo anterior, crea un archivo doc.yml en la misma carpeta para generar un PDF de documentación.
8. En el archivo doc.yml añade un nuevo trabajo que suba el PDF al finalizarse, siguiendo [este ejemplo](https://github.com/actions/upload-artifact#upload-an-individual-file)
9. Combina todos los archivos de workflows en uno solo haciendo que `test` y `doc` dependan de que `build` haya sido exitoso.
10. Usar una herramienta de `./mvnw check` y después `./mvnw site` para comprobar los errores de estilo que hay en el proyecto.
11. Usar la action **Super Linter** de Github Actions para validar el código subido al repositorio en cada push.
