package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销签到活动奖品。
 *
 * @author auto create
 * @since 1.0, 2020-05-06 17:50:08
 */
public class PrizeOrderVO extends AlipayObject {

	private static final long serialVersionUID = 8321851429918454325L;

	/**
	 * 发奖系数。
	 */
	@ApiField("modulus")
	private Long modulus;

	/**
	 * 返奖奖品ID。
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品名称。
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 发奖单据ID
	 */
	@ApiField("prize_order_id")
	private String prizeOrderId;

	/**
	 * 返奖奖品类型。
	 */
	@ApiField("prize_type")
	private String prizeType;

	public Long getModulus() {
		return this.modulus;
	}
	public void setModulus(Long modulus) {
		this.modulus = modulus;
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

	public String getPrizeOrderId() {
		return this.prizeOrderId;
	}
	public void setPrizeOrderId(String prizeOrderId) {
		this.prizeOrderId = prizeOrderId;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

}
