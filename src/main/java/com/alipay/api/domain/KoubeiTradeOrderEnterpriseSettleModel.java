package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑对接外部订单结算接口
 *
 * @author auto create
 * @since 1.0, 2020-06-03 19:56:26
 */
public class KoubeiTradeOrderEnterpriseSettleModel extends AlipayObject {

	private static final long serialVersionUID = 6423983673658812539L;

	/**
	 * 业务产品
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 买家支付金额，单位为元，精确到小数点后两位
	 */
	@ApiField("buyer_amount")
	private String buyerAmount;

	/**
	 * 买家个人账户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家个人账户类型，buyer_type=alipay时，buyer_id代表买家的支付宝uid，会对buyer_id做合法性校验

alipay  支付宝账号
mobile   手机号
outUser  外部用户账号
	 */
	@ApiField("buyer_type")
	private String buyerType;

	/**
	 * 第三方企业支付的金额，单位为元，精确到小数点后两位
	 */
	@ApiField("enterprise_amount")
	private String enterpriseAmount;

	/**
	 * 额外的业务信息，以json串的格式传入，传入企业信息(enterpriseInfo)，是否支持开票(supportInvoice)，可开票金额(invoiceAmount)等信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商家补贴金额，单位为元，精确到小数点后两位
	 */
	@ApiField("mdiscount_amount")
	private String mdiscountAmount;

	/**
	 * 商户订单号,64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 商户和支付宝交互时，用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 外部平台补贴的金额，单位为元，精确到小数点后两位
	 */
	@ApiField("platform_discount_amount")
	private String platformDiscountAmount;

	/**
	 * 商家实收金额，单位为元，精确到小数点后两位
商家实收金额 = 平台优惠金额+企业支付金额+买家支付金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位。
订单总金额=商家实收金额+商家优惠金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 该笔订单交易关闭超时时间，逾期将关闭交易，取值范围:3m～60m(单位:分钟) 不传默认3m。
	 */
	@ApiField("trade_close_timeout")
	private String tradeCloseTimeout;

	/**
	 * 该笔订单的交易完结超时时间，从结算成功开始计算，逾期将把交易状态推进到完结，完结后不允许退款，取值范围:1m～3000m(单位:分钟) 不传默认2880m(48小时)。
	 */
	@ApiField("trade_finish_timeout")
	private String tradeFinishTimeout;

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBuyerAmount() {
		return this.buyerAmount;
	}
	public void setBuyerAmount(String buyerAmount) {
		this.buyerAmount = buyerAmount;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerType() {
		return this.buyerType;
	}
	public void setBuyerType(String buyerType) {
		this.buyerType = buyerType;
	}

	public String getEnterpriseAmount() {
		return this.enterpriseAmount;
	}
	public void setEnterpriseAmount(String enterpriseAmount) {
		this.enterpriseAmount = enterpriseAmount;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMdiscountAmount() {
		return this.mdiscountAmount;
	}
	public void setMdiscountAmount(String mdiscountAmount) {
		this.mdiscountAmount = mdiscountAmount;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPlatformDiscountAmount() {
		return this.platformDiscountAmount;
	}
	public void setPlatformDiscountAmount(String platformDiscountAmount) {
		this.platformDiscountAmount = platformDiscountAmount;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeCloseTimeout() {
		return this.tradeCloseTimeout;
	}
	public void setTradeCloseTimeout(String tradeCloseTimeout) {
		this.tradeCloseTimeout = tradeCloseTimeout;
	}

	public String getTradeFinishTimeout() {
		return this.tradeFinishTimeout;
	}
	public void setTradeFinishTimeout(String tradeFinishTimeout) {
		this.tradeFinishTimeout = tradeFinishTimeout;
	}

}
