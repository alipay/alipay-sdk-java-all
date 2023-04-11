package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商方案详情查询
 *
 * @author auto create
 * @since 1.0, 2022-09-10 22:01:14
 */
public class AlipayMarketingRecruitPlanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7293659956329195712L;

	/**
	 * 查询可报名方案的目标商户信息。 说明： 如果该复杂对象不填。则默认为是查询调用者本人。 如果填写，则认为是查询该商户。 建议：服务商身份接入时必传，否则可报名方案不是针对代运营商户的。
	 */
	@ApiField("enroll_merchant")
	private RecruitEnrollMerchant enrollMerchant;

	/**
	 * 招商方案ID
	 */
	@ApiField("plan_id")
	private String planId;

	public RecruitEnrollMerchant getEnrollMerchant() {
		return this.enrollMerchant;
	}
	public void setEnrollMerchant(RecruitEnrollMerchant enrollMerchant) {
		this.enrollMerchant = enrollMerchant;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
