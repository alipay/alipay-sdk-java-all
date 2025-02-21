package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营-邀约-咨询
 *
 * @author auto create
 * @since 1.0, 2022-11-16 14:53:44
 */
public class AlipayCommerceOperationBsInviteConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7596862783978335571L;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 联营计划ID
	 */
	@ApiField("plan_id")
	private String planId;

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
