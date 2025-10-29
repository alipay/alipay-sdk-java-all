package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.rcv.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:38
 */
public class AlipayDigitalmgmtRcvCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3143295184723914152L;

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
