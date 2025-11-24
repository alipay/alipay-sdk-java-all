package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险检测同步内容查询
 *
 * @author auto create
 * @since 1.0, 2025-03-27 21:47:26
 */
public class AlipayCommercePropertyRiskdetectContentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4113194764883436143L;

	/**
	 * deviceId和outDeviceId至少传其一
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备时间查询结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 外部内容id
	 */
	@ApiField("out_content_id")
	private String outContentId;

	/**
	 * deviceId和outDeviceId至少传其一
	 */
	@ApiField("out_device_id")
	private String outDeviceId;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 设备时间查询开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOutContentId() {
		return this.outContentId;
	}
	public void setOutContentId(String outContentId) {
		this.outContentId = outContentId;
	}

	public String getOutDeviceId() {
		return this.outDeviceId;
	}
	public void setOutDeviceId(String outDeviceId) {
		this.outDeviceId = outDeviceId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
