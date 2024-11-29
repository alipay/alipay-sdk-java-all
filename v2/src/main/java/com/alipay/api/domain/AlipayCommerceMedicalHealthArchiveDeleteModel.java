package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗健康档案数据删除接口
 *
 * @author auto create
 * @since 1.0, 2024-11-27 15:20:18
 */
public class AlipayCommerceMedicalHealthArchiveDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2378249879757487599L;

	/**
	 * 会话ID
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 档案ID、报告ID、药盒识别ID
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 类型编码
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 会话SessionId
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 填写号码
	 */
	@ApiField("user_card_no")
	private String userCardNo;

	/**
	 * 填写证件类型
	 */
	@ApiField("user_cert_type")
	private String userCertType;

	/**
	 * 取当前会话的用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserCardNo() {
		return this.userCardNo;
	}
	public void setUserCardNo(String userCardNo) {
		this.userCardNo = userCardNo;
	}

	public String getUserCertType() {
		return this.userCertType;
	}
	public void setUserCertType(String userCertType) {
		this.userCertType = userCertType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
