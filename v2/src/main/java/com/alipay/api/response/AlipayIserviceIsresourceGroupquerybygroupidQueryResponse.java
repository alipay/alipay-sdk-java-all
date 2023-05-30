package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiSkillGroupInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.groupquerybygroupid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-26 10:41:57
 */
public class AlipayIserviceIsresourceGroupquerybygroupidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5754981754143263871L;

	/** 
	 * 技能组信息
	 */
	@ApiField("biz_data")
	private OpenApiSkillGroupInfo bizData;

	public void setBizData(OpenApiSkillGroupInfo bizData) {
		this.bizData = bizData;
	}
	public OpenApiSkillGroupInfo getBizData( ) {
		return this.bizData;
	}

}
