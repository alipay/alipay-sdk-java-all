package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拓展字段
 *
 * @author auto create
 * @since 1.0, 2020-06-16 16:43:35
 */
public class BillSendExtInfo extends AlipayObject {

	private static final long serialVersionUID = 7821984934461834882L;

	/**
	 * 分账金额
	 */
	@ApiField("royalty_amount")
	private String royaltyAmount;

	/**
	 * 2088xxx
	 */
	@ApiField("trans_in_pid")
	private String transInPid;

	public String getRoyaltyAmount() {
		return this.royaltyAmount;
	}
	public void setRoyaltyAmount(String royaltyAmount) {
		this.royaltyAmount = royaltyAmount;
	}

	public String getTransInPid() {
		return this.transInPid;
	}
	public void setTransInPid(String transInPid) {
		this.transInPid = transInPid;
	}

}
