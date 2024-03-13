package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约商户指定渠道参数
 *
 * @author auto create
 * @since 1.0, 2023-07-12 16:06:18
 */
public class SpecifiedChannelParam extends AlipayObject {

	private static final long serialVersionUID = 8158986522176169999L;

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
	 * 银行卡类型，只有在资产类型为BANKCARD时才有效。如果为空，则标识不限制卡类型。卡类型在有值时，仅支持 两类传参：DD-贷记卡（储蓄卡），CC-信用卡。
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
