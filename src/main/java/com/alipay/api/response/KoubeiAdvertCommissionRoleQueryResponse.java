package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbadvertRoleInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.role.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-10 14:26:07
 */
public class KoubeiAdvertCommissionRoleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3515579184135926125L;

	/** 
	 * 角色拥有信息，无论是否拥有角色，都会返回“角色拥有信息”，如果没有，则返回没有开通。同时需要通过role_code ，查找对应角色的开通情况
	 */
	@ApiListField("role_infos")
	@ApiField("kbadvert_role_info_response")
	private List<KbadvertRoleInfoResponse> roleInfos;

	public void setRoleInfos(List<KbadvertRoleInfoResponse> roleInfos) {
		this.roleInfos = roleInfos;
	}
	public List<KbadvertRoleInfoResponse> getRoleInfos( ) {
		return this.roleInfos;
	}

}
