package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放平台金融云操作员同步
 *
 * @author auto create
 * @since 1.0, 2024-08-30 11:23:34
 */
public class AlipayOpenOperatorSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1414541839272619898L;

	/**
	 * 主账号的userId
	 */
	@ApiField("master_user_id")
	private String masterUserId;

	/**
	 * 产品code，FINCLOUD=金融云，CSC=云客服
	 */
	@ApiField("product_code")
	private String productCode;

	public String getMasterUserId() {
		return this.masterUserId;
	}
	public void setMasterUserId(String masterUserId) {
		this.masterUserId = masterUserId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
