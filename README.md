#JNI在VS2012下调试步骤
1.在VS中新建类，类名由javah生成的.h文件中获取，并将.h文件的全部内容拷贝到新建类的.h中。
2.在VS的类CPP文件中，编写.h中定义的native方法，并实现。
3.建立VS项目，选择dll项目
4.编译时选择配置管理器，x64
