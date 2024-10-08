package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约商户指定渠道参数
 *
 * @author auto create
 * @since 1.0, 2024-09-26 18:30:40
 */
public class SpecifiedChannelParams extends AlipayObject {

	private static final long serialVersionUID = 3164453835937731751L;

	/**
	 * 指定渠道签约号
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产编码
	 */
	@ApiField("asset_type_code")
	private String assetTypeCode;

	/**
	 * 银行卡类型，只有在资产类型为BANKCA...
	 */
	@ApiField("bank_card_type")
	private String bankCardType;

	/**
	 * 机构编码
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 资产类型，用以标识资产大类。
	 */
	@ApiField("pay_tool_type")
	private String payToolType;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetTypeCode() {
		return this.assetTypeCode;
	}
	public void setAssetTypeCode(String assetTypeCode) {
		this.assetTypeCode = assetTypeCode;
	}

	public String getBankCardType() {
		return this.bankCardType;
	}
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getPayToolType() {
		return this.payToolType;
	}
	public void setPayToolType(String payToolType) {
		this.payToolType = payToolType;
	}

}
