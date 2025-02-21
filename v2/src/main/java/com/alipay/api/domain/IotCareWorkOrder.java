package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 维保工单（包含工单号，工单提报设备SN，工单创建时间，工单完结时间，新机SN， 系列类型）
 *
 * @author auto create
 * @since 1.0, 2024-12-19 15:43:35
 */
public class IotCareWorkOrder extends AlipayObject {

	private static final long serialVersionUID = 3873242948997751695L;

	/**
	 * 用于标识是何种系列的设备
	 */
	@ApiField("device_category_name")
	private String deviceCategoryName;

	/**
	 * 新机sn
	 */
	@ApiField("new_device_sn")
	private String newDeviceSn;

	/**
	 * 工单提报设备SN
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 工单创建时间
	 */
	@ApiField("worker_order_create_time")
	private Date workerOrderCreateTime;

	/**
	 * 工单完结时间
	 */
	@ApiField("worker_order_end_time")
	private Date workerOrderEndTime;

	/**
	 * 维保工单号
	 */
	@ApiField("worker_order_id")
	private String workerOrderId;

	public String getDeviceCategoryName() {
		return this.deviceCategoryName;
	}
	public void setDeviceCategoryName(String deviceCategoryName) {
		this.deviceCategoryName = deviceCategoryName;
	}

	public String getNewDeviceSn() {
		return this.newDeviceSn;
	}
	public void setNewDeviceSn(String newDeviceSn) {
		this.newDeviceSn = newDeviceSn;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public Date getWorkerOrderCreateTime() {
		return this.workerOrderCreateTime;
	}
	public void setWorkerOrderCreateTime(Date workerOrderCreateTime) {
		this.workerOrderCreateTime = workerOrderCreateTime;
	}

	public Date getWorkerOrderEndTime() {
		return this.workerOrderEndTime;
	}
	public void setWorkerOrderEndTime(Date workerOrderEndTime) {
		this.workerOrderEndTime = workerOrderEndTime;
	}

	public String getWorkerOrderId() {
		return this.workerOrderId;
	}
	public void setWorkerOrderId(String workerOrderId) {
		this.workerOrderId = workerOrderId;
	}

}
