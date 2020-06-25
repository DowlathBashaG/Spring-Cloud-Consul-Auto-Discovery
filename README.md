# Spring-Cloud-Consul-Auto-Discovery
Step 1:

Download from : https://www.consul.io/

Step 2:

Check ipaddress in your system.

![ipadd_1](https://user-images.githubusercontent.com/9671419/85619679-4355ff80-b680-11ea-8747-8df4324d9361.PNG)


![ipadd_2](https://user-images.githubusercontent.com/9671419/85619675-4224d280-b680-11ea-983d-401b01d3cf28.PNG)



Step 3:

Execute the blow command along with ip address.

consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind= [IP-ADDRESS]

![address](https://user-images.githubusercontent.com/9671419/85619844-84e6aa80-b680-11ea-85bf-531269aa68dd.PNG)

For Example :

consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=192.168.0.65

![consul run](https://user-images.githubusercontent.com/9671419/85619394-db071e00-b67f-11ea-9c7f-1d3868d26841.PNG)

Step 4:

Launch consul in brower using default port number for consul : 8500.

http://localhost:8500/

Step 5:

A. Run the application - Greeting

B. Run the application - User Service

Now you can see the both services automatically register in Consul. Its based on Discovery Client register the services.


