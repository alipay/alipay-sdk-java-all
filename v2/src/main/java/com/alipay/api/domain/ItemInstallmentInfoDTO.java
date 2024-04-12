package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品分期信息
 *
 * @author auto create
 * @since 1.0, 2024-01-05 15:03:16
 */
public class ItemInstallmentInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7381471964185215952L;

	/**
	 * 分期商品每期金额不固定时，请填入该字段，分期时分期金额会与该字段进行比较，单位为元。
	 */
	@ApiField("period_max_price")
	private String periodMaxPrice;

	/**
	 * 分期商品对应的总分期数
	 */
	@ApiField("period_num")
	private Long periodNum;

	/**
	 * 分期商品每期金额固定时，请填入该字段，分期时分期金额会与该字段进行比较，单位为元
	 */
	@ApiField("period_price")
	private String periodPrice;

	public String getPeriodMaxPrice() {
		return this.periodMaxPrice;
	}
	public void setPeriodMaxPrice(String periodMaxPrice) {
		this.periodMaxPrice = periodMaxPrice;
	}

	public Long getPeriodNum() {
		return this.periodNum;
	}
	public void setPeriodNum(Long periodNum) {
		this.periodNum = periodNum;
	}

	public String getPeriodPrice() {
		return this.periodPrice;
	}
	public void setPeriodPrice(String periodPrice) {
		this.periodPrice = periodPrice;
	}

}
