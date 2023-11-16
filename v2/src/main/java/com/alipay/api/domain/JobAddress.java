package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 岗位工作地址
 *
 * @author auto create
 * @since 1.0, 2023-08-03 19:29:18
 */
public class JobAddress extends AlipayObject {

	private static final long serialVersionUID = 2892825865915853889L;

	/**
	 * 详细办公地址
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 高德坐标系经纬度
<br/>
经纬度半角逗号分隔
	 */
	@ApiField("geo")
	private String geo;

	/**
	 * 6位行政区域编码
<br/>
至少到城市级编码，否则岗位无法展示，建议传到区(县)级编码，如: 浙江省杭州市西湖区=330106。
<br/>
<a href="https://jiuye.yuque.com/org-wiki-jiuye-cpfcqs/araxo9/ed5yn3asbtes7ni4" target="_blank">全量城市行政区划编码（2020Q1版本）</a>
<br/>
<a href="https://jiuye.yuque.com/org-wiki-jiuye-cpfcqs/araxo9/yi0uix3f0babcfzi" target="_blank"> 全量区县行政区划编码（2020Q1版本） </a>
	 */
	@ApiField("region_code")
	private String regionCode;

	public String getDetail() {
		return this.detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getGeo() {
		return this.geo;
	}
	public void setGeo(String geo) {
		this.geo = geo;
	}

	public String getRegionCode() {
		return this.regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

}
