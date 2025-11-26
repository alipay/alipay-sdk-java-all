package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财受理同步撤销接口
 *
 * @author auto create
 * @since 1.0, 2022-12-22 14:35:56
 */
public class AlipayBossFncGfacceptanceSyncbillCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1595977277684666827L;

	/**
	 * 业财账单受理模型
	 */
	@ApiField("bill_acceptance")
	private GFAOpenAPIReverseBillAcceptance billAcceptance;

	/**
	 * 16位。支付宝UID或者2088000000000XX0，倒数2、3位数字用来决策LDC ZoneUid和分库位
	 */
	@ApiField("principal_id")
	private String principalId;

	public GFAOpenAPIReverseBillAcceptance getBillAcceptance() {
		return this.billAcceptance;
	}
	public void setBillAcceptance(GFAOpenAPIReverseBillAcceptance billAcceptance) {
		this.billAcceptance = billAcceptance;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

}
