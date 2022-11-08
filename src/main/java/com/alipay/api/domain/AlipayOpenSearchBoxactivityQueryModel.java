package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索直达活动详情
 *
 * @author auto create
 * @since 1.0, 2022-08-09 11:05:06
 */
public class AlipayOpenSearchBoxactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6438892987568578349L;

	/**
	 * 搜索直达活动id
	 */
	@ApiField("box_activity_id")
	private String boxActivityId;

	/**
	 * 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家"运营支付宝小程序"授权。
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public String getBoxActivityId() {
		return this.boxActivityId;
	}
	public void setBoxActivityId(String boxActivityId) {
		this.boxActivityId = boxActivityId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
