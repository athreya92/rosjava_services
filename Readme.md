Steps for building

    1. Clone this repository
    2. Make sure you have Java JDK1.8 setup
    3. Download the turtlesim jar from this repo [https://github.com/rosjava/rosjava_mvn_repo/tree/master/org/ros/rosjava_messages/turtlesim/0.5.5]
    4. Add the jar to your local .m2 repository. Follow the below step.,
       a. mvn install:install-file -Dfile=loation of the jar -DgroupId=org.ros.rosjava_messages
           -DartifactId=turtle_sim -Dversion=0.5.5 -Dpackaging=jar
    5. Build the project - mvn clean install
    
Steps for execution

    1. Launch a terminal
    2. roscore
    3. rosrun turtlesim turtlesim_node
    4. Run NodeExecutor class ( Make sure you change the URI to wherever the roscore is running )
