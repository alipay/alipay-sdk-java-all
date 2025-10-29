package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NbMessage;
import com.alipay.api.domain.NbPagination;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.nextbuilder.agent.message.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-28 14:22:04
 */
public class AlipayCloudNextbuilderAgentMessageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1548399572473959743L;

	/** 
	 * 消息列表
	 */
	@ApiListField("data")
	@ApiField("nb_message")
	private List<NbMessage> data;

	/** 
	 * 分页信息
	 */
	@ApiField("pagination")
	private NbPagination pagination;

	public void setData(List<NbMessage> data) {
		this.data = data;
	}
	public List<NbMessage> getData( ) {
		return this.data;
	}

	public void setPagination(NbPagination pagination) {
		this.pagination = pagination;
	}
	public NbPagination getPagination( ) {
		return this.pagination;
	}

}
