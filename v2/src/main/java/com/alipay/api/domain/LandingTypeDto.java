package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 落地页信息
 *
 * @author auto create
 * @since 1.0, 2024-06-19 15:32:16
 */
public class LandingTypeDto extends AlipayObject {

	private static final long serialVersionUID = 6254416163155348781L;

	/**
	 * 活动列表
	 */
	@ApiListField("landing_act")
	@ApiField("landing_act_dto")
	private List<LandingActDto> landingAct;

	/**
	 * 商品落地页id
	 */
	@ApiField("landing_id")
	private String landingId;

	/**
	 * 落地页名称
	 */
	@ApiField("landing_name")
	private String landingName;

	/**
	 * 视频落地页
	 */
	@ApiField("landing_type")
	private String landingType;

	/**
	 * 商品落地页url
	 */
	@ApiField("landing_url")
	private String landingUrl;

	/**
	 * 商品视频信息
	 */
	@ApiListField("product_videos")
	@ApiField("video_info")
	private List<VideoInfo> productVideos;

	public List<LandingActDto> getLandingAct() {
		return this.landingAct;
	}
	public void setLandingAct(List<LandingActDto> landingAct) {
		this.landingAct = landingAct;
	}

	public String getLandingId() {
		return this.landingId;
	}
	public void setLandingId(String landingId) {
		this.landingId = landingId;
	}

	public String getLandingName() {
		return this.landingName;
	}
	public void setLandingName(String landingName) {
		this.landingName = landingName;
	}

	public String getLandingType() {
		return this.landingType;
	}
	public void setLandingType(String landingType) {
		this.landingType = landingType;
	}

	public String getLandingUrl() {
		return this.landingUrl;
	}
	public void setLandingUrl(String landingUrl) {
		this.landingUrl = landingUrl;
	}

	public List<VideoInfo> getProductVideos() {
		return this.productVideos;
	}
	public void setProductVideos(List<VideoInfo> productVideos) {
		this.productVideos = productVideos;
	}

}
