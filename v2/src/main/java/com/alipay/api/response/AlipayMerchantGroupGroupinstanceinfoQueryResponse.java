package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupInstanceInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupinstanceinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-27 14:57:18
 */
public class AlipayMerchantGroupGroupinstanceinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1471172732878419758L;

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
