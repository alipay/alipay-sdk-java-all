package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.product.app.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-10 15:22:00
 */
public class AlipayDataDataserviceProductAppModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8434263732345998454L;

	/** 
	 * 商品灯火侧外部id
	 */
	@ApiField("out_id")
	private String outId;

	/** 
	 * 商家侧商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/** 
	 * 是否成功
	 */
	@ApiField("suc")
	private Boolean suc;

	public void setOutId(String outId) {
		this.outId = outId;
	}
	public String getOutId( ) {
		return this.outId;
	}

	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}
	public String getOutItemId( ) {
		return this.outItemId;
	}

	public void setSuc(Boolean suc) {
		this.suc = suc;
	}
	public Boolean getSuc( ) {
		return this.suc;
	}

}
