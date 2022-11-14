package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证件宝审核结果
 *
 * @author auto create
 * @since 1.0, 2018-04-20 09:30:36
 */
public class CertAuditResult extends AlipayObject {

	private static final long serialVersionUID = 8872257626634685449L;

	/**
	 * 官方渠道信息比对结果返回码。
0：通过，
1：参数未输入，
2：参数不合法， 
3：查询不到信息， 
4：参数无法验证， 
5：参数不匹配，
6：服务异常
	 */
	@ApiField("authority_check_retcode")
	private String authorityCheckRetcode;

	/**
	 * 官方渠道信息比对结果返回信息
	 */
	@ApiField("authority_check_retmessage")
	private String authorityCheckRetmessage;

	/**
	 * 官方渠道信息比对结果，通过Y，不通过N，待定U
	 */
	@ApiField("authority_check_suggest")
	private String authorityCheckSuggest;

	/**
	 * 证件上人脸比对结果，通过Y，不通过N，待定U
	 */
	@ApiField("cert_face_suggest")
	private String certFaceSuggest;

	/**
	 * 合规结果，通过Y，不通过N，待定U
	 */
	@ApiField("compliance_suggest")
	private String complianceSuggest;

	/**
	 * ocr结果
	 */
	@ApiField("ocr")
	private CertFields ocr;

	/**
	 * ocr比对结果，通过Y，不通过N，待定U
	 */
	@ApiField("ocr_check_suggest")
	private String ocrCheckSuggest;

	public String getAuthorityCheckRetcode() {
		return this.authorityCheckRetcode;
	}
	public void setAuthorityCheckRetcode(String authorityCheckRetcode) {
		this.authorityCheckRetcode = authorityCheckRetcode;
	}

	public String getAuthorityCheckRetmessage() {
		return this.authorityCheckRetmessage;
	}
	public void setAuthorityCheckRetmessage(String authorityCheckRetmessage) {
		this.authorityCheckRetmessage = authorityCheckRetmessage;
	}

	public String getAuthorityCheckSuggest() {
		return this.authorityCheckSuggest;
	}
	public void setAuthorityCheckSuggest(String authorityCheckSuggest) {
		this.authorityCheckSuggest = authorityCheckSuggest;
	}

	public String getCertFaceSuggest() {
		return this.certFaceSuggest;
	}
	public void setCertFaceSuggest(String certFaceSuggest) {
		this.certFaceSuggest = certFaceSuggest;
	}

	public String getComplianceSuggest() {
		return this.complianceSuggest;
	}
	public void setComplianceSuggest(String complianceSuggest) {
		this.complianceSuggest = complianceSuggest;
	}

	public CertFields getOcr() {
		return this.ocr;
	}
	public void setOcr(CertFields ocr) {
		this.ocr = ocr;
	}

	public String getOcrCheckSuggest() {
		return this.ocrCheckSuggest;
	}
	public void setOcrCheckSuggest(String ocrCheckSuggest) {
		this.ocrCheckSuggest = ocrCheckSuggest;
	}

}
