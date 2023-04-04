package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开通 经营资质信息
 *
 * @author auto create
 * @since 1.0, 2023-03-03 17:12:22
 */
public class ApplyBusinessPropertyDTO extends AlipayObject {

	private static final long serialVersionUID = 4324484495434169314L;

	/**
	 * 联系人信息
	 */
	@ApiListField("contacts")
	@ApiField("business_contact_d_t_o")
	private List<BusinessContactDTO> contacts;

	/**
	 * 扩展属性
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * 营业执照资质
	 */
	@ApiField("license")
	private BusinessLicenseDTO license;

	/**
	 * MCC 枚举值
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * 经营类目类型
	 */
	@ApiField("mcc_type")
	private String mccType;

	/**
	 * 特殊资质信息
	 */
	@ApiListField("special_license")
	@ApiField("business_special_license_d_t_o")
	private List<BusinessSpecialLicenseDTO> specialLicense;

	/**
	 * 网站信息
	 */
	@ApiListField("web_apps")
	@ApiField("business_web_app_d_t_o")
	private List<BusinessWebAppDTO> webApps;

	public List<BusinessContactDTO> getContacts() {
		return this.contacts;
	}
	public void setContacts(List<BusinessContactDTO> contacts) {
		this.contacts = contacts;
	}

	public String getExtend() {
		return this.extend;
	}
	public void setExtend(String extend) {
		this.extend = extend;
	}

	public BusinessLicenseDTO getLicense() {
		return this.license;
	}
	public void setLicense(BusinessLicenseDTO license) {
		this.license = license;
	}

	public String getMccCode() {
		return this.mccCode;
	}
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public String getMccType() {
		return this.mccType;
	}
	public void setMccType(String mccType) {
		this.mccType = mccType;
	}

	public List<BusinessSpecialLicenseDTO> getSpecialLicense() {
		return this.specialLicense;
	}
	public void setSpecialLicense(List<BusinessSpecialLicenseDTO> specialLicense) {
		this.specialLicense = specialLicense;
	}

	public List<BusinessWebAppDTO> getWebApps() {
		return this.webApps;
	}
	public void setWebApps(List<BusinessWebAppDTO> webApps) {
		this.webApps = webApps;
	}

}
