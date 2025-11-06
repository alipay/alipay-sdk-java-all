package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务特征查询数据产品
 *
 * @author auto create
 * @since 1.0, 2025-11-04 11:02:41
 */
public class ZhimaCreditEpBusinessIndicatorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1123956435788493542L;

	/**
	 * 授权编号
	 */
	@ApiField("auth_id")
	private String authId;

	/**
	 * 业务关键词
	 */
	@ApiField("business_key")
	private String businessKey;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAuthId() {
		return this.authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getBusinessKey() {
		return this.businessKey;
	}
	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
