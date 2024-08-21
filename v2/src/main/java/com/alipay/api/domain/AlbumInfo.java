package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对合作方展示的专辑信息
 *
 * @author auto create
 * @since 1.0, 2024-03-24 21:54:14
 */
public class AlbumInfo extends AlipayObject {

	private static final long serialVersionUID = 1733961996163985847L;

	/**
	 * 专辑名称
	 */
	@ApiField("album_name")
	private String albumName;

	/**
	 * 审核失败原因，可能为空
	 */
	@ApiField("audit_reject_desc")
	private String auditRejectDesc;

	/**
	 * 专辑最新版本的审核状态，可能为空
	 */
	@ApiField("latest_audit_status")
	private String latestAuditStatus;

	/**
	 * 三方专辑id
	 */
	@ApiField("out_album_id")
	private String outAlbumId;

	/**
	 * 对C端用户展示的专辑上下架状态，可能为空。可能出现专辑最新版本还在审核中（latestAuditStatus=AUDIT_ING），但是上一版本已上架（status=ONLINE）情况。
	 */
	@ApiField("status")
	private String status;

	public String getAlbumName() {
		return this.albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getAuditRejectDesc() {
		return this.auditRejectDesc;
	}
	public void setAuditRejectDesc(String auditRejectDesc) {
		this.auditRejectDesc = auditRejectDesc;
	}

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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
