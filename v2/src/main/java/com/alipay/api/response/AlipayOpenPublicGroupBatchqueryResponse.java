package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryGroup;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.group.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 21:41:12
 */
public class AlipayOpenPublicGroupBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4485933869618394382L;

	/** 
	 * 用户分组列表，包含每个分组的id、name、以及规则模型
	 */
	@ApiListField("groups")
	@ApiField("query_group")
	private List<QueryGroup> groups;

	public void setGroups(List<QueryGroup> groups) {
		this.groups = groups;
	}
	public List<QueryGroup> getGroups( ) {
		return this.groups;
	}

}
