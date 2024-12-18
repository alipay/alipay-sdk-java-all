package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款条件基础信息DTO
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:29:57
 */
public class PayContractBaseDTO extends AlipayObject {

	private static final long serialVersionUID = 6712225881783333113L;

	/**
	 * 合约号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 合约来源,集采平台：acep
	 */
	@ApiField("agreement_source")
	private String agreementSource;

	/**
	 * 业务产品码
	 */
	@ApiField("biz_pd_code")
	private String bizPdCode;

	/**
	 * 幂等号
	 */
	@ApiField("idempotent_no")
	private String idempotentNo;

	/**
	 * 供应商蚂蚁2088账号
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 供应商来源
	 */
	@ApiField("ip_role_source")
	private String ipRoleSource;

	/**
	 * 端产品码
	 */
	@ApiField("pd_code")
	private String pdCode;

	/**
	 * 签约产品码
	 */
	@ApiField("sales_product_code")
	private String salesProductCode;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAgreementSource() {
		return this.agreementSource;
	}
	public void setAgreementSource(String agreementSource) {
		this.agreementSource = agreementSource;
	}

	public String getBizPdCode() {
		return this.bizPdCode;
	}
	public void setBizPdCode(String bizPdCode) {
		this.bizPdCode = bizPdCode;
	}

	public String getIdempotentNo() {
		return this.idempotentNo;
	}
	public void setIdempotentNo(String idempotentNo) {
		this.idempotentNo = idempotentNo;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getIpRoleSource() {
		return this.ipRoleSource;
	}
	public void setIpRoleSource(String ipRoleSource) {
		this.ipRoleSource = ipRoleSource;
	}

	public String getPdCode() {
		return this.pdCode;
	}
	public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}

	public String getSalesProductCode() {
		return this.salesProductCode;
	}
	public void setSalesProductCode(String salesProductCode) {
		this.salesProductCode = salesProductCode;
	}

}
