package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 选填。此参数用于传入子商户信息，目前商户代扣、海外代扣、淘旅行信用住产品支持传入该参数(在销售方案中“是否允许自定义子商户信息”需要选是)
 *
 * @author auto create
 * @since 1.0, 2019-06-17 17:42:56
 */
public class SubMerchantParams extends AlipayObject {

	private static final long serialVersionUID = 7496653581142665133L;

	/**
	 * 子商户的商户id
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 子商户的商户名称
	 */
	@ApiField("sub_merchant_name")
	private String subMerchantName;

	/**
	 * 子商户的服务描述
	 */
	@ApiField("sub_merchant_service_description")
	private String subMerchantServiceDescription;

	/**
	 * 子商户的服务名称
	 */
	@ApiField("sub_merchant_service_name")
	private String subMerchantServiceName;

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public String getSubMerchantName() {
		return this.subMerchantName;
	}
	public void setSubMerchantName(String subMerchantName) {
		this.subMerchantName = subMerchantName;
	}

	public String getSubMerchantServiceDescription() {
		return this.subMerchantServiceDescription;
	}
	public void setSubMerchantServiceDescription(String subMerchantServiceDescription) {
		this.subMerchantServiceDescription = subMerchantServiceDescription;
	}

	public String getSubMerchantServiceName() {
		return this.subMerchantServiceName;
	}
	public void setSubMerchantServiceName(String subMerchantServiceName) {
		this.subMerchantServiceName = subMerchantServiceName;
	}

}
