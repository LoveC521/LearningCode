package org.example.case02;

/**
 * 多例模式：懒汉式 <br>
 * 在一家大型公司中，每个部门（如 HR、IT、Finance）都需要一台打印机。为了节省系统资源，公司决定使用懒汉式多例模式设计一个打印机管理系统。该系统应满足以下要求：
 * <ul>
 *     <li>每个部门只能拥有一个打印机实例（通过部门名称唯一标识）。</li>
 *     <li>打印机实例应按需创建，即只有在第一次请求该部门的打印机时才创建。</li>
 *     <li>所有部门的打印机都通过一个统一的管理类来获取。</li>
 *     <li>系统支持多个部门，但每个部门的打印机实例只能创建一次。</li>
 *     <li>系统需保证线程安全。</li>
 * </ul>
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = PrinterManager.getInstance("财务部");
        printer.print();
    }
}
