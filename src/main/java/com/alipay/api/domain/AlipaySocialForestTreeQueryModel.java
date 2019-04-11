package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户种植树统计信息查询
 *
 * @author auto create
 * @since 1.0, 2019-03-05 12:34:47
 */
public class AlipaySocialForestTreeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5325437274154566886L;

	/**
	 * 种树截止时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 种树开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
