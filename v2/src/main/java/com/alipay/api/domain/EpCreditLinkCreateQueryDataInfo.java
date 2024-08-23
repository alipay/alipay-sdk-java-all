package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据查询任务返回的数据内容
 *
 * @author auto create
 * @since 1.0, 2023-03-17 12:49:34
 */
public class EpCreditLinkCreateQueryDataInfo extends AlipayObject {

	private static final long serialVersionUID = 8265533413867727742L;

	/**
	 * 信用等级结果
	 */
	@ApiField("cr_result")
	private CreditRateResult crResult;

	public CreditRateResult getCrResult() {
		return this.crResult;
	}
	public void setCrResult(CreditRateResult crResult) {
		this.crResult = crResult;
	}

}
