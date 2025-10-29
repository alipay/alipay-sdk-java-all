package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零工钱包信息
 *
 * @author auto create
 * @since 1.0, 2023-09-07 18:00:51
 */
public class EmployeeCardWalletInfo extends AlipayObject {

	private static final long serialVersionUID = 1587445757243625362L;

	/**
	 * 零工钱包资产类别名称
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
