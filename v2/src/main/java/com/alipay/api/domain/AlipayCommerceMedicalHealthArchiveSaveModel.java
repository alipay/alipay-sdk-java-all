package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗健康档案数据保存接口
 *
 * @author auto create
 * @since 1.0, 2025-03-10 17:34:55
 */
public class AlipayCommerceMedicalHealthArchiveSaveModel extends AlipayObject {

	private static final long serialVersionUID = 2653871684199997969L;

	/**
	 * 会话ID
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 档案内容
	 */
	@ApiField("data")
	private String data;

	/**
	 * 档案ID：报告ID等，从会话来的可存会话ID
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 报告名称、药盒名称
	 */
	@ApiField("data_name")
	private String dataName;

	/**
	 * 数据来源，小程序可填写orgId
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 健康档案字类型，可以用来划分健康自测量表的二级分类，如心理健康下的焦虑症自测，如果不传无法通过subType检测，
	 */
	@ApiField("data_sub_type")
	private String dataSubType;

	/**
	 * 数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 文件类型
	 */
	@ApiField("pic_type")
	private String picType;

	/**
	 * 图片或PDF链接，完整链接
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 会话的sessionId
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 用户证件编码
	 */
	@ApiField("user_card_no")
	private String userCardNo;

	/**
	 * 身份证
	 */
	@ApiField("user_cert_type")
	private String userCertType;

	/**
	 * 用户的userId，取当前会话的用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataName() {
		return this.dataName;
	}
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getDataSubType() {
		return this.dataSubType;
	}
	public void setDataSubType(String dataSubType) {
		this.dataSubType = dataSubType;
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

	public String getPicType() {
		return this.picType;
	}
	public void setPicType(String picType) {
		this.picType = picType;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
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
