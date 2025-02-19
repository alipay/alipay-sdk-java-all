package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.employment.product.order response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 14:41:32
 */
public class AlipayInsSceneEmploymentProductOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 8642763251981929458L;

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
