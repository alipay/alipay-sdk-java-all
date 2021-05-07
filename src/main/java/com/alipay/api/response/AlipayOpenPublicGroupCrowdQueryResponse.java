package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.group.crowd.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-28 17:08:25
 */
public class AlipayOpenPublicGroupCrowdQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8333798753153683117L;

	/** 
	 * 分组圈出的人群数量
	 */
	@ApiField("count")
	private String count;

	public void setCount(String count) {
		this.count = count;
	}
	public String getCount( ) {
		return this.count;
	}

}
