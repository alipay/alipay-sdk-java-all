package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零工钱包开通结果模型
 *
 * @author auto create
 * @since 1.0, 2023-09-07 18:00:41
 */
public class EmployeeCardWalletInfoResDTO extends AlipayObject {

	private static final long serialVersionUID = 8532178526461679929L;

	/**
	 * 资产类型名称
	 */
	@ApiField("asset_type_name")
	private String assetTypeName;

	/**
	 * 脱敏资产编码
	 */
	@ApiField("desensitize_card_no")
	private String desensitizeCardNo;

	public String getAssetTypeName() {
		return this.assetTypeName;
	}
	public void setAssetTypeName(String assetTypeName) {
		this.assetTypeName = assetTypeName;
	}

	public String getDesensitizeCardNo() {
		return this.desensitizeCardNo;
	}
	public void setDesensitizeCardNo(String desensitizeCardNo) {
		this.desensitizeCardNo = desensitizeCardNo;
	}

}
