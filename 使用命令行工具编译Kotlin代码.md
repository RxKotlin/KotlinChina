###下载编译器

请先安装Homebrew

```
$ brew update
$ brew inatall kotlin
```

###创建并运行第一个程序

1. 创建一个hello.kt文件，并使用您喜欢的编辑器写入：

```Kotlin
fun main(args: Array<String>) {
    println("Hello, World!")
}
```

2. 使用Kotlin编译器编译该文件

```
$ kotlinc hello.kt -include-runtime -d hello.jar
```

参数说明：
-d 将编译后的文件输出为 hello.jar；
-include-runtime 将包含Kotlin的运行库；

若需要了解更多的参数：

```
$ kotlinc -help
```

3. 运行该应用

```Kotlin
$ java -jar hello.jar
```

###编译库文件

若需要将生成的jar包供其他Kotlin程序使用，可无需包含Kotlin的运行库：

```
$ kotlinc hello.kt -d hello.jar
```

此时可以使用kotlin来运行此结果：

```
$ kotlin -classpath hello.jar HelloKt
```

HelloKt 为编译器为hello.kt文件生成的默认类名。
