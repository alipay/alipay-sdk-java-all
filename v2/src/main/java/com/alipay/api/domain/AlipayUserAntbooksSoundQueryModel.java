package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 阅读听书频道声音信息查询接口
 *
 * @author auto create
 * @since 1.0, 2024-03-23 23:59:14
 */
public class AlipayUserAntbooksSoundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8817667487834776796L;

	/**
	 * 最新版本审核状态，用做过滤。如果传入AUDIT_REJECT，则只返回审核失败的声音
	 */
	@ApiField("latest_audit_status")
	private String latestAuditStatus;

	/**
	 * 三方专辑id列表，长度不能超过20。如果传入，则只返回输入专辑ID的声音信息。soundIdList和albumId不能同时为空
	 */
	@ApiField("out_album_id")
	private String outAlbumId;

	/**
	 * 三方声音id列表，长度不能超过20。如果传入，则只返回输入id列表范围内的声音信息。soundIdList和albumId不能同时为空
	 */
	@ApiListField("out_sound_id_list")
	@ApiField("string")
	private List<String> outSoundIdList;

	/**
	 * 从1开始，默认为1。如果传入albumId，分页查询声音
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 默认为20。如果传入albumId，分页查询声音
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getLatestAuditStatus() {
		return this.latestAuditStatus;
	}
	public void setLatestAuditStatus(String latestAuditStatus) {
		this.latestAuditStatus = latestAuditStatus;
	}

	public String getOutAlbumId() {
		return this.outAlbumId;
	}
	public void setOutAlbumId(String outAlbumId) {
		this.outAlbumId = outAlbumId;
	}

	public List<String> getOutSoundIdList() {
		return this.outSoundIdList;
	}
	public void setOutSoundIdList(List<String> outSoundIdList) {
		this.outSoundIdList = outSoundIdList;
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
