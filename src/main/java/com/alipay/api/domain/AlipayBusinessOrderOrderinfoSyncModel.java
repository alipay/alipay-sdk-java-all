package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 景区订单同步
 *
 * @author auto create
 * @since 1.0, 2022-10-26 16:04:49
 */
public class AlipayBusinessOrderOrderinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5722711618858588366L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 下单用户
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 联系人信息，限制最大长度为20
	 */
	@ApiListField("contact")
	@ApiField("contact")
	private List<Contact> contact;

	/**
	 * 打折金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 扩展字段
	 */
	@ApiListField("ext_info")
	@ApiField("scenic_ext_info")
	private List<ScenicExtInfo> extInfo;

	/**
	 * open_id是用户（UserId）在应用（AppId）下的唯一用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单属性
FORWARD("FORWARD", "提前购"),
DAY("DAY","当日购")
	 */
	@ApiField("order_character")
	private String orderCharacter;

	/**
	 * 下单时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 支付宝行业订单id  新建时为null， 更新时必传，和出参中object_id一致
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单详情页链接，必须是alipay://开头的小程序scheme链接，如何拼接小程序页面链接参考https://opensupport.alipay.com/support/helpcenter/142/201602496413。

注意：scheme链接中的page参数值必须做URL ENCODE，否则接口会报错！
	 */
	@ApiField("order_link")
	private String orderLink;

	/**
	 * 更新时间
	 */
	@ApiField("order_modified_time")
	private Date orderModifiedTime;

	/**
	 * 付款时间
	 */
	@ApiField("order_pay_time")
	private Date orderPayTime;

	/**
	 * 订单状态
CHECK_WAITING("CHECK_WAITING",待检票)，
CHECKED("CHECKED",已检票)，
FINISHED("FINISHED",已完结)，
TICKET_RUNNING("TICKET_RUNNING",出票中)，
PAY_WAITING("PAY_WAITING",待付款)，
REFUND_AUDITING("REFUND_AUDITING",退单审核中)，
REFUND_SUCCESS("REFUND_SUCCESS",已退单)，
CLOSED("CLOSED",已关闭),
REFUND_RUNNING("REFUND_RUNNING","退单中")
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单类型
TICKET("TICKET","门票订单")
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 订单外部id
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/**
	 * app下标识一个景区的景区id
	 */
	@ApiField("outer_scenic_id")
	private String outerScenicId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * Passengers， 限制最大长度为20
	 */
	@ApiListField("passengers")
	@ApiField("passengers")
	private List<Passengers> passengers;

	/**
	 * 付款金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 具体付款方式
ALIPAY("ALIPAY","支付宝"),
MEMBERSHIP_CARD("MEMBERSHIP_CARD","会员卡支付"),
BALANCE("BALANCE","余额"),
WECHAT("WECHAT","微信")
	 */
	@ApiField("payment_method")
	private String paymentMethod;

	/**
	 * 支付状态
WAITING("WAITING",待支付)，
SUCCESS("SUCCESS",支付成功)，
FAILURE("FAILURE",支付失败)，
REFUND_WAITING("REFUND_WAITING",待退款)，
REFUND_SUCCESS("REFUND_SUCCESS",已退款)，
REFUND_FAILURE("REFUND_FAILURE",退款失败)
	 */
	@ApiField("payment_status")
	private String paymentStatus;

	/**
	 * 退票金额
	 */
	@ApiField("refund_amout")
	private String refundAmout;

	/**
	 * 退票数量
	 */
	@ApiField("refund_count")
	private String refundCount;

	/**
	 * 退票手续费
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退票手续费类型
PERCENT("PERCENT","百分比"),
FIXED("FIXED","固定值")
	 */
	@ApiField("refund_fee_type")
	private String refundFeeType;

	/**
	 * 退票状态
REFUND_AUDITING("REFUND_AUDITING",退票审核中),
REFUND_SUCCESS("REFUND_SUCCESS",已退票),
REFUND_FAILURE("REFUND_FAILURE",退票失败)
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 退票时间
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * 景区小程序id
	 */
	@ApiField("scenic_app_id")
	private String scenicAppId;

	/**
	 * 购票来源
ALIPAY_MINI_APP("ALIPAY_MINI_APP", "支付宝小程序"),
H5("H5", "H5")
	 */
	@ApiField("source")
	private String source;

	/**
	 * 服务商的标识，需要ISV提前联系支付宝技术分配该值。配置时间较长，请提前联系
	 */
	@ApiField("source_system")
	private String sourceSystem;

	/**
	 * 门票
	 */
	@ApiListField("ticket_info")
	@ApiField("scenic_ticket_info")
	private List<ScenicTicketInfo> ticketInfo;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 更新信息
	 */
	@ApiField("update_msg")
	private String updateMsg;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public List<Contact> getContact() {
		return this.contact;
	}
	public void setContact(List<Contact> contact) {
		this.contact = contact;
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderCharacter() {
		return this.orderCharacter;
	}
	public void setOrderCharacter(String orderCharacter) {
		this.orderCharacter = orderCharacter;
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

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOuterOrderId() {
		return this.outerOrderId;
	}
	public void setOuterOrderId(String outerOrderId) {
		this.outerOrderId = outerOrderId;
	}

	public String getOuterScenicId() {
		return this.outerScenicId;
	}
	public void setOuterScenicId(String outerScenicId) {
		this.outerScenicId = outerScenicId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public List<Passengers> getPassengers() {
		return this.passengers;
	}
	public void setPassengers(List<Passengers> passengers) {
		this.passengers = passengers;
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

	public String getPaymentStatus() {
		return this.paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getRefundAmout() {
		return this.refundAmout;
	}
	public void setRefundAmout(String refundAmout) {
		this.refundAmout = refundAmout;
	}

	public String getRefundCount() {
		return this.refundCount;
	}
	public void setRefundCount(String refundCount) {
		this.refundCount = refundCount;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getRefundFeeType() {
		return this.refundFeeType;
	}
	public void setRefundFeeType(String refundFeeType) {
		this.refundFeeType = refundFeeType;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public String getScenicAppId() {
		return this.scenicAppId;
	}
	public void setScenicAppId(String scenicAppId) {
		this.scenicAppId = scenicAppId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public List<ScenicTicketInfo> getTicketInfo() {
		return this.ticketInfo;
	}
	public void setTicketInfo(List<ScenicTicketInfo> ticketInfo) {
		this.ticketInfo = ticketInfo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUpdateMsg() {
		return this.updateMsg;
	}
	public void setUpdateMsg(String updateMsg) {
		this.updateMsg = updateMsg;
	}

}
