package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DtAudioInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.aics.devin.oneaudio.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 10:49:29
 */
public class DatadigitalAicsDevinOneaudioQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5216958554847791386L;

	/** 
	 * 通话ID
	 */
	@ApiField("acid")
	private String acid;

	/** 
	 * 机器人通话录音
	 */
	@ApiField("ivr_audio")
	private DtAudioInfo ivrAudio;

	/** 
	 * 人工坐席通话录音
	 */
	@ApiField("one_audio")
	private DtAudioInfo oneAudio;

	public void setAcid(String acid) {
		this.acid = acid;
	}
	public String getAcid( ) {
		return this.acid;
	}

	public void setIvrAudio(DtAudioInfo ivrAudio) {
		this.ivrAudio = ivrAudio;
	}
	public DtAudioInfo getIvrAudio( ) {
		return this.ivrAudio;
	}

	public void setOneAudio(DtAudioInfo oneAudio) {
		this.oneAudio = oneAudio;
	}
	public DtAudioInfo getOneAudio( ) {
		return this.oneAudio;
	}

}
