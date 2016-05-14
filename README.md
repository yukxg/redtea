# redtea
内容
1. 在Github上面建立一个账户，然后建立一个自己公开的代码库，.gitignore选择
PlayFramework
2. 在电脑上面安装git，把代码库clone到本地
3. 开发任务
a. 在本地代码库建立Play的项目，然后进行第一次提交代码到git。
b. 做一个HelloWorld接口，URL为localhost:8088/redtea/helloWorld, 通过GET请求
发回”Hello World“ 这两个单词。第二次提交代码到git。
c. 利用Play的Evolution，建立一个数据库表，表放在Mysql，表名user, 有字段
username, firstname, lastname, address。第三次提交代码到git。
d. 做一个User接口，URL为localhost:8088/redtea/userRegister, 通过POST请求发送
如下JSON格式数据
{
"username" : "tester",
"firstname" : "Jimmy",
"lastname" : "Jackson",
"address" : "USA"
}
接口收到这个数据之后，在后台打印一下收到的信息，返回字符串“ok”。第四次提
交代码到git。（提示，利用Chrome的一个叫POSTMAN的插件可以提交POST请
求）
e. 修改User接口，解释接收到的JSON字符串，并且转化为一个对象，利用Ebean保
存到3.3建立的表中。第五次提交代码到git。
4. 作业完成，将你的git账户发给我
要求
1. 导入附件中的style.xml到Eclipse，用以规范代码格式。
2. 不允许使用上面提到的Play, Ebean, Evolution以外的第三方框架。
3. 每完成一个开发子项目，commit一次。
4. 你有一周的时间完成这个项目，做得快不如做得好。我们喜欢用尽可能少的代码完成尽可
能多的事情。
5. 必要的代码注释可以提高代码的整体可读性。
有用的连接
● Github https://github.com/
● PlayFramework https://www.playframework.com/documentation/2.4.x/Home
○ https://www.playframework.com/documentation/2.4.x/JavaActions
○ https://www.playframework.com/documentation/2.4.x/JavaDatabase
○ https://www.playframework.com/documentation/2.4.x/Evolutions
○ https://www.playframework.com/documentation/2.4.x/JavaEbean
● POSTMAN （可能需要翻墙）
https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop
