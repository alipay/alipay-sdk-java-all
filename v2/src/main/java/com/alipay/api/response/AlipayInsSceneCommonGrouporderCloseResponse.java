package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.common.grouporder.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 14:41:37
 */
public class AlipayInsSceneCommonGrouporderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2332229662941854524L;

	/** 
	 * 外部业务号
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
