package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 亲情卡额度模型
 *
 * @author auto create
 * @since 1.0, 2023-05-04 21:15:09
 */
public class FamilyPayQuotaInfo extends AlipayObject {

	private static final long serialVersionUID = 7814796711226257918L;

	/**
	 * 额度周期：
PER_DAY(单日)、PER_TRANSACTION(单笔)、PER_MONTH(单月）
	 */
	@ApiField("period")
	private String period;

	/**
	 * 额度值，单位元
	 */
	@ApiField("quota")
	private String quota;

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getQuota() {
		return this.quota;
	}
	public void setQuota(String quota) {
		this.quota = quota;
	}

}
