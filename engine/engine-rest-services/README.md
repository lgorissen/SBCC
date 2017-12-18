#Build & Run

The commands below are intended to be run on a Linux machine.

**Build**
Requires Maven 3 and JDK8
> mvn clean package

Builds 3 artifacts:
1. SpringBoot jar file: *engine-rest-service-0.1.0.jar*
2. ACCS archive: *engine-rest-service-0.1.0-dist.zip*
3. ACCS archive: *engine-rest-service-0.1.0-dist.tar.gz*

Artifacts 2 and 3 are similar: either one can be used when deploying to the Oracle ACCS.


**Run the SpringBoot jar file:**
Run the SpringBoot jar file:
> java -jar target/engine-rest-service-0.1.0.jar

**Running on Oracle Application Container Cloud Service (ACCS)**
ToDo

**Build a Container**
Requires at least the Docker community edition to be installed.
>mvn install dockerfile:build

Verify that the container is present:
> docker images

That lists the containers available and the operations container should show up like:
> REPOSITORY                    TAG     IMAGE ID      CREATED         SIZE
> sbcc/engine-rest-service      latest  35f31744fba8  35 seconds ago  116MB


**Run a Container**
Running the Docker container on a local machine:
> docker run -d -p 8080:8080 sbcc/engine-rest-service

Runs the container 'detached' and with port mapping.




