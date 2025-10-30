package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.data.item.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:32:41
 */
public class AlipayOpenDataItemSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5188244731456249929L;

	/** 
	 * 返回更新成功的外部id
	 */
	@ApiField("external_id")
	private String externalId;

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getExternalId( ) {
		return this.externalId;
	}

}
