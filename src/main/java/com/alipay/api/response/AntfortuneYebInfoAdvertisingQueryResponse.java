package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.yeb.info.advertising.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-06 19:47:29
 */
public class AntfortuneYebInfoAdvertisingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5875131834284541688L;

	/** 
	 * advertising_type：广告投放类型。
目前值为00或01。
00:表示进行投放。
01:表示不进行投放。
	 */
	@ApiField("advertising_type")
	private String advertisingType;

	public void setAdvertisingType(String advertisingType) {
		this.advertisingType = advertisingType;
	}
	public String getAdvertisingType( ) {
		return this.advertisingType;
	}

}
