# Operations REST services

## API description
A description of the Operations REST services can be found on SwaggerHub:

https://swaggerhub.com/apis/SBCC/operations/0.1.0

## Generating the API server code in Swagger

The API is defined in in OpenAPI 2.0. The server code is generated using SwaggerHub's code generation facilities, including the 'Delegate Pattern'. This pattern supports a clear distinction between the generated front of the API and the - custom coded - implementation of the API logic.

### Code generation - settings
For code generation in SwaggerHub, the settings below are used:

| Setting | Value |
|---------|-------|
|useTags| not checked |
|implicitHeaders| not checked |
|configPackage| com.sbcc.operations.service.config |
|interfaceOnly| not checked |
|artifactVersion| 0.1.0 |
|sortParamsByRequiredFlag| not checked |
|useOptional| not checked |
|singleContentTypes| not checked |
|sourceFolder| /src/main/java |
|serializableModel| not checked |
|artifactDescription| SBCC Operations |
|delegatePattern| checked |
|scmDeveloperConnection| |
|apiPackage| com.sbcc.operations.service.api |
|licenseName | |
|invokerPackage| com.sbcc.operations.service.invoker |
|dateLibrary|  |
|artifactId| operations-rest-service |
|licenseUrl|  |
|swaggerDocketConfig| checked |
|useBeanValidation| not checked |
|withXml| not checked |
|responseWrapper| |
|developerEmail| luc.gorissen@amis.nl |
|developerOrganizationUrl| https://www.amis.nl |
|fullJavaUtil| not checked |
|bigDecimalAsString| not checked |
|ensureUniquerParams| not chekced |
|basePackage| com.sbcc.operations.service |
|developerName| Luc Gorissen |
|allowUnicodeIdentifiers| not checked |
|java8| not checked |
|title| SBCC Operations |
|localVariablePrefix| not checked |
|groupId| com.sbcc.operations |
|library| Sping-boot Server application using the SpringFox integration |
|scmConnection|  |
|hideGenerationTimestamp |
|async| not checked |
|modelPackage| com.sbcc.operations.service.model |
|developerOrganization| AMIS |
|artifactUrl| |

### Code generation - server code
With the above settings, the server code can be generated in SwaggerHub:

- Download --> Server --> spring

## Using the generated code
The generated code must be used in the implementation project. This consists of the following steps:
1. prepare the staging area
1. copy generated code from staging area to the implmentation project
1. optional: change delegated implementation
1. optional: change the application properties
1. optional: change the pom file

### 1. prepare the staging area
Create staging area
```bash
developer@developer-VirtualBox:~$ mkdir stage
developer@developer-VirtualBox:~$ cd stage
developer@developer-VirtualBox:~/stage$ pwd
/home/developer/stage
developer@developer-VirtualBox:~/stage$ ls
developer@developer-VirtualBox:~/stage$ cp ~/Downloads/spring-server-generated.zip .
developer@developer-VirtualBox:~/stage$ unzip spring.server.generated.zip 
```

### 2. copy generated code from staging area to the implmentation project
Copy 3 directories:

```bash
developer@developer-VirtualBox:~/projects/SBCC/operations/operations-rest-services/src/main/java/com/sbcc/operations/service$ pwd
/home/developer/projects/SBCC/operations/operations-rest-services/src/main/java/com/sbcc/operations/service
developer@developer-VirtualBox:~/projects/SBCC/operations/operations-rest-services/src/main/java/com/sbcc/operations/service$ ls
api  config  invoker  model
developer@developer-VirtualBox:~/projects/SBCC/operations/operations-rest-services/src/main/java/com/sbcc/operations/service$ cp ~/stage2/src/main/java/com/sbcc/operations/service/api/* api
developer@developer-VirtualBox:~/projects/SBCC/operations/operations-rest-services/src/main/java/com/sbcc/operations/service$ cp ~/stage2/src/main/java/com/sbcc/operations/service/config/* config/
developer@developer-VirtualBox:~/projects/SBCC/operations/operations-rest-services/src/main/java/com/sbcc/operations/service$ cp ~/stage2/src/main/java/com/sbcc/operations/service/model/* model/
developer@developer-VirtualBox:~/projects/SBCC/operations/operations-rest-services/src/main/java/com/sbcc/operations/service$
```

### 3. optional: change delegated implementation
Verify that the delegated implementation classes are still present:
```bash
developer@developer-VirtualBox:~/projects/SBCC/operations/operations-rest-services/src/main/java/com/sbcc/operations/service/api$ pwd
/home/developer/projects/SBCC/operations/operations-rest-services/src/main/java/com/sbcc/operations/service/api
developer@developer-VirtualBox:~/projects/SBCC/operations/operations-rest-services/src/main/java/com/sbcc/operations/service/api$ ls impl
CaseactivityApiDelegateService.java  PingApiDelegateService.java
developer@developer-VirtualBox:~/projects/SBCC/operations/operations-rest-services/src/main/java/com/sbcc/operations/service/api$
```
The implementation classes are in the `api/impl` directory and are suffixed with `Service`.
Where necessary, add/update these classes.

### 4. optional: change the application properties

The originally generated application.properties file is changed in 2 places:
1. The line with the server.port is removed:
`server.port=8080`
This property is now configured in the `Swagger2SproingBoot.java` file. This is necessary to support configuration by using environment properties.
2. Add a line to remove the error handler from the swagger documentation:
`spring.autoconfigure.exclude: org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration`
This removes the ugly error mapping from the Swagger documentation (see: https://stackoverflow.com/questions/38747548/spring-boot-disable-error-mapping)

### 5. optional: change the pom file
Several changes have been made to the original pom file:
- it can generate a Docker image
- it can generate a zip archive for the Oracle Application Container Cloud Service (ACCS)

Be careful on when/what to change.
