package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿里信用分接口的结果
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class AliCreditScoreResult extends AlipayObject {

	private static final long serialVersionUID = 5873225188471643874L;

	/**
	 * 信用支付额度是否大于等于50
	 */
	@ApiField("is_credit_pay_enabled")
	private Boolean isCreditPayEnabled;

	public Boolean getIsCreditPayEnabled() {
		return this.isCreditPayEnabled;
	}
	public void setIsCreditPayEnabled(Boolean isCreditPayEnabled) {
		this.isCreditPayEnabled = isCreditPayEnabled;
	}

}
