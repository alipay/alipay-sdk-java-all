package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫开播同步到医疗
 *
 * @author auto create
 * @since 1.0, 2025-04-23 13:49:12
 */
public class AlipayCommerceMedicalHdfLiveSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5368594433642444771L;

	/**
	 * tab3生活号id
	 */
	@ApiField("alipay_public_id")
	private String alipayPublicId;

	/**
	 * 直播流地址
	 */
	@ApiField("live_stream_url")
	private String liveStreamUrl;

	/**
	 * 好大夫小程序医生主页跳转链接
	 */
	@ApiField("out_doc_app_url")
	private String outDocAppUrl;

	/**
	 * 好大夫侧医生id
	 */
	@ApiField("out_doc_id")
	private String outDocId;

	/**
	 * 好大夫侧直播id
	 */
	@ApiField("out_doc_live_id")
	private String outDocLiveId;

	/**
	 * 直播名称
	 */
	@ApiField("out_name")
	private String outName;

	/**
	 * 好大夫侧预告id
	 */
	@ApiField("out_prepare_id")
	private String outPrepareId;

	public String getAlipayPublicId() {
		return this.alipayPublicId;
	}
	public void setAlipayPublicId(String alipayPublicId) {
		this.alipayPublicId = alipayPublicId;
	}

	public String getLiveStreamUrl() {
		return this.liveStreamUrl;
	}
	public void setLiveStreamUrl(String liveStreamUrl) {
		this.liveStreamUrl = liveStreamUrl;
	}

	public String getOutDocAppUrl() {
		return this.outDocAppUrl;
	}
	public void setOutDocAppUrl(String outDocAppUrl) {
		this.outDocAppUrl = outDocAppUrl;
	}

	public String getOutDocId() {
		return this.outDocId;
	}
	public void setOutDocId(String outDocId) {
		this.outDocId = outDocId;
	}

	public String getOutDocLiveId() {
		return this.outDocLiveId;
	}
	public void setOutDocLiveId(String outDocLiveId) {
		this.outDocLiveId = outDocLiveId;
	}

	public String getOutName() {
		return this.outName;
	}
	public void setOutName(String outName) {
		this.outName = outName;
	}

	public String getOutPrepareId() {
		return this.outPrepareId;
	}
	public void setOutPrepareId(String outPrepareId) {
		this.outPrepareId = outPrepareId;
	}

}
