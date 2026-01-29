package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 处方信息
 *
 * @author auto create
 * @since 1.0, 2025-07-07 15:36:52
 */
public class PrescriptionVO extends AlipayObject {

	private static final long serialVersionUID = 7749477436976339721L;

	/**
	 * 创建处方的时间，即开方时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 商家侧审核处方的药师姓名
	 */
	@ApiField("review_doc_name")
	private String reviewDocName;

	/**
	 * 商家侧审核处方驳回的原因
	 */
	@ApiField("review_reject_note")
	private String reviewRejectNote;

	/**
	 * 商家侧药师审核处方的日期，有年月日，时分秒，精确到秒
	 */
	@ApiField("review_time")
	private Date reviewTime;

	/**
	 * 处方编号
	 */
	@ApiField("rx_code")
	private String rxCode;

	/**
	 * 开具处方的医生姓名
	 */
	@ApiField("rx_doc_name")
	private String rxDocName;

	/**
	 * 处方的pdf访问地址链接
	 */
	@ApiField("rx_pdf")
	private String rxPdf;

	/**
	 * 处方笺的图片访问地址链接
	 */
	@ApiField("rx_picture")
	private String rxPicture;

	/**
	 * 0-待补方,5-待开方,10-已开方,15-待审方,20-已完成,30-已取消
	 */
	@ApiField("rx_status")
	private Long rxStatus;

	/**
	 * 最近一次处方单更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getReviewDocName() {
		return this.reviewDocName;
	}
	public void setReviewDocName(String reviewDocName) {
		this.reviewDocName = reviewDocName;
	}

	public String getReviewRejectNote() {
		return this.reviewRejectNote;
	}
	public void setReviewRejectNote(String reviewRejectNote) {
		this.reviewRejectNote = reviewRejectNote;
	}

	public Date getReviewTime() {
		return this.reviewTime;
	}
	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}

	public String getRxCode() {
		return this.rxCode;
	}
	public void setRxCode(String rxCode) {
		this.rxCode = rxCode;
	}

	public String getRxDocName() {
		return this.rxDocName;
	}
	public void setRxDocName(String rxDocName) {
		this.rxDocName = rxDocName;
	}

	public String getRxPdf() {
		return this.rxPdf;
	}
	public void setRxPdf(String rxPdf) {
		this.rxPdf = rxPdf;
	}

	public String getRxPicture() {
		return this.rxPicture;
	}
	public void setRxPicture(String rxPicture) {
		this.rxPicture = rxPicture;
	}

	public Long getRxStatus() {
		return this.rxStatus;
	}
	public void setRxStatus(Long rxStatus) {
		this.rxStatus = rxStatus;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
