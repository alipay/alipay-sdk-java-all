package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请子户交易明细回单
 *
 * @author auto create
 * @since 1.0, 2025-01-06 11:25:33
 */
public class AlipayEbppIndustrySalaryFundflowApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4492554168189534465L;

	/**
	 * 子户账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 结束时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 网商商户号
	 */
	@ApiField("merchant_id")
	private String merchantId;

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

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 回单类型
	 */
	@ApiField("type")
	private String type;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
