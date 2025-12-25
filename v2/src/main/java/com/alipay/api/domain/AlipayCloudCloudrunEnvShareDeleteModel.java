package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资源复用删除关联应用
 *
 * @author auto create
 * @since 1.0, 2024-01-19 16:10:25
 */
public class AlipayCloudCloudrunEnvShareDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1872272348416132976L;

	/**
	 * 源应用id（公共请求参数中app_id）的环境资源id。
	 */
	@ApiField("env_id")
	private String envId;

	/**
	 * 源app_id（公共请求参数中的app_id）的环境资源所属产品code。如：云托管 cloudrun_product;  云开发cloudbase_product
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 目标app_id，进行删除资源复用关联应用的id，已经复用了源app_id（公共请求参数中app_id）资源环境的app_id。
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
