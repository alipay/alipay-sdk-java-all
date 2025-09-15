package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.promo.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:27:42
 */
public class AlipayOpenAppServicePromoDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3234842582459562833L;

	/** 
	 * 服务场景素材记录ID
	 */
	@ApiField("promo_record_id")
	private String promoRecordId;

	public void setPromoRecordId(String promoRecordId) {
		this.promoRecordId = promoRecordId;
	}
	public String getPromoRecordId( ) {
		return this.promoRecordId;
	}

}
