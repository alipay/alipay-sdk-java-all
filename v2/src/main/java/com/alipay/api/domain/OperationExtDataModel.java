package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营扩展数据模型
 *
 * @author auto create
 * @since 1.0, 2019-01-29 17:05:28
 */
public class OperationExtDataModel extends AlipayObject {

	private static final long serialVersionUID = 4739551398231841893L;

	/**
	 * 奖品金额,单位分
	 */
	@ApiField("prize_amount")
	private String prizeAmount;

	/**
	 * 奖品 id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 营销错误码
	 */
	@ApiField("promo_error_code")
	private String promoErrorCode;

	public String getPrizeAmount() {
		return this.prizeAmount;
	}
	public void setPrizeAmount(String prizeAmount) {
		this.prizeAmount = prizeAmount;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPromoErrorCode() {
		return this.promoErrorCode;
	}
	public void setPromoErrorCode(String promoErrorCode) {
		this.promoErrorCode = promoErrorCode;
	}

}
