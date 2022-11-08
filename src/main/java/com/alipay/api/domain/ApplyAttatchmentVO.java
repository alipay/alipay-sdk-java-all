package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请附件
 *
 * @author auto create
 * @since 1.0, 2022-09-08 11:48:50
 */
public class ApplyAttatchmentVO extends AlipayObject {

	private static final long serialVersionUID = 8784792953118357418L;

	/**
	 * 保函开立申请书
	 */
	@ApiField("apply_doc")
	private String applyDoc;

	/**
	 * 征信授权
	 */
	@ApiField("auth_docs")
	private String authDocs;

	/**
	 * 投标书
	 */
	@ApiField("bid_doc")
	private String bidDoc;

	/**
	 * 企业营业执照
	 */
	@ApiField("business_licenses")
	private String businessLicenses;

	/**
	 * 企业证件信息
	 */
	@ApiField("corporation_cert")
	private String corporationCert;

	/**
	 * 开立保函担保公司委托合同
	 */
	@ApiField("entrust_doc")
	private String entrustDoc;

	/**
	 * 法人证件信息
	 */
	@ApiField("legal_person_cert")
	private String legalPersonCert;

	/**
	 * 合并文档
	 */
	@ApiField("merge_doc")
	private String mergeDoc;

	public String getApplyDoc() {
		return this.applyDoc;
	}
	public void setApplyDoc(String applyDoc) {
		this.applyDoc = applyDoc;
	}

	public String getAuthDocs() {
		return this.authDocs;
	}
	public void setAuthDocs(String authDocs) {
		this.authDocs = authDocs;
	}

	public String getBidDoc() {
		return this.bidDoc;
	}
	public void setBidDoc(String bidDoc) {
		this.bidDoc = bidDoc;
	}

	public String getBusinessLicenses() {
		return this.businessLicenses;
	}
	public void setBusinessLicenses(String businessLicenses) {
		this.businessLicenses = businessLicenses;
	}

	public String getCorporationCert() {
		return this.corporationCert;
	}
	public void setCorporationCert(String corporationCert) {
		this.corporationCert = corporationCert;
	}

	public String getEntrustDoc() {
		return this.entrustDoc;
	}
	public void setEntrustDoc(String entrustDoc) {
		this.entrustDoc = entrustDoc;
	}

	public String getLegalPersonCert() {
		return this.legalPersonCert;
	}
	public void setLegalPersonCert(String legalPersonCert) {
		this.legalPersonCert = legalPersonCert;
	}

	public String getMergeDoc() {
		return this.mergeDoc;
	}
	public void setMergeDoc(String mergeDoc) {
		this.mergeDoc = mergeDoc;
	}

}
