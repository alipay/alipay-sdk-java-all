package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件检测对象
 *
 * @author auto create
 * @since 1.0, 2025-07-18 10:41:14
 */
public class PropertyFileDetectionVO extends AlipayObject {

	private static final long serialVersionUID = 8123446583486445246L;

	/**
	 * 唯一编码标识
	 */
	@ApiField("code")
	private String code;

	/**
	 * 线圈id
	 */
	@ApiField("coil_id")
	private String coilId;

	/**
	 * 项目id
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 图片大模型检测结果
	 */
	@ApiField("file_ai_check")
	private Boolean fileAiCheck;

	/**
	 * 大模型检测原因
	 */
	@ApiField("file_ai_check_reason")
	private String fileAiCheckReason;

	/**
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件url
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 点位id
	 */
	@ApiField("point_id")
	private String pointId;

	/**
	 * 图片二维码检测结果
	 */
	@ApiField("qrcode_check")
	private Boolean qrcodeCheck;

	/**
	 * 图片二维码检测内容
	 */
	@ApiField("qrcode_check_reason")
	private String qrcodeCheckReason;

	/**
	 * 流水号
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 签到id
	 */
	@ApiField("sign_in_id")
	private String signInId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCoilId() {
		return this.coilId;
	}
	public void setCoilId(String coilId) {
		this.coilId = coilId;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Boolean getFileAiCheck() {
		return this.fileAiCheck;
	}
	public void setFileAiCheck(Boolean fileAiCheck) {
		this.fileAiCheck = fileAiCheck;
	}

	public String getFileAiCheckReason() {
		return this.fileAiCheckReason;
	}
	public void setFileAiCheckReason(String fileAiCheckReason) {
		this.fileAiCheckReason = fileAiCheckReason;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPointId() {
		return this.pointId;
	}
	public void setPointId(String pointId) {
		this.pointId = pointId;
	}

	public Boolean getQrcodeCheck() {
		return this.qrcodeCheck;
	}
	public void setQrcodeCheck(Boolean qrcodeCheck) {
		this.qrcodeCheck = qrcodeCheck;
	}

	public String getQrcodeCheckReason() {
		return this.qrcodeCheckReason;
	}
	public void setQrcodeCheckReason(String qrcodeCheckReason) {
		this.qrcodeCheckReason = qrcodeCheckReason;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSignInId() {
		return this.signInId;
	}
	public void setSignInId(String signInId) {
		this.signInId = signInId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
