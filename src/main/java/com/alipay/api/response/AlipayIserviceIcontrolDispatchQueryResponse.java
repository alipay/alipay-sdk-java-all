package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.icontrol.dispatch.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-26 21:01:43
 */
public class AlipayIserviceIcontrolDispatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2246658726697452894L;

	/** 
	 * 热线技能组ID
	 */
	@ApiField("skill_group_id")
	private String skillGroupId;

	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
	}
	public String getSkillGroupId( ) {
		return this.skillGroupId;
	}

}
