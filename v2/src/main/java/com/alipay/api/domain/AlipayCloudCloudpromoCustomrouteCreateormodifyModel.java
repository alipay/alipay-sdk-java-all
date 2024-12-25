package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自定义路线创建或修改
 *
 * @author auto create
 * @since 1.0, 2024-09-20 16:31:31
 */
public class AlipayCloudCloudpromoCustomrouteCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 5892269152785363118L;

	/**
	 * 当前坐标经纬度，逗号分隔
	 */
	@ApiField("cur_lbs_poi")
	private String curLbsPoi;

	/**
	 * 伴游卡片唯一id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 生成自定义路线的景点id列表
	 */
	@ApiListField("poi_info_id_list")
	@ApiField("string")
	private List<String> poiInfoIdList;

	/**
	 * 伴游卡片对应的requestId
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 伴游路线id
	 */
	@ApiField("route_id")
	private String routeId;

	public String getCurLbsPoi() {
		return this.curLbsPoi;
	}
	public void setCurLbsPoi(String curLbsPoi) {
		this.curLbsPoi = curLbsPoi;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public List<String> getPoiInfoIdList() {
		return this.poiInfoIdList;
	}
	public void setPoiInfoIdList(List<String> poiInfoIdList) {
		this.poiInfoIdList = poiInfoIdList;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRouteId() {
		return this.routeId;
	}
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

}
