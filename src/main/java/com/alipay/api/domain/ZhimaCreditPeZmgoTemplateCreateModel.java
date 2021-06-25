package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻Go模板创建
 *
 * @author auto create
 * @since 1.0, 2020-12-30 19:27:13
 */
public class ZhimaCreditPeZmgoTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7484565515663431911L;

	/**
	 * 使用权益跳转链接
	 */
	@ApiField("benefit_url")
	private String benefitUrl;

	/**
	 * 业务号，控制幂等
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 模板适用的商家pid列表，不传默认为商户id
	 */
	@ApiListField("consume_pid_list")
	@ApiField("string")
	private List<String> consumePidList;

	/**
	 * 商家联系方式
	 */
	@ApiField("contact")
	private String contact;

	/**
	 * 扩展内容，主要满足文案和展示类、个性化定制需求
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 会员协议html文本
	 */
	@ApiField("member_agreement")
	private String memberAgreement;

	/**
	 * 会员模式。
PAID_MEMBER，付费会员；
PROMISE_MEMBER，承诺会员。
	 */
	@ApiField("member_mode")
	private String memberMode;

	/**
	 * 会员规则
	 */
	@ApiField("member_rule")
	private MemberRule memberRule;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	public String getBenefitUrl() {
		return this.benefitUrl;
	}
	public void setBenefitUrl(String benefitUrl) {
		this.benefitUrl = benefitUrl;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public List<String> getConsumePidList() {
		return this.consumePidList;
	}
	public void setConsumePidList(List<String> consumePidList) {
		this.consumePidList = consumePidList;
	}

	public String getContact() {
		return this.contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMemberAgreement() {
		return this.memberAgreement;
	}
	public void setMemberAgreement(String memberAgreement) {
		this.memberAgreement = memberAgreement;
	}

	public String getMemberMode() {
		return this.memberMode;
	}
	public void setMemberMode(String memberMode) {
		this.memberMode = memberMode;
	}

	public MemberRule getMemberRule() {
		return this.memberRule;
	}
	public void setMemberRule(MemberRule memberRule) {
		this.memberRule = memberRule;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
