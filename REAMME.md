## stage1代码说明
### 文件目录
├── calculator
│   ├── build.xml
│   ├── lib
│   │   └── junit-4.13.2.jar
│   ├── sonar-project.properties
│   ├── src
│   │   ├── calculator$1.class
│   │   ├── calculator$2.class
│   │   ├── calculator$3.class
│   │   ├── calculator$4.class
│   │   ├── calculator$5.class
│   │   ├── calculator.class
│   │   └── calculator.java
│   └── test
│       ├── calculator$1.class
│       ├── calculator$2.class
│       ├── calculator$3.class
│       ├── calculator$4.class
│       ├── calculator$5.class
│       └── calculator.class
├── helloworld
│   ├── build
│   │   └── classes
│   │       └── helloworld.class
│   ├── build.xml
│   ├── lib
│   │   └── junit-4.13.2.jar
│   ├── src
│   │   ├── helloworld.class
│   │   ├── helloworld.java
│   │   ├── helloworldJunitTest.class
│   │   └── helloworldJunitTest.java
│   └── test
│       ├── helloworld.class
│       └── helloworldJunitTest.class
└── REAMME.md


### helloworld
程序功能：命令行输出helloworld，并使用junit进行测试
程序运行：在helloworld下运行ant指令
### calculator
程序功能：一个简单的计算器小程序，支持两数加减乘除
程序运行：在src下运行终端，输入：javac calculator.java java calculator