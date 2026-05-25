package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户资质信息
 *
 * @author auto create
 * @since 1.0, 2026-03-18 19:55:15
 */
public class BizOpenCommonMerchantLicenseInfo extends AlipayObject {

	private static final long serialVersionUID = 1424595986879459327L;

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
	 * 资质类型。资质类型需要与商户类型对应。
商户类型下填写对应资质如下：
01-普通企业可使用的资质为：营业执照（201）或外国企业常驻代表机构登记证（205）。
02-事业单位可使用的资质为：事业单位法人证书（218）。
04-社会组织可使用的资质为：社会团体法人登记证书（206）、民办非企业单位登记证书（204）、基金会法人登记证书（222）、外国常驻新闻机构证（403）、律师事务所执业许可证（404）、公证机构执业证（405）、基层法律服务所执业证（406）、司法鉴定许可证（407）、仲裁委员会登记证（408）、宗教活动场所登记证（409）、宗教院校许可证（410）、工会法人资格证书（411）、农村集体经济组织登记证（412）、基层群众性自治组织特别法人统一社会信用代码证书（413）、外国在华文化中心登记证（414）、外国政府旅游部门常驻代表机构批准登记证（415）、港、澳、台地区旅游部门常驻代表机构批准登记证（416）。
05-党政及国家机关可使用的资质为：统一社会信用代码证书（2011）、军队单位对外有偿服务许可证（401） 或 武警部队单位对外有偿服务许可证（402）。
07-个体工商户可使用的资质为：营业执照（201）。
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
