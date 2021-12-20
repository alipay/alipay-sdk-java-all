package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家单个权益同步接口
 *
 * @author auto create
 * @since 1.0, 2021-10-27 14:52:32
 */
public class AlipayCommerceOperationBenefitSingleSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7762228975883247777L;

	/**
	 * 权益行为，CREATE-创建，MODIFY-修改，DELETE-删除
	 */
	@ApiField("action")
	private String action;

	/**
	 * 支付宝内券活动对象
	 */
	@ApiField("activity_benefit")
	private ActivityBenefit activityBenefit;

	/**
	 * 会员权益
	 */
	@ApiField("privilege_benefit")
	private PrivilegeBenefit privilegeBenefit;

	/**
	 * 卡包卡模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public ActivityBenefit getActivityBenefit() {
		return this.activityBenefit;
	}
	public void setActivityBenefit(ActivityBenefit activityBenefit) {
		this.activityBenefit = activityBenefit;
	}

	public PrivilegeBenefit getPrivilegeBenefit() {
		return this.privilegeBenefit;
	}
	public void setPrivilegeBenefit(PrivilegeBenefit privilegeBenefit) {
		this.privilegeBenefit = privilegeBenefit;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
