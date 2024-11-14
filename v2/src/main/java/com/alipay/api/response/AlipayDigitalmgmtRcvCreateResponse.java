package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.rcv.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-29 12:09:26
 */
public class AlipayDigitalmgmtRcvCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8725742752448116763L;

	/** 
	 * rcv编码列表
	 */
	@ApiListField("rcv_number_list")
	@ApiField("string")
	private List<String> rcvNumberList;

	public void setRcvNumberList(List<String> rcvNumberList) {
		this.rcvNumberList = rcvNumberList;
	}
	public List<String> getRcvNumberList( ) {
		return this.rcvNumberList;
	}

}
