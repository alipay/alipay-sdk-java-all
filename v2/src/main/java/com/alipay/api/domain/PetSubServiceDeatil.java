package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务计划详情
 *
 * @author auto create
 * @since 1.0, 2024-04-23 10:32:19
 */
public class PetSubServiceDeatil extends AlipayObject {

	private static final long serialVersionUID = 3444618738291961138L;

	/**
	 * 实际时间
	 */
	@ApiField("actual_time")
	private Date actualTime;

	/**
	 * 服务金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 预期时间
	 */
	@ApiField("expect_time")
	private Date expectTime;

	/**
	 * 其他扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 服务期数
	 */
	@ApiField("period")
	private String period;

	/**
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 业务id
	 */
	@ApiField("sub_biz_id")
	private String subBizId;

	public Date getActualTime() {
		return this.actualTime;
	}
	public void setActualTime(Date actualTime) {
		this.actualTime = actualTime;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getExpectTime() {
		return this.expectTime;
	}
	public void setExpectTime(Date expectTime) {
		this.expectTime = expectTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubBizId() {
		return this.subBizId;
	}
	public void setSubBizId(String subBizId) {
		this.subBizId = subBizId;
	}

}
