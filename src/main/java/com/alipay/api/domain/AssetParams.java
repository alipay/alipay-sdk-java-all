package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产信息
 *
 * @author auto create
 * @since 1.0, 2017-07-11 14:32:14
 */
public class AssetParams extends AlipayObject {

	private static final long serialVersionUID = 4494288762225488877L;

	/**
	 * 资产类型：
1. BANK（银行卡）
2. ACCOUNT（账号模式）
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 银行卡号。
assetType为BANK时，必填。
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 机构ID。
assetType为BANK时，必填。
	 */
	@ApiField("inst_id")
	private String instId;

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
