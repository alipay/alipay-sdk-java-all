package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NbConversation;
import com.alipay.api.domain.NbPagination;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.nextbuilder.agent.conversation.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-28 17:52:04
 */
public class AlipayCloudNextbuilderAgentConversationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6485199958583827242L;

	/** 
	 * 会话列表
	 */
	@ApiListField("data")
	@ApiField("nb_conversation")
	private List<NbConversation> data;

	/** 
	 * 分页信息
	 */
	@ApiField("pagination")
	private NbPagination pagination;

	public void setData(List<NbConversation> data) {
		this.data = data;
	}
	public List<NbConversation> getData( ) {
		return this.data;
	}

	public void setPagination(NbPagination pagination) {
		this.pagination = pagination;
	}
	public NbPagination getPagination( ) {
		return this.pagination;
	}

}
