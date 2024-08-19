package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 制卡单明细
 *
 * @author auto create
 * @since 1.0, 2024-05-28 17:47:05
 */
public class FundCardGenerateOrder extends AlipayObject {

	private static final long serialVersionUID = 4742716827651512537L;

	/**
	 * 卡面额，单位：元
	 */
	@ApiField("denomination")
	private Long denomination;

	/**
	 * 过期日期(在此日期之后即过期，为null时则无过期日期)
	 */
	@ApiField("expiration_date")
	private String expirationDate;

	/**
	 * 卡数量
	 */
	@ApiField("quantity")
	private Long quantity;

	public Long getDenomination() {
		return this.denomination;
	}
	public void setDenomination(Long denomination) {
		this.denomination = denomination;
	}

	public String getExpirationDate() {
		return this.expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
