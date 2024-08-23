package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附近车场查询
 *
 * @author auto create
 * @since 1.0, 2021-12-06 20:37:52
 */
public class AlipayEcoMycarVehMultiterminalBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1417699837957616252L;

	/**
	 * 业务id
例: biz_scene为PARKING_SERVICE时,可传入parkingId(支付宝车场唯一id)
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务场景
PARKING_SERVICE(停车服务)
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 纬度，根据传入经纬度搜索radius内的车场
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，根据传入经纬度搜索radius内的车场
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 分页页码,从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小，上限200条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 距离[单位：米]，上限10公里
	 */
	@ApiField("radius")
	private Long radius;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

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

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getRadius() {
		return this.radius;
	}
	public void setRadius(Long radius) {
		this.radius = radius;
	}

}
