package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款到卡扩展参数business_params
 *
 * @author auto create
 * @since 1.0, 2024-03-12 16:42:50
 */
public class RepaymentBusinessParams extends AlipayObject {

	private static final long serialVersionUID = 6343615138888427437L;

	/**
	 * 转账到银行卡的预期到账时间，T0 表示预期 T+0 到账，T1 表示预期 T+1 到账，到账时效受银行机构处理影响，支付宝无法保证一定是 T0 或者 T1 到账
	 */
	@ApiField("withdraw_timeliness")
	private String withdrawTimeliness;

	public String getWithdrawTimeliness() {
		return this.withdrawTimeliness;
	}
	public void setWithdrawTimeliness(String withdrawTimeliness) {
		this.withdrawTimeliness = withdrawTimeliness;
	}

}
