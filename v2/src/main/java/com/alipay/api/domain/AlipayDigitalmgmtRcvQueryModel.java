package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据rcv编号查询采购rcv详情
 *
 * @author auto create
 * @since 1.0, 2025-08-07 19:09:31
 */
public class AlipayDigitalmgmtRcvQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4888384224336622438L;

	/**
	 * rcv编号
	 */
	@ApiField("rcv_number")
	private String rcvNumber;

	public String getRcvNumber() {
		return this.rcvNumber;
	}
	public void setRcvNumber(String rcvNumber) {
		this.rcvNumber = rcvNumber;
	}

}
