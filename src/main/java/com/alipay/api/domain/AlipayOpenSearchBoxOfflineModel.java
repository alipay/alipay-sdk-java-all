package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索直达下架
 *
 * @author auto create
 * @since 1.0, 2022-08-09 11:08:05
 */
public class AlipayOpenSearchBoxOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 8677464671243888286L;

	/**
	 * 搜索直达配置id
	 */
	@ApiField("box_id")
	private String boxId;

	/**
	 * 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家"运营支付宝小程序"授权。
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public String getBoxId() {
		return this.boxId;
	}
	public void setBoxId(String boxId) {
		this.boxId = boxId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
