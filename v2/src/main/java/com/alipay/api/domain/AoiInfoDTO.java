package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活圈aoi信息
 *
 * @author auto create
 * @since 1.0, 2020-07-02 10:57:18
 */
public class AoiInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6116412499152711159L;

	/**
	 * 生活圈名称
	 */
	@ApiField("aoi_name")
	private String aoiName;

	/**
	 * 生活圈标签；
1.aoi类型为非社区：AOI名称；
2.aoi类型为社区：AOI名称/店铺所在的街道路名+离当前主AOI的距离
	 */
	@ApiField("aoi_tag")
	private String aoiTag;

	/**
	 * 生活圈小程序URL链接
	 */
	@ApiField("circle_detail_url")
	private String circleDetailUrl;

	/**
	 * 生活圈ID
	 */
	@ApiField("tribe_id")
	private String tribeId;

	public String getAoiName() {
		return this.aoiName;
	}
	public void setAoiName(String aoiName) {
		this.aoiName = aoiName;
	}

	public String getAoiTag() {
		return this.aoiTag;
	}
	public void setAoiTag(String aoiTag) {
		this.aoiTag = aoiTag;
	}

	public String getCircleDetailUrl() {
		return this.circleDetailUrl;
	}
	public void setCircleDetailUrl(String circleDetailUrl) {
		this.circleDetailUrl = circleDetailUrl;
	}

	public String getTribeId() {
		return this.tribeId;
	}
	public void setTribeId(String tribeId) {
		this.tribeId = tribeId;
	}

}
