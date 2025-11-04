package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链自检指令反馈
 *
 * @author auto create
 * @since 1.0, 2025-09-15 16:22:00
 */
public class AntProdpaasProductInspectionCompleteCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 1568112842364467938L;

	/**
	 * 生产单据编号，于自检指令创建接口获取。
	 */
	@ApiField("ao_no")
	private String aoNo;

	/**
	 * 不合格原因，由供应商反馈
	 */
	@ApiField("defect_reason")
	private String defectReason;

	/**
	 * 实际自检完成时间
	 */
	@ApiField("feedback_time")
	private Date feedbackTime;

	/**
	 * 产品自检图URL
	 */
	@ApiField("inspection_picture")
	private String inspectionPicture;

	/**
	 * 自检报告URL
	 */
	@ApiField("inspection_report_attachment")
	private String inspectionReportAttachment;

	/**
	 * 自检结果
	 */
	@ApiField("inspection_result")
	private String inspectionResult;

	/**
	 * 自检单据编号,于自检指令创建接口获取。
	 */
	@ApiField("quality_inspection_no")
	private String qualityInspectionNo;

	/**
	 * 自检数量，单位：件
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 备注
	 */
	@ApiField("result_remark")
	private String resultRemark;

	public String getAoNo() {
		return this.aoNo;
	}
	public void setAoNo(String aoNo) {
		this.aoNo = aoNo;
	}

	public String getDefectReason() {
		return this.defectReason;
	}
	public void setDefectReason(String defectReason) {
		this.defectReason = defectReason;
	}

	public Date getFeedbackTime() {
		return this.feedbackTime;
	}
	public void setFeedbackTime(Date feedbackTime) {
		this.feedbackTime = feedbackTime;
	}

	public String getInspectionPicture() {
		return this.inspectionPicture;
	}
	public void setInspectionPicture(String inspectionPicture) {
		this.inspectionPicture = inspectionPicture;
	}

	public String getInspectionReportAttachment() {
		return this.inspectionReportAttachment;
	}
	public void setInspectionReportAttachment(String inspectionReportAttachment) {
		this.inspectionReportAttachment = inspectionReportAttachment;
	}

	public String getInspectionResult() {
		return this.inspectionResult;
	}
	public void setInspectionResult(String inspectionResult) {
		this.inspectionResult = inspectionResult;
	}

	public String getQualityInspectionNo() {
		return this.qualityInspectionNo;
	}
	public void setQualityInspectionNo(String qualityInspectionNo) {
		this.qualityInspectionNo = qualityInspectionNo;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getResultRemark() {
		return this.resultRemark;
	}
	public void setResultRemark(String resultRemark) {
		this.resultRemark = resultRemark;
	}

}
