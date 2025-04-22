package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行流水认领
 *
 * @author auto create
 * @since 1.0, 2021-12-10 11:50:18
 */
public class AlipayBossFncGfcenterBanklogtransferCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4465856215472226675L;

	/**
	 * 银行流水转账form
	 */
	@ApiField("bank_log_transfer_form_new")
	private BankLogTransferFormNew bankLogTransferFormNew;

	public BankLogTransferFormNew getBankLogTransferFormNew() {
		return this.bankLogTransferFormNew;
	}
	public void setBankLogTransferFormNew(BankLogTransferFormNew bankLogTransferFormNew) {
		this.bankLogTransferFormNew = bankLogTransferFormNew;
	}

}
