package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.wufu.hdaipicture.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 22:16:40
 */
public class AlipayFundCouponWufuHdaipictureCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5786889179769751891L;

	/** 
	 * 高清图ID
	 */
	@ApiField("hd_image_id")
	private String hdImageId;

	public void setHdImageId(String hdImageId) {
		this.hdImageId = hdImageId;
	}
	public String getHdImageId( ) {
		return this.hdImageId;
	}

}
