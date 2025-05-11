package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询薪资发放申请结果
 *
 * @author auto create
 * @since 1.0, 2025-01-06 11:25:17
 */
public class AlipayEbppIndustrySalaryPaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8339275666589798176L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 代发商户的商户号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 原网商支付订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 对接收付通加签的xml，通过base64编码
	 */
	@ApiField("sign_xml")
	private String signXml;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSignXml() {
		return this.signXml;
	}
	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}

}
