package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数娱充值ISV订单回流模型
 *
 * @author auto create
 * @since 1.0, 2017-11-02 10:19:49
 */
public class EntertainmentOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 2867399813733481566L;

	/**
	 * 订单号,通过回调获得
如果订单状态为2  未支付  那就不存在alipay_trade_no 就不是必填
3和5 用户付款行为已经发生，那么 alipay_trade_no  就是必填
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 用户uid
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 订单完成时间(UNIX时间戳)
未支付自动关闭
	 */
	@ApiField("complete_time")
	private Long completeTime;

	/**
	 * 下单时间(UNIX时间戳)
	 */
	@ApiField("create_time")
	private Long createTime;

	/**
	 * 额外的参数信息,格式为json
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 与娱乐充值平台对接的商品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 与娱乐充值平台对接的商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 标识是哪个isv来源的订单
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * isv订单号(每个isv独立保证唯一,16位)
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 2-未支付自动关闭
3-退款
5-交易完成
	 */
	@ApiField("order_status")
	private Long orderStatus;

	/**
	 * 支付时间(UNIX时间戳)
	 */
	@ApiField("pay_time")
	private Long payTime;

	/**
	 * 与娱乐充值平台对接的产品编号
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 与娱乐充值平台对接的产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 用户购买数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 用户总支付金额
	 */
	@ApiField("total_payment")
	private String totalPayment;

	/**
	 * 每个商品单价
	 */
	@ApiField("unit_price")
	private String unitPrice;

	/**
	 * 用户充值账号
	 */
	@ApiField("user_account")
	private String userAccount;

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public Long getCompleteTime() {
		return this.completeTime;
	}
	public void setCompleteTime(Long completeTime) {
		this.completeTime = completeTime;
	}

	public Long getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Long payTime) {
		this.payTime = payTime;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getTotalPayment() {
		return this.totalPayment;
	}
	public void setTotalPayment(String totalPayment) {
		this.totalPayment = totalPayment;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUserAccount() {
		return this.userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

}
