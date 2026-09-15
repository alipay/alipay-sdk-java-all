package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询核销结果
 *
 * @author auto create
 * @since 1.0, 2026-09-02 00:47:52
 */
public class AlipayAipayNowpayQuotaRefreshModel extends AlipayObject {

	private static final long serialVersionUID = 3345658287762143858L;

	/**
	 * 权益受益人
	 */
	@ApiField("external_buyer_id")
	private String externalBuyerId;

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

	/**
	 * 核销幂等号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getExternalBuyerId() {
		return this.externalBuyerId;
	}
	public void setExternalBuyerId(String externalBuyerId) {
		this.externalBuyerId = externalBuyerId;
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

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
