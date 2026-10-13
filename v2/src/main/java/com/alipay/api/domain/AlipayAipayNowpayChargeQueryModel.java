package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询收费能力和档位
 *
 * @author auto create
 * @since 1.0, 2026-09-28 15:32:54
 */
public class AlipayAipayNowpayChargeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5884273145133967888L;

	/**
	 * 商品所有者标识
	 */
	@ApiField("external_owner_id")
	private String externalOwnerId;

	/**
	 * 观猹商品/应用标识
	 */
	@ApiField("out_product_id")
	private String outProductId;

	public String getExternalOwnerId() {
		return this.externalOwnerId;
	}
	public void setExternalOwnerId(String externalOwnerId) {
		this.externalOwnerId = externalOwnerId;
	}

	public String getOutProductId() {
		return this.outProductId;
	}
	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

}
