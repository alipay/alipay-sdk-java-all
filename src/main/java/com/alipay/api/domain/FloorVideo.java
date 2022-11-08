package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人工层视频
 *
 * @author auto create
 * @since 1.0, 2022-03-25 17:14:50
 */
public class FloorVideo extends AlipayObject {

	private static final long serialVersionUID = 7374338194646369137L;

	/**
	 * 货柜层号
	 */
	@ApiField("floor_id")
	private String floorId;

	/**
	 * 当前人工层是否有变化
	 */
	@ApiField("if_changed")
	private Boolean ifChanged;

	/**
	 * 视频地址
	 */
	@ApiListField("video_urls")
	@ApiField("string")
	private List<String> videoUrls;

	public String getFloorId() {
		return this.floorId;
	}
	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}

	public Boolean getIfChanged() {
		return this.ifChanged;
	}
	public void setIfChanged(Boolean ifChanged) {
		this.ifChanged = ifChanged;
	}

	public List<String> getVideoUrls() {
		return this.videoUrls;
	}
	public void setVideoUrls(List<String> videoUrls) {
		this.videoUrls = videoUrls;
	}

}
