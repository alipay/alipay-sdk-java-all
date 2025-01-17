package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.crowd.match response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-30 14:22:01
 */
public class AlipayCommerceAcommunicationCrowdMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 6162918346393927573L;

	/** 
	 * 匹配成功的人群标签列表
	 */
	@ApiListField("match")
	@ApiField("string")
	private List<String> match;

	public void setMatch(List<String> match) {
		this.match = match;
	}
	public List<String> getMatch( ) {
		return this.match;
	}

}
