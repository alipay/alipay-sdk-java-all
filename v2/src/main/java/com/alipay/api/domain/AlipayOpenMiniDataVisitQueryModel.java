package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序当日访问数据查询
 *
 * @author auto create
 * @since 1.0, 2019-06-12 12:04:36
 */
public class AlipayOpenMiniDataVisitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8174591948735876586L;

	/**
	 * 查询数据范围；APP_SUMMARY代表仅查询小程序的访问数据，AREA_DETAIL代表同时查询区域下该小程序的访问数据
	 */
	@ApiField("data_scope")
	private String dataScope;

	/**
	 * 国标六位省份行政区划编码，参考http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/；data_scope传入AREA_DETAIL时该参数有效，传空表示同时查询各省的访问数据，否则同时查询该省份行政区划下的各城市访问数据。
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getDataScope() {
		return this.dataScope;
	}
	public void setDataScope(String dataScope) {
		this.dataScope = dataScope;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
