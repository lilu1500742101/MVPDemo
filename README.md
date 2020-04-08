# MVPDemo
Android  MVP Demo
Android MVP框架案例 开发工具：Android Studio3.5.+、Gradle 3.5.2、Anddroid Gradle Plugin 5.4.1、最低SDK 19（Android4.4），目标SDK 29

两个案例讲解MVP，分别是实现登录功能的MVPDemo和Google官方MVPDemo。


实现登录功能的MVPDemo：
1、具体分为3层View-Presenter-Model
2、V-P层传数据采用函数的参数传参
3、M层模拟从网络获取数据。
4、正确用户名和密码分别为:mvp，123456

Google官方提供的MVPDemo：
1、具体分为4层View-Crontract-Presenter-Model
2、contract层处于V层和P层中间，实现了原本在V层和P层的两个接口，V层和P层的接口是在Contract中对应接口的基础上再抽象一层，
使V层和P层的耦合性更低，灵活性更高。
3、V-P层传参采用接口函数传参
4、此Demo重点在于V层和P层的分离，M层的较少。
