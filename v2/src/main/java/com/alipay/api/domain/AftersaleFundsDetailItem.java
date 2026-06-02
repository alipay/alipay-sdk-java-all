package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 售后资金明细项
 *
 * @author auto create
 * @since 1.0, 2026-04-17 19:14:34
 */
public class AftersaleFundsDetailItem extends AlipayObject {

	private static final long serialVersionUID = 7378519228995278458L;

	/**
	 * 当前售后单上退款资金中的资产项
	 */
	@ApiField("asset_code")
	private String assetCode;

	/**
	 * 当前售后单中退款资金中某一资产项的名称
	 */
	@ApiField("asset_name")
	private String assetName;

	/**
	 * 当前售后单中退款资金中某一资产项的具体值，金额单位为元
	 */
	@ApiField("asset_value")
	private String assetValue;

	public String getAssetCode() {
		return this.assetCode;
	}
	public void setAssetCode(String assetCode) {
		this.assetCode = assetCode;
	}

	public String getAssetName() {
		return this.assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetValue() {
		return this.assetValue;
	}
	public void setAssetValue(String assetValue) {
		this.assetValue = assetValue;
	}

}
