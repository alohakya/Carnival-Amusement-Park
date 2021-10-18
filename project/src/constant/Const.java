package constant;

public class Const {
    //票的种类
    public final static String ADULT_TICKET = "成人票";
    public final static String CHILD_TICKET = "儿童票";
    public final static String COUPLE_TICKET = "情侣票";
    public final static String FAMILY_TICKET = "家庭票";
    public final static String STUDENT_TICKET = "学生票";


    //票的价格
    public final static int ADULT_TICKET_MONEY = 200;
    public final static int CHILD_TICKET_MONEY = 100;
    public final static int COUPLE_TICKET_MONEY = 360;
    public final static int FAMILY_TICKET_MONEY = 400;
    public final static int STUDENT_TICKET_MONEY = 120;

    //票使用状态
    public static final String[] TICKET_STATE = {"未买票","已退票","已购买，未检票","检票成功，进入园区"};

    //游乐设施的状态
    public final static String IN_SERVICE = "正常运行";
    public final static String REPAIRED= "维修中";

}
