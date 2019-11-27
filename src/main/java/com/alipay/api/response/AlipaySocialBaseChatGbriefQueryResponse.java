package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupBrief;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.gbrief.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-16 21:06:48
 */
public class AlipaySocialBaseChatGbriefQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4689233573425157334L;

	/** 
	 * 群概要信息
	 */
	@ApiField("group_brief")
	private GroupBrief groupBrief;

	public void setGroupBrief(GroupBrief groupBrief) {
		this.groupBrief = groupBrief;
	}
	public GroupBrief getGroupBrief( ) {
		return this.groupBrief;
	}

}
