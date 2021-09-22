package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡创建储值优惠方案
 *
 * @author auto create
 * @since 1.0, 2021-08-17 15:11:45
 */
public class MemberCardCreatePrepaidPromotionPlanInfo extends AlipayObject {

	private static final long serialVersionUID = 8837924179185472393L;

	/**
	 * 充值方案权益金部分，最小为0，权益金不超过5000元
	 */
	@ApiField("benefit")
	private String benefit;

	/**
	 * 方案的失效时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 充值本金部分，单位元，必须大于0，本金不超过5000元
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 方案开始生效时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * ENALBLE生效；DISABLE失效
	 */
	@ApiField("status")
	private String status;

	public String getBenefit() {
		return this.benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
