package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁云服务插件扩展信息
 *
 * @author auto create
 * @since 1.0, 2016-11-30 21:06:38
 */
public class CommodityPublicExtInfos extends AlipayObject {

	private static final long serialVersionUID = 2897617932622993733L;

	/**
	 * 前置url
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 应用展台id
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 类目
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 服务插件ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 创建者ID
	 */
	@ApiField("create_user_id")
	private String createUserId;

	/**
	 * 挂载ID，用于确认唯一记录的主键对象
	 */
	@ApiField("displayapp_id")
	private String displayappId;

	/**
	 * 城市服务说明
	 */
	@ApiField("displayapp_memo")
	private String displayappMemo;

	/**
	 * 服务别名
	 */
	@ApiField("displayapp_name")
	private String displayappName;

	/**
	 * 状态 1:上架；0：下架；2:维护中
	 */
	@ApiField("displayapp_status")
	private String displayappStatus;

	/**
	 * 用户访问地址
	 */
	@ApiField("displayapp_url")
	private String displayappUrl;

	/**
	 * 外部展示地址
	 */
	@ApiField("export_url")
	private String exportUrl;

	/**
	 * 属性ID
	 */
	@ApiField("property_id")
	private String propertyId;

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getAppId() {
		return this.appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getCreateUserId() {
		return this.createUserId;
	}
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getDisplayappId() {
		return this.displayappId;
	}
	public void setDisplayappId(String displayappId) {
		this.displayappId = displayappId;
	}

	public String getDisplayappMemo() {
		return this.displayappMemo;
	}
	public void setDisplayappMemo(String displayappMemo) {
		this.displayappMemo = displayappMemo;
	}

	public String getDisplayappName() {
		return this.displayappName;
	}
	public void setDisplayappName(String displayappName) {
		this.displayappName = displayappName;
	}

	public String getDisplayappStatus() {
		return this.displayappStatus;
	}
	public void setDisplayappStatus(String displayappStatus) {
		this.displayappStatus = displayappStatus;
	}

	public String getDisplayappUrl() {
		return this.displayappUrl;
	}
	public void setDisplayappUrl(String displayappUrl) {
		this.displayappUrl = displayappUrl;
	}

	public String getExportUrl() {
		return this.exportUrl;
	}
	public void setExportUrl(String exportUrl) {
		this.exportUrl = exportUrl;
	}

	public String getPropertyId() {
		return this.propertyId;
	}
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

}
