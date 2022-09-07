# 工程简介
Druid 数据库连接池配置 demo，测试了”SQL监控“和”URI监控“，数据库密码加密，druid 日志输出（感觉有些过于详细了）等。  
# 延伸阅读
part2-multi-db 是想演示多数据源情况下 Druid 的配置情况，结合 Spring Boot 2.x 不再支持配置继承，测试如何配置才能使 Druid 控制台获取到监控数据，这里主要是分数据源配置 filters: stat 开启监控，配置 connectProperties 进行数据库密码加密。  

part2 并未展示如何进行“多数据源（读写分离）”，Druid 本身的多数据源配置，官方不建议用于生产环境。使用多数据源需要结合第三方工具，同时要支持分布式事务。比如：Sharding Sphere.    

