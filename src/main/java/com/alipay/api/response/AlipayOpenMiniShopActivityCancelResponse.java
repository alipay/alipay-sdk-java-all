package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.shop.activity.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2018-10-25 16:02:37
 */
public class AlipayOpenMiniShopActivityCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5598351818623331781L;

	/** 
	 * 返回传入的业务处理流水号
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
