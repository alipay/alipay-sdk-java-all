package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构专户账户信息查询服务
 *
 * @author auto create
 * @since 1.0, 2018-09-04 14:59:40
 */
public class AlipayFinancialnetAuthSpaccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5589657894932945942L;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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
