package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建直播间并开始直播
 *
 * @author auto create
 * @since 1.0, 2025-04-22 13:58:24
 */
public class AlipayContentLiveLiveroomCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7447352212895244131L;

	/**
	 * 预告id，从创建预告接口获取
	 */
	@ApiField("alipay_advance_id")
	private String alipayAdvanceId;

	/**
	 * 用户生活号标识id
	 */
	@ApiField("alipay_public_id")
	private String alipayPublicId;

	/**
	 * 封面图片url地址，尺寸1:1
	 */
	@ApiField("cover_url")
	private String coverUrl;

	/**
	 * 直播封面图片，尺寸3:4
	 */
	@ApiField("cover_url_3_x_4")
	private String coverUrl3X4;

	/**
	 * 直播业务场景，调用前找直播平台协商。
	 */
	@ApiField("live_biz_scene")
	private String liveBizScene;

	/**
	 * 直播流地址
	 */
	@ApiField("live_stream_url")
	private String liveStreamUrl;

	/**
	 * 直播标题
	 */
	@ApiField("live_title")
	private String liveTitle;

	/**
	 * 外部直播id，和接口返回支付宝直播id对应
	 */
	@ApiField("out_live_id")
	private String outLiveId;

	public String getAlipayAdvanceId() {
		return this.alipayAdvanceId;
	}
	public void setAlipayAdvanceId(String alipayAdvanceId) {
		this.alipayAdvanceId = alipayAdvanceId;
	}

	public String getAlipayPublicId() {
		return this.alipayPublicId;
	}
	public void setAlipayPublicId(String alipayPublicId) {
		this.alipayPublicId = alipayPublicId;
	}

	public String getCoverUrl() {
		return this.coverUrl;
	}
	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	public String getCoverUrl3X4() {
		return this.coverUrl3X4;
	}
	public void setCoverUrl3X4(String coverUrl3X4) {
		this.coverUrl3X4 = coverUrl3X4;
	}

	public String getLiveBizScene() {
		return this.liveBizScene;
	}
	public void setLiveBizScene(String liveBizScene) {
		this.liveBizScene = liveBizScene;
	}

	public String getLiveStreamUrl() {
		return this.liveStreamUrl;
	}
	public void setLiveStreamUrl(String liveStreamUrl) {
		this.liveStreamUrl = liveStreamUrl;
	}

	public String getLiveTitle() {
		return this.liveTitle;
	}
	public void setLiveTitle(String liveTitle) {
		this.liveTitle = liveTitle;
	}

	public String getOutLiveId() {
		return this.outLiveId;
	}
	public void setOutLiveId(String outLiveId) {
		this.outLiveId = outLiveId;
	}

}
