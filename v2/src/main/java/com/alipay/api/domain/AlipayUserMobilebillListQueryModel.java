package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户账单列表查询
 *
 * @author auto create
 * @since 1.0, 2026-03-13 10:42:44
 */
public class AlipayUserMobilebillListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3158434693478682169L;

	/**
	 * 查询范围-结束时间，开始和结束时间间隔不能大于31天
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 查询范围-开始时间，开始和结束时间间隔不能大于31天
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 用户uid，仅做路由，不实际消费
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户uid，仅做路由，不实际消费
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

}
