package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直接核销次数或积分
 *
 * @author auto create
 * @since 1.0, 2026-09-02 00:47:51
 */
public class AlipayAipayNowpayQuotaVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 2811683814429939918L;

	/**
	 * COUNT 默认 1；POINT 为正整数，，单位次数或积分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 本次业务消耗额度的原因，仅用于留痕和审计；普通文本，最长 256 字符
	 */
	@ApiField("consume_reason")
	private String consumeReason;

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
