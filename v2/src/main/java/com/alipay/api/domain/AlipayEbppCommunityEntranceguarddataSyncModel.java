package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门禁开门数据回流
 *
 * @author auto create
 * @since 1.0, 2023-04-23 14:30:49
 */
public class AlipayEbppCommunityEntranceguarddataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6363811673244658847L;

	/**
	 * 支付宝小区编码
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
	 * 开门门记录编号
	 */
	@ApiField("enter_record_id")
	private String enterRecordId;

	/**
	 * 开门结果，1成功，0失败
	 */
	@ApiField("enter_result")
	private String enterResult;

	/**
	 * 开门时间
	 */
	@ApiField("enter_time")
	private Date enterTime;

	/**
	 * 加密后的支付宝用户id
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

	public String getEnterResult() {
		return this.enterResult;
	}
	public void setEnterResult(String enterResult) {
		this.enterResult = enterResult;
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
