package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 落地页信息
 *
 * @author auto create
 * @since 1.0, 2025-04-02 15:27:56
 */
public class LandingTypeDto extends AlipayObject {

	private static final long serialVersionUID = 1776968527842834425L;

	/**
	 * 活动列表
	 */
	@ApiListField("landing_act")
	@ApiField("landing_act_dto")
	private List<LandingActDto> landingAct;

	/**
	 * 商品落地页id，同一个商品的落地页id唯一。
	 */
	@ApiField("landing_id")
	private String landingId;

	/**
	 * 落地页名称，同一个商品的落地页名称唯一。
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
	 * 图文落地页中的图片地址，landing_type值为2的时候必填，至少一张图片地址
	 */
	@ApiListField("pic_info_list")
	@ApiField("string")
	private List<String> picInfoList;

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

	public List<String> getPicInfoList() {
		return this.picInfoList;
	}
	public void setPicInfoList(List<String> picInfoList) {
		this.picInfoList = picInfoList;
	}

	public List<VideoInfo> getProductVideos() {
		return this.productVideos;
	}
	public void setProductVideos(List<VideoInfo> productVideos) {
		this.productVideos = productVideos;
	}

}
