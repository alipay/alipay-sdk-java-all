package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupInstanceInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupinstanceinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 17:52:01
 */
public class AlipayMerchantGroupGroupinstanceinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4614218121746867624L;

	/** 
	 * 群详情
	 */
	@ApiField("group_instance_info")
	private GroupInstanceInfoVO groupInstanceInfo;

	public void setGroupInstanceInfo(GroupInstanceInfoVO groupInstanceInfo) {
		this.groupInstanceInfo = groupInstanceInfo;
	}
	public GroupInstanceInfoVO getGroupInstanceInfo( ) {
		return this.groupInstanceInfo;
	}

}
