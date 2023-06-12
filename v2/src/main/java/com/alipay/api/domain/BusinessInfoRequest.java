package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务信息请求体
 *
 * @author auto create
 * @since 1.0, 2023-05-31 16:46:15
 */
public class BusinessInfoRequest extends AlipayObject {

	private static final long serialVersionUID = 3574341245974225323L;

	/**
	 * 结束时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 场所名称，如房间号：302
	 */
	@ApiField("place_name")
	private String placeName;

	/**
	 * 场所类型，如房间刷脸开门：40002001
	 */
	@ApiField("place_type")
	private String placeType;

	/**
	 * 设备编码
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 开始时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 小程序的服务页面url链接
	 */
	@ApiField("url")
	private String url;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPlaceName() {
		return this.placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceType() {
		return this.placeType;
	}
	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
