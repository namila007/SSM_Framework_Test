# SSM_Framework_Test
This is a test project for integrating Spring+Struts+Mybatis framework for JavaWeb project. 

## ---How to Run---
------
### Basic Setup for IntelliJ Idea
##### 1. Clone the git and import the project in to IntelliJ Idea(or use eclipse).
&nbsp;
##### 2. setup the basic configurations
* add `Web/WEB-INF/lib` to library path
![screenshot_4](https://user-images.githubusercontent.com/18147085/33571605-90dc4516-d956-11e7-9c28-593adb3d0af4.jpg)

* add **modules** `Struts2,Spring,Web` and give thier relevant config files (for spring-`spring-config.xml` ,for struts-`struts.xml` 
![screenshot_5](https://user-images.githubusercontent.com/18147085/33571567-661e0e86-d956-11e7-911f-83a7a530c964.jpg)
    ![screenshot_6](https://user-images.githubusercontent.com/18147085/33571761-0fa383e6-d957-11e7-817e-464c3d536c17.jpg)

* add `TOMCAT libraries` make them **EXPORT**
 ![screenshot_9](https://user-images.githubusercontent.com/18147085/33571771-15b8faae-d957-11e7-9155-39aeefb10fce.jpg)

* add **Facets**
![screenshot_7](https://user-images.githubusercontent.com/18147085/33571763-1015c208-d957-11e7-86aa-67fe67e55c5c.jpg)
![screenshot_8](https://user-images.githubusercontent.com/18147085/33571766-12bd1e70-d957-11e7-96cd-391fa68d5578.jpg)

* create **Artifact** in type of `War Exploded`
![screenshot_10](https://user-images.githubusercontent.com/18147085/33571772-17089702-d957-11e7-885e-5bc054126ee7.jpg)


##### 3.Setup the TomCat Run configurations
* go to run configuration and add `Tomcat server>Local` 
[Download Tomcat](https://tomcat.apache.org/download-80.cgi)
![screenshot_10](https://user-images.githubusercontent.com/18147085/33572266-6db38bf6-d958-11e7-8557-05ba1acc2262.jpg)
------
### Create MySQL DB

##### 1. create a database called `struts` and a user with **username=`struts1` & password=`abc123`**
&nbsp;
##### 2. Transfer database privilages for newly created user
&nbsp;
##### 3. Run the Ant file `build.xml` in **DATABASE** folder
----
&nbsp;

### Mybatis Generator

##### 1. Run the Ant `build.xml` file in project root 
---
&nbsp;
---- 
#### Compile & Build the project and Deploy the Artifact
![screenshot_12](https://user-images.githubusercontent.com/18147085/33572759-e290dcde-d959-11e7-851f-3b521deb8564.jpg)

&nbsp;
-----
#### Others
* i have added some comments so you will be able to understand what i did there



---
### Resources
it was hard to find the resource for SSM framework, here's some reosurces found from chinese sites
* [tutorial 1]( http://blog.csdn.net/lk7688535/article/details/51243753)
* [transaction tx method](http://blog.csdn.net/u012964143/article/details/43761509)
* [Maven version](http://blog.csdn.net/AC_great/article/details/47614273)

