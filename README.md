## NULS Maven Archetype for Smart Contract
Maven archetype to create NULS smart contract project

### How to Build

#### Prerequisite

- JDK 1.8 and above
- Maven 3.5 and above

Get the source

      git clone https://github.com/naveen7252/nuls-maven-archetype.git

Build the Source

 Run to check java and maven installation status
 
      $ mvn -v
 
 should display maven and java versions
 
 Now, run below command to build the archetype
 
      $ mvn clean install
 
 After successful maven build, artifact will be uploaded to your local maven repository.
 
 ### Create NULS smart contract project with archetype
 
 1. Maven command line option:
 
 2. Using IntelliJ IDE
 
 ### What does archetype contain?
 
 - Archetype is generally used to create maven projects with the predefined template. 
 - Archetype defines what are all the elements should the generated project contain
 
 NULS maven archetype generates the smart contract project with following archetecture:
 
 - It generates smart contract project as maven project
 - It generates project with sample contract class and all the required NULS smart contract dependencies are automataically added to the project
 - It generates test packeges and adds required dependencies automatically
 - It adds [NULS smart contract maven plugin](https://github.com/naveen7252/nuls-smart-contract-maven-plugin) to the project. So that cotract deployment & execution operations are simplified.
 - Build the generated project with simple maven commands - "mvn clean install" will deploy the contract to NULS blockchain.
 - No need to upload the jar or generate and copy the contract hex code to NULS wallet for the contract deployment.
 - Generated project comes with some useful library classes(most frequently used) which can be used in smart contract development.
 
 
