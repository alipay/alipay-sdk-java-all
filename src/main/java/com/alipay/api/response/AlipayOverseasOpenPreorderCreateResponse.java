package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TuitionISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.preorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-26 16:12:25
 */
public class AlipayOverseasOpenPreorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1315225564799583682L;

	/** 
	 * 预创建单单号
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private TuitionISVResult result;

	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}
	public String getPreOrderId( ) {
		return this.preOrderId;
	}

	public void setResult(TuitionISVResult result) {
		this.result = result;
	}
	public TuitionISVResult getResult( ) {
		return this.result;
	}

}
