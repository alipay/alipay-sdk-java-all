package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认结算接口扩展字段模型
 *
 * @author auto create
 * @since 1.0, 2024-11-22 11:04:34
 */
public class SettleConfirmExtendParams extends AlipayObject {

	private static final long serialVersionUID = 6698131828886319199L;

	/**
	 * 是否进行资金冻结，用于后续分账，true表示冻结，false或不传表示不冻结
	 */
	@ApiField("royalty_freeze")
	private String royaltyFreeze;

	public String getRoyaltyFreeze() {
		return this.royaltyFreeze;
	}
	public void setRoyaltyFreeze(String royaltyFreeze) {
		this.royaltyFreeze = royaltyFreeze;
	}

}
