package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 彩种类型
 *
 * @author auto create
 * @since 1.0, 2017-07-24 14:38:00
 */
public class LotteryType extends AlipayObject {

	private static final long serialVersionUID = 7547215424187113532L;

	/**
	 * 彩种ID
	 */
	@ApiField("lottery_type_id")
	private Long lotteryTypeId;

	/**
	 * 彩种名称
	 */
	@ApiField("lottery_type_name")
	private String lotteryTypeName;

	public Long getLotteryTypeId() {
		return this.lotteryTypeId;
	}
	public void setLotteryTypeId(Long lotteryTypeId) {
		this.lotteryTypeId = lotteryTypeId;
	}

	public String getLotteryTypeName() {
		return this.lotteryTypeName;
	}
	public void setLotteryTypeName(String lotteryTypeName) {
		this.lotteryTypeName = lotteryTypeName;
	}

}
