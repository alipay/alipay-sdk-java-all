package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 每天途径的景点信息
 *
 * @author auto create
 * @since 1.0, 2024-09-14 17:21:37
 */
public class PoiListDayVo extends AlipayObject {

	private static final long serialVersionUID = 5717882844345587247L;

	/**
	 * 第几天
	 */
	@ApiField("day")
	private String day;

	/**
	 * 景点列表
	 */
	@ApiListField("poi_info_vo_list")
	@ApiField("poi_info_vo")
	private List<PoiInfoVo> poiInfoVoList;

	public String getDay() {
		return this.day;
	}
	public void setDay(String day) {
		this.day = day;
	}

	public List<PoiInfoVo> getPoiInfoVoList() {
		return this.poiInfoVoList;
	}
	public void setPoiInfoVoList(List<PoiInfoVo> poiInfoVoList) {
		this.poiInfoVoList = poiInfoVoList;
	}

}
