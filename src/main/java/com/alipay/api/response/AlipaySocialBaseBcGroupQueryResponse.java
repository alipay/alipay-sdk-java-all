package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.bc.group.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-21 14:22:41
 */
public class AlipaySocialBaseBcGroupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3254388771268265887L;

	/** 
	 * 支付宝群详情
	 */
	@ApiField("group_detail")
	private GroupDetail groupDetail;

	public void setGroupDetail(GroupDetail groupDetail) {
		this.groupDetail = groupDetail;
	}
	public GroupDetail getGroupDetail( ) {
		return this.groupDetail;
	}

}
