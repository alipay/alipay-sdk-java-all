package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.unifiedshop.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-16 10:17:56
 */
public class AlipayCommerceLifeserviceUnifiedshopModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8128984973314859335L;

	/** 
	 * 副本业务ID
	 */
	@ApiField("copy_id")
	private String copyId;

	/** 
	 * 更新后状态：UPDATING-更新中 / AUDITING-审核中 / PASS-审核通过
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 门店主键ID
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
