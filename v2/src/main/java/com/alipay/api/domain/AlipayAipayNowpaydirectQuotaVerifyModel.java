package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直连模式核销次数或积分
 *
 * @author auto create
 * @since 1.0, 2026-09-29 11:17:55
 */
public class AlipayAipayNowpaydirectQuotaVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 3383941586668879839L;

	/**
	 * 核销数量
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 核销说明
	 */
	@ApiField("consume_reason")
	private String consumeReason;

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
	 * 核销幂等请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getConsumeReason() {
		return this.consumeReason;
	}
	public void setConsumeReason(String consumeReason) {
		this.consumeReason = consumeReason;
	}

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
