package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开门记录换取用户脱敏信息
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:34:06
 */
public class AlipayEbppCommunityAccessUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3272344567875425451L;

	/**
	 * 小区code
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * 设备ID
	 */
	@ApiField("dev_id")
	private String devId;

	/**
	 * 如果开门失败，记录失败原因（sdk错误码）
	 */
	@ApiField("enter_error_message")
	private String enterErrorMessage;

	/**
	 * 进门记录编号
	 */
	@ApiField("enter_record_id")
	private String enterRecordId;

	/**
	 * 进门结果，1成功，0失败
	 */
	@ApiField("enter_success")
	private String enterSuccess;

	/**
	 * 进门时间
	 */
	@ApiField("enter_time")
	private Date enterTime;

	/**
	 * 用户id（加密后）
	 */
	@ApiField("user_id_encrypt")
	private String userIdEncrypt;

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

	public String getDevId() {
		return this.devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getEnterErrorMessage() {
		return this.enterErrorMessage;
	}
	public void setEnterErrorMessage(String enterErrorMessage) {
		this.enterErrorMessage = enterErrorMessage;
	}

	public String getEnterRecordId() {
		return this.enterRecordId;
	}
	public void setEnterRecordId(String enterRecordId) {
		this.enterRecordId = enterRecordId;
	}

	public String getEnterSuccess() {
		return this.enterSuccess;
	}
	public void setEnterSuccess(String enterSuccess) {
		this.enterSuccess = enterSuccess;
	}

	public Date getEnterTime() {
		return this.enterTime;
	}
	public void setEnterTime(Date enterTime) {
		this.enterTime = enterTime;
	}

	public String getUserIdEncrypt() {
		return this.userIdEncrypt;
	}
	public void setUserIdEncrypt(String userIdEncrypt) {
		this.userIdEncrypt = userIdEncrypt;
	}

}
