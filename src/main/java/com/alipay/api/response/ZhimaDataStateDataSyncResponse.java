package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.data.state.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:31:37
 */
public class ZhimaDataStateDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7357622783767542864L;

	/** 
	 * 同步结果成功或失败,具体错误码在错误信息中
	 */
	@ApiField("biz_result")
	private String bizResult;

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

}
