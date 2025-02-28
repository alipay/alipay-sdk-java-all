package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资源复用新增关联应用
 *
 * @author auto create
 * @since 1.0, 2024-01-19 16:09:52
 */
public class AlipayCloudCloudrunEnvShareCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2392888815184771833L;

	/**
	 * 源应用id（公共请求参数中app_id）的环境资源id。
	 */
	@ApiField("env_id")
	private String envId;

	/**
	 * 源app_id（公共请求参数中的app_id）的环境资源所属产品code。如：云托管 cloudrun_product; 云开发cloudbase_product
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 目标应用id，新增资源复用关联应用的id，进行复用源app_id（公共请求参数中app_id）资源环境的app_id。
	 */
	@ApiField("share_app_id")
	private String shareAppId;

	public String getEnvId() {
		return this.envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getShareAppId() {
		return this.shareAppId;
	}
	public void setShareAppId(String shareAppId) {
		this.shareAppId = shareAppId;
	}

}
