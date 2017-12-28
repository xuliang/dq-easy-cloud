# dq-easy-cloud简称dqEasyCloud
## 前言
> ### 说明
> * dqEasyCloud不只是简单的spring-cloud相关组件的集合，最主要是为了定义微服务的相关约定，尽可能的降低维护成本。
> * dqEasyCloud推荐封装自己的工具类，业务逻辑类应尽可能降低与第三方接口的依赖，从而方便统一管理以及维护。
> * dqEasyCloud相关工具类都以Dq作为前缀开头:目的是为了防止和第三方的工具类同名冲突以及统一的命名前缀规范。
> * dqEasyCloud微观上使用了模块化思想进行封装，分为工具模块和业务逻辑模块。
> * dqEasyCloud工具模块：提供公共的服务，并且不依赖于任何业务逻辑模块。
> * dqEasyCloud业务逻辑模块：
>> * 最底层为原子业务逻辑模块(以下简称原子逻辑模块)：各个原子逻辑模块只关心自己业务逻辑。不应该相互调用其他原子逻辑模块。
>> * 聚合业务逻辑模块：将原子逻辑模块进行组装后，返回给外部调用者

> ### 使用申明
> * 本项目内容为整合spring boot和spring cloud相关组件，进行规范性约束，从而让使用者能更方便的进行微服务开发。<br>
> * 如您觉得该项目对您有用，欢迎点击右上方的Star按钮，给予支持！！欢迎大家一起参与开发<br>
> * 为方便开发者初步使用、项目提供了可直接运行的资源环境<br/>
> * 本开源项目所有可运行的资源包括但不限于(数据库资源、缓存资源、消息队列资源等等)，只可以用做测试之用。切勿进行压力测试<br/>
> * 若要进行压力测试，请替换为自己的数据资源<br/>

## 项目基础架构
> ### 请求流程解析
> * 前端请求->dns负载->nginx反向代理集群->zuul网关集群->聚合服务层->原子服务层->数据层访问层
## 开发步骤
> ### 集成微服务基本组件
> * dq-
> ### 项目实战
## 持续开发中
