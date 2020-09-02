package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.voucher.code.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOfflineMarketingVoucherCodeUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4251126772577186689L;

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
