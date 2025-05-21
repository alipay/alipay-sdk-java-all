package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阅读听书频道章节信息查询接口
 *
 * @author auto create
 * @since 1.0, 2024-03-23 11:37:50
 */
public class AlipayUserAntbookcontentChapterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5281113266172825343L;

	/**
	 * 最新版本审核状态，用做过滤。如果传入AUDIT_REJECT，则只返回审核失败的章节
	 */
	@ApiField("latest_audit_status")
	private String latestAuditStatus;

	/**
	 * 三方书籍ID，分页返回该书籍下的章节信息
	 */
	@ApiField("out_book_id")
	private String outBookId;

	/**
	 * 从1开始，默认值为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 默认值为20
	 */
	@ApiField("page_size")
	private Long pageSize;

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

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
