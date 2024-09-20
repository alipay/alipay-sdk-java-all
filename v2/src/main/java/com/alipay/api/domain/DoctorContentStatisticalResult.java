package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生内容数据统计结果
 *
 * @author auto create
 * @since 1.0, 2024-05-14 10:44:51
 */
public class DoctorContentStatisticalResult extends AlipayObject {

	private static final long serialVersionUID = 7634215359229419455L;

	/**
	 * 累计用户观看文章数
	 */
	@ApiField("article_pv_total")
	private String articlePvTotal;

	/**
	 * 累计发送图文公益文章数
	 */
	@ApiField("article_total")
	private String articleTotal;

	/**
	 * 累计直播观看次数
	 */
	@ApiField("live_pv_total")
	private String livePvTotal;

	/**
	 * 累计直播次数
	 */
	@ApiField("live_total")
	private String liveTotal;

	/**
	 * 外部医生ID
	 */
	@ApiField("merchant_doctor_id")
	private String merchantDoctorId;

	/**
	 * 点赞数
	 */
	@ApiField("praise_count")
	private String praiseCount;

	/**
	 * 累计用户观看视频数
	 */
	@ApiField("video_pv_total")
	private String videoPvTotal;

	/**
	 * 累计发送公益短视频或科普是视频数
	 */
	@ApiField("video_total")
	private String videoTotal;

	public String getArticlePvTotal() {
		return this.articlePvTotal;
	}
	public void setArticlePvTotal(String articlePvTotal) {
		this.articlePvTotal = articlePvTotal;
	}

	public String getArticleTotal() {
		return this.articleTotal;
	}
	public void setArticleTotal(String articleTotal) {
		this.articleTotal = articleTotal;
	}

	public String getLivePvTotal() {
		return this.livePvTotal;
	}
	public void setLivePvTotal(String livePvTotal) {
		this.livePvTotal = livePvTotal;
	}

	public String getLiveTotal() {
		return this.liveTotal;
	}
	public void setLiveTotal(String liveTotal) {
		this.liveTotal = liveTotal;
	}

	public String getMerchantDoctorId() {
		return this.merchantDoctorId;
	}
	public void setMerchantDoctorId(String merchantDoctorId) {
		this.merchantDoctorId = merchantDoctorId;
	}

	public String getPraiseCount() {
		return this.praiseCount;
	}
	public void setPraiseCount(String praiseCount) {
		this.praiseCount = praiseCount;
	}

	public String getVideoPvTotal() {
		return this.videoPvTotal;
	}
	public void setVideoPvTotal(String videoPvTotal) {
		this.videoPvTotal = videoPvTotal;
	}

	public String getVideoTotal() {
		return this.videoTotal;
	}
	public void setVideoTotal(String videoTotal) {
		this.videoTotal = videoTotal;
	}

}
