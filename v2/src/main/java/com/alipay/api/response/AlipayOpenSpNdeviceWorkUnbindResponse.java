package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ndevice.work.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-30 11:57:26
 */
public class AlipayOpenSpNdeviceWorkUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 7893961991288529362L;

	/** 
	 * 外部业务主键ID，用来保证绑定操作重试操作下幂等
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/** 
	 * 当前操作是否完成
	 */
	@ApiField("unbind_result")
	private Boolean unbindResult;

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}
	public String getOutBizId( ) {
		return this.outBizId;
	}

	public void setUnbindResult(Boolean unbindResult) {
		this.unbindResult = unbindResult;
	}
	public Boolean getUnbindResult( ) {
		return this.unbindResult;
	}

}
