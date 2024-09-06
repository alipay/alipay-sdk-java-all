package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家业务订单同步
 *
 * @author auto create
 * @since 1.0, 2024-05-29 15:31:21
 */
public class AlipayCloudFundBizOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7854321544811346385L;

	/**
	 * 订单金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 行业信息
	 */
	@ApiField("biz_industry")
	private String bizIndustry;

	/**
	 * 用户在平台的userID，若来源是支付宝，就填支付宝的uid，否则传对应平台的uid
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 用户在平台ID，若来源是支付宝，就填支付宝的openid，否则传对应平台的用户id
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 订单扩展信息包括收单方分账smid、收单人钱包id、收件人地址信息、发件人地址信息、物流信息等
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 商品明细列表，商品id：itemId、skuId、itemNum、amount、realAmount 等等
	 */
	@ApiListField("item_detail")
	@ApiField("string")
	private List<String> itemDetail;

	/**
	 * 履约状态：等待履约、履约中、履约完成
	 */
	@ApiField("logistic_status")
	private String logisticStatus;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_created_time")
	private Date orderCreatedTime;

	/**
	 * 订单号，当source=ALIPAY时，需传入支付宝订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单履约状态：已下单、履约中、履约完成、退货中、已退货
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 外部业务订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 在支付宝侧的支付单号
	 */
	@ApiField("pay_order_id")
	private String payOrderId;

	/**
	 * 支付状态：等待支付、支付中、支付完成、支付失败
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 实付金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 收单方支付宝uid，用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 当账号类型为open_id时必选，传入支付宝的openId
	 */
	@ApiField("seller_open_id")
	private String sellerOpenId;

	/**
	 * 订单服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 订单来源平台
	 */
	@ApiField("source")
	private String source;

	/**
	 * 本次订单的内容标题
	 */
	@ApiField("subject")
	private String subject;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizIndustry() {
		return this.bizIndustry;
	}
	public void setBizIndustry(String bizIndustry) {
		this.bizIndustry = bizIndustry;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getExtParams() {
		return this.extParams;
	}
	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

	public List<String> getItemDetail() {
		return this.itemDetail;
	}
	public void setItemDetail(List<String> itemDetail) {
		this.itemDetail = itemDetail;
	}

	public String getLogisticStatus() {
		return this.logisticStatus;
	}
	public void setLogisticStatus(String logisticStatus) {
		this.logisticStatus = logisticStatus;
	}

	public Date getOrderCreatedTime() {
		return this.orderCreatedTime;
	}
	public void setOrderCreatedTime(Date orderCreatedTime) {
		this.orderCreatedTime = orderCreatedTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayOrderId() {
		return this.payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerOpenId() {
		return this.sellerOpenId;
	}
	public void setSellerOpenId(String sellerOpenId) {
		this.sellerOpenId = sellerOpenId;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
