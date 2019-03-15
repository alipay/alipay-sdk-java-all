package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营业执照信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class BusinessLicenceInfo extends AlipayObject {

	private static final long serialVersionUID = 3642162912545743614L;

	/**
	 * 营业执照授权函图片，个体工商户如果使用总公司或其他公司的营业执照认证需上传该授权函图片
	 */
	@ApiField("business_license_auth_pic")
	private String businessLicenseAuthPic;

	/**
	 * 营业执照所在城市，使用国家行政区划代码，可参考http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/
	 */
	@ApiField("business_license_city")
	private String businessLicenseCity;

	/**
	 * 营业执照有效期，传入营业执照上营业期限到期日，格式为YYYY-MM-DD，如为长期则传入9999-12-31
	 */
	@ApiField("business_license_indate")
	private String businessLicenseIndate;

	/**
	 * 营业执照是否为三证合一，个体工商户可忽略该字段，企业级商户的营业执照如为三证合一的新营业执照则传true
	 */
	@ApiField("business_license_is_three_in_one")
	private Boolean businessLicenseIsThreeInOne;

	/**
	 * 营业执照号码
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	/**
	 * 营业执照图片
	 */
	@ApiField("business_license_pic")
	private String businessLicensePic;

	/**
	 * 营业执照所在地省份，使用国家行政区划代码，可参考http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/
	 */
	@ApiField("business_license_province")
	private String businessLicenseProvince;

	/**
	 * 营业执照上的企业经营范围
	 */
	@ApiField("business_scope")
	private String businessScope;

	/**
	 * 营业执照上的企业联系地址
	 */
	@ApiField("company_address")
	private String companyAddress;

	/**
	 * 营业执照上的企业名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 组织机构代码证号码，个体工商户忽略该字段，企业级商户如营业执照非三证合一需要传入该字段否则预校验会不通过
	 */
	@ApiField("org_code_certificate_no")
	private String orgCodeCertificateNo;

	/**
	 * 组织机构代码证图片，个体工商户忽略该字段，企业级商户如营业执照非三证合一需要传入该字段否则预校验会不通过
	 */
	@ApiField("org_code_certificate_pic")
	private String orgCodeCertificatePic;

	public String getBusinessLicenseAuthPic() {
		return this.businessLicenseAuthPic;
	}
	public void setBusinessLicenseAuthPic(String businessLicenseAuthPic) {
		this.businessLicenseAuthPic = businessLicenseAuthPic;
	}

	public String getBusinessLicenseCity() {
		return this.businessLicenseCity;
	}
	public void setBusinessLicenseCity(String businessLicenseCity) {
		this.businessLicenseCity = businessLicenseCity;
	}

	public String getBusinessLicenseIndate() {
		return this.businessLicenseIndate;
	}
	public void setBusinessLicenseIndate(String businessLicenseIndate) {
		this.businessLicenseIndate = businessLicenseIndate;
	}

	public Boolean getBusinessLicenseIsThreeInOne() {
		return this.businessLicenseIsThreeInOne;
	}
	public void setBusinessLicenseIsThreeInOne(Boolean businessLicenseIsThreeInOne) {
		this.businessLicenseIsThreeInOne = businessLicenseIsThreeInOne;
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

	public String getBusinessLicenseProvince() {
		return this.businessLicenseProvince;
	}
	public void setBusinessLicenseProvince(String businessLicenseProvince) {
		this.businessLicenseProvince = businessLicenseProvince;
	}

	public String getBusinessScope() {
		return this.businessScope;
	}
	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	public String getCompanyAddress() {
		return this.companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOrgCodeCertificateNo() {
		return this.orgCodeCertificateNo;
	}
	public void setOrgCodeCertificateNo(String orgCodeCertificateNo) {
		this.orgCodeCertificateNo = orgCodeCertificateNo;
	}

	public String getOrgCodeCertificatePic() {
		return this.orgCodeCertificatePic;
	}
	public void setOrgCodeCertificatePic(String orgCodeCertificatePic) {
		this.orgCodeCertificatePic = orgCodeCertificatePic;
	}

}
