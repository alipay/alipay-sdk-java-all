package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务扩展信息
 *
 * @author auto create
 * @since 1.0, 2024-09-13 14:40:44
 */
public class ServiceExtInfo extends AlipayObject {

	private static final long serialVersionUID = 2375812757185867984L;

	/**
	 * 服务扩展信息
	 */
	@ApiField("promo_text")
	private String promoText;

	public String getPromoText() {
		return this.promoText;
	}
	public void setPromoText(String promoText) {
		this.promoText = promoText;
	}

}
