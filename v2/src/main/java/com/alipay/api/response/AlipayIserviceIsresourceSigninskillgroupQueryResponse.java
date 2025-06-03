package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiSkillGroupInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.signinskillgroup.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-10 10:02:14
 */
public class AlipayIserviceIsresourceSigninskillgroupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3266143939465727471L;

	/** 
	 * 签入技能组查询响应
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
