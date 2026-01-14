package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一体化作业商户营业执照信息
 *
 * @author auto create
 * @since 1.0, 2026-01-09 18:33:09
 */
public class InteOpBusinessLicenseInfo extends AlipayObject {

	private static final long serialVersionUID = 7569589352624752296L;

	/**
	 * 营业执照法人认证手机号。上传非经营者本人（签约账号）的营业执照时必填，填写营业执照法人支付宝账号对应的手机号。
	 */
	@ApiField("business_license_mobile")
	private String businessLicenseMobile;

	/**
	 * 商户营业执照号码
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	/**
	 * 营业执照图片。
被代创建商户运营主体为个人账户必填，企业账户无需填写，最小5KB，最大5M（暂不限制图片宽高），图片格式必须为：png、bmp、gif、jpg、jpeg
传入alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("business_license_pic")
	private String businessLicensePic;

	/**
	 * 营业期限（非长期时需填）
	 */
	@ApiField("date_limitation")
	private String dateLimitation;

	/**
	 * 营业执照是否长期有效
	 */
	@ApiField("long_term")
	private Boolean longTerm;

	public String getBusinessLicenseMobile() {
		return this.businessLicenseMobile;
	}
	public void setBusinessLicenseMobile(String businessLicenseMobile) {
		this.businessLicenseMobile = businessLicenseMobile;
	}

	public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}
	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

	public String getBusinessLicensePic() {
		return this.businessLicensePic;
	}
	public void setBusinessLicensePic(String businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}

	public String getDateLimitation() {
		return this.dateLimitation;
	}
	public void setDateLimitation(String dateLimitation) {
		this.dateLimitation = dateLimitation;
	}

	public Boolean getLongTerm() {
		return this.longTerm;
	}
	public void setLongTerm(Boolean longTerm) {
		this.longTerm = longTerm;
	}

}
