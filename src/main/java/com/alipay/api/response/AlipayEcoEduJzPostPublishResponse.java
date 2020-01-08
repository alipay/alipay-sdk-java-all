package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.jz.post.publish response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoEduJzPostPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 7445514319976539951L;

	/** 
	 * 职位编号
	 */
	@ApiField("third_id")
	private String thirdId;

	public void setThirdId(String thirdId) {
		this.thirdId = thirdId;
	}
	public String getThirdId( ) {
		return this.thirdId;
	}

}
