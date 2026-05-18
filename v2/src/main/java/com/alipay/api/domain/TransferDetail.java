package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-14 10:17:45
 */
public class TransferDetail extends AlipayObject {

	private static final long serialVersionUID = 8553432571556498527L;

	/**
	 * 转出金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 转账备注，不可使用特殊字符，如 /，=，& ，<，>等
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 请求方订单号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 收款方机构号
	 */
	@ApiField("payee_inst_id")
	private String payeeInstId;

	/**
	 * 收款方姓名
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 收款方钱包id
	 */
	@ApiField("payee_wallet_id")
	private String payeeWalletId;

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

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPayeeInstId() {
		return this.payeeInstId;
	}
	public void setPayeeInstId(String payeeInstId) {
		this.payeeInstId = payeeInstId;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeWalletId() {
		return this.payeeWalletId;
	}
	public void setPayeeWalletId(String payeeWalletId) {
		this.payeeWalletId = payeeWalletId;
	}

}
