package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SimpleOpenApiPrivilegeDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.privilege.skill.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-23 20:12:44
 */
public class AlipayUserPrivilegeSkillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3185231314556961228L;

	/** 
	 * 用户的特权基础信息
	 */
	@ApiListField("simple_open_api_privilege_detail_list")
	@ApiField("simple_open_api_privilege_detail")
	private List<SimpleOpenApiPrivilegeDetail> simpleOpenApiPrivilegeDetailList;

	public void setSimpleOpenApiPrivilegeDetailList(List<SimpleOpenApiPrivilegeDetail> simpleOpenApiPrivilegeDetailList) {
		this.simpleOpenApiPrivilegeDetailList = simpleOpenApiPrivilegeDetailList;
	}
	public List<SimpleOpenApiPrivilegeDetail> getSimpleOpenApiPrivilegeDetailList( ) {
		return this.simpleOpenApiPrivilegeDetailList;
	}

}
