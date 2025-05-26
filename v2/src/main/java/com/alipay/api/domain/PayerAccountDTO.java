package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转入时付款方所指定的资产信息
 *
 * @author auto create
 * @since 1.0, 2022-12-07 10:01:23
 */
public class PayerAccountDTO extends AlipayObject {

	private static final long serialVersionUID = 7364681455377117347L;

	/**
	 * 资产展示名
	 */
	@ApiField("asset_display_name")
	private String assetDisplayName;

	/**
	 * 资产类型<br>
- DEFAULT_BALANCE：余额<br>
- YUEBAO：余额宝<br>
- BANK_CARD：银行卡<br>
- POLLING_PAY：按支付宝APP内设定的支付方式优先级轮训扣款
	 */
	@ApiField("asset_type")
	private String assetType;

	public String getAssetDisplayName() {
		return this.assetDisplayName;
	}
	public void setAssetDisplayName(String assetDisplayName) {
		this.assetDisplayName = assetDisplayName;
	}

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

}
