package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MembersXPermissionDO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.member.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceMemberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3182864359838253727L;

	/** 
	 * 用户权限信息
	 */
	@ApiListField("member_x_permission")
	@ApiField("members_x_permission_d_o")
	private List<MembersXPermissionDO> memberXPermission;

	public void setMemberXPermission(List<MembersXPermissionDO> memberXPermission) {
		this.memberXPermission = memberXPermission;
	}
	public List<MembersXPermissionDO> getMemberXPermission( ) {
		return this.memberXPermission;
	}

}
