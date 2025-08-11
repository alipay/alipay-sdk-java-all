package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户查询接口
 *
 * @author auto create
 * @since 1.0, 2025-01-06 11:26:01
 */
public class AlipayEbppIndustrySalaryPayrollaccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8725666477419311663L;

	/**
	 * 开户场景
	 */
	@ApiField("acct_type")
	private String acctType;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * Map<String,String>格式
JSON BASE64Encode.
key/value说明
key=PARENT_TYPE，value为开户时的母户类型
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 代发商户的商户号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 对接收付通加签的xml，通过base64Encode编码
	 */
	@ApiField("sign_xml")
	private String signXml;

	public String getAcctType() {
		return this.acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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
