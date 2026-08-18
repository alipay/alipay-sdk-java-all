package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.sourceuid.pid.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-28 16:17:55
 */
public class AnttechOceanbaseSourceuidPidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5118582675695152975L;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("alipay_virtual_id")
	private String alipayVirtualId;

	/** 
	 * 来源uid
	 */
	@ApiField("source_uid")
	private String sourceUid;

	public void setAlipayVirtualId(String alipayVirtualId) {
		this.alipayVirtualId = alipayVirtualId;
	}
	public String getAlipayVirtualId( ) {
		return this.alipayVirtualId;
	}

	public void setSourceUid(String sourceUid) {
		this.sourceUid = sourceUid;
	}
	public String getSourceUid( ) {
		return this.sourceUid;
	}

}
