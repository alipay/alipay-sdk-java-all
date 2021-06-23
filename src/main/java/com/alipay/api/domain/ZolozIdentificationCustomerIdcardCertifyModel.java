package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证件宝审核
 *
 * @author auto create
 * @since 1.0, 2018-04-20 09:30:36
 */
public class ZolozIdentificationCustomerIdcardCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 1794794281643455239L;

	/**
	 * 业务唯一id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 当使用手填信息审核接口对营业执照进行审核时，填写该字段信息
	 */
	@ApiField("business_license_cert")
	private BusinessLicenseCertFileds businessLicenseCert;

	/**
	 * 当使用手填信息审核接口对身份证进行审核时，填写该字段信息
	 */
	@ApiField("cert")
	private CertFields cert;

	/**
	 * 上传证件图片信息
	 */
	@ApiField("idcard_img")
	private IdCardImg idcardImg;

	/**
	 * 用户uid
	 */
	@ApiField("operater_id")
	private String operaterId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public BusinessLicenseCertFileds getBusinessLicenseCert() {
		return this.businessLicenseCert;
	}
	public void setBusinessLicenseCert(BusinessLicenseCertFileds businessLicenseCert) {
		this.businessLicenseCert = businessLicenseCert;
	}

	public CertFields getCert() {
		return this.cert;
	}
	public void setCert(CertFields cert) {
		this.cert = cert;
	}

	public IdCardImg getIdcardImg() {
		return this.idcardImg;
	}
	public void setIdcardImg(IdCardImg idcardImg) {
		this.idcardImg = idcardImg;
	}

	public String getOperaterId() {
		return this.operaterId;
	}
	public void setOperaterId(String operaterId) {
		this.operaterId = operaterId;
	}

}
