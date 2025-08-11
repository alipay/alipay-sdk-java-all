package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜素直达活动下架
 *
 * @author auto create
 * @since 1.0, 2023-06-12 16:48:20
 */
public class AlipayOpenSearchBoxactivityOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 4417391988896842598L;

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
