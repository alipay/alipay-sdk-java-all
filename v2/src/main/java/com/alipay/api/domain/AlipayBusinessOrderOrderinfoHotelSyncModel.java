package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 酒店订单同步
 *
 * @author auto create
 * @since 1.0, 2023-04-14 15:10:00
 */
public class AlipayBusinessOrderOrderinfoHotelSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8217499328938833198L;

	/**
	 * 订单总金额（不包含任何优惠的金额）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 酒店小程序id
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 预定人信息
	 */
	@ApiField("booker")
	private Passenger booker;

	/**
	 * 取消规则描述
	 */
	@ApiField("cancel_rule_description")
	private String cancelRuleDescription;

	/**
	 * 取消规则
	 */
	@ApiField("cancel_rule_name")
	private String cancelRuleName;

	/**
	 * 入住日期
	 */
	@ApiField("check_in_date")
	private Date checkInDate;

	/**
	 * 酒店入住时间
	 */
	@ApiField("check_in_time")
	private String checkInTime;

	/**
	 * 离店日期
	 */
	@ApiField("check_out_date")
	private Date checkOutDate;

	/**
	 * 酒店离店时间
	 */
	@ApiField("check_out_time")
	private String checkOutTime;

	/**
	 * 订单优惠金额（仅包含外券优惠金额，即仅包含商户优惠的金额，不包含支付宝优惠的金额（如支付宝红包等））
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 扩展信息。回流的key值请提前联系支付宝侧人员配置，否则回流的key值不会被消费。
	 */
	@ApiListField("ext_info")
	@ApiField("scenic_ext_info")
	private List<ScenicExtInfo> extInfo;

	/**
	 * 会员卡支付宝卡包模板id
	 */
	@ApiField("membership_card_template_id")
	private String membershipCardTemplateId;

	/**
	 * 会员卡等级枚举值
	 */
	@ApiField("membership_grade")
	private String membershipGrade;

	/**
	 * open_id是用户（UserId）在应用（AppId）下的唯一用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 支付宝订单id，订单同步。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 支付宝小程序订单详情页链接
	 */
	@ApiField("order_link")
	private String orderLink;

	/**
	 * 来源ISV
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 订单状态：
ORDER_SUCCESS--下单成功
TO_BE_PAID--待支付
PAID--已支付
TO_CHECK_IN--待入住
CHECKED_IN--已入住
CHECKED_OUT--已退房
FINISHED--订单完成
CANCELING--订单取消中
CANCELED--订单取消
CLOSED--订单关闭
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单更新时间
	 */
	@ApiField("order_update_time")
	private Date orderUpdateTime;

	/**
	 * 商户侧酒店id
	 */
	@ApiField("outer_hotel_id")
	private String outerHotelId;

	/**
	 * ISV订单id
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/**
	 * 收款账户pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 预约到店时间
	 */
	@ApiField("plan_check_in_date")
	private String planCheckInDate;

	/**
	 * 房型信息，最大长度限制为10，超出部分不会被消费；房型信息下的出行人信息最大长度限制为10，超出部分不会被消费。
	 */
	@ApiListField("rooms")
	@ApiField("room")
	private List<Room> rooms;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_id")
	private String tradeId;

	/**
	 * 下单用户id
	 */
	@ApiField("uid")
	private String uid;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public Passenger getBooker() {
		return this.booker;
	}
	public void setBooker(Passenger booker) {
		this.booker = booker;
	}

	public String getCancelRuleDescription() {
		return this.cancelRuleDescription;
	}
	public void setCancelRuleDescription(String cancelRuleDescription) {
		this.cancelRuleDescription = cancelRuleDescription;
	}

	public String getCancelRuleName() {
		return this.cancelRuleName;
	}
	public void setCancelRuleName(String cancelRuleName) {
		this.cancelRuleName = cancelRuleName;
	}

	public Date getCheckInDate() {
		return this.checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckInTime() {
		return this.checkInTime;
	}
	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public Date getCheckOutDate() {
		return this.checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getCheckOutTime() {
		return this.checkOutTime;
	}
	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public List<ScenicExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ScenicExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getMembershipCardTemplateId() {
		return this.membershipCardTemplateId;
	}
	public void setMembershipCardTemplateId(String membershipCardTemplateId) {
		this.membershipCardTemplateId = membershipCardTemplateId;
	}

	public String getMembershipGrade() {
		return this.membershipGrade;
	}
	public void setMembershipGrade(String membershipGrade) {
		this.membershipGrade = membershipGrade;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderLink() {
		return this.orderLink;
	}
	public void setOrderLink(String orderLink) {
		this.orderLink = orderLink;
	}

	public String getOrderSource() {
		return this.orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderUpdateTime() {
		return this.orderUpdateTime;
	}
	public void setOrderUpdateTime(Date orderUpdateTime) {
		this.orderUpdateTime = orderUpdateTime;
	}

	public String getOuterHotelId() {
		return this.outerHotelId;
	}
	public void setOuterHotelId(String outerHotelId) {
		this.outerHotelId = outerHotelId;
	}

	public String getOuterOrderId() {
		return this.outerOrderId;
	}
	public void setOuterOrderId(String outerOrderId) {
		this.outerOrderId = outerOrderId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPlanCheckInDate() {
		return this.planCheckInDate;
	}
	public void setPlanCheckInDate(String planCheckInDate) {
		this.planCheckInDate = planCheckInDate;
	}

	public List<Room> getRooms() {
		return this.rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
