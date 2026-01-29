package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户资质信息
 *
 * @author auto create
 * @since 1.0, 2026-01-04 14:12:37
 */
public class BizOpenCommonMerchantLicenseInfo extends AlipayObject {

	private static final long serialVersionUID = 7476751744919673155L;

	/**
	 * 经营范围
	 */
	@ApiField("business_scope")
	private String businessScope;

	/**
	 * 证件号，比如统一社会信用代码、登记管理部门代码、机构类型代码、行政区划码、主体识别码和校验码等
	 */
	@ApiField("cert_no")
	private String certNo;

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
	 * 资质凭证图片,通过调用<a href="https://isp-fe-tern.alipay.com/legacy/my/openApiDetailAndApply?apiId=24075&operateType=detail">ant.merchant.expand.indirect.image.upload</a> (图片上传)接口返回的image_id作为参数
	 */
	@ApiListField("license_pics")
	@ApiField("string")
	private List<String> licensePics;

	/**
	 * 注册地址
	 */
	@ApiField("reg_capital")
	private String regCapital;

	/**
	 * 资质类型
	 */
	@ApiField("type")
	private String type;

	public String getBusinessScope() {
		return this.businessScope;
	}
	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
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

	public List<String> getLicensePics() {
		return this.licensePics;
	}
	public void setLicensePics(List<String> licensePics) {
		this.licensePics = licensePics;
	}

	public String getRegCapital() {
		return this.regCapital;
	}
	public void setRegCapital(String regCapital) {
		this.regCapital = regCapital;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
