package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.label.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 16:31:39
 */
public class AlipayOpenPublicLabelUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7183818251595497339L;

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
