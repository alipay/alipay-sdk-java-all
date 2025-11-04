package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账结算扩展参数
 *
 * @author auto create
 * @since 1.0, 2025-02-28 14:36:20
 */
public class SettleExtendParams extends AlipayObject {

	private static final long serialVersionUID = 8397537746254391529L;

	/**
	 * 本笔交易的分账操作是否已完结，可传入的值：true/false。
如果指定完结分账，则本次分账处理完成后会把该笔交易的剩余冻结金额全额解冻；
	 */
	@ApiField("royalty_finish")
	private String royaltyFinish;

	/**
	 * 部分分账完结的金额，单位为元。若该参数不为空，则会按照该参数金额进行部分解冻。注：该参数不为空时，royalty_finish需要传入true
	 */
	@ApiField("royalty_finish_amount")
	private String royaltyFinishAmount;

	public String getRoyaltyFinish() {
		return this.royaltyFinish;
	}
	public void setRoyaltyFinish(String royaltyFinish) {
		this.royaltyFinish = royaltyFinish;
	}

	public String getRoyaltyFinishAmount() {
		return this.royaltyFinishAmount;
	}
	public void setRoyaltyFinishAmount(String royaltyFinishAmount) {
		this.royaltyFinishAmount = royaltyFinishAmount;
	}

}
