package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserLabels;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.edas.memory.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-05 15:02:43
 */
public class AlipayCommerceEdasMemoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6842711272199277181L;

	/** 
	 * null
	 */
	@ApiListField("user_labels")
	@ApiField("user_labels")
	private List<UserLabels> userLabels;

	public void setUserLabels(List<UserLabels> userLabels) {
		this.userLabels = userLabels;
	}
	public List<UserLabels> getUserLabels( ) {
		return this.userLabels;
	}

}
