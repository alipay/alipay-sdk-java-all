package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参赛作品同步接口
 *
 * @author auto create
 * @since 1.0, 2021-05-12 11:00:07
 */
public class AlipayCommerceEducateApplycompetitionWorksSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7411577928475757964L;

	/**
	 * 参赛状态，参赛状态0:已报名，1:已支付，2:已参赛
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 扩展信息JSON格式
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 文件类型1：图片，2：视频
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 参赛者作品url
	 */
	@ApiField("files_url")
	private String filesUrl;

	/**
	 * 参赛者id,由支付宝生成
	 */
	@ApiField("participant_id")
	private String participantId;

	/**
	 * 外部赛事id
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFilesUrl() {
		return this.filesUrl;
	}
	public void setFilesUrl(String filesUrl) {
		this.filesUrl = filesUrl;
	}

	public String getParticipantId() {
		return this.participantId;
	}
	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
