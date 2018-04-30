# Spring Context Test
Shows initialization order of Spring Beans for different context setups.

Each exercise has ist own Package and its own application. After starting particular application it will create log output, so that you can observer Bean initialization order.
For example execution of V01Application will create such output:
````
>> BeanA - constructor
>> BeanA - postConstruct
>> BeanB - constructor
>> BeanB - postConstruct
>> BeanC - constructor
>> BeanC - postConstruct
````  
V02Application contains slightly modified Conext configuration and thafore Bans has different initialation order:
````
>> BeanB - constructor
>> BeanB - postConstruct
>> BeanA - constructor
>> BeanA - postConstruct
>> BeanC - constructor
>> BeanC - postConstruct
````  

Each excersisse modifies slightly prevous one, so that we can observe different initialization order of Spring Beans.

It logs over System.err because Lockback refused to create log statements in some cases (probably due to CLLIB)
