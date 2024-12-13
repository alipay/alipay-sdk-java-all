package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据rcv编号查询采购rcv详情
 *
 * @author auto create
 * @since 1.0, 2023-09-15 09:58:53
 */
public class AlipayDigitalmgmtRcvQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5216316329788372412L;

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
