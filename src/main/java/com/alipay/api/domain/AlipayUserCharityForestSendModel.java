package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 森林能量发放接口
 *
 * @author auto create
 * @since 1.0, 2019-10-11 12:06:18
 */
public class AlipayUserCharityForestSendModel extends AlipayObject {

	private static final long serialVersionUID = 5552537889234745153L;

	/**
	 * 唯一单据号，用于发能量幂等控制
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 能量值，最小1g，最大100kg（100,000），不能有小数
	 */
	@ApiField("energy")
	private Long energy;

	/**
	 * 能量气泡类型
	 */
	@ApiField("energy_type")
	private String energyType;

	/**
	 * 业务来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 用户的支付宝账户ID
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

	public Long getEnergy() {
		return this.energy;
	}
	public void setEnergy(Long energy) {
		this.energy = energy;
	}

	public String getEnergyType() {
		return this.energyType;
	}
	public void setEnergyType(String energyType) {
		this.energyType = energyType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
