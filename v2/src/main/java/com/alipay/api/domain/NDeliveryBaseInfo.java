package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广计划基础信息
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:47:11
 */
public class NDeliveryBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2719658329251956463L;

	/**
	 * 推广计划开始时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("n_delivery_begin_time")
	private Date nDeliveryBeginTime;

	/**
	 * 推广计划结束时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("n_delivery_end_time")
	private Date nDeliveryEndTime;

	/**
	 * 推广计划名称不会对用户进行表达，只用于商户管理使用。长度需要大于等于3，小于等于20。
	 */
	@ApiField("n_delivery_name")
	private String nDeliveryName;

	public Date getnDeliveryBeginTime() {
		return this.nDeliveryBeginTime;
	}
	public void setnDeliveryBeginTime(Date nDeliveryBeginTime) {
		this.nDeliveryBeginTime = nDeliveryBeginTime;
	}

	public Date getnDeliveryEndTime() {
		return this.nDeliveryEndTime;
	}
	public void setnDeliveryEndTime(Date nDeliveryEndTime) {
		this.nDeliveryEndTime = nDeliveryEndTime;
	}

	public String getnDeliveryName() {
		return this.nDeliveryName;
	}
	public void setnDeliveryName(String nDeliveryName) {
		this.nDeliveryName = nDeliveryName;
	}

}
