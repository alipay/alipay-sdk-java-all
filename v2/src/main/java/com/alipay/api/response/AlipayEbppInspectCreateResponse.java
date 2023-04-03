package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.inspect.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 10:36:22
 */
public class AlipayEbppInspectCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8338559738583376812L;

	/** 
	 * 外部业务标识，同入参的out_biz_no
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
