package sxkeji.net.dailydiary.utils;

import android.content.Context;

import com.umeng.analytics.MobclickAgent;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by renbingwu on 2015/11/20.
 */
public class UmengEventUtils {
    public static void onEventId(Context context, String id) {
        MobclickAgent.onEvent(context, id);
    }

    public static void onEventMap(Context context, String id, Map<String, String> map) {
        MobclickAgent.onEvent(context, id, map);
    }

    public static String AboutYaoMaiChe = "aboutYaoMaiChe";// 关于要买车
    public static String AfterInputApply = "afterInputApply";//申请达人下一步
    public static String AgreeProtocol = "agreeProtocol";//同意车达人用户协议
    public static String ApplyCarMaster = "applyCarMaster";//登陆申请达人
    public static String BenefitActivities = "benefitActivities";//优惠活动
    public static String CancelSetHeader = "cancelSetHeader";//取消设置头像
    public static String CommitMyAddress = "commitMyAddress";//提交收货地址
    public static String CommitMyGathering = "commitMyGathering";//提交收款方式
    public static String ConsultQuestion = "consultQuestion";//咨询留言
    public static String ConsultQuestionSubmit = "consultQuestionSubmit";//咨询留言提交
    public static String Coupons = "coupons";//优惠券
    public static String FindCar = "findCar";//找车
    public static String FinishResetPwd = "finishResetPwd";//完成忘记_设置密码
    public static String Forget_resetPassword = "forget_resetPassword";//登陆忘记_设置密码
    public static String FundBills = "fundBills";//基金账单
    public static String Help = "help";//登陆帮助
    public static String HelpCenter = "helpCenter";//帮助中心
    public static String HelpOnclick = "helpOnclick";//帮助中心点击
    public static String Home = "home";//首页
    public static String Login = "login";//登陆
    public static String MasterArea = "MasterArea";//达人所属地区
    public static String MasterBrand = "MasterBrand";//达人所属品牌
    public static String MyAddress = "myAddress";//我的收货地址
    public static String MGathering = "myGathering";//我的收款方式
    public static String MyHeader = "myHeader";//头像
    public static String MyInfo = "myInfo";//我的
    public static String MyInformationDetail = "myInformationDetail";//个人信息
    public static String NotToQuitApplyCarMaster = "NotToQuitApplyCarMaster";//否(退出车达人申请)
    public static String NotToQuitResetPwd = "NotToQuitResetPwd";//否(退出设置密码)
    public static String NotToSignOut = "notToSignOut";//否(退出登录)
    public static String OpinionsFeedback = "opinionsFeedback";//意见反馈
    public static String OpinionsFeedbackSubmit = "opinionsFeedbackSubmit";//意见反馈提交
    public static String OrderTrace = "orderTrace";//订单跟踪
    public static String QuitApplyCarMaster = "quitApplyCarMaster";//达人申请
    public static String SaveNameChange = "saveNameChange";//保存姓名
    public static String SelectABrandS = "selectABrand";//选择某车品牌
    public static String SelectCarModel = "selectCarModel";//选择某车型
    public static String SelectCarSeries = "selectCarSeries";//选择某车系
    public static String SelectHotBrand = "selectHotBrand";//选择热门品牌
    public static String SelectHotCar = "selectHotCar";//选择热销车
    public static String SetHeaderByTakingAPhoto = "setHeaderByTakingAPhoto";//拍照
    public static String SetHeaderFromAlbums = "setHeaderFromAlbums";//从相册选择
    public static String Share = "share";//分享
    public static String ShowCarColor = "showCarColor";//显示颜色
    public static String SignOut = "signOut";//退出登录
    public static String SinaWeibo = "sinaWeibo";//微博
    public static String UploadIDCardPhoto = "uploadIDCardPhoto";//上传身份证照片
    public static String WechatFrends = "wechatFrends";//微信好友
    public static String WechatFrendsCircle = "wechatFrendsCircle";//微信朋友圈
    public static String YesToQuitApplyCarMaster = "yesToQuitApplyCarMaster";//是(退出车达人申请)
    public static String YesToQuitResetPwd = "yesToQuitResetPwd";//是(退出设置密码)
    public static String YesToSignOut = "yesToSignOut";//是(退出登录)


}
