package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对合作方展示的书籍章节信息，一本电子书包含一个或者多个章节
 *
 * @author auto create
 * @since 1.0, 2024-03-23 11:37:50
 */
public class ChapterInfo extends AlipayObject {

	private static final long serialVersionUID = 4552628428721519677L;

	/**
	 * 书籍（电子书）名称
	 */
	@ApiField("book_name")
	private String bookName;

	/**
	 * 三方章节id
	 */
	@ApiField("chapter_id")
	private String chapterId;

	/**
	 * 章节名称
	 */
	@ApiField("chapter_name")
	private String chapterName;

	/**
	 * 章节顺序
	 */
	@ApiField("chapter_order")
	private Long chapterOrder;

	/**
	 * 章节最新版本的审核状态，可能为空。（章节审核失败原因暂不支持）
	 */
	@ApiField("latest_audit_status")
	private String latestAuditStatus;

	/**
	 * 三方书籍id
	 */
	@ApiField("out_book_id")
	private String outBookId;

	/**
	 * 章节的上下架状态以其对应的书籍为准，对C端用户展示
	 */
	@ApiField("status")
	private String status;

	public String getBookName() {
		return this.bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getChapterId() {
		return this.chapterId;
	}
	public void setChapterId(String chapterId) {
		this.chapterId = chapterId;
	}

	public String getChapterName() {
		return this.chapterName;
	}
	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

	public Long getChapterOrder() {
		return this.chapterOrder;
	}
	public void setChapterOrder(Long chapterOrder) {
		this.chapterOrder = chapterOrder;
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
