package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务投放模版查询
 *
 * @author auto create
 * @since 1.0, 2025-01-03 11:06:27
 */
public class AlipayOpenAppServicePromotemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1138356419755669164L;

	/**
	 * 展台ID
	 */
	@ApiField("promo_booth_id")
	private String promoBoothId;

	/**
	 * 展台版本
	 */
	@ApiField("promo_booth_version")
	private Long promoBoothVersion;

	public String getPromoBoothId() {
		return this.promoBoothId;
	}
	public void setPromoBoothId(String promoBoothId) {
		this.promoBoothId = promoBoothId;
	}

	public Long getPromoBoothVersion() {
		return this.promoBoothVersion;
	}
	public void setPromoBoothVersion(Long promoBoothVersion) {
		this.promoBoothVersion = promoBoothVersion;
	}

}
