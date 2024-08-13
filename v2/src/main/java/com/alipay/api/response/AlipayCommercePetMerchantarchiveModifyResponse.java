package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.pet.merchantarchive.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-01 16:37:03
 */
public class AlipayCommercePetMerchantarchiveModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1558732239454431746L;

	/** 
	 * 支付宝宠物档案Id
	 */
	@ApiField("archive_id")
	private String archiveId;

	public void setArchiveId(String archiveId) {
		this.archiveId = archiveId;
	}
	public String getArchiveId( ) {
		return this.archiveId;
	}

}
