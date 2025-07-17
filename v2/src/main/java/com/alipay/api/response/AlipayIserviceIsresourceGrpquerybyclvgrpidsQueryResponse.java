package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiSkillGroupInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.grpquerybyclvgrpids.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-11 14:46:53
 */
public class AlipayIserviceIsresourceGrpquerybyclvgrpidsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4259984863356392238L;

	/** 
	 * 相关技能组信息
	 */
	@ApiListField("biz_data")
	@ApiField("open_api_skill_group_info")
	private List<OpenApiSkillGroupInfo> bizData;

	public void setBizData(List<OpenApiSkillGroupInfo> bizData) {
		this.bizData = bizData;
	}
	public List<OpenApiSkillGroupInfo> getBizData( ) {
		return this.bizData;
	}

}
