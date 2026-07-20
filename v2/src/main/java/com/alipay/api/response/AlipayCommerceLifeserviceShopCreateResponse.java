package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-16 10:17:55
 */
public class AlipayCommerceLifeserviceShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3121226927772374213L;

	/** 
	 * 副本业务ID
	 */
	@ApiField("copy_id")
	private String copyId;

	/** 
	 * 审核状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 正本ID
	 */
	@ApiField("store_id")
	private String storeId;

	public void setCopyId(String copyId) {
		this.copyId = copyId;
	}
	public String getCopyId( ) {
		return this.copyId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreId( ) {
		return this.storeId;
	}

}
