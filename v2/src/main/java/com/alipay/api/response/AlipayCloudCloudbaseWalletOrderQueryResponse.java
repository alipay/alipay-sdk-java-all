package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.wallet.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-27 15:57:47
 */
public class AlipayCloudCloudbaseWalletOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5451173423423476153L;

	/** 
	 * 优惠前金额(分)
	 */
	@ApiField("before_discount_money")
	private String beforeDiscountMoney;

	/** 
	 * 环境ID
	 */
	@ApiField("env_id")
	private String envId;

	/** 
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 支付金额(分)
	 */
	@ApiField("money")
	private String money;

	/** 
	 * 购买数量
	 */
	@ApiField("num")
	private String num;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单状态/支付状态
 - INIT(待支付)
 - PAY_SUCCESS(支付成功)
 - WAIT_REFUND(待退款)
 - REFUND_SUCCESS(退款成功)
 - CLOSED(已关闭)
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 订单类型（新购、续费、变配等）
 - NEW(新签)
 - RENEW(续费)
 - MODIFY(变配)
 - REFUND(退款)
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 产品code
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 产品名
	 */
	@ApiField("product_name")
	private String productName;

	public void setBeforeDiscountMoney(String beforeDiscountMoney) {
		this.beforeDiscountMoney = beforeDiscountMoney;
	}
	public String getBeforeDiscountMoney( ) {
		return this.beforeDiscountMoney;
	}

	public void setEnvId(String envId) {
		this.envId = envId;
	}
	public String getEnvId( ) {
		return this.envId;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setMoney(String money) {
		this.money = money;
	}
	public String getMoney( ) {
		return this.money;
	}

	public void setNum(String num) {
		this.num = num;
	}
	public String getNum( ) {
		return this.num;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType( ) {
		return this.orderType;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName( ) {
		return this.productName;
	}

}
