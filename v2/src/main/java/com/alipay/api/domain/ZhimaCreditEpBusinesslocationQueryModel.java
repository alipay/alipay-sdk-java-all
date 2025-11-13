package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户位置查询专用版接口
 *
 * @author auto create
 * @since 1.0, 2025-06-27 14:17:09
 */
public class ZhimaCreditEpBusinesslocationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8217548688282852177L;

	/**
	 * 客户场景下授权码
	 */
	@ApiField("auth_id")
	private String authId;

	/**
	 * 场景查询键。该产品下传入被查询企业的pid
	 */
	@ApiField("business_key")
	private String businessKey;

	/**
	 * 产品编码。本接口下固定值BusinessLocationSearch
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
