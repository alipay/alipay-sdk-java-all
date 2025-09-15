package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询按量付费的扩展服务的单价
 *
 * @author auto create
 * @since 1.0, 2023-10-16 13:47:31
 */
public class AlipayCloudCloudbaseExtensionFeeGetModel extends AlipayObject {

	private static final long serialVersionUID = 5681229983531137828L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 查询产品
 - REDIS
 - MYSQL
	 */
	@ApiField("product")
	private String product;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getProduct() {
		return this.product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

}
