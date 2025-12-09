package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商一体化作业代运营授权产品信息
 *
 * @author auto create
 * @since 1.0, 2025-10-22 20:46:55
 */
public class InteopOpAuthProductInfo extends AlipayObject {

	private static final long serialVersionUID = 7799511245356772399L;

	/**
	 * 产品对应权限集code
	 */
	@ApiListField("permission_codes")
	@ApiField("string")
	private List<String> permissionCodes;

	/**
	 * 商家券
	 */
	@ApiField("product_code")
	private String productCode;

	public List<String> getPermissionCodes() {
		return this.permissionCodes;
	}
	public void setPermissionCodes(List<String> permissionCodes) {
		this.permissionCodes = permissionCodes;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
