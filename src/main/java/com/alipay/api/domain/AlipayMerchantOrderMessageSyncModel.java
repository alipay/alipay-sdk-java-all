package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单信息同步
 *
 * @author auto create
 * @since 1.0, 2020-05-08 15:19:50
 */
public class AlipayMerchantOrderMessageSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2443142933737617239L;

	/**
	 * 提交到支付的金额，可描述积分价钱类型，如订单金额，可描述积分价钱类型，如[{type: MONEY, amount: 31.08},{type: ALIPAY_POINT, amount: 88}]
	 */
	@ApiListField("actual_amount")
	@ApiField("price_information")
	private List<PriceInformation> actualAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 平台订单号，如tp平台订单号
	 */
	@ApiField("biz_order_no")
	private String bizOrderNo;

	/**
	 * 一级业务身份/行业，如在飞猪有机票、酒店、门票等细分的行业
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 经营单元信息，如门店信息，identity: 6792889042, type: UNIFY_STORE_ID, name: 深夜食堂
	 */
	@ApiField("biz_unit_info")
	private BizUnitInfo bizUnitInfo;

	/**
	 * 一般用作支付宝买家，type: USER_ID, issuer: ALIPAY, identity: 2088102556225661
	 */
	@ApiField("buyer")
	private UserIdentity buyer;

	/**
	 * 回查商户数据的链接
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 履约状态枚举，如DELIVERIND/DELIVERED
	 */
	@ApiField("deliver_status")
	private String deliverStatus;

	/**
	 * 履约状态文案
	 */
	@ApiField("deliver_status_desc")
	private String deliverStatusDesc;

	/**
	 * 扩展信息，如ORDER_FROM/ORDER_CHANNEL/EXTERNAL_PID
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 外部买家，type: USER_ID, issuer: TAOBAO, identity: 75438909432
	 */
	@ApiField("external_buyer")
	private UserIdentity externalBuyer;

	/**
	 * 关联的外部订单号，如tp平台关联的飞猪交易号
	 */
	@ApiField("external_order_no")
	private String externalOrderNo;

	/**
	 * 外部卖家，如type: USER_ID, issuer: TAOBAO, identity: 746239043226
	 */
	@ApiField("external_seller")
	private UserIdentity externalSeller;

	/**
	 * 主商品名称/商品集合名称
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * 订单修改时间，用于控制乱序。如果主订单时间没修改但是履约单时间修改了，需要传履约单最新的修改时间过来，否则会被判断为已经处理过
	 */
	@ApiField("modify_time")
	private Date modifyTime;

	/**
	 * 订单金额，可描述积分价钱类型，如[{type: MONEY, amount: 32.58},{type: ALIPAY_POINT, amount: 88}]
	 */
	@ApiListField("order_amount")
	@ApiField("price_information")
	private List<PriceInformation> orderAmount;

	/**
	 * 状态枚举，如PAID/DELIVERED
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 状态文案，一般必选，如有特殊接入场景无法传入需单独沟通
	 */
	@ApiField("order_status_desc")
	private String orderStatusDesc;

	/**
	 * 平台商的支付宝ID，如tp在支付宝的pid
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付状态枚举，如WAIT_PAY/PAID/CLOSED
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 支付状态文案
	 */
	@ApiField("pay_status_desc")
	private String payStatusDesc;

	/**
	 * 订单支付成功时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 退款状态枚举，如PROCESSING/REFUNDED
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 退款状态文案
	 */
	@ApiField("refund_status_desc")
	private String refundStatusDesc;

	/**
	 * 一般用作支付宝卖家，type: USER_ID, issuer: ALIPAY, identity: 2088102146225135
	 */
	@ApiField("seller")
	private UserIdentity seller;

	/**
	 * 业务来源/经济体，如trip、eleme、koubei、hema、film、damai等
	 */
	@ApiField("source")
	private String source;

	/**
	 * 二级业务身份，类似于类目层级中的业务类目，如飞猪机票国内ali.china.trip.airticket.inland，飞猪机票国外ali.china.trip.airticket.abroad.hl
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 调用方系统名称
	 */
	@ApiField("system_name")
	private String systemName;

	public List<PriceInformation> getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(List<PriceInformation> actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getBizOrderNo() {
		return this.bizOrderNo;
	}
	public void setBizOrderNo(String bizOrderNo) {
		this.bizOrderNo = bizOrderNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public BizUnitInfo getBizUnitInfo() {
		return this.bizUnitInfo;
	}
	public void setBizUnitInfo(BizUnitInfo bizUnitInfo) {
		this.bizUnitInfo = bizUnitInfo;
	}

	public UserIdentity getBuyer() {
		return this.buyer;
	}
	public void setBuyer(UserIdentity buyer) {
		this.buyer = buyer;
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDeliverStatus() {
		return this.deliverStatus;
	}
	public void setDeliverStatus(String deliverStatus) {
		this.deliverStatus = deliverStatus;
	}

	public String getDeliverStatusDesc() {
		return this.deliverStatusDesc;
	}
	public void setDeliverStatusDesc(String deliverStatusDesc) {
		this.deliverStatusDesc = deliverStatusDesc;
	}

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public UserIdentity getExternalBuyer() {
		return this.externalBuyer;
	}
	public void setExternalBuyer(UserIdentity externalBuyer) {
		this.externalBuyer = externalBuyer;
	}

	public String getExternalOrderNo() {
		return this.externalOrderNo;
	}
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}

	public UserIdentity getExternalSeller() {
		return this.externalSeller;
	}
	public void setExternalSeller(UserIdentity externalSeller) {
		this.externalSeller = externalSeller;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public Date getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public List<PriceInformation> getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(List<PriceInformation> orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatusDesc() {
		return this.orderStatusDesc;
	}
	public void setOrderStatusDesc(String orderStatusDesc) {
		this.orderStatusDesc = orderStatusDesc;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPayStatusDesc() {
		return this.payStatusDesc;
	}
	public void setPayStatusDesc(String payStatusDesc) {
		this.payStatusDesc = payStatusDesc;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getRefundStatusDesc() {
		return this.refundStatusDesc;
	}
	public void setRefundStatusDesc(String refundStatusDesc) {
		this.refundStatusDesc = refundStatusDesc;
	}

	public UserIdentity getSeller() {
		return this.seller;
	}
	public void setSeller(UserIdentity seller) {
		this.seller = seller;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getSystemName() {
		return this.systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

}
