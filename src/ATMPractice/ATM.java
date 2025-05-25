package ATMPractice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        //放置Account類的容器
        ArrayList<Account> accounts = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Account acc = new Account();

        while (true) {
            //登入、註冊
            welcomePage:
            while (true) {
                System.out.println("============Welcome to use the ATM System============");
                System.out.println("1.登入帳戶");
                System.out.println("2.註冊帳戶");
                System.out.println();
                System.out.println("請選擇操作選項：");
                int choice1 = sc.nextInt();
                switch (choice1) {
                    case 1:
                        //用戶登入操作;
                        acc = logIn(accounts, sc);
                        if (acc == null) {
                            break;
                        } else {
                            break welcomePage;
                        }
                    case 2:
                        //註冊操作
                        register(accounts, sc);
                        break;
                    default:
                        System.out.println("您所輸入的選項不正確，請重新選擇");
                }
            }

            //功能操作頁面
            function:
            while (true) {
                System.out.println("============歡迎使用ＡＴＭ系統============");
                System.out.println("1.查詢");
                System.out.println("2.存款");
                System.out.println("3.取款");
                System.out.println("4.轉帳");
                System.out.println("5.修改密碼");
                System.out.println("6.退出");
                System.out.println("7.註銷目前帳戶");
                System.out.println();
                System.out.println("請選擇操作選項：");
                int choice2 = sc.nextInt();
                switch (choice2) {
                    case 1:
                        //查詢
                        search(acc);
                        break;
                    case 2:
                        //存款
                        deposit(acc, sc);
                        break;
                    case 3:
                        //取款
                        withdraw(acc, sc);
                        break;
                    case 4:
                        //轉帳
                        trans(accounts, acc, sc);
                        break;
                    case 5:
                        //修改密碼
                        changePWD(acc, sc);
                        break;
                    case 6:
                        //退出
                        break function;
                    case 7:
                        //註銷帳戶
                        accounts.remove(acc);
                        System.out.println("您已註銷本帳戶");
                        break function;
                    default:
                        System.out.println("您輸入錯誤指令，請重新輸入。");
                }
            }
        }
    }


    //=========用戶操作功能區===========
    /**
     *查詢帳戶資訊
     * @param acc 當前帳戶
     */
    private static void search(Account acc) {
        System.out.println("帳戶卡號： " + acc.getCardId());
        System.out.println("帳戶名稱： " + acc.getUserName());
        System.out.println("帳戶餘額： " + acc.getMoney());
        System.out.println("單次額度： " + acc.getQuota());
        System.out.println();
    }

    /**
     * 存款
     * @param acc 當前帳戶
     * @param sc 輸入
     */
    private static void deposit(Account acc, Scanner sc) {
        System.out.println("請輸入存款金額：");
        double depositMoney = sc.nextDouble();
        double insideMoney = acc.getMoney();
        acc.setMoney(depositMoney + insideMoney);
        insideMoney = acc.getMoney();
        System.out.println("目前餘額" + insideMoney);
        System.out.println();
    }

    /**
     * 取款
     * @param acc 當前帳戶
     * @param sc 輸入
     */
    private static void withdraw(Account acc, Scanner sc) {
        System.out.println("請輸入取款金額：");
        double withdraw = sc.nextDouble();
        double inside = acc.getMoney();
        double limit = acc.getQuota();
        if (withdraw > inside) {
            System.out.println("您的餘額不足，請操作。");
            System.out.println();
            return;
        }
        if (withdraw > limit) {
            System.out.println("您取款限制金額為：" + limit + "請重新操作。");
            System.out.println();
            return;
        }else {
            inside -= withdraw;
            acc.setMoney(inside);
            System.out.println("您提領了：" + withdraw + "元。");
            System.out.println("餘額剩餘：" + inside);
            System.out.println();
        }
    }
    /**
     * 轉帳
     * @param accounts 放帳戶的集合
     * @param acc 當前帳戶
     * @param sc 輸入
     */
    private static void trans(ArrayList<Account> accounts, Account acc, Scanner sc) {
        //確認有人可以轉帳
        if (accounts.size() < 2) {
            System.out.println("目前帳戶內無人員可以轉帳，請重新選擇。");
            return;
        }
        //以卡號查詢對方帳戶
        System.out.println("請輸入要轉入的卡號");
        String cardId = sc.next();
        Account acc2 = getAccountByCardId(accounts, cardId);

        if (acc2 == null) {
            System.out.println("查無您要轉帳的卡號，請重新選擇：");
            System.out.println();
            return;
        }

        System.out.println("請輸入轉帳金額: ");
        double trans = sc.nextDouble();
        double accMoney = acc.getMoney();
        double acc2Money = acc2.getMoney();
        if (accMoney < trans) {
            System.out.println("您的帳戶餘額不足，請重新選擇需求功能。");
            System.out.println("帳戶餘額為：" + accMoney);
            System.out.println();
            return;
        }
        acc.setMoney(accMoney - trans);
        acc2.setMoney(acc2Money + trans);
        System.out.println("您已完成轉帳，帳戶餘額為：" + acc.getMoney());
        System.out.println();
    }

    /**
     * 修改密碼
     * @param acc 當前帳戶
     * @param sc 輸入
     */
    private static void changePWD(Account acc, Scanner sc) {
        System.out.println("請輸入您的原始密碼：");
        String PWD = sc.next();
        if (!PWD.equals(acc.getPwd())) {
            System.out.println("您的密碼錯誤，請重新選擇您需要的功能。");
            System.out.println();
            return;
        }
        System.out.println("請輸入您要更換的密碼：");
        String changePWD = sc.next();
        System.out.println("請再次確認您要更換的密碼：");
        String changePWD2 = sc.next();
        if (!changePWD.equals(changePWD2)) {
            System.out.println("您兩次輸入的密碼不同，請重新選取您要的功能。");
            System.out.println();
            return;
        }
        acc.setPwd(changePWD);
    }


    //===========方法區域============
    /**
     * 登入帳戶
     * @param accounts 帳戶集合
     * @param sc 輸入
     * @return 傳回帳戶
     */
    private static Account logIn(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("============系統登入頁面============");
        //判斷是否有帳戶
        if (accounts.size() == 0) {
            System.out.println("目前無任何帳戶，請註冊後再登入。");
            return null;
        }

        //輸入並驗證卡號
        Account acc;

        checkCardId:
        while (true) {
            System.out.println("請輸入您的卡號：");
            String cardId = sc.next();
            acc = getAccountByCardId(accounts, cardId);
            if (acc != null) {
                break checkCardId;
            }
            System.out.println("查無您輸入的卡號，請重新輸入");
//            //我忘記已經有寫查詢卡號的方法了
//            for (int i = 0; i < accounts.size(); i++) {
//                Account acc = accounts.get(i);
//                if (cardId.equals(acc.getCardId())) {
//                    break checkCardId;
//                }
//            System.out.println("查無此卡號，請重新輸入")
//            }
        }
        //輸入密碼並驗證
        checkPWD:
        while (true) {
            System.out.println("請輸入您的密碼：");
            String pwd = sc.next();
            if (pwd.equals(acc.getPwd())) {
                break checkPWD;
            }
            System.out.println("您輸入的密碼錯誤，請重新輸入");
//            //接續上面作業
//            for (int i = 0; i < accounts.size(); i++) {
//                acc = accounts.get(i);
//                if (pwd.equals(acc.getPwd())) {
//                    break checkPWD;
//                }
//                System.out.println("您輸入的密碼錯誤，請重新輸入");
//            }
        }

        System.out.println(acc.getUserName() + "先生/女士，歡迎您進入系統，請繼續選擇您的功能。");
        return acc;
    }

    /**
     * 用戶註冊功能
     * @param accounts 帳戶集合
     * @param sc 輸入
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        String id;
        String pw1;
        String pw2;
        double quota;
        Account account = new Account();
        //註冊帳號名稱
        System.out.println("============Welcome to Register============");
        System.out.println("請輸入您要申請的帳戶名稱：");
        id = sc.next();
        account.setUserName(id);
        //註冊密碼
        while (true) {
            System.out.println("請輸入您的密碼：");
            pw1 = sc.next();
            System.out.println("請輸入確認密碼：");
            pw2 = sc.next();
            if (pw1.equals(pw2)) {
                account.setPwd(pw1);
                break;
            } else {
                System.out.println("兩次密碼輸入不相同，請重新輸入。");
            }
        }
        System.out.println("請輸入每次提領額度：");
        quota = sc.nextInt();
        account.setQuota(quota);

        //八位數卡號，且不重複(另做方法)
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);

        accounts.add(account);

        System.out.println(account.getUserName() + "您好，您已完成註冊，您的卡號是[" + account.getCardId() + "]請務必熟記。");
    }

    /**
     * 生成卡號
     * @param accounts 帳戶集合
     * @return 回傳卡號
     */
    private static String getRandomCardId(ArrayList<Account> accounts) {
        while (true) {
            Random r = new Random();
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }
            //看卡號是否重複(用卡號查詢)，查詢到資料，回傳accout,否則回傳NULL
            Account account = getAccountByCardId(accounts, cardId);
            if (account == null) {
                return cardId;
            }
        }
    }

    /**
     * 用卡號查帳戶
     * @param accounts 帳戶集合
     * @param cardId 卡片號碼
     * @return 回傳帳戶
     */
    private static Account getAccountByCardId(ArrayList<Account> accounts, String cardId) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (cardId.equals(acc.getCardId())) {
                return acc;
            }
        }
        return null;
    }


}






