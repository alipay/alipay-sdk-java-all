package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分页查询商户信息
 *
 * @author auto create
 * @since 1.0, 2023-10-09 10:04:40
 */
public class IndirectMerchantProcessorResponse extends AlipayObject {

	private static final long serialVersionUID = 1441257491446954247L;

	/**
	 * 商家审核状态
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 商家经营状态
	 */
	@ApiField("business_status")
	private String businessStatus;

	/**
	 * 行业模版code
	 */
	@ApiField("industry_template_code")
	private String industryTemplateCode;

	/**
	 * 行业模版name
	 */
	@ApiField("industry_template_name")
	private String industryTemplateName;

	/**
	 * 登录账号
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 商家logo图片地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 商家appid
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	/**
	 * 商家名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户Pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 分账关系信息
	 */
	@ApiListField("merchant_settle_relation_list")
	@ApiField("merchant_settle_relation_processor_response")
	private List<MerchantSettleRelationProcessorResponse> merchantSettleRelationList;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 商家联系电话
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * smid
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 芝麻信用id
	 */
	@ApiField("zm_service_id")
	private String zmServiceId;

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getBusinessStatus() {
		return this.businessStatus;
	}
	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getIndustryTemplateCode() {
		return this.industryTemplateCode;
	}
	public void setIndustryTemplateCode(String industryTemplateCode) {
		this.industryTemplateCode = industryTemplateCode;
	}

	public String getIndustryTemplateName() {
		return this.industryTemplateName;
	}
	public void setIndustryTemplateName(String industryTemplateName) {
		this.industryTemplateName = industryTemplateName;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public List<MerchantSettleRelationProcessorResponse> getMerchantSettleRelationList() {
		return this.merchantSettleRelationList;
	}
	public void setMerchantSettleRelationList(List<MerchantSettleRelationProcessorResponse> merchantSettleRelationList) {
		this.merchantSettleRelationList = merchantSettleRelationList;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getZmServiceId() {
		return this.zmServiceId;
	}
	public void setZmServiceId(String zmServiceId) {
		this.zmServiceId = zmServiceId;
	}

}
