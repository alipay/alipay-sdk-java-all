package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品简要信息
 *
 * @author auto create
 * @since 1.0, 2018-08-17 17:34:31
 */
public class PrizeLiteInfo extends AlipayObject {

	private static final long serialVersionUID = 7543427439183456447L;

	/**
	 * 外部奖品ID
	 */
	@ApiField("out_prize_id")
	private String outPrizeId;

	/**
	 * 奖品状态，可枚举，分别为“可用”(ENABLED)、“不可用”(DISABLED)、“不满足使用规则”(NOT_MATCH_USE_CONDITION)
	 */
	@ApiField("status")
	private String status;

	public String getOutPrizeId() {
		return this.outPrizeId;
	}
	public void setOutPrizeId(String outPrizeId) {
		this.outPrizeId = outPrizeId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
