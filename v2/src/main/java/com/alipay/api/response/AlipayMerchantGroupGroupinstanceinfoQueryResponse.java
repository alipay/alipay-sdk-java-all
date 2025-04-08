package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupInstanceInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupinstanceinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-07 13:58:43
 */
public class AlipayMerchantGroupGroupinstanceinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8264833713463451563L;

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
