package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品治理结果
 *
 * @author auto create
 * @since 1.0, 2025-04-02 11:00:54
 */
public class GovernGoodsCheckMessage extends AlipayObject {

	private static final long serialVersionUID = 2256988155255561978L;

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

	/**
	 * 治理的类型，即哪个地方需要治理
	 */
	@ApiField("type")
	private String type;

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
