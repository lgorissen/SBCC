#Build & Run

The commands below are intended to be run on a Linux machine.

**Build**

Requires Maven 3 and JDK8
> mvn clean package

Builds 3 artifacts:
1. SpringBoot jar file: *businessrules-rest-service-1.0.0.jar*
2. ACCS archive: *businessrules-rest-service-1.0.0-dist.zip*
3. ACCS archive: *businessrules-rest-service-1.0.0-dist.tar.gz*

Artifacts 2 and 3 are similar: either one can be used when deploying to the Oracle ACCS.


**Run the SpringBoot jar file:**

Run the SpringBoot jar file:
> java -jar target/businessrules-rest-service-1.0.0.jar

**Running on Oracle Application Container Cloud Service (ACCS)**

ToDo

**Build a Container**

Requires at least the Docker community edition to be installed.
>mvn install dockerfile:build

Verify that the container is present:
> docker images

That lists the containers available and the businessrules container should show up like:
> REPOSITORY                       TAG     IMAGE ID      CREATED         SIZE
> sbcc/businessrules-rest-service  latest  35f31744fba8  35 seconds ago  116MB


**Run a Container**

Running the Docker container on a local machine:
> docker run -d -p 8083:8083 sbcc/businessrules-rest-service

Runs the container 'detached' and with port mapping.

**Testing the Service**

Currently the service just convert the supplied Event into an Action with the same name and value.
The current JSON request can be used for testing against endpoint **http://localhost:8083/businessrules/rpc/1.0**:

`{
   "id":0,
   "method":"processEvent",
   "params":{
      "case":{
         "caseHeader":{
            "name":"HandelsvorderingCasus",
            "state":"ACTIVE",
            "version":"2.0",
            "rulesVersion":"DEFAULT"
         },
         "milestones":[
         ]
      },
      "caseEvent":{
         "eventType":"ACTIVITY_EVENT",
         "activityEvent":{
            "activityName":"actIndienenProcesinleiding",
            "activityEvent":"COMPLETED"
         }
      },
      "caseActions":[
      ]
   }
}
`


