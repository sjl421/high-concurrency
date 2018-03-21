/**
 * Created by Will.Zhang on 2018/3/20 0020 12:30.
 * 演示了synchronized关键字的几种使用情况
 *
 * 修饰代码块
 * 作用范围:被修饰的代码块
 * 作用对象:调用该方法的对象, 不同对象并不会影响
 *
 * 修饰方法
 * 作用范围:被修饰的方法
 * 作用对象:调用该方法的对象, 不同对象并不会影响
 *
 * 修饰类
 * 作用范围:被修饰的方法
 * 作用对象:调用该方法的所有对象
 *
 * 修饰静态方法
 * 作用范围:被修饰的方法
 * 作用对象:调用该方法的所有对象
 *
 * JMM(Java Memory Model)关于synchronized的两条规定
 * 线程解锁前:必须把共享变量的最新值刷新到主内存上
 * 线程加锁时:将清空工作内存中共享变量的值, 从而使用共享变量时需要从主内存上重新读取最新的值
 * 注意:加锁和解锁指的是同一把锁
 */
package com.will.highconcurrency.example.sync;