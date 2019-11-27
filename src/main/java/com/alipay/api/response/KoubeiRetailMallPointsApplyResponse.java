package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.mall.points.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailMallPointsApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3897471474599835196L;

	/** 
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getMallId( ) {
		return this.mallId;
	}

}
