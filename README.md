# Spring-Cloud-Consul-Auto-Discovery

# Difference between Eureka Server and HashiCorp Consul

Eureka Server:

![Eur_1](https://user-images.githubusercontent.com/9671419/85754832-05fa7c00-b72b-11ea-9dee-625ee5847cba.JPG)

Consul:

![consu_2](https://user-images.githubusercontent.com/9671419/85754913-1a3e7900-b72b-11ea-8c15-0a1ff5ad0332.JPG)

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

![ServiceDiscovery](https://user-images.githubusercontent.com/9671419/85753956-51f8f100-b72a-11ea-90c6-b9a9ded4ebac.PNG)

Step 6:

Access greeting service inside user service.

http://localhost:8282/accessAPI

![userService](https://user-images.githubusercontent.com/9671419/85754475-b5831e80-b72a-11ea-9fd4-18d458148430.PNG)

