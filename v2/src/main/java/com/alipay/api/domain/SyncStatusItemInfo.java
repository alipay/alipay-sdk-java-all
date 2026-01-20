package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-26 11:03:52
 */
public class SyncStatusItemInfo extends AlipayObject {

	private static final long serialVersionUID = 2522624128154394538L;

	/**
	 * 预约截止时间
	 */
	@ApiField("appointment_end_time")
	private String appointmentEndTime;

	/**
	 * 预约开始时间
	 */
	@ApiField("appointment_start_time")
	private String appointmentStartTime;

	/**
	 * 影响资料类型，如DICOM、NIFTI等
	 */
	@ApiField("image_type")
	private String imageType;

	/**
	 * 影像地址
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 项目编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 项目名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 项目状态:1:预约成功 2:已核销 3:已检测 8:未预约9:已取消10:报告已出
	 */
	@ApiField("item_status")
	private Long itemStatus;

	/**
	 * 报告地址
	 */
	@ApiField("pdf_url")
	private String pdfUrl;

	/**
	 * 出具报告的时间
	 */
	@ApiField("report_time")
	private String reportTime;

	public String getAppointmentEndTime() {
		return this.appointmentEndTime;
	}
	public void setAppointmentEndTime(String appointmentEndTime) {
		this.appointmentEndTime = appointmentEndTime;
	}

	public String getAppointmentStartTime() {
		return this.appointmentStartTime;
	}
	public void setAppointmentStartTime(String appointmentStartTime) {
		this.appointmentStartTime = appointmentStartTime;
	}

	public String getImageType() {
		return this.imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getItemStatus() {
		return this.itemStatus;
	}
	public void setItemStatus(Long itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getPdfUrl() {
		return this.pdfUrl;
	}
	public void setPdfUrl(String pdfUrl) {
		this.pdfUrl = pdfUrl;
	}

	public String getReportTime() {
		return this.reportTime;
	}
	public void setReportTime(String reportTime) {
		this.reportTime = reportTime;
	}

}
