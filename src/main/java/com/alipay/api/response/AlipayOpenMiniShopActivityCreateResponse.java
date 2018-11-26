package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.shop.activity.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-10-25 16:05:00
 */
public class AlipayOpenMiniShopActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4538115844619821241L;

	/** 
	 * 业务处理流水号，唯一，可以根据该流水号进行活动取消
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}
	public String getOutBizId( ) {
		return this.outBizId;
	}

}
