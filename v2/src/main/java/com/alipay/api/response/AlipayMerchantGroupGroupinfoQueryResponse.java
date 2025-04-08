package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-07 14:01:59
 */
public class AlipayMerchantGroupGroupinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4196547294657118536L;

	/** 
	 * 群组详情信息。
	 */
	@ApiField("group_detail")
	private GroupDetailVO groupDetail;

	public void setGroupDetail(GroupDetailVO groupDetail) {
		this.groupDetail = groupDetail;
	}
	public GroupDetailVO getGroupDetail( ) {
		return this.groupDetail;
	}

}
