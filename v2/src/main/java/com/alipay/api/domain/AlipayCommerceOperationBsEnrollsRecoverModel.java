package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 联营-恢复计划报名
 *
 * @author auto create
 * @since 1.0, 2023-03-16 20:34:31
 */
public class AlipayCommerceOperationBsEnrollsRecoverModel extends AlipayObject {

	private static final long serialVersionUID = 6244931583698967489L;

	/**
	 * 恢复报名参与者，支持批量传参，最大10
	 */
	@ApiListField("participants")
	@ApiField("bs_participant_d_t_o")
	private List<BsParticipantDTO> participants;

	/**
	 * 联营计划ID
	 */
	@ApiField("plan_id")
	private String planId;

	public List<BsParticipantDTO> getParticipants() {
		return this.participants;
	}
	public void setParticipants(List<BsParticipantDTO> participants) {
		this.participants = participants;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
