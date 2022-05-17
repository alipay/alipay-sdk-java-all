package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 景区小交通订单回流接口
 *
 * @author auto create
 * @since 1.0, 2021-10-21 10:39:56
 */
public class AlipayBusinessOrderScenicTrafficSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6843715167789269385L;

	/**
	 * 订单金额
举例：
如果门票100，商户自己学生票打8折，那就收80，支付宝交易里的金额是80。 然后支付宝正好有活动，立减5块钱，最后用户付了75。针对这个场景：
amount：100.00；
discount_amount：20.00
pay_amount：80.00
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 下单小程序名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 景区交通小程序id
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 联系人信息
	 */
	@ApiField("contact")
	private ScenicTrafficUserInfo contact;

	/**
	 * 优惠金额，仅包含商户优惠的金额。
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private ScenicExtInfo extInfo;

	/**
	 * 订单创建时间，该值不可变。
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 行业侧的订单id，该字段可选，具体描述分如下场景： 1.若订单是第一次同步，即新增场景，此时无需传该字段。订单同步成功后，在返回值中会将该字段给到isv。 2.若订单不是第一次同步，即更新场景，此时一定要传该字段。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单链接。注意需对page=后面的内容encode
	 */
	@ApiField("order_link")
	private String orderLink;

	/**
	 * 订单更新时间。
	 */
	@ApiField("order_modified_time")
	private Date orderModifiedTime;

	/**
	 * 订单付款时间
	 */
	@ApiField("order_pay_time")
	private Date orderPayTime;

	/**
	 * 订单来源isv
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * WAIT_PAY  待支付，
PAID 支付成功，
IN_THE_TICKET 出票中，
TICKETED 出票成功，
UN_TICKET 出票失败，
WAITING_CHECK 待检票，
CHECK_IN 已检票，
REFUNDING 申请退票中，
REFUNDED 已退票。
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * isv侧订单id
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/**
	 * 支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * ALIPAY("ALIPAY","支付宝")
	 */
	@ApiField("payment_method")
	private String paymentMethod;

	/**
	 * 退票金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * REFUND_AUDITING 退票审核中, 
REFUND_SUCCESS 已退票, 
REFUND_FAILURE 退票失败。
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 退票数量
	 */
	@ApiField("refund_ticket_num")
	private String refundTicketNum;

	/**
	 * 退票时间
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * 票务信息
	 */
	@ApiListField("ticket_info")
	@ApiField("scenic_traffic_ticket_info")
	private List<ScenicTrafficTicketInfo> ticketInfo;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 订单下单用户支付宝uid
	 */
	@ApiField("uid")
	private String uid;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public ScenicTrafficUserInfo getContact() {
		return this.contact;
	}
	public void setContact(ScenicTrafficUserInfo contact) {
		this.contact = contact;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public ScenicExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(ScenicExtInfo extInfo) {
		this.extInfo = extInfo;
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

	public Date getOrderModifiedTime() {
		return this.orderModifiedTime;
	}
	public void setOrderModifiedTime(Date orderModifiedTime) {
		this.orderModifiedTime = orderModifiedTime;
	}

	public Date getOrderPayTime() {
		return this.orderPayTime;
	}
	public void setOrderPayTime(Date orderPayTime) {
		this.orderPayTime = orderPayTime;
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

	public String getOuterOrderId() {
		return this.outerOrderId;
	}
	public void setOuterOrderId(String outerOrderId) {
		this.outerOrderId = outerOrderId;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPaymentMethod() {
		return this.paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getRefundTicketNum() {
		return this.refundTicketNum;
	}
	public void setRefundTicketNum(String refundTicketNum) {
		this.refundTicketNum = refundTicketNum;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public List<ScenicTrafficTicketInfo> getTicketInfo() {
		return this.ticketInfo;
	}
	public void setTicketInfo(List<ScenicTrafficTicketInfo> ticketInfo) {
		this.ticketInfo = ticketInfo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
