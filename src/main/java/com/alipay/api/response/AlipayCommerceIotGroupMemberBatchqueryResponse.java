package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceGroupMember;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.group.member.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-19 20:11:11
 */
public class AlipayCommerceIotGroupMemberBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5329429363238632154L;

	/** 
	 * 分组成员列表
	 */
	@ApiListField("members")
	@ApiField("device_group_member")
	private List<DeviceGroupMember> members;

	/** 
	 * 分组中的设备总数
	 */
	@ApiField("total")
	private Long total;

	public void setMembers(List<DeviceGroupMember> members) {
		this.members = members;
	}
	public List<DeviceGroupMember> getMembers( ) {
		return this.members;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
