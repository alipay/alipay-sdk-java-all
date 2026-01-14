package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抽佣关系信息
 *
 * @author auto create
 * @since 1.0, 2025-12-01 20:27:25
 */
public class CommissionRelationDTO extends AlipayObject {

	private static final long serialVersionUID = 7479672251538273717L;

	/**
	 * 授权结果信息
	 */
	@ApiField("auth_result")
	private Boolean authResult;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_role_id")
	private String merchantRoleId;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public Boolean getAuthResult() {
		return this.authResult;
	}
	public void setAuthResult(Boolean authResult) {
		this.authResult = authResult;
	}

	public String getMerchantRoleId() {
		return this.merchantRoleId;
	}
	public void setMerchantRoleId(String merchantRoleId) {
		this.merchantRoleId = merchantRoleId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
