package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.label.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-23 14:44:07
 */
public class AlipayOpenPublicLabelUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5771966598114522794L;

	/** 
	 * 用户标签id列表，以英文逗号分隔
	 */
	@ApiField("label_ids")
	private String labelIds;

	public void setLabelIds(String labelIds) {
		this.labelIds = labelIds;
	}
	public String getLabelIds( ) {
		return this.labelIds;
	}

}
