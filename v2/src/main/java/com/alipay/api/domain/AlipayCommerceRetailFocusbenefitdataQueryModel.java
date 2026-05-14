package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 触享查询权益活动接口
 *
 * @author auto create
 * @since 1.0, 2026-03-11 10:07:43
 */
public class AlipayCommerceRetailFocusbenefitdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1516142654634539998L;

	/**
	 * 区域
	 */
	@ApiField("area")
	private String area;

	/**
	 * 分页查询游标
	 */
	@ApiField("digest")
	private String digest;

	/**
	 * 天分区
	 */
	@ApiField("dt_list")
	private String dtList;

	/**
	 * 时间分区
	 */
	@ApiField("hh_list")
	private String hhList;

	/**
	 * 分钟级时间
	 */
	@ApiField("minute_time")
	private String minuteTime;

	/**
	 * 页码
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 页码
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getDigest() {
		return this.digest;
	}
	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getDtList() {
		return this.dtList;
	}
	public void setDtList(String dtList) {
		this.dtList = dtList;
	}

	public String getHhList() {
		return this.hhList;
	}
	public void setHhList(String hhList) {
		this.hhList = hhList;
	}

	public String getMinuteTime() {
		return this.minuteTime;
	}
	public void setMinuteTime(String minuteTime) {
		this.minuteTime = minuteTime;
	}

	public String getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
