package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫关播同步到医疗
 *
 * @author auto create
 * @since 1.0, 2025-04-22 21:11:05
 */
public class AlipayCommerceMedicalHdfLiveCloseModel extends AlipayObject {

	private static final long serialVersionUID = 7166427835924581155L;

	/**
	 * 支付宝侧直播id
	 */
	@ApiField("alipay_live_id")
	private String alipayLiveId;

	/**
	 * 直播预告类型
开播：live
预告：prepare
	 */
	@ApiField("live_prepare_type")
	private String livePrepareType;

	/**
	 * 好大夫侧医生id
	 */
	@ApiField("out_doc_id")
	private String outDocId;

	/**
	 * 好大夫侧直播id
	 */
	@ApiField("out_live_id")
	private String outLiveId;

	public String getAlipayLiveId() {
		return this.alipayLiveId;
	}
	public void setAlipayLiveId(String alipayLiveId) {
		this.alipayLiveId = alipayLiveId;
	}

	public String getLivePrepareType() {
		return this.livePrepareType;
	}
	public void setLivePrepareType(String livePrepareType) {
		this.livePrepareType = livePrepareType;
	}

	public String getOutDocId() {
		return this.outDocId;
	}
	public void setOutDocId(String outDocId) {
		this.outDocId = outDocId;
	}

	public String getOutLiveId() {
		return this.outLiveId;
	}
	public void setOutLiveId(String outLiveId) {
		this.outLiveId = outLiveId;
	}

}
