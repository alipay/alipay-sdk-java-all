package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活服务预约单资源明细
 *
 * @author auto create
 * @since 1.0, 2026-09-07 22:25:59
 */
public class LifeServiceBookingResource extends AlipayObject {

	private static final long serialVersionUID = 8547949828723396935L;

	/**
	 * 资源服务截止时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("booking_end_time")
	private String bookingEndTime;

	/**
	 * 资源服务开始时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("booking_start_time")
	private String bookingStartTime;

	/**
	 * 外部资源id
	 */
	@ApiField("out_resource_id")
	private String outResourceId;

	/**
	 * 预约资源id
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 资源明细序号，创建后不允许修改或重排
	 */
	@ApiField("resource_index")
	private Long resourceIndex;

	/**
	 * 资源名称
	 */
	@ApiField("resource_name")
	private String resourceName;

	/**
	 * 预约资源类型
	 */
	@ApiField("resource_type")
	private String resourceType;

	public String getBookingEndTime() {
		return this.bookingEndTime;
	}
	public void setBookingEndTime(String bookingEndTime) {
		this.bookingEndTime = bookingEndTime;
	}

	public String getBookingStartTime() {
		return this.bookingStartTime;
	}
	public void setBookingStartTime(String bookingStartTime) {
		this.bookingStartTime = bookingStartTime;
	}

	public String getOutResourceId() {
		return this.outResourceId;
	}
	public void setOutResourceId(String outResourceId) {
		this.outResourceId = outResourceId;
	}

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public Long getResourceIndex() {
		return this.resourceIndex;
	}
	public void setResourceIndex(Long resourceIndex) {
		this.resourceIndex = resourceIndex;
	}

	public String getResourceName() {
		return this.resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceType() {
		return this.resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

}
