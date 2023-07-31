package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TuitionISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.preorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:07:21
 */
public class AlipayOverseasOpenPreorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6196789884762391465L;

	/** 
	 * 预创建单单号
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	/** 
	 * 预订单链接地址（小程序的链接地址）
	 */
	@ApiField("pre_order_link")
	private String preOrderLink;

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

	public void setPreOrderLink(String preOrderLink) {
		this.preOrderLink = preOrderLink;
	}
	public String getPreOrderLink( ) {
		return this.preOrderLink;
	}

	public void setResult(TuitionISVResult result) {
		this.result = result;
	}
	public TuitionISVResult getResult( ) {
		return this.result;
	}

}
