package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务推广查询
 *
 * @author auto create
 * @since 1.0, 2025-01-03 11:06:32
 */
public class AlipayOpenAppServicePromoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3859687871392426389L;

	/**
	 * 服务场景素材记录ID
	 */
	@ApiField("promo_record_id")
	private String promoRecordId;

	public String getPromoRecordId() {
		return this.promoRecordId;
	}
	public void setPromoRecordId(String promoRecordId) {
		this.promoRecordId = promoRecordId;
	}

}
