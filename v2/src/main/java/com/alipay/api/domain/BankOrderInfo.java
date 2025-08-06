package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行转账信息
 *
 * @author auto create
 * @since 1.0, 2023-09-20 11:04:51
 */
public class BankOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 4749832989285873736L;

	/**
	 * 银行的转账流水号，来账通知时平台基于该字段进行交易匹配
	 */
	@ApiField("bank_serial_no")
	private String bankSerialNo;

	/**
	 * 资方内部转账流水号
	 */
	@ApiField("capital_serial_no")
	private String capitalSerialNo;

	public String getBankSerialNo() {
		return this.bankSerialNo;
	}
	public void setBankSerialNo(String bankSerialNo) {
		this.bankSerialNo = bankSerialNo;
	}

	public String getCapitalSerialNo() {
		return this.capitalSerialNo;
	}
	public void setCapitalSerialNo(String capitalSerialNo) {
		this.capitalSerialNo = capitalSerialNo;
	}

}
