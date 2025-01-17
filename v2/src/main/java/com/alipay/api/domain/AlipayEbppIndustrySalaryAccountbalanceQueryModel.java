package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户余额查询
 *
 * @author auto create
 * @since 1.0, 2025-01-06 13:50:47
 */
public class AlipayEbppIndustrySalaryAccountbalanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2261769792499283481L;

	/**
	 * 卡号类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 子户卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 对接收付通加签的xml, base64编码
	 */
	@ApiField("sign_xml")
	private String signXml;

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
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
