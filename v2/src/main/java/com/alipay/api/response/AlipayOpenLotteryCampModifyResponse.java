package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.camp.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:06:09
 */
public class AlipayOpenLotteryCampModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6246434396796736954L;

	/** 
	 * 抽奖活动ID
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
