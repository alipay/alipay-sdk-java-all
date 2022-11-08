package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放计划基础信息
 *
 * @author auto create
 * @since 1.0, 2022-08-08 15:15:40
 */
public class DeliveryBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 6684575847621484767L;

	/**
	 * 投放计划开始时间。 格式为：yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("delivery_begin_time")
	private Date deliveryBeginTime;

	/**
	 * 投放计划结束时间。 格式为：yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("delivery_end_time")
	private Date deliveryEndTime;

	/**
	 * 投放计划素材信息。
	 */
	@ApiField("delivery_material")
	private DeliveryMaterial deliveryMaterial;

	/**
	 * 投放计划名称。
投放计划名称不会对用户进行表达，只用于商户管理使用。长度需要大于等于3，小于20。
	 */
	@ApiField("delivery_name")
	private String deliveryName;

	public Date getDeliveryBeginTime() {
		return this.deliveryBeginTime;
	}
	public void setDeliveryBeginTime(Date deliveryBeginTime) {
		this.deliveryBeginTime = deliveryBeginTime;
	}

	public Date getDeliveryEndTime() {
		return this.deliveryEndTime;
	}
	public void setDeliveryEndTime(Date deliveryEndTime) {
		this.deliveryEndTime = deliveryEndTime;
	}

	public DeliveryMaterial getDeliveryMaterial() {
		return this.deliveryMaterial;
	}
	public void setDeliveryMaterial(DeliveryMaterial deliveryMaterial) {
		this.deliveryMaterial = deliveryMaterial;
	}

	public String getDeliveryName() {
		return this.deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

}
