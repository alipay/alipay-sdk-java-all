package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RemindTextInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfrtc.videoconference.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-17 14:44:04
 */
public class AlipayCommerceMedicalHdfrtcVideoconferenceCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 1678932839186224264L;

	/** 
	 * 是否允许接入会议（0：不允许 1：允许）
	 */
	@ApiField("can_enter")
	private Long canEnter;

	/** 
	 * 对方是否进入会议室提醒
	 */
	@ApiField("party_entered_tips")
	private String partyEnteredTips;

	/** 
	 * 弹窗文案
	 */
	@ApiListField("remind_text_list")
	@ApiField("remind_text_info")
	private List<RemindTextInfo> remindTextList;

	/** 
	 * 弹窗标题
	 */
	@ApiField("title")
	private String title;

	public void setCanEnter(Long canEnter) {
		this.canEnter = canEnter;
	}
	public Long getCanEnter( ) {
		return this.canEnter;
	}

	public void setPartyEnteredTips(String partyEnteredTips) {
		this.partyEnteredTips = partyEnteredTips;
	}
	public String getPartyEnteredTips( ) {
		return this.partyEnteredTips;
	}

	public void setRemindTextList(List<RemindTextInfo> remindTextList) {
		this.remindTextList = remindTextList;
	}
	public List<RemindTextInfo> getRemindTextList( ) {
		return this.remindTextList;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

}
