package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑二级分佣配置信息
 *
 * @author auto create
 * @since 1.0, 2017-02-08 10:55:02
 */
public class KbadvertKoubeiCMInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 6233559546387863531L;

	/**
	 * 口碑平台任务二级分佣后的广告ID
	 */
	@ApiField("koubei_adv_id")
	private String koubeiAdvId;

	/**
	 * 封顶金额
	 */
	@ApiField("max")
	private String max;

	/**
	 * 固定分佣金额
	 */
	@ApiField("quota_amount")
	private String quotaAmount;

	/**
	 * 分佣比例(100以内精度2位的非负小数)
例如30.04%，则输入  30.04
分佣比例存在浮动的下限，可通过业务文档获取实际值
	 */
	@ApiField("rate")
	private String rate;

	public String getKoubeiAdvId() {
		return this.koubeiAdvId;
	}
	public void setKoubeiAdvId(String koubeiAdvId) {
		this.koubeiAdvId = koubeiAdvId;
	}

	public String getMax() {
		return this.max;
	}
	public void setMax(String max) {
		this.max = max;
	}

	public String getQuotaAmount() {
		return this.quotaAmount;
	}
	public void setQuotaAmount(String quotaAmount) {
		this.quotaAmount = quotaAmount;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

}
