package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询伴游途数据
 *
 * @author auto create
 * @since 1.0, 2024-12-20 15:17:19
 */
public class AlipayCloudCloudpromoTravelPartnerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5662421875743364728L;

	/**
	 * 当前坐标经纬度，逗号分隔
	 */
	@ApiField("cur_lbs_poi")
	private String curLbsPoi;

	/**
	 * 伴游卡片ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 路线ID
	 */
	@ApiField("route_id")
	private String routeId;

	/**
	 * 请求来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 微信用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
