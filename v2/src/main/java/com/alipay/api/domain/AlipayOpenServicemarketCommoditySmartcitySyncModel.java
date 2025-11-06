package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务信息同步
 *
 * @author auto create
 * @since 1.0, 2018-04-09 18:17:19
 */
public class AlipayOpenServicemarketCommoditySmartcitySyncModel extends AlipayObject {

	private static final long serialVersionUID = 5365253221857842337L;

	/**
	 * 服务基础信息
	 */
	@ApiField("commodity_base_info")
	private CommodityBaseInfo commodityBaseInfo;

	/**
	 * 服务ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 是否预发环境数据，1是，0否
	 */
	@ApiField("is_pre")
	private String isPre;

	/**
	 * 新型智慧城市服务扩展信息
	 */
	@ApiField("smart_city_commodity_info")
	private SmartCityCommodityInfo smartCityCommodityInfo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public CommodityBaseInfo getCommodityBaseInfo() {
		return this.commodityBaseInfo;
	}
	public void setCommodityBaseInfo(CommodityBaseInfo commodityBaseInfo) {
		this.commodityBaseInfo = commodityBaseInfo;
	}

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getIsPre() {
		return this.isPre;
	}
	public void setIsPre(String isPre) {
		this.isPre = isPre;
	}

	public SmartCityCommodityInfo getSmartCityCommodityInfo() {
		return this.smartCityCommodityInfo;
	}
	public void setSmartCityCommodityInfo(SmartCityCommodityInfo smartCityCommodityInfo) {
		this.smartCityCommodityInfo = smartCityCommodityInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
