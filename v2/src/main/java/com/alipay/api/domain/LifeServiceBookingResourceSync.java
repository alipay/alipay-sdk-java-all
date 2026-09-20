package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-08 10:42:53
 */
public class LifeServiceBookingResourceSync extends AlipayObject {

	private static final long serialVersionUID = 8154456983712989344L;

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
	 * 资源明细序号，从 1 开始；仅用于定位，创建后不允许修改或重排
	 */
	@ApiField("resource_index")
	private Long resourceIndex;

	/**
	 * 资源名称
	 */
	@ApiField("resource_name")
	private String resourceName;

	/**
	 * 预约资源类型；必须与存量明细类型一致，不允许通过本请求修改
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
