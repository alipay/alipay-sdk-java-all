package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资源复用查新关联应用
 *
 * @author auto create
 * @since 1.0, 2024-01-19 16:10:11
 */
public class AlipayCloudCloudrunEnvShareQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1776314455877913869L;

	/**
	 * 源app_id（公共请求参数中的app_id）的环境资源所属产品code。如：云托管 cloudrun_product; 云开发 cloudbase_product
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 目标app_id，已经复用了源app_id（公共请求参数中app_id）资源环境的app_id。
	 */
	@ApiField("query_app_id")
	private String queryAppId;

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getQueryAppId() {
		return this.queryAppId;
	}
	public void setQueryAppId(String queryAppId) {
		this.queryAppId = queryAppId;
	}

}
