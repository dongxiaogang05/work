package listview.tianhetbm.p2p.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @date:2020/9/15
 * @author:dongxiaogang
 * @description:
 */
public class Product implements Serializable {

    /**
     * data : [{"id":"1","name":"超级新手计划","money":"10","yearLv":"8.00","suodingDays":"30","minTouMoney":"100","memberNum":"100","progress":"50"},{"id":"2","name":"乐享活系列90天计划","money":"20","yearLv":"8.00","suodingDays":"40","minTouMoney":"1000","memberNum":"100","progress":"60"},{"id":"3","name":"钱包计划","money":"200","yearLv":"11.00","suodingDays":"100","minTouMoney":"10000","memberNum":"400","progress":"90"},{"id":"4","name":"90天理财计划(加息5%)","money":"40","yearLv":"15.00","suodingDays":"80","minTouMoney":"10000","memberNum":"200","progress":"30"},{"id":"5","name":"林业局投资商业经营","money":"500","yearLv":"10.00","suodingDays":"150","minTouMoney":"50000","memberNum":"150","progress":"40"},{"id":"6","name":"中学老师购买车辆","money":"10","yearLv":"8.00","suodingDays":"60","minTouMoney":"5000","memberNum":"60","progress":"40"},{"id":"7","name":"屌丝下海经商计划","money":"20","yearLv":"13.00","suodingDays":"120","minTouMoney":"10000","memberNum":"80","progress":"90"},{"id":"8","name":"新西游影视拍摄投资","money":"500","yearLv":"14.00","suodingDays":"100","minTouMoney":"2000","memberNum":"1000","progress":"80"},{"id":"9","name":"Java培训老师自己周转","money":"5","yearLv":"8.00","suodingDays":"90","minTouMoney":"1000","memberNum":"100","progress":"40"},{"id":"10","name":"阿里巴巴洗钱计划","money":"1000","yearLv":"10.00","suodingDays":"200","minTouMoney":"100000","memberNum":"1000","progress":"60"}]
     * success : true
     */

    public boolean success;
    /**
     * id : 1
     * name : 超级新手计划
     * money : 10
     * yearLv : 8.00
     * suodingDays : 30
     * minTouMoney : 100
     * memberNum : 100
     * progress : 50
     */

    public List<Data> data;

    public static class Data {
        public String id;
        public String name;
        public String money;
        public String yearLv;
        public String suodingDays;
        public String minTouMoney;
        public String memberNum;
        public String progress;
    }
}
