package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保障服务信息
 *
 * @author auto create
 * @since 1.0, 2024-04-15 16:05:53
 */
public class GuaranteeServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 7731535888893248536L;

	/**
	 * 基础保障
	 */
	@ApiField("basic_guarantee")
	private GuaranteeService basicGuarantee;

	/**
	 * 更多保障服务列表
	 */
	@ApiListField("more_services")
	@ApiField("guarantee_service")
	private List<GuaranteeService> moreServices;

	/**
	 * 详细规则链接
	 */
	@ApiField("rule_detail_page_url")
	private String ruleDetailPageUrl;

	/**
	 * 所有保障服务的概括性规则
	 */
	@ApiField("rule_text")
	private String ruleText;

	public GuaranteeService getBasicGuarantee() {
		return this.basicGuarantee;
	}
	public void setBasicGuarantee(GuaranteeService basicGuarantee) {
		this.basicGuarantee = basicGuarantee;
	}

	public List<GuaranteeService> getMoreServices() {
		return this.moreServices;
	}
	public void setMoreServices(List<GuaranteeService> moreServices) {
		this.moreServices = moreServices;
	}

	public String getRuleDetailPageUrl() {
		return this.ruleDetailPageUrl;
	}
	public void setRuleDetailPageUrl(String ruleDetailPageUrl) {
		this.ruleDetailPageUrl = ruleDetailPageUrl;
	}

	public String getRuleText() {
		return this.ruleText;
	}
	public void setRuleText(String ruleText) {
		this.ruleText = ruleText;
	}

}
