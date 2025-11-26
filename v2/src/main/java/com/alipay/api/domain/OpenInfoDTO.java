package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兑换情况DTO
 *
 * @author auto create
 * @since 1.0, 2025-07-10 13:57:47
 */
public class OpenInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6379154687199749567L;

	/**
	 * 会员卡流水ID
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 券码有效期，时间戳
	 */
	@ApiField("expiration_date")
	private Long expirationDate;

	/**
	 * 1-已开通   2-未开通
	 */
	@ApiField("open_status")
	private Long openStatus;

	/**
	 * 开通时间
	 */
	@ApiField("open_time")
	private Long openTime;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Long getExpirationDate() {
		return this.expirationDate;
	}
	public void setExpirationDate(Long expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Long getOpenStatus() {
		return this.openStatus;
	}
	public void setOpenStatus(Long openStatus) {
		this.openStatus = openStatus;
	}

	public Long getOpenTime() {
		return this.openTime;
	}
	public void setOpenTime(Long openTime) {
		this.openTime = openTime;
	}

}
