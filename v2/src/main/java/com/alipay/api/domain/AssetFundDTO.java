package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益资金模型，包含权益id和权益数量
 *
 * @author auto create
 * @since 1.0, 2024-10-09 15:57:05
 */
public class AssetFundDTO extends AlipayObject {

	private static final long serialVersionUID = 7558367653664866536L;

	/**
	 * 资产数额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

}
