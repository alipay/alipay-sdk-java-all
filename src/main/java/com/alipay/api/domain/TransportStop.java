package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公交站点数据结构
 *
 * @author auto create
 * @since 1.0, 2019-06-14 09:50:43
 */
public class TransportStop extends AlipayObject {

	private static final long serialVersionUID = 5211414579783614858L;

	/**
	 * 站点维度。描述位置信息。火星坐标系。
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 站点经度。描述位置信息。火星坐标系。
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 站点id。站点的唯一标志。
	 */
	@ApiField("stop_id")
	private String stopId;

	/**
	 * 站点名称。站点的描述。
	 */
	@ApiField("stop_name")
	private String stopName;

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getStopId() {
		return this.stopId;
	}
	public void setStopId(String stopId) {
		this.stopId = stopId;
	}

	public String getStopName() {
		return this.stopName;
	}
	public void setStopName(String stopName) {
		this.stopName = stopName;
	}

}
