package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫开播预告同步到医疗
 *
 * @author auto create
 * @since 1.0, 2025-04-23 13:48:52
 */
public class AlipayCommerceMedicalHdfPreviewSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8329277666782128656L;

	/**
	 * tab3生活号id
	 */
	@ApiField("alipay_public_id")
	private String alipayPublicId;

	/**
	 * 操作类型
	 */
	@ApiField("out_action")
	private String outAction;

	/**
	 * 直播预告封面链接
	 */
	@ApiField("out_cover_img")
	private String outCoverImg;

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
	 * 预约开播时间 格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("out_live_time")
	private Date outLiveTime;

	/**
	 * 外部的预告id，和支付宝直播域的预告id有关联
	 */
	@ApiField("out_prepare_id")
	private String outPrepareId;

	/**
	 * 对直播主题的简短描述
	 */
	@ApiField("out_title")
	private String outTitle;

	public String getAlipayPublicId() {
		return this.alipayPublicId;
	}
	public void setAlipayPublicId(String alipayPublicId) {
		this.alipayPublicId = alipayPublicId;
	}

	public String getOutAction() {
		return this.outAction;
	}
	public void setOutAction(String outAction) {
		this.outAction = outAction;
	}

	public String getOutCoverImg() {
		return this.outCoverImg;
	}
	public void setOutCoverImg(String outCoverImg) {
		this.outCoverImg = outCoverImg;
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

	public Date getOutLiveTime() {
		return this.outLiveTime;
	}
	public void setOutLiveTime(Date outLiveTime) {
		this.outLiveTime = outLiveTime;
	}

	public String getOutPrepareId() {
		return this.outPrepareId;
	}
	public void setOutPrepareId(String outPrepareId) {
		this.outPrepareId = outPrepareId;
	}

	public String getOutTitle() {
		return this.outTitle;
	}
	public void setOutTitle(String outTitle) {
		this.outTitle = outTitle;
	}

}
