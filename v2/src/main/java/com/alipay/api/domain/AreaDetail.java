package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序的区域pv、uv数据
 *
 * @author auto create
 * @since 1.0, 2019-04-26 11:01:43
 */
public class AreaDetail extends AlipayObject {

	private static final long serialVersionUID = 6324193494867392916L;

	/**
	 * 国标六位行政区划代码；参考http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/。当area_name为“其他”等时该字段可能为空
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 行政区划名称；参考http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/。注意，该字段可能存在“其他”、“未知”等
	 */
	@ApiField("area_name")
	private String areaName;

	/**
	 * 小程序在该区域下的pv
	 */
	@ApiField("area_pv")
	private Long areaPv;

	/**
	 * 小程序在该区域下的uv
	 */
	@ApiField("area_uv")
	private Long areaUv;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return this.areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Long getAreaPv() {
		return this.areaPv;
	}
	public void setAreaPv(Long areaPv) {
		this.areaPv = areaPv;
	}

	public Long getAreaUv() {
		return this.areaUv;
	}
	public void setAreaUv(Long areaUv) {
		this.areaUv = areaUv;
	}

}
