package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.order.enterprise.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-26 19:55:00
 */
public class KoubeiTradeOrderEnterpriseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8323876794842233537L;

	/** 
	 * 订单下单主体id，一般是支付宝账号，也可能是虚拟账号
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * json格式的字符串，订单的扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 订单对应的商家补贴的金额
	 */
	@ApiField("merchant_subsidy_amount")
	private String merchantSubsidyAmount;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单产品码
	 */
	@ApiField("order_product")
	private String orderProduct;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户签约支付宝账号
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 订单支付的实际资金
	 */
	@ApiField("real_amount")
	private String realAmount;

	/** 
	 * 订单打款对应的商家收款账户
	 */
	@ApiField("seller_id")
	private String sellerId;

	/** 
	 * 口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 订单状态:INITIAL（订单初始化）、WAIT_PAY（订单已创建待支付）、ERROR（订单异常）、PAID（已支付）、SUCCESS（订单成功）、WAIT_PAY_CLOSE（订单未支付后自动关闭或者未支付用户主动关闭）、CLOSED（订单支付成功后，全部退款）、FINISH（订完完结）
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/** 
	 * 订单对应的平台补贴的金额
	 */
	@ApiField("subsidy_amount")
	private String subsidyAmount;

	/** 
	 * 订单总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setMerchantSubsidyAmount(String merchantSubsidyAmount) {
		this.merchantSubsidyAmount = merchantSubsidyAmount;
	}
	public String getMerchantSubsidyAmount( ) {
		return this.merchantSubsidyAmount;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderProduct(String orderProduct) {
		this.orderProduct = orderProduct;
	}
	public String getOrderProduct( ) {
		return this.orderProduct;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}
	public String getRealAmount( ) {
		return this.realAmount;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerId( ) {
		return this.sellerId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject( ) {
		return this.subject;
	}

	public void setSubsidyAmount(String subsidyAmount) {
		this.subsidyAmount = subsidyAmount;
	}
	public String getSubsidyAmount( ) {
		return this.subsidyAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
