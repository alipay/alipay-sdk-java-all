package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业级商户法人信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class LegalRepresentativeInfo extends AlipayObject {

	private static final long serialVersionUID = 5694928978164772398L;

	/**
	 * 法人证件有效期，YYYY-MM-DD格式
	 */
	@ApiField("legal_representative_cert_indate")
	private String legalRepresentativeCertIndate;

	/**
	 * 法人证件号码
	 */
	@ApiField("legal_representative_cert_no")
	private String legalRepresentativeCertNo;

	/**
	 * 法人证件背面照片（如证件为身份证则上传身份证国徽面图片）
	 */
	@ApiField("legal_representative_cert_pic_back")
	private String legalRepresentativeCertPicBack;

	/**
	 * 法人证件正面照片（如证件为身份证则上传身份证头像面图片）
	 */
	@ApiField("legal_representative_cert_pic_front")
	private String legalRepresentativeCertPicFront;

	/**
	 * 法人证件类型，支持传入的类型为：RESIDENT(居民身份证)括号中为每种类型的释义，不需要将括号中的内容当参数内容传入。
	 */
	@ApiField("legal_representative_cert_type")
	private String legalRepresentativeCertType;

	/**
	 * 法人姓名
	 */
	@ApiField("legal_representative_name")
	private String legalRepresentativeName;

	public String getLegalRepresentativeCertIndate() {
		return this.legalRepresentativeCertIndate;
	}
	public void setLegalRepresentativeCertIndate(String legalRepresentativeCertIndate) {
		this.legalRepresentativeCertIndate = legalRepresentativeCertIndate;
	}

	public String getLegalRepresentativeCertNo() {
		return this.legalRepresentativeCertNo;
	}
	public void setLegalRepresentativeCertNo(String legalRepresentativeCertNo) {
		this.legalRepresentativeCertNo = legalRepresentativeCertNo;
	}

	public String getLegalRepresentativeCertPicBack() {
		return this.legalRepresentativeCertPicBack;
	}
	public void setLegalRepresentativeCertPicBack(String legalRepresentativeCertPicBack) {
		this.legalRepresentativeCertPicBack = legalRepresentativeCertPicBack;
	}

	public String getLegalRepresentativeCertPicFront() {
		return this.legalRepresentativeCertPicFront;
	}
	public void setLegalRepresentativeCertPicFront(String legalRepresentativeCertPicFront) {
		this.legalRepresentativeCertPicFront = legalRepresentativeCertPicFront;
	}

	public String getLegalRepresentativeCertType() {
		return this.legalRepresentativeCertType;
	}
	public void setLegalRepresentativeCertType(String legalRepresentativeCertType) {
		this.legalRepresentativeCertType = legalRepresentativeCertType;
	}

	public String getLegalRepresentativeName() {
		return this.legalRepresentativeName;
	}
	public void setLegalRepresentativeName(String legalRepresentativeName) {
		this.legalRepresentativeName = legalRepresentativeName;
	}

}
