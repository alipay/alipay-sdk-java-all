package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.sdarttool.print.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:34
 */
public class AlipayCommerceIotSdarttoolPrintSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2288395989539338298L;

	/** 
	 * 打印任务编号
	 */
	@ApiField("print_no")
	private String printNo;

	public void setPrintNo(String printNo) {
		this.printNo = printNo;
	}
	public String getPrintNo( ) {
		return this.printNo;
	}

}
