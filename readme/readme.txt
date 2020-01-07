执行mvn compile命令来自动生成代码Stub
mvn编译完成以后，在target/generated-sources目录下就能看到根据上面.proto文件自动转化生成的Java代码Stub


可以在maven projects视图中选择 protobuf:compile命令执行
protobuf:compile //编译消息对象
protobuf:compile-custom //依赖消息对象,生成接口服务

也可以使用通过终端Terminal执行mvn命令，但是必须提前安装好protoc.exe

mvn install:install-file -DgroupId=com.google.protobuf -DartifactId=protoc -Dversion=3.0.0 -Dclassifier=windows-x86_64} -Dpackaging=exe -Dfile=D:\protobuf\protoc.exe

mvn protobuf:compile
mvn protobuf:compile-custom


CodeSheep程序羊
https://www.imooc.com/article/30184





