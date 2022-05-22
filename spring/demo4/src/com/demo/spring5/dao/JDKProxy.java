package com.demo.spring5.dao;

import com.demo.spring5.dao.impl.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args) {

//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });

        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        System.out.println("4:"+dao.add(1,3));
    }

}

class UserDaoProxy implements InvocationHandler {

    private Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }


//    代理对象  方法名 参数
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        //增强逻辑
//        System.out.println("方法之前" + method.getName() + Arrays.toString(args));
        System.out.println("before excute methods: " + method.getName() + "methos args"+Arrays.toString(args));

        //执行增强方法
        Object result = method.invoke(obj, args);

//        System.out.println("方法执行完了并且有返回值了：" + result + "方法执行完了查看对象：" + obj);
        System.out.println(System.getProperty("file.encoding"));
        System.out.println("method excuted and return res:" + result + " method excuted and check obj:" + obj);
        return result;

        //执行后

    }

}
