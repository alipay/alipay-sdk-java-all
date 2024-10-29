package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.outboundwork.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:05
 */
public class KoubeiRetailWmsOutboundworkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7478852892574861988L;

	/** 
	 * 出库作业id
	 */
	@ApiField("outbound_work_id")
	private String outboundWorkId;

	public void setOutboundWorkId(String outboundWorkId) {
		this.outboundWorkId = outboundWorkId;
	}
	public String getOutboundWorkId( ) {
		return this.outboundWorkId;
	}

}
