package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直连模式查询收费能力和档位
 *
 * @author auto create
 * @since 1.0, 2026-09-29 13:37:54
 */
public class AlipayAipayNowpaydirectChargeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3831933161624767572L;

	/**
	 * 外部商品id，从管理小程序商品详情页获取
	 */
	@ApiField("out_product_id")
	private String outProductId;

	public String getOutProductId() {
		return this.outProductId;
	}
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

}
