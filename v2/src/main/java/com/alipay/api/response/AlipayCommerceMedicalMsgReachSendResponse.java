package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.msg.reach.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-23 10:02:56
 */
public class AlipayCommerceMedicalMsgReachSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7816814713628967557L;

	/** 
	 * null
	 */
	@ApiListField("channel_results")
	@ApiField("string")
	private List<String> channelResults;

	/** 
	 * 业务号，业务方提供
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setChannelResults(List<String> channelResults) {
		this.channelResults = channelResults;
	}
	public List<String> getChannelResults( ) {
		return this.channelResults;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
