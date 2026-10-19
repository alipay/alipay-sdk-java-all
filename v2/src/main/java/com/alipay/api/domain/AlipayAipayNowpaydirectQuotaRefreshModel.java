package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直连模式查询额度核销结果
 *
 * @author auto create
 * @since 1.0, 2026-09-25 14:47:53
 */
public class AlipayAipayNowpaydirectQuotaRefreshModel extends AlipayObject {

	private static final long serialVersionUID = 3423329683444852789L;

	/**
	 * 外部会员id
	 */
	@ApiField("external_buyer_id")
	private String externalBuyerId;

	/**
	 * 外部商品id
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/**
	 * 核销时传入的幂等请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getExternalBuyerId() {
		return this.externalBuyerId;
	}
	public void setExternalBuyerId(String externalBuyerId) {
		this.externalBuyerId = externalBuyerId;
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
