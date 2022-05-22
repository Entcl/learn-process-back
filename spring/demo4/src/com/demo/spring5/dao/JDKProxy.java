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


//    �������  ������ ����
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        //��ǿ�߼�
//        System.out.println("����֮ǰ" + method.getName() + Arrays.toString(args));
        System.out.println("before excute methods: " + method.getName() + "methos args"+Arrays.toString(args));

        //ִ����ǿ����
        Object result = method.invoke(obj, args);

//        System.out.println("����ִ�����˲����з���ֵ�ˣ�" + result + "����ִ�����˲鿴����" + obj);
        System.out.println(System.getProperty("file.encoding"));
        System.out.println("method excuted and return res:" + result + " method excuted and check obj:" + obj);
        return result;

        //ִ�к�

    }

}
