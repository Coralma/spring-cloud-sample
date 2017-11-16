启动方式：
先启动eureka-server的EurekaServerApplication

定义Eureka注册机的IP地址
server.port=1111
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
eureka.client.serviceUrl.defaultZone=http://localhost:${server.port}/eureka/


Ribbon是负载均衡工具，Eureka是自动注册工具

Ribbon 维护了一个服务器列表，如果服务器有宕机现象，Ribbon 能够自行将其剔除；
但如果该服务器故障排除，重新启动，或者增加新的负载节点，我们需要手工调用
Ribbon 的接口将其动态添加进 Ribbon 的服务器列表。这样明显不够尽如人意。
如何能够在服务节点启动时，自行添加服务列表？—— Eureka。
Eureka 提供了 Application Service 客户端的自行注册的功能。
此外，Eureka 的缓存机制能够防止大规模宕机带来的灾难性后果。