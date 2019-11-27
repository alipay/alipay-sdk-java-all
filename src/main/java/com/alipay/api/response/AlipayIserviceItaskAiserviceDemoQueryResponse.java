package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.aiservice.demo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayIserviceItaskAiserviceDemoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3827752262836652553L;

	/** 
	 * 排序分时
	 */
	@ApiListField("score")
	@ApiField("number")
	private List<Long> score;

	public void setScore(List<Long> score) {
		this.score = score;
	}
	public List<Long> getScore( ) {
		return this.score;
	}

}
