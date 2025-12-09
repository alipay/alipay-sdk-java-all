package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费贷还款用户账户检查结果信息
 *
 * @author auto create
 * @since 1.0, 2024-08-06 11:22:26
 */
public class ConsumerLoanUserAccountCheckData extends AlipayObject {

	private static final long serialVersionUID = 7565483774336118581L;

	/**
	 * 消费贷还款用户账户检查返回结果，若没有账单，或用户没有注册等无法查询到对应用户相关信息的情况下可不填写，但若出现手机号/身份证/姓名不匹配则应填写其中不匹配的内容
	 */
	@ApiField("not_match_data")
	private ConsumerLoanNotMatchData notMatchData;

	public ConsumerLoanNotMatchData getNotMatchData() {
		return this.notMatchData;
	}
	public void setNotMatchData(ConsumerLoanNotMatchData notMatchData) {
		this.notMatchData = notMatchData;
	}

}
