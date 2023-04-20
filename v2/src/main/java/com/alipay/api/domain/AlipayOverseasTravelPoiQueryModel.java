package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游内容对接-POI信息获取
 *
 * @author auto create
 * @since 1.0, 2019-11-14 22:00:41
 */
public class AlipayOverseasTravelPoiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1139359627535526727L;

	/**
	 * 店铺id
	 */
	@ApiField("global_shop_id")
	private String globalShopId;

	/**
	 * 飞猪poiId
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 回传同步POI信息扩展字段中的poi_task_sub_type
	 */
	@ApiField("poi_task_sub_type")
	private String poiTaskSubType;

	public String getGlobalShopId() {
		return this.globalShopId;
	}
	public void setGlobalShopId(String globalShopId) {
		this.globalShopId = globalShopId;
	}

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	public String getPoiTaskSubType() {
		return this.poiTaskSubType;
	}
	public void setPoiTaskSubType(String poiTaskSubType) {
		this.poiTaskSubType = poiTaskSubType;
	}

}
