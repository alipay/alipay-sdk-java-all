package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.label.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:49:01
 */
public class AlipayOpenPublicLifeLabelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5163719997788327726L;

	/** 
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}
	public String getLabelId( ) {
		return this.labelId;
	}

}
