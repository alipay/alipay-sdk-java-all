package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.member.chat.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-06 14:52:41
 */
public class AlipayCommerceMedicalMemberChatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7639945674361991584L;

	/** 
	 * 头像地址
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 医生接诊状态
	 */
	@ApiField("doctor_inquiry_status")
	private String doctorInquiryStatus;

	/** 
	 * 用户没有查看到的医生消息
	 */
	@ApiField("doctor_message")
	private Long doctorMessage;

	/** 
	 * 好大夫提供的客户与医生交流的页面地址
	 */
	@ApiField("doctor_url")
	private String doctorUrl;

	/** 
	 * 意图来源
	 */
	@ApiField("intention_source")
	private String intentionSource;

	/** 
	 * 健康师的昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/** 
	 * 标语
	 */
	@ApiField("slogan")
	private String slogan;

	/** 
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/** 
	 * 未读消息数量
	 */
	@ApiField("unread_message")
	private Long unreadMessage;

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAvatar( ) {
		return this.avatar;
	}

	public void setDoctorInquiryStatus(String doctorInquiryStatus) {
		this.doctorInquiryStatus = doctorInquiryStatus;
	}
	public String getDoctorInquiryStatus( ) {
		return this.doctorInquiryStatus;
	}

	public void setDoctorMessage(Long doctorMessage) {
		this.doctorMessage = doctorMessage;
	}
	public Long getDoctorMessage( ) {
		return this.doctorMessage;
	}

	public void setDoctorUrl(String doctorUrl) {
		this.doctorUrl = doctorUrl;
	}
	public String getDoctorUrl( ) {
		return this.doctorUrl;
	}

	public void setIntentionSource(String intentionSource) {
		this.intentionSource = intentionSource;
	}
	public String getIntentionSource( ) {
		return this.intentionSource;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getNickName( ) {
		return this.nickName;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public String getSlogan( ) {
		return this.slogan;
	}

	public void setSource(String source) {
		this.source = source;
	}
	public String getSource( ) {
		return this.source;
	}

	public void setUnreadMessage(Long unreadMessage) {
		this.unreadMessage = unreadMessage;
	}
	public Long getUnreadMessage( ) {
		return this.unreadMessage;
	}

}
