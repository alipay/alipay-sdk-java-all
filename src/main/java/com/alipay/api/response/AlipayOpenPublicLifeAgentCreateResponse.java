package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.agent.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-26 15:02:30
 */
public class AlipayOpenPublicLifeAgentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8627115617276238389L;

	/** 
	 * 外部入驻申请单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
