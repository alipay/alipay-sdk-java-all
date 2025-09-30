package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AudioInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.crm.oneaudio.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 11:02:28
 */
public class AlipayIserviceCcmCrmOneaudioQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1576816243618961848L;

	/** 
	 * 通话ID
	 */
	@ApiField("acid")
	private String acid;

	/** 
	 * 机器人通话录音
	 */
	@ApiField("ivr_audio")
	private AudioInfo ivrAudio;

	/** 
	 * 人工坐席通话录音
	 */
	@ApiField("one_audio")
	private AudioInfo oneAudio;

	public void setAcid(String acid) {
		this.acid = acid;
	}
	public String getAcid( ) {
		return this.acid;
	}

	public void setIvrAudio(AudioInfo ivrAudio) {
		this.ivrAudio = ivrAudio;
	}
	public AudioInfo getIvrAudio( ) {
		return this.ivrAudio;
	}

	public void setOneAudio(AudioInfo oneAudio) {
		this.oneAudio = oneAudio;
	}
	public AudioInfo getOneAudio( ) {
		return this.oneAudio;
	}

}
