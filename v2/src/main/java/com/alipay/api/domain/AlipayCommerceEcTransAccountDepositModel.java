package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金专户充值
 *
 * @author auto create
 * @since 1.0, 2023-09-28 10:01:33
 */
public class AlipayCommerceEcTransAccountDepositModel extends AlipayObject {

	private static final long serialVersionUID = 5563845613779425767L;

	/**
	 * 资金专户账号ID
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 充值订单总金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 商户端的唯一订单号，对于同一笔充值请求，商户需保证该订单号唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务备注
	 */
	@ApiField("remark")
	private String remark;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
