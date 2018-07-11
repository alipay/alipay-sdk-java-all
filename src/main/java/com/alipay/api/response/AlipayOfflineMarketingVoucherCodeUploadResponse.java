package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.voucher.code.upload response.
 * 
 * @author auto create
 * @since 1.0, 2018-01-12 10:57:49
 */
public class AlipayOfflineMarketingVoucherCodeUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6778282321431556654L;

	/** 
	 * 码库id
	 */
	@ApiField("code_inventory_id")
	private String codeInventoryId;

	public void setCodeInventoryId(String codeInventoryId) {
		this.codeInventoryId = codeInventoryId;
	}
	public String getCodeInventoryId( ) {
		return this.codeInventoryId;
	}

}
