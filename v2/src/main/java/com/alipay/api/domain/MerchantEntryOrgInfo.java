package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主体信息
 *
 * @author auto create
 * @since 1.0, 2024-02-01 19:31:34
 */
public class MerchantEntryOrgInfo extends AlipayObject {

	private static final long serialVersionUID = 7486812545345357413L;

	/**
	 * 企业有效期是否为长期有效
	 */
	@ApiField("expired_date_is_long_term")
	private Boolean expiredDateIsLongTerm;

	/**
	 * 商户类型（企业子类型）
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 企业的地址
	 */
	@ApiField("org_address")
	private String orgAddress;

	/**
	 * 企业的经营范围
	 */
	@ApiField("org_business_scope")
	private String orgBusinessScope;

	/**
	 * 商户证件图片在文件存储平台的标识（图片大小小于5M）。图片上传存储平台对应的接口文档 <a href="https://opendocs.alipay.com/open/0alqco?pathHash=87b43f78&scene=common"> ant.merchant.expand.indirect.image.upload</a>
	 */
	@ApiField("org_cert_image")
	private String orgCertImage;

	/**
	 * 按商户类型merchant_type的说明提供对应的证件编号
	 */
	@ApiField("org_cert_no")
	private String orgCertNo;

	/**
	 * 证件类型。具体选项值：营业执照: NATIONAL_LEGAL;
外国企业常驻代表机构登记证: FOREIGN_REP;
统一社会信用代码证: NATIONAL_LEGAL_MERGE;
军队单位对外有偿服务许可证: MILITARY_PUBLIC_COMMERCIAL_PERMIT;
武警部队单位对外有偿服务许可证: ARMED_POLICE_PUBLIC_COMMERCIAL_PERMIT;
事业单位法人证书: INST_RGST_CTF;
社会团体法人登记证书: GROUP_LEGAL;
民办非企业单位登记证书: PRIVATE_NON_ENTERPRISE;
基金会法人登记证书: FOUNDATION_RGST_CTF;
外国常驻新闻机构证: FOUNDATION_CORP_RGST_CTF;
律师事务所执业许可证: LAW_FIRM_PRACTICE_LICENSE;
公证机构执业证: NOTARY_PUBLIC_INSTITUTIONS_PRACTICE_CTF;
基层法律服务所执业证: GRASSROOTS_LEGAL_SERVICES_PRACTICE_CTF;
司法鉴定许可证: JUDICIAL_APPRAISAL_LICENSE;
仲裁委员会登记证: ARBITRATION_COMMITTEE_REG_CTF;
宗教活动场所登记证: RELIGIOUS_ACTIVITY_VENUE_REG_CTF;
宗教院校许可证: RELIGIOUS_SCHOOL_LICENSE;
工会法人资格证书: TRADE_UNION_QUALIFICATION_CTF;
农村集体经济组织登记证: RURAL_COLLECTIVE_ECONOMIC_ORG_CTF;
基层群众性自治组织特别法人统一社会信用代码证书: GRASSROOTS_AUTONOMY_ORG_USCC_CTF;
外国在华文化中心登记证: FOREIGN_CULTURAL_CENTER_IN_CHINA_CTF;
外国政府旅游部门常驻代表机构批准登记证: FOREIGN_GOV_TOURISM_OFFICES_CTF;
港、澳、台地区旅游部门常驻代表机构批准登记证: HK_MA_TW_TOURISM_OFFICES_CTF
	 */
	@ApiField("org_cert_type")
	private String orgCertType;

	/**
	 * 企业有效期，yyyyMMdd。企业有效期不为长期时，必填。
	 */
	@ApiField("org_expired_date")
	private String orgExpiredDate;

	/**
	 * 企业名称
	 */
	@ApiField("org_name")
	private String orgName;

	public Boolean getExpiredDateIsLongTerm() {
		return this.expiredDateIsLongTerm;
	}
	public void setExpiredDateIsLongTerm(Boolean expiredDateIsLongTerm) {
		this.expiredDateIsLongTerm = expiredDateIsLongTerm;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getOrgAddress() {
		return this.orgAddress;
	}
	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}

	public String getOrgBusinessScope() {
		return this.orgBusinessScope;
	}
	public void setOrgBusinessScope(String orgBusinessScope) {
		this.orgBusinessScope = orgBusinessScope;
	}

	public String getOrgCertImage() {
		return this.orgCertImage;
	}
	public void setOrgCertImage(String orgCertImage) {
		this.orgCertImage = orgCertImage;
	}

	public String getOrgCertNo() {
		return this.orgCertNo;
	}
	public void setOrgCertNo(String orgCertNo) {
		this.orgCertNo = orgCertNo;
	}

	public String getOrgCertType() {
		return this.orgCertType;
	}
	public void setOrgCertType(String orgCertType) {
		this.orgCertType = orgCertType;
	}

	public String getOrgExpiredDate() {
		return this.orgExpiredDate;
	}
	public void setOrgExpiredDate(String orgExpiredDate) {
		this.orgExpiredDate = orgExpiredDate;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

}
