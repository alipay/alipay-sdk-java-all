package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 阅读听书频道专辑信息查询接口
 *
 * @author auto create
 * @since 1.0, 2024-03-24 21:54:14
 */
public class AlipayUserAntbooksAlbumQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4885946529414124651L;

	/**
	 * 最新版本审核状态，用做过滤。如果传入AUDIT_REJECT，则只返回审核失败的专辑
	 */
	@ApiField("latest_audit_status")
	private String latestAuditStatus;

	/**
	 * 三方专辑id列表，长度不能超过20。如果传入，则只返回输入id列表范围内的专辑信息。
	 */
	@ApiListField("out_album_id_list")
	@ApiField("string")
	private List<String> outAlbumIdList;

	/**
	 * 从1开始，默认为1。如果out_album_id_list为空，默认按照分页查询。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 默认为20。如果out_album_id_list为空，默认按照分页查询。
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getLatestAuditStatus() {
		return this.latestAuditStatus;
	}
	public void setLatestAuditStatus(String latestAuditStatus) {
		this.latestAuditStatus = latestAuditStatus;
	}

	public List<String> getOutAlbumIdList() {
		return this.outAlbumIdList;
	}
	public void setOutAlbumIdList(List<String> outAlbumIdList) {
		this.outAlbumIdList = outAlbumIdList;
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
