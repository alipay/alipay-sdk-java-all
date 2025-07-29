package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupMsgAutoreplyDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.autoreply.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-09 11:39:29
 */
public class AlipayMerchantGroupAutoreplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3498925298455985854L;

	/** 
	 * 自动回复详情
	 */
	@ApiField("group_msg_autoreply_detail")
	private GroupMsgAutoreplyDetailVO groupMsgAutoreplyDetail;

	public void setGroupMsgAutoreplyDetail(GroupMsgAutoreplyDetailVO groupMsgAutoreplyDetail) {
		this.groupMsgAutoreplyDetail = groupMsgAutoreplyDetail;
	}
	public GroupMsgAutoreplyDetailVO getGroupMsgAutoreplyDetail( ) {
		return this.groupMsgAutoreplyDetail;
	}

}
