package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘宝场景金融专项数据服务查询接口
 *
 * @author auto create
 * @since 1.0, 2025-02-08 10:59:21
 */
public class ZhimaCreditEpPersonecomshopDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2573132297439764366L;

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
	 * 企业标识（统一信用代码/注册号/企业名）
	 */
	@ApiField("company_key")
	private String companyKey;

	/**
	 * 请求唯一编号，每次请求保持唯一
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

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

	public String getCompanyKey() {
		return this.companyKey;
	}
	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public String getMerchantRequestId() {
		return this.merchantRequestId;
	}
	public void setMerchantRequestId(String merchantRequestId) {
		this.merchantRequestId = merchantRequestId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
