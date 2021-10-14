package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 到位服务订单信息
 *
 * @author auto create
 * @since 1.0, 2017-03-14 16:37:23
 */
public class ServiceOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 4639443652711844325L;

	/**
	 * 服务总金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商品服务所在类目的id
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 订单创建时间，格式为
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 订单修改时间，格式为
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 订单最后支付时间，格式：
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_payment")
	private String gmtPayment;

	/**
	 * 订单最后退款时间，格式：
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_refund")
	private String gmtRefund;

	/**
	 * 消费者标注订单备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 第三方服务id
	 */
	@ApiField("out_service_id")
	private String outServiceId;

	/**
	 * 商品的商家端端SKU ID
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 第三方服务者id列表，例子：
[“2323”,…]，如果没有服务者，则为[]
	 */
	@ApiListField("out_sp_id")
	@ApiField("string")
	private List<String> outSpId;

	/**
	 * 服务已付金额，单位为元
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 单价，单位为元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 份数
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 服务实际金额，单位为元
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 订单退款金额，单位为元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 到位的服务id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 服务订单号
	 */
	@ApiField("service_order_no")
	private String serviceOrderNo;

	/**
	 * 商品的内部SKU ID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 商品价格单位
	 */
	@ApiField("unit")
	private String unit;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getGmtPayment() {
		return this.gmtPayment;
	}
	public void setGmtPayment(String gmtPayment) {
		this.gmtPayment = gmtPayment;
	}

	public String getGmtRefund() {
		return this.gmtRefund;
	}
	public void setGmtRefund(String gmtRefund) {
		this.gmtRefund = gmtRefund;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutServiceId() {
		return this.outServiceId;
	}
	public void setOutServiceId(String outServiceId) {
		this.outServiceId = outServiceId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public List<String> getOutSpId() {
		return this.outSpId;
	}
	public void setOutSpId(List<String> outSpId) {
		this.outSpId = outSpId;
	}

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceOrderNo() {
		return this.serviceOrderNo;
	}
	public void setServiceOrderNo(String serviceOrderNo) {
		this.serviceOrderNo = serviceOrderNo;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
