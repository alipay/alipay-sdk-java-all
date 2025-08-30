package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开启AI伴游接口
 *
 * @author auto create
 * @since 1.0, 2024-09-14 11:34:31
 */
public class AlipayCloudCloudpromoTravelPartnerTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 7628394666992225625L;

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
	 * 伴游卡片对应的requestId，可不传
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 伴游路线id
	 */
	@ApiField("route_id")
	private String routeId;

	/**
	 * 请求来源，枚举有：CUBE、H5
	 */
	@ApiField("source")
	private String source;

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

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
