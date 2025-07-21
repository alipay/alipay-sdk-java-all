package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupControlVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupcontrol.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-09 11:42:32
 */
public class AlipayMerchantGroupGroupcontrolQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4141164117288436111L;

	/** 
	 * 广告屏蔽配置详情
	 */
	@ApiField("group_control_detail")
	private GroupControlVO groupControlDetail;

	public void setGroupControlDetail(GroupControlVO groupControlDetail) {
		this.groupControlDetail = groupControlDetail;
	}
	public GroupControlVO getGroupControlDetail( ) {
		return this.groupControlDetail;
	}

}
