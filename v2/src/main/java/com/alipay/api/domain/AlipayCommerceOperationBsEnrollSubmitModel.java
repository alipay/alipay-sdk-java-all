package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 联营-计划报名
 *
 * @author auto create
 * @since 1.0, 2023-03-16 22:20:15
 */
public class AlipayCommerceOperationBsEnrollSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 2537594345992668711L;

	/**
	 * 报名参与者，支持批量传参，最大10
	 */
	@ApiListField("participants")
	@ApiField("bs_enroll_participant")
	private List<BsEnrollParticipant> participants;

	/**
	 * 联营计划ID
	 */
	@ApiField("plan_id")
	private String planId;

	public List<BsEnrollParticipant> getParticipants() {
		return this.participants;
	}
	public void setParticipants(List<BsEnrollParticipant> participants) {
		this.participants = participants;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
