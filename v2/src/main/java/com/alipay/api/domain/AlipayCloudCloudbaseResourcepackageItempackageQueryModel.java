package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单项资源包列表
 *
 * @author auto create
 * @since 1.0, 2025-08-08 10:15:26
 */
public class AlipayCloudCloudbaseResourcepackageItempackageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2862672164979552458L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 商品编码
	 */
	@ApiField("commodity_code")
	private String commodityCode;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

}
