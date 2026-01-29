package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.trafficshare.crowd.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-14 16:32:42
 */
public class AlipayCommerceTransportTrafficshareCrowdSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8736614452119614668L;

	/** 
	 * null
	 */
	@ApiListField("phone_number_list")
	@ApiField("string")
	private List<String> phoneNumberList;

	public void setPhoneNumberList(List<String> phoneNumberList) {
		this.phoneNumberList = phoneNumberList;
	}
	public List<String> getPhoneNumberList( ) {
		return this.phoneNumberList;
	}

}
