package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对合作方展示的声音信息，一个专辑下包含一个或者多个声音
 *
 * @author auto create
 * @since 1.0, 2024-03-23 23:59:13
 */
public class SoundInfo extends AlipayObject {

	private static final long serialVersionUID = 6325545476993346216L;

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
	 * 声音最新版本的审核状态，可能为空
	 */
	@ApiField("latest_audit_status")
	private String latestAuditStatus;

	/**
	 * 三方专辑id
	 */
	@ApiField("out_album_id")
	private String outAlbumId;

	/**
	 * 三方声音id
	 */
	@ApiField("out_sound_id")
	private String outSoundId;

	/**
	 * 声音名称
	 */
	@ApiField("sound_name")
	private String soundName;

	/**
	 * 专辑内的声音顺序，可能被支付宝修改
	 */
	@ApiField("sound_order")
	private Long soundOrder;

	/**
	 * 对C端用户展示的声音上下架状态，可能为空。仅当专辑和声音都上架的时候才返回ONLINE
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

	public String getOutSoundId() {
		return this.outSoundId;
	}
	public void setOutSoundId(String outSoundId) {
		this.outSoundId = outSoundId;
	}

	public String getSoundName() {
		return this.soundName;
	}
	public void setSoundName(String soundName) {
		this.soundName = soundName;
	}

	public Long getSoundOrder() {
		return this.soundOrder;
	}
	public void setSoundOrder(Long soundOrder) {
		this.soundOrder = soundOrder;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
