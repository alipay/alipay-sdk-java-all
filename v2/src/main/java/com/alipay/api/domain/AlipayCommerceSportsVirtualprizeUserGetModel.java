package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户授勋
 *
 * @author auto create
 * @since 1.0, 2023-06-09 14:55:15
 */
public class AlipayCommerceSportsVirtualprizeUserGetModel extends AlipayObject {

	private static final long serialVersionUID = 6647551893833957249L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 奖品授予时间
	 */
	@ApiField("grant_time")
	private Date grantTime;

	/**
	 * 用户OPENID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部奖品id
	 */
	@ApiListField("out_prize_ids")
	@ApiField("string")
	private List<String> outPrizeIds;

	/**
	 * 1：授予；0：取消
	 */
	@ApiField("status")
	private String status;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public Date getGrantTime() {
		return this.grantTime;
	}
	public void setGrantTime(Date grantTime) {
		this.grantTime = grantTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getOutPrizeIds() {
		return this.outPrizeIds;
	}
	public void setOutPrizeIds(List<String> outPrizeIds) {
		this.outPrizeIds = outPrizeIds;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
