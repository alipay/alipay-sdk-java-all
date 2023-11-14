package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财账单受理接口
 *
 * @author auto create
 * @since 1.0, 2022-11-08 14:40:09
 */
public class AlipayBossFncGfacceptanceBillAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 3322457912957829341L;

	/**
	 * 业财账单受理模型
	 */
	@ApiField("bill_acceptance")
	private GFAOpenAPIBillAcceptance billAcceptance;

	/**
	 * 16位。支付宝UID或者2088000000000XX0，倒数2、3位数字用来决策LDC ZoneUid和分库位
	 */
	@ApiField("principal_id")
	private String principalId;

	public GFAOpenAPIBillAcceptance getBillAcceptance() {
		return this.billAcceptance;
	}
	public void setBillAcceptance(GFAOpenAPIBillAcceptance billAcceptance) {
		this.billAcceptance = billAcceptance;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

}
