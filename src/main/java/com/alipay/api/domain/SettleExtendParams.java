package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账结算扩展参数
 *
 * @author auto create
 * @since 1.0, 2021-04-23 09:17:43
 */
public class SettleExtendParams extends AlipayObject {

	private static final long serialVersionUID = 6757865159143271741L;

	/**
	 * 本笔交易的分账操作是否已完结，可传入的值：true/false。
如果指定完结分账，则本次分账处理完成后会把该笔交易的剩余冻结金额全额解冻；
	 */
	@ApiField("royalty_finish")
	private String royaltyFinish;

	public String getRoyaltyFinish() {
		return this.royaltyFinish;
	}
	public void setRoyaltyFinish(String royaltyFinish) {
		this.royaltyFinish = royaltyFinish;
	}

}
