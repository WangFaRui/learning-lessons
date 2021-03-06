package com.wfr.learning.in.spring.generic;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 基于 {@link GenericCollectionTypeResolver} 示例
 * <p>GenericCollectionTypeResolver 在Spring 4.3.26版本已被移除
 *
 * @author wangfarui
 * @since 2022/6/29
 */
public class SpringGenericCollectionTypeResolverDemo {

    private static StringList stringList;

    private static List<String> strings;

    public static void main(String[] args) throws Exception {

//        // StringList extends ArrayList<String> 具体化
//        // getCollectionType 返回具体化泛型参数类型集合的成员类型 = String
//        System.out.println(GenericCollectionTypeResolver.getCollectionType(StringList.class));
//
//        System.out.println(GenericCollectionTypeResolver.getCollectionType(ArrayList.class));
//
//        // 获取字段
//        Field field = GenericCollectionTypeResolverDemo.class.getDeclaredField("stringList");
//        System.out.println(GenericCollectionTypeResolver.getCollectionFieldType(field));
//
//        field = GenericCollectionTypeResolverDemo.class.getDeclaredField("strings");
//        System.out.println(GenericCollectionTypeResolver.getCollectionFieldType(field));
    }
}
