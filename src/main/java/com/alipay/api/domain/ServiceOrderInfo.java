package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 到位服务订单信息
 *
 * @author auto create
 * @since 1.0, 2017-03-14 16:38:23
 */
public class ServiceOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 4188828932257494813L;

	/**
	 * 服务总金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商品服务所在类目的id，全局唯一，订单商品所属的到位系统固定类目信息
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
	 * 备注信息，消费者下单时填写的备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部服务ID，保证商家内部唯一，用于查询商家服务信息，商家同步服务到到位系统时填写
	 */
	@ApiField("out_service_id")
	private String outServiceId;

	/**
	 * 外部SKU ID，商家内部保证唯一，用于到位系统查询商品商家端价格信息，商家系统生成
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 第三方服务者id列表，保证商家内部唯一，商家同步服务者信息给到位时填写，例子：[“2323”,…]，如果没有服务者，则为[]，
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
	 * 商品单价，单位为元
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
	 * 到位的服务id, 全局唯一，用于查询或者修改到位到服务信息，到位系统在商家同步服务时生成
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 服务订单号，全局唯一，用户下单时到位系统生成
	 */
	@ApiField("service_order_no")
	private String serviceOrderNo;

	/**
	 * 商品的内部SKU ID，全局唯一，商家同步sku信息时到位系统产生
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 支付宝交易号，全局唯一，商家可用于对账，用户下单时由到位系统生成
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 商品价格单位，枚举值，PER_TIME：每次；PER_HOUR：每小时；PER_MINUTE：每分钟；PER_DAY：每天；PER_WEEK：每周；PER_MONTH：每月；PER_PIECE：每份；PER_GE：每个；PER_SHAN：每扇；PER_KESHI：每课时；NEGOTIABLE：面议；PER_QITA：其他；UNDEFINE：未定义；
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
