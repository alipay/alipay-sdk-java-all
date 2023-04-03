package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.camp.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 13:15:58
 */
public class AlipayOpenLotteryCampCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7582827679741483593L;

	/** 
	 * 返回新建的活动ID
	 */
	@ApiField("camp_id")
	private String campId;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

}
