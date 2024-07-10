package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 读书听书频道书籍信息查询接口
 *
 * @author auto create
 * @since 1.0, 2024-03-28 13:36:07
 */
public class AlipayUserAntbookcontentBookQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4299696139891454522L;

	/**
	 * 最新版本审核状态，用做过滤。如果传入AUDIT_REJECT，则只返回审核失败的书籍
	 */
	@ApiField("latest_audit_status")
	private String latestAuditStatus;

	/**
	 * 三方书籍id列表，长度不能超过20。如果传入，则只返回输入id列表范围内的书籍信息。
	 */
	@ApiListField("out_book_id_list")
	@ApiField("string")
	private List<String> outBookIdList;

	/**
	 * 从1开始。如果bookIdList为空，默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 如果bookIdList为空，默认为20，按照进件时间倒序查询
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getLatestAuditStatus() {
		return this.latestAuditStatus;
	}
	public void setLatestAuditStatus(String latestAuditStatus) {
		this.latestAuditStatus = latestAuditStatus;
	}

	public List<String> getOutBookIdList() {
		return this.outBookIdList;
	}
	public void setOutBookIdList(List<String> outBookIdList) {
		this.outBookIdList = outBookIdList;
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
