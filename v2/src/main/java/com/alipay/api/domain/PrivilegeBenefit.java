package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 特权对象，可以区分出通用特权与动态特权（有规则的权益）
 *
 * @author auto create
 * @since 1.0, 2021-10-19 09:19:47
 */
public class PrivilegeBenefit extends AlipayObject {

	private static final long serialVersionUID = 3231862733183593147L;

	/**
	 * 权益内容，KV形式
	 */
	@ApiField("benefit_context")
	private String benefitContext;

	/**
	 * 整体以{"key":[value1, value2]}的结构传参，通过K-V的形式传递，需要与开发人员指定规则code。通用权益则不需要指定规则，如没有规则，即认为全部会员生效。
	 */
	@ApiField("benefit_rule")
	private String benefitRule;

	/**
	 * 权益类型，STATIC_PRIVILEGE -静态权益，DYNAMIC_PRIVILEGE - 动态权益
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * 权益描述信息，如有权益需要填写描述信息，需要确保所有的权益都具备描述信息，否则都不填写描述。
	 */
	@ApiListField("desc")
	@ApiField("string")
	private List<String> desc;

	/**
	 * 特权logo图标地址，需要通过alipay.offline.material.image.upload 上传。
特权的logo图片大小为56x56像素。
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 外部权益id，由商家自行指定，需要确保在该商家权益内能保证区分出唯一权益内容。在内券权益中，该值传内券活动ID（activityId）
	 */
	@ApiField("out_benefit_id")
	private String outBenefitId;

	/**
	 * 权益的优先级，需要指定在1-20之间，优先级的值越小，权益展示约靠前
	 */
	@ApiField("priority")
	private String priority;

	/**
	 * ENABLE("已生效"),
DISABLE("未生效");
	 */
	@ApiField("status")
	private String status;

	/**
	 * 权益的副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 权益标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 权益的跳转地址，卡面点击可跳转到商家小程序地址
	 */
	@ApiField("url")
	private String url;

	public String getBenefitContext() {
		return this.benefitContext;
	}
	public void setBenefitContext(String benefitContext) {
		this.benefitContext = benefitContext;
	}

	public String getBenefitRule() {
		return this.benefitRule;
	}
	public void setBenefitRule(String benefitRule) {
		this.benefitRule = benefitRule;
	}

	public String getBenefitType() {
		return this.benefitType;
	}
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	public List<String> getDesc() {
		return this.desc;
	}
	public void setDesc(List<String> desc) {
		this.desc = desc;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getOutBenefitId() {
		return this.outBenefitId;
	}
	public void setOutBenefitId(String outBenefitId) {
		this.outBenefitId = outBenefitId;
	}

	public String getPriority() {
		return this.priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
