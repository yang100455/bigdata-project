# bigdata-project



<img width="50%" src="README_images/flink-header-logo.svg" />()




<span><img  width='100px' src="https://img.shields.io/badge/项目背景-green" alt="项目背景" /> <span/>



数据源：[**深圳市图书馆书籍外借数据**](https://opendata.sz.gov.cn/data/dataSet/toDataDetails/29200_01603514)

数据源：[**大鹏新区-卡口过车数据统计表**](https://opendata.sz.gov.cn/data/dataSet/toDataDetails/29200_03001079)

数据源：[**高速公路ETC入深圳数据**](https://opendata.sz.gov.cn/data/dataSet/toDataDetails/29200_00403621)



<span><img width='50px' src="https://img.shields.io/badge/安装-blue" alt="安装" /> <span/>





|   组件    | Node001      | Node002 | Node003 |
| :-------: | :----------- | :------ | :------ |
|   Mysql   | ☑️            |         |         |
|   Redis   | ☑️            |         |         |
|    CM     | ☑️            |         |         |
|   HDFS    | ☑️nn          | ☑️2nn    | ☑️       |
| Zookeeper | ☑️            | ☑️       | ☑️       |
|   Spark   | ☑️history     | ☑️       | ☑️       |
|   Hive    | ☑️meta/server | ☑️       | ☑️       |
|  Impala   | ☑️server      | ☑️       | ☑️sta    |
|   Kudu    | ☑️master/ts   | ☑️ts     | ☑️ts     |
|   Kafka   |              | ☑️       | ☑️       |
|   Flume   |              | ☑️       | ☑️       |
|   yarn    | ☑️            |         |         |
|   sqoop   | ☑️            | ☑️       | ☑️       |
|   HBASE   | ☑️master      | ☑️       | ☑️       |



## Phoenix 

[**CDH6.3.2安装（包括Phoenix和Kylin）**](https://blog.csdn.net/monster77777/article/details/109243089)



## Flink

[**CDH6.3.2添加安装flink-yarn服务**](https://blog.csdn.net/qq_31454379/article/details/110440037)



## dolphinscheduler
admin/dolphinscheduler123

一键停止集群所有服务

```shell
sh ./bin/stop-all.sh
```

一键开启集群所有服务

```shell
sh ./bin/start-all.sh
```

启停Master

```shell
sh ./bin/dolphinscheduler-daemon.sh start master-server
sh ./bin/dolphinscheduler-daemon.sh stop master-server
```

启停Worker

```shell
sh ./bin/dolphinscheduler-daemon.sh start worker-server
sh ./bin/dolphinscheduler-daemon.sh stop worker-server
```

启停Api

```shell
sh ./bin/dolphinscheduler-daemon.sh start api-server
sh ./bin/dolphinscheduler-daemon.sh stop api-server
```

启停Logger

```shell
sh ./bin/dolphinscheduler-daemon.sh start logger-server
sh ./bin/dolphinscheduler-daemon.sh stop logger-server
```

启停Alert

```shell
sh ./bin/dolphinscheduler-daemon.sh start alert-server
sh ./bin/dolphinscheduler-daemon.sh stop alert-server
```





<span><img width='50px' src="https://img.shields.io/badge/使用-black" alt="使用" /> <span/>




<span><img  src="https://img.shields.io/badge/贡献人-yellow" alt="贡献人" /> <span/>

<img  src="https://img.shields.io/badge/Wangwy-9cf" alt="Wangwy" /> <img  src="https://img.shields.io/badge/Linzc-9cf" alt="Linzc" /> <img  src="https://img.shields.io/badge/Yangxw-9cf" alt="Yangxw" /> 

