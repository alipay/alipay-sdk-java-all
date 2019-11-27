package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.smartscene.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-12 19:58:42
 */
public class AlipayDataAiserviceSmartsceneModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5882896842116866629L;

	/** 
	 * 32
	 */
	@ApiField("price")
	private String price;

	/** 
	 * dfd
	 */
	@ApiField("tt")
	private String tt;

	public void setPrice(String price) {
		this.price = price;
	}
	public String getPrice( ) {
		return this.price;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}
	public String getTt( ) {
		return this.tt;
	}

}
