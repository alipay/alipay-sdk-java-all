package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客商主数据新增接口
 *
 * @author auto create
 * @since 1.0, 2024-08-15 10:29:42
 */
public class AlipayBossFncGfmdmMerchantCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2274479389799158181L;

	/**
	 * B类客商填写统一信用编码，C类客商填写个人身份证
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 2位代码，请联系主数据onwer咨询。超过200多个枚举值，没法提前录入
	 */
	@ApiField("country")
	private String country;

	/**
	 * 客商主数据商户唯一ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户状态信息，Y->有效；N->无效
	 */
	@ApiField("merchant_status")
	private String merchantStatus;

	/**
	 * 标识商户类型，B->企业类客商；C->个人类客商
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 省份区域信息
	 */
	@ApiField("province")
	private String province;

	/**
	 * 来源系统的APP code，每个系统由自己特有的code，没法预先设置枚举值，请接入时跟主数据owner沟通
	 */
	@ApiField("source")
	private String source;

	/**
	 * 来源系统ID，即上游客商库自定义的唯一主键信息
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 当前客商在来源系统中的状态
	 */
	@ApiField("source_status")
	private String sourceStatus;

	/**
	 * 国外商户税号，一般情况下不填写，直接填写在cert_no证件号即可
	 */
	@ApiField("tax_id")
	private String taxId;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantStatus() {
		return this.merchantStatus;
	}
	public void setMerchantStatus(String merchantStatus) {
		this.merchantStatus = merchantStatus;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceStatus() {
		return this.sourceStatus;
	}
	public void setSourceStatus(String sourceStatus) {
		this.sourceStatus = sourceStatus;
	}

	public String getTaxId() {
		return this.taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

}
