package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 岗位工作地址
 *
 * @author auto create
 * @since 1.0, 2023-07-21 15:25:16
 */
public class JobAddress extends AlipayObject {

	private static final long serialVersionUID = 2753979696277854152L;

	/**
	 * 详细地址
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 高德坐标系经纬度，半角逗号分隔。
	 */
	@ApiField("geo")
	private String geo;

	/**
	 * 6位行政区域编码，具体到区(县)，如: 浙江省杭州市西湖区=330106。区域编码可参考：https://www.mca.gov.cn/mzsj/xzqh/2022/202201xzqh.html
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
