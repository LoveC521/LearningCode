package org.example.case01;

/**
 * 多例模式：饿汉式
 * 某公司希望为几个固定部门（如 HR、IT、Finance）预分配打印机资源，以确保每次请求都能快速获取打印机。因此，决定使用饿汉式多例模式设计一个打印机管理系统。该系统应满足以下要求：
 * <ul>
 *     <li>在系统启动时，预先创建好每个部门的打印机实例。</li>
 *     <li>所有打印机实例存储在一个注册表中。</li>
 *     <li>每个部门只能拥有一个打印机实例（通过部门名称唯一标识）。</li>
 *     <li>请求打印机时，直接从注册表中获取，不重新创建。</li>
 *     <li>系统支持固定的几个部门，不支持动态添加。</li>
 * </ul>
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = PrinterManager.getInstance("人力资源部");
        printer.print();
    }
}
