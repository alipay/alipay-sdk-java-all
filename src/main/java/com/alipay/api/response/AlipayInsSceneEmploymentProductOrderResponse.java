package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.employment.product.order response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-22 13:36:48
 */
public class AlipayInsSceneEmploymentProductOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 2147438476329792627L;

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
