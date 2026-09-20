package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * TOP3 通行费分布
 *
 * @author auto create
 * @since 1.0, 2026-08-19 11:51:43
 */
public class EtcTollFeeTopThreeDTO extends AlipayObject {

	private static final long serialVersionUID = 2256885757764115699L;

	/**
	 * 通行费金额(元）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 占比（小数）
	 */
	@ApiField("ratio")
	private String ratio;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getRatio() {
		return this.ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

}
