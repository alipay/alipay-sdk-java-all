package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序橱窗数据同步
 *
 * @author auto create
 * @since 1.0, 2022-12-20 14:13:49
 */
public class AlipayOpenMiniWidgetDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5155365921498819414L;

	/**
	 * 活动信息列表
	 */
	@ApiListField("activity_list")
	@ApiField("widget_activity_info")
	private List<WidgetActivityInfo> activityList;

	/**
	 * 数据类型，可选值：ACTIVITY(活动数据)、GOODS(商品数据)
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 商品信息列表
	 */
	@ApiListField("goods_list")
	@ApiField("widget_goods_info")
	private List<WidgetGoodsInfo> goodsList;

	/**
	 * 商家小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序背后的商家，和mini_app_id要求对应
	 */
	@ApiField("pid")
	private String pid;

	public List<WidgetActivityInfo> getActivityList() {
		return this.activityList;
	}
	public void setActivityList(List<WidgetActivityInfo> activityList) {
		this.activityList = activityList;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public List<WidgetGoodsInfo> getGoodsList() {
		return this.goodsList;
	}
	public void setGoodsList(List<WidgetGoodsInfo> goodsList) {
		this.goodsList = goodsList;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
