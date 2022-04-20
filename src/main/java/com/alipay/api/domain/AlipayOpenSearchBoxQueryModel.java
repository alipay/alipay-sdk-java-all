package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索直达详情查询
 *
 * @author auto create
 * @since 1.0, 2022-04-19 19:29:03
 */
public class AlipayOpenSearchBoxQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2462716282263715776L;

	/**
	 * 搜索直达配置id
	 */
	@ApiField("box_id")
	private String boxId;

	/**
	 * 商户id，代运营模式下传入
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
