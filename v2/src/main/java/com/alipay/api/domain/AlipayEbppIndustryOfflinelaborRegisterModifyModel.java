package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心登记卡线下报名状态变更修改
 *
 * @author auto create
 * @since 1.0, 2025-08-13 17:27:37
 */
public class AlipayEbppIndustryOfflinelaborRegisterModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1448491271581162771L;

	/**
	 * 应聘状态
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 用户入职时间，格式yyyy-mm-dd  hh:mm:ss
	 */
	@ApiField("hire_time")
	private Date hireTime;

	/**
	 * 服务商侧该登记记录唯一标识
	 */
	@ApiField("out_register_id")
	private String outRegisterId;

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public Date getHireTime() {
		return this.hireTime;
	}
	public void setHireTime(Date hireTime) {
		this.hireTime = hireTime;
	}

	public String getOutRegisterId() {
		return this.outRegisterId;
	}
	public void setOutRegisterId(String outRegisterId) {
		this.outRegisterId = outRegisterId;
	}

}
