package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新自动售卖机终端设备
 *
 * @author auto create
 * @since 1.0, 2021-08-20 13:06:32
 */
public class AlipayCommerceTerminalVendingModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3372129868559238389L;

	/**
	 * 是否删除
	 */
	@ApiField("delete")
	private String delete;

	/**
	 * 地址位置纬度，使用国标GCJ-02坐标系，取值范围：纬度-90~90，中国地区经度范围：纬度3.86~53.55
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 地址位置经度，使用国标GCJ-02坐标系，取值范围：经度-180~180，中国地区经度范围：73.66~135.05
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 终端设备序列号
	 */
	@ApiField("sn")
	private String sn;

	public String getDelete() {
		return this.delete;
	}
	public void setDelete(String delete) {
		this.delete = delete;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
