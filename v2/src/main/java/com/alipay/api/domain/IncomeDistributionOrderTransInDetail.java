package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收益分配订单分入方详情
 *
 * @author auto create
 * @since 1.0, 2023-06-28 20:54:53
 */
public class IncomeDistributionOrderTransInDetail extends AlipayObject {

	private static final long serialVersionUID = 2117422439651211642L;

	/**
	 * 收款金额,单元元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 收款方账号
	 */
	@ApiField("trans_in_account_no")
	private String transInAccountNo;

	/**
	 * 收款方账户类型
01-数币子钱包
03-外部银行账户
04-标准数币钱包
	 */
	@ApiField("trans_in_account_type")
	private String transInAccountType;

	/**
	 * 收款方名称
	 */
	@ApiField("trans_in_name")
	private String transInName;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTransInAccountNo() {
		return this.transInAccountNo;
	}
	public void setTransInAccountNo(String transInAccountNo) {
		this.transInAccountNo = transInAccountNo;
	}

	public String getTransInAccountType() {
		return this.transInAccountType;
	}
	public void setTransInAccountType(String transInAccountType) {
		this.transInAccountType = transInAccountType;
	}

	public String getTransInName() {
		return this.transInName;
	}
	public void setTransInName(String transInName) {
		this.transInName = transInName;
	}

}
