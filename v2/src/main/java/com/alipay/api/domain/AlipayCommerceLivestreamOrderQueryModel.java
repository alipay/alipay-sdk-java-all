package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户在直播间的淘宝订单信息
 *
 * @author auto create
 * @since 1.0, 2023-10-17 17:24:30
 */
public class AlipayCommerceLivestreamOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2255941654267931281L;

	/**
	 * 业务授权token，用户允许在该小程序上查询主播直播间订单数据。获取方法：小程序插件组件实例通过ref透出的auth方法获取
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 查询订单范围的结束时间，以订单付款时间为准
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 默认值1
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 默认值，10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询订单范围的开始时间，以订单付款时间为准
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
