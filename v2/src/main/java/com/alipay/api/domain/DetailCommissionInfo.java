package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:28
 */
public class DetailCommissionInfo extends AlipayObject {

	private static final long serialVersionUID = 4841574966348515947L;

	/**
	 * 配置失效时间
	 */
	@ApiField("alloc_invalid_time")
	private Date allocInvalidTime;

	/**
	 * 配置生效时间
	 */
	@ApiField("alloc_valid_time")
	private Date allocValidTime;

	/**
	 * null
	 */
	@ApiListField("commission_role_list")
	@ApiField("detail_commission_role_info")
	private List<DetailCommissionRoleInfo> commissionRoleList;

	/**
	 * 抽佣状态
	 */
	@ApiField("commission_status")
	private String commissionStatus;

	/**
	 * 抽佣比例
	 */
	@ApiField("isv_rate")
	private String isvRate;

	/**
	 * 最新抽佣信息
	 */
	@ApiField("latest_commission")
	private LatestCommissionInfo latestCommission;

	/**
	 * 真实失效时间
	 */
	@ApiField("real_invalid_time")
	private Date realInvalidTime;

	/**
	 * 真实生效时间
	 */
	@ApiField("real_valid_time")
	private Date realValidTime;

	/**
	 * 目标id
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 商家
	 */
	@ApiField("target_type")
	private String targetType;

	public Date getAllocInvalidTime() {
		return this.allocInvalidTime;
	}
	public void setAllocInvalidTime(Date allocInvalidTime) {
		this.allocInvalidTime = allocInvalidTime;
	}

	public Date getAllocValidTime() {
		return this.allocValidTime;
	}
	public void setAllocValidTime(Date allocValidTime) {
		this.allocValidTime = allocValidTime;
	}

	public List<DetailCommissionRoleInfo> getCommissionRoleList() {
		return this.commissionRoleList;
	}
	public void setCommissionRoleList(List<DetailCommissionRoleInfo> commissionRoleList) {
		this.commissionRoleList = commissionRoleList;
	}

	public String getCommissionStatus() {
		return this.commissionStatus;
	}
	public void setCommissionStatus(String commissionStatus) {
		this.commissionStatus = commissionStatus;
	}

	public String getIsvRate() {
		return this.isvRate;
	}
	public void setIsvRate(String isvRate) {
		this.isvRate = isvRate;
	}

	public LatestCommissionInfo getLatestCommission() {
		return this.latestCommission;
	}
	public void setLatestCommission(LatestCommissionInfo latestCommission) {
		this.latestCommission = latestCommission;
	}

	public Date getRealInvalidTime() {
		return this.realInvalidTime;
	}
	public void setRealInvalidTime(Date realInvalidTime) {
		this.realInvalidTime = realInvalidTime;
	}

	public Date getRealValidTime() {
		return this.realValidTime;
	}
	public void setRealValidTime(Date realValidTime) {
		this.realValidTime = realValidTime;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
