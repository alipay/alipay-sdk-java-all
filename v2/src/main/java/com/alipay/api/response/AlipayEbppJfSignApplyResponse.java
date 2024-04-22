package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jf.sign.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:58
 */
public class AlipayEbppJfSignApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3875749228598554217L;

	/** 
	 * 外部业务号,和接口传入的外部业务号保持一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 异步签约流程的唯一标识
	 */
	@ApiField("process_id")
	private String processId;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

}
