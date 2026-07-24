package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账结算业务扩展参数
 *
 * @author auto create
 * @since 1.0, 2026-07-10 17:47:54
 */
public class SettleExtParam extends AlipayObject {

	private static final long serialVersionUID = 2516573326528798694L;

	/**
	 * 本笔交易的分账操作是否已完结，可传入的值：true/false。 如果指定完结分账，则本次分账处理完成后会把该笔交易的剩余冻结金额全额解冻；
	 */
	@ApiField("royalty_finish")
	private Boolean royaltyFinish;

	/**
	 * 部分分账完结的金额，单位为元。若该参数不为空，则会按照该参数金额进行部分解冻。注：该参数不为空时，royalty_finish需要传入true
	 */
	@ApiField("royalty_finish_amount")
	private String royaltyFinishAmount;

	public Boolean getRoyaltyFinish() {
		return this.royaltyFinish;
	}
	public void setRoyaltyFinish(Boolean royaltyFinish) {
		this.royaltyFinish = royaltyFinish;
	}

	public String getRoyaltyFinishAmount() {
		return this.royaltyFinishAmount;
	}
	public void setRoyaltyFinishAmount(String royaltyFinishAmount) {
		this.royaltyFinishAmount = royaltyFinishAmount;
	}

}
