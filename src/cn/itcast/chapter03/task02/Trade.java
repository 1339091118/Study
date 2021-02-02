package cn.itcast.chapter03.task02;

public class Trade {
    public static void main(String[] args) {
        // 定义一家银行名称(给静态变量赋值,可以直接使用类名访问)
        Bank.bankName = "建设银行";
        // 调用静态方法,打印银行欢迎语句
        Bank.welcome();
        // 通过构造方法进行开户操作
        Bank bank = new Bank("小陈", "654321", 100.0);
        // 进行存款操作
        bank.deposit(500.00);
         /* 取款时密码输入错误，取款失败
          * 取款时密码输入正确，余额不足，取款失败
          * 取款时密码输入正确，余额充足，取款成功
          */
        bank.withdrawal("123456", 200.0);
        bank.withdrawal("654321", 1000.0);
        bank.withdrawal("654321", 100.0);
        // 调用静态方法,打印银行道别语句
        Bank.welcomeNext();
    }
}
