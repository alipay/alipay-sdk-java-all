package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 启停收费能力
 *
 * @author auto create
 * @since 1.0, 2026-09-02 00:42:50
 */
public class AlipayAipayNowpayChargeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8639987439676795187L;

	/**
	 * 修改类型，ENABLE/DISABLE
	 */
	@ApiField("action")
	private String action;

	/**
	 * 商品所有者
	 */
	@ApiField("external_owner_id")
	private String externalOwnerId;

	/**
	 * 商品/应用标识
	 */
	@ApiField("out_product_id")
	private String outProductId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

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
