package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询留资页统计信息
 *
 * @author auto create
 * @since 1.0, 2021-05-08 11:48:29
 */
public class AlipayDataDataserviceAdPromotepagestatisticQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8442762393338743344L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 数据查询开始时间，查询时间间隔不能大于30天，点时间格式：yyyyMMdd
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 推广页id,获取推广页接口可以获取pageId
	 */
	@ApiField("page_id")
	private String pageId;

	/**
	 * 灯火商家ID
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 数据查询开始时间，查询时间间隔不能大于30天，点时间格式：yyyyMMdd
	 */
	@ApiField("start_time")
	private String startTime;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPageId() {
		return this.pageId;
	}
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
