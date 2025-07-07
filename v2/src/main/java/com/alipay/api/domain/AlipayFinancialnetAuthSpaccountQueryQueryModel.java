package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构专户查询
 *
 * @author auto create
 * @since 1.0, 2024-06-17 11:02:25
 */
public class AlipayFinancialnetAuthSpaccountQueryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3277387372827273933L;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
