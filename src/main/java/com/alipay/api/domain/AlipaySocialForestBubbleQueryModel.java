package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁森林气泡查询
 *
 * @author auto create
 * @since 1.0, 2019-05-30 14:21:52
 */
public class AlipaySocialForestBubbleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7486726924548985379L;

	/**
	 * 业务消息流入的bizNo字段值
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务发生时间，精确到天就成。不填默认是当天
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 业务能量类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
