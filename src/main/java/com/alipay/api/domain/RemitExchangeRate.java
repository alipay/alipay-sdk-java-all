package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇款汇率
 *
 * @author auto create
 * @since 1.0, 2017-06-14 05:38:08
 */
public class RemitExchangeRate extends AlipayObject {

	private static final long serialVersionUID = 6694858822935754212L;

	/**
	 * base_currency, 基准货币
	 */
	@ApiField("base_currency")
	private String baseCurrency;

	/**
	 * id, 汇款汇率的唯一标示。在锁汇场景中需要使用
	 */
	@ApiField("id")
	private String id;

	/**
	 * rate, 外币汇率。采用baseCurrency/targetCurrency进行计算
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * startTime, 汇率有效的开始时间,在锁汇场景下需要
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * target_currency, 目标货币
	 */
	@ApiField("target_currency")
	private String targetCurrency;

	public String getBaseCurrency() {
		return this.baseCurrency;
	}
	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTargetCurrency() {
		return this.targetCurrency;
	}
	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

}
