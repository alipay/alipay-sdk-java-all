package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 法人信息
 *
 * @author auto create
 * @since 1.0, 2024-02-01 19:31:42
 */
public class MerchantEntryLegalInfo extends AlipayObject {

	private static final long serialVersionUID = 5782658583918373899L;

	/**
	 * 法人证件有效期是否为长期有效
	 */
	@ApiField("expired_date_is_long_term")
	private Boolean expiredDateIsLongTerm;

	/**
	 * 法人证件图片在文件存储平台的标识（图片大小小于5M）。图片上传存储平台对应的接口文档 <a href="https://opendocs.alipay.com/open/0alqco?pathHash=87b43f78&scene=common"> ant.merchant.expand.indirect.image.upload</a>
	 */
	@ApiField("legal_cert_image")
	private String legalCertImage;

	/**
	 * 法人证件图片反面在文件存储平台的标识（图片大小小于5M）。图片上传存储平台对应的接口文档 <a href="https://opendocs.alipay.com/open/0alqco?pathHash=87b43f78&scene=common"> ant.merchant.expand.indirect.image.upload</a>
	 */
	@ApiField("legal_cert_image_back")
	private String legalCertImageBack;

	/**
	 * 法人证件号码
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 法人证件类型
	 */
	@ApiField("legal_cert_type")
	private String legalCertType;

	/**
	 * 法人的证件有效期，yyyyMMdd。法人有效期不为长期时，必填。
	 */
	@ApiField("legal_expired_date")
	private String legalExpiredDate;

	/**
	 * 法人名称
	 */
	@ApiField("legal_name")
	private String legalName;

	public Boolean getExpiredDateIsLongTerm() {
		return this.expiredDateIsLongTerm;
	}
	public void setExpiredDateIsLongTerm(Boolean expiredDateIsLongTerm) {
		this.expiredDateIsLongTerm = expiredDateIsLongTerm;
	}

	public String getLegalCertImage() {
		return this.legalCertImage;
	}
	public void setLegalCertImage(String legalCertImage) {
		this.legalCertImage = legalCertImage;
	}

	public String getLegalCertImageBack() {
		return this.legalCertImageBack;
	}
	public void setLegalCertImageBack(String legalCertImageBack) {
		this.legalCertImageBack = legalCertImageBack;
	}

	public String getLegalCertNo() {
		return this.legalCertNo;
	}
	public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}

	public String getLegalCertType() {
		return this.legalCertType;
	}
	public void setLegalCertType(String legalCertType) {
		this.legalCertType = legalCertType;
	}

	public String getLegalExpiredDate() {
		return this.legalExpiredDate;
	}
	public void setLegalExpiredDate(String legalExpiredDate) {
		this.legalExpiredDate = legalExpiredDate;
	}

	public String getLegalName() {
		return this.legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

}
