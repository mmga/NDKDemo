# NDKDemo
在Android Studio运行第一个NDK程序

> 参考
>  http://yanbober.github.io/2015/02/14/android_studio_jni_1/ <br>
> http://blog.csdn.net/qiujuer/article/details/42040963

1. 设置ndk路径的时候，总提示出错不让确定，仔细一看发现是c:\program files\ndk里有空格,于是又换了个文件夹，耽误好久。
![这里写图片描述](http://img.blog.csdn.net/20151119161447245)

2.build的时候出现个错误：

```
Error: NDK integration is deprecated in the current plugin. <br>
Consider trying the new experimental plugin. For details, <br>
see http://tools.android.com/tech-docs/new-build-system/gradle-experimental. <br>
Set "android.useDeprecatedNdk=true" in gradle.properties to continue using the current NDK integration.
```

当时只看到前半部分，后面的在屏幕外没在意，想继续用的话在gradle.properties中添加`android.useDeprecatedNdk=true`就行了


好吧，没什么有营养的内容，就是记录下自己学习过程中的坑。<br>
[http://blog.csdn.net/gulumi_mmga/article/details/49929501](http://blog.csdn.net/gulumi_mmga/article/details/49929501)
