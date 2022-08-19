package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 全量权益同步接口
 *
 * @author auto create
 * @since 1.0, 2021-10-27 17:08:05
 */
public class AlipayCommerceOperationBenefitAllSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5496368711888656825L;

	/**
	 * 内券活动列表，最多可填写0-20个券活动
	 */
	@ApiListField("activity_benefit_list")
	@ApiField("activity_benefit")
	private List<ActivityBenefit> activityBenefitList;

	/**
	 * 会员权益列表，需要指定3-20个会员权益
	 */
	@ApiListField("privilege_benefit_list")
	@ApiField("privilege_benefit")
	private List<PrivilegeBenefit> privilegeBenefitList;

	/**
	 * 卡包卡模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public List<ActivityBenefit> getActivityBenefitList() {
		return this.activityBenefitList;
	}
	public void setActivityBenefitList(List<ActivityBenefit> activityBenefitList) {
		this.activityBenefitList = activityBenefitList;
	}

	public List<PrivilegeBenefit> getPrivilegeBenefitList() {
		return this.privilegeBenefitList;
	}
	public void setPrivilegeBenefitList(List<PrivilegeBenefit> privilegeBenefitList) {
		this.privilegeBenefitList = privilegeBenefitList;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
