package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对合作方展示的书籍（电子书）信息
 *
 * @author auto create
 * @since 1.0, 2024-03-24 00:10:16
 */
public class BookInfo extends AlipayObject {

	private static final long serialVersionUID = 5635898557737852873L;

	/**
	 * 书籍审核失败原因，可能为空
	 */
	@ApiField("audit_reject_desc")
	private String auditRejectDesc;

	/**
	 * 书籍（电子书）名称
	 */
	@ApiField("book_name")
	private String bookName;

	/**
	 * 书籍最新版本的审核状态，可能为空
	 */
	@ApiField("latest_audit_status")
	private String latestAuditStatus;

	/**
	 * 三方书籍id
	 */
	@ApiField("out_book_id")
	private String outBookId;

	/**
	 * 对C端用户展示的书籍上下架状态，可能为空。可能出现书籍最新版本还在审核中（latestAuditStatus=AUDIT_ING），但是上一版本已上架（status=ONLINE）情况。
	 */
	@ApiField("status")
	private String status;

	public String getAuditRejectDesc() {
		return this.auditRejectDesc;
	}
	public void setAuditRejectDesc(String auditRejectDesc) {
		this.auditRejectDesc = auditRejectDesc;
	}

	public String getBookName() {
		return this.bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getLatestAuditStatus() {
		return this.latestAuditStatus;
	}
	public void setLatestAuditStatus(String latestAuditStatus) {
		this.latestAuditStatus = latestAuditStatus;
	}

	public String getOutBookId() {
		return this.outBookId;
	}
	public void setOutBookId(String outBookId) {
		this.outBookId = outBookId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
