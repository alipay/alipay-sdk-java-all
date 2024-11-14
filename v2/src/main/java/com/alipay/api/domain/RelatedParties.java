package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 相关方列表
 *
 * @author auto create
 * @since 1.0, 2023-06-28 19:29:03
 */
public class RelatedParties extends AlipayObject {

	private static final long serialVersionUID = 6268512822189251288L;

	/**
	 * 相关方证件号码，请按实际证件号码填写
	 */
	@ApiField("related_party_cert_no")
	private String relatedPartyCertNo;

	/**
	 * 相关方证件类型，请结合实际按枚举值填写
	 */
	@ApiField("related_party_cert_type")
	private String relatedPartyCertType;

	/**
	 * 相关方名称，请按实际资产相关方名称填写
	 */
	@ApiField("related_party_name")
	private String relatedPartyName;

	/**
	 * 相关方类型，请结合资产相关方实际，按照枚举值提供
	 */
	@ApiField("related_party_type")
	private String relatedPartyType;

	public String getRelatedPartyCertNo() {
		return this.relatedPartyCertNo;
	}
	public void setRelatedPartyCertNo(String relatedPartyCertNo) {
		this.relatedPartyCertNo = relatedPartyCertNo;
	}

	public String getRelatedPartyCertType() {
		return this.relatedPartyCertType;
	}
	public void setRelatedPartyCertType(String relatedPartyCertType) {
		this.relatedPartyCertType = relatedPartyCertType;
	}

	public String getRelatedPartyName() {
		return this.relatedPartyName;
	}
	public void setRelatedPartyName(String relatedPartyName) {
		this.relatedPartyName = relatedPartyName;
	}

	public String getRelatedPartyType() {
		return this.relatedPartyType;
	}
	public void setRelatedPartyType(String relatedPartyType) {
		this.relatedPartyType = relatedPartyType;
	}

}
