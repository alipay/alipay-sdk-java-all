package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品治理结果
 *
 * @author auto create
 * @since 1.0, 2024-11-28 17:32:31
 */
public class GovernGoodsCheckMessage extends AlipayObject {

	private static final long serialVersionUID = 2465596889772123894L;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 需要治理的地方
	 */
	@ApiField("need_grovern_point")
	private String needGrovernPoint;

	/**
	 * 治理结果
	 */
	@ApiField("result")
	private String result;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getNeedGrovernPoint() {
		return this.needGrovernPoint;
	}
	public void setNeedGrovernPoint(String needGrovernPoint) {
		this.needGrovernPoint = needGrovernPoint;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
