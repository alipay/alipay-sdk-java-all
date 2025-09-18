package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 景点标签数据
 *
 * @author auto create
 * @since 1.0, 2024-09-20 19:27:34
 */
public class PoiTagInfo extends AlipayObject {

	private static final long serialVersionUID = 7298563957527618186L;

	/**
	 * 景点列表
	 */
	@ApiListField("poi_info_list")
	@ApiField("poi_info_vo")
	private List<PoiInfoVo> poiInfoList;

	/**
	 * 景点标签名
	 */
	@ApiField("tag_name")
	private String tagName;

	public List<PoiInfoVo> getPoiInfoList() {
		return this.poiInfoList;
	}
	public void setPoiInfoList(List<PoiInfoVo> poiInfoList) {
		this.poiInfoList = poiInfoList;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
