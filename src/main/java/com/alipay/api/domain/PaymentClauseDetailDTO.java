package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付条款明细模型
 *
 * @author auto create
 * @since 1.0, 2022-05-06 16:15:13
 */
public class PaymentClauseDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 5891943922836597193L;

	/**
	 * 支付条目金额，单位元，人民币
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付条目备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 资金转入资产主体
	 */
	@ApiField("trans_in_principal")
	private WitnessPrincipalDTO transInPrincipal;

	/**
	 * 资金转出资产主体
	 */
	@ApiField("trans_out_principal")
	private WitnessPrincipalDTO transOutPrincipal;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public WitnessPrincipalDTO getTransInPrincipal() {
		return this.transInPrincipal;
	}
	public void setTransInPrincipal(WitnessPrincipalDTO transInPrincipal) {
		this.transInPrincipal = transInPrincipal;
	}

	public WitnessPrincipalDTO getTransOutPrincipal() {
		return this.transOutPrincipal;
	}
	public void setTransOutPrincipal(WitnessPrincipalDTO transOutPrincipal) {
		this.transOutPrincipal = transOutPrincipal;
	}

}
