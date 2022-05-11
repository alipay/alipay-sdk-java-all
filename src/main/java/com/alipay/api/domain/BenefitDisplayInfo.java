package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益展示信息
 *
 * @author auto create
 * @since 1.0, 2020-05-28 18:55:13
 */
public class BenefitDisplayInfo extends AlipayObject {

	private static final long serialVersionUID = 1873974251655718869L;

	/**
	 * 权益描述
	 */
	@ApiField("benefit_description")
	private String benefitDescription;

	/**
	 * 权益icon
	 */
	@ApiField("benefit_icon_url")
	private String benefitIconUrl;

	/**
	 * 权益名称
	 */
	@ApiField("benefit_name")
	private String benefitName;

	/**
	 * 透传信息
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	public String getBenefitDescription() {
		return this.benefitDescription;
	}
	public void setBenefitDescription(String benefitDescription) {
		this.benefitDescription = benefitDescription;
	}

	public String getBenefitIconUrl() {
		return this.benefitIconUrl;
	}
	public void setBenefitIconUrl(String benefitIconUrl) {
		this.benefitIconUrl = benefitIconUrl;
	}

	public String getBenefitName() {
		return this.benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

	public String getPassThroughInfo() {
		return this.passThroughInfo;
	}
	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}

}
