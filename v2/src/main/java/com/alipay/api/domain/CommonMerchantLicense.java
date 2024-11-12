package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户资质信息
 *
 * @author auto create
 * @since 1.0, 2024-11-09 00:59:50
 */
public class CommonMerchantLicense extends AlipayObject {

	private static final long serialVersionUID = 1552227834346838119L;

	/**
	 * 资质Code，包括登记管理部门代码、机构类型代码、行政区划码、主体识别码和校验码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 资质有效期 {dateFormat{yyyy-MM-dd}} 长期有效传入 9999-12-31
	 */
	@ApiField("effective_date")
	private String effectiveDate;

	/**
	 * 资质名称。如营业执照就是营业执照的名称
	 */
	@ApiField("license_name")
	private String licenseName;

	/**
	 * 用户上传资质类型
	 */
	@ApiField("license_type")
	private String licenseType;

	/**
	 * 资质凭证图片链接,通过调用 ant.merchant.expand.indirect.image.upload(图片上传)接口返回的image_id作为参数
	 */
	@ApiListField("license_urls")
	@ApiField("string")
	private List<String> licenseUrls;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getEffectiveDate() {
		return this.effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getLicenseName() {
		return this.licenseName;
	}
	public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}

	public String getLicenseType() {
		return this.licenseType;
	}
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public List<String> getLicenseUrls() {
		return this.licenseUrls;
	}
	public void setLicenseUrls(List<String> licenseUrls) {
		this.licenseUrls = licenseUrls;
	}

}
