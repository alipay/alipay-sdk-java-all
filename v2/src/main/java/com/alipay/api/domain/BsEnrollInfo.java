package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营-报名-报名信息
 *
 * @author auto create
 * @since 1.0, 2023-04-11 17:16:52
 */
public class BsEnrollInfo extends AlipayObject {

	private static final long serialVersionUID = 5275453675835949216L;

	/**
	 * 报名id
	 */
	@ApiField("enroll_id")
	private String enrollId;

	/**
	 * 该计划报名的剩余权益库存
	 */
	@ApiField("remain_stock")
	private Long remainStock;

	/**
	 * 报名的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 报名进行到当前状态的原因
	 */
	@ApiField("status_reason")
	private String statusReason;

	/**
	 * 报名对象id，可以是商户pid
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 参与计划的权益总库存
	 */
	@ApiField("total_stock")
	private Long totalStock;

	/**
	 * 报名信息更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	public String getEnrollId() {
		return this.enrollId;
	}
	public void setEnrollId(String enrollId) {
		this.enrollId = enrollId;
	}

	public Long getRemainStock() {
		return this.remainStock;
	}
	public void setRemainStock(Long remainStock) {
		this.remainStock = remainStock;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusReason() {
		return this.statusReason;
	}
	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public Long getTotalStock() {
		return this.totalStock;
	}
	public void setTotalStock(Long totalStock) {
		this.totalStock = totalStock;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
