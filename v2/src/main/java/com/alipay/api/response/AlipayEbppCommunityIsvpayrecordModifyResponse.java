package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.isvpayrecord.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-29 15:42:56
 */
public class AlipayEbppCommunityIsvpayrecordModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6449616621165785312L;

	/** 
	 * 是	核心定位键：创单时平台生成并传给服务商的统一单号，回写定位、校验、更新均以其为准
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 回写后记录当前状态（含终态幂等后返回的当前终态）
枚举 {SUCCESS, CLOSED}
	 */
	@ApiField("status")
	private String status;

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
