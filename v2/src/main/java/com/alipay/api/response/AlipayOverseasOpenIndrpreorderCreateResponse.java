package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IndrISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.indrpreorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 20:52:37
 */
public class AlipayOverseasOpenIndrpreorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7383125525163917595L;

	/** 
	 * 预订单号
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	/** 
	 * 预订单链接地址
	 */
	@ApiField("pre_order_link")
	private String preOrderLink;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private IndrISVResult result;

	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}
	public String getPreOrderId( ) {
		return this.preOrderId;
	}

	public void setPreOrderLink(String preOrderLink) {
		this.preOrderLink = preOrderLink;
	}
	public String getPreOrderLink( ) {
		return this.preOrderLink;
	}

	public void setResult(IndrISVResult result) {
		this.result = result;
	}
	public IndrISVResult getResult( ) {
		return this.result;
	}

}
