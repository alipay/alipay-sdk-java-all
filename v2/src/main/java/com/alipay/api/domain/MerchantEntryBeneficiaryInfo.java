package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 受益人信息
 *
 * @author auto create
 * @since 1.0, 2024-02-01 19:31:28
 */
public class MerchantEntryBeneficiaryInfo extends AlipayObject {

	private static final long serialVersionUID = 2362223651655699763L;

	/**
	 * 受益人的证件有效期，yyyyMMdd。受益人有效期不为长期时，必填。
	 */
	@ApiField("beneficiary_cert_expired_date")
	private String beneficiaryCertExpiredDate;

	/**
	 * 受益人证件图片在文件存储平台的标识（图片大小小于5M）。图片上传存储平台对应的接口文档 <a href="https://opendocs.alipay.com/open/0alqco?pathHash=87b43f78&scene=common"> ant.merchant.expand.indirect.image.upload</a>
	 */
	@ApiField("beneficiary_cert_image")
	private String beneficiaryCertImage;

	/**
	 * 受益人证件图片背面在文件存储平台的标识（图片大小小于5M）。图片上传存储平台对应的接口文档 <a href="https://opendocs.alipay.com/open/0alqco?pathHash=87b43f78&scene=common"> ant.merchant.expand.indirect.image.upload</a>
	 */
	@ApiField("beneficiary_cert_image_back")
	private String beneficiaryCertImageBack;

	/**
	 * 受益人号码
	 */
	@ApiField("beneficiary_cert_no")
	private String beneficiaryCertNo;

	/**
	 * 受益人证件类型
	 */
	@ApiField("beneficiary_cert_type")
	private String beneficiaryCertType;

	/**
	 * 受益人名称
	 */
	@ApiField("beneficiary_name")
	private String beneficiaryName;

	/**
	 * 受益人证件有效期是否为长期有效
	 */
	@ApiField("expired_date_is_long_term")
	private Boolean expiredDateIsLongTerm;

	public String getBeneficiaryCertExpiredDate() {
		return this.beneficiaryCertExpiredDate;
	}
	public void setBeneficiaryCertExpiredDate(String beneficiaryCertExpiredDate) {
		this.beneficiaryCertExpiredDate = beneficiaryCertExpiredDate;
	}

	public String getBeneficiaryCertImage() {
		return this.beneficiaryCertImage;
	}
	public void setBeneficiaryCertImage(String beneficiaryCertImage) {
		this.beneficiaryCertImage = beneficiaryCertImage;
	}

	public String getBeneficiaryCertImageBack() {
		return this.beneficiaryCertImageBack;
	}
	public void setBeneficiaryCertImageBack(String beneficiaryCertImageBack) {
		this.beneficiaryCertImageBack = beneficiaryCertImageBack;
	}

	public String getBeneficiaryCertNo() {
		return this.beneficiaryCertNo;
	}
	public void setBeneficiaryCertNo(String beneficiaryCertNo) {
		this.beneficiaryCertNo = beneficiaryCertNo;
	}

	public String getBeneficiaryCertType() {
		return this.beneficiaryCertType;
	}
	public void setBeneficiaryCertType(String beneficiaryCertType) {
		this.beneficiaryCertType = beneficiaryCertType;
	}

	public String getBeneficiaryName() {
		return this.beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public Boolean getExpiredDateIsLongTerm() {
		return this.expiredDateIsLongTerm;
	}
	public void setExpiredDateIsLongTerm(Boolean expiredDateIsLongTerm) {
		this.expiredDateIsLongTerm = expiredDateIsLongTerm;
	}

}
