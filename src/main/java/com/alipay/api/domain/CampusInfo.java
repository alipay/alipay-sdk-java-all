package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校区信息
 *
 * @author auto create
 * @since 1.0, 2022-01-14 17:19:11
 */
public class CampusInfo extends AlipayObject {

	private static final long serialVersionUID = 2758225471285466759L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 校区id
	 */
	@ApiField("campus_id")
	private String campusId;

	/**
	 * 校区名称
	 */
	@ApiField("campus_name")
	private String campusName;

	/**
	 * 学校名称
	 */
	@ApiField("inst_name")
	private String instName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCampusId() {
		return this.campusId;
	}
	public void setCampusId(String campusId) {
		this.campusId = campusId;
	}

	public String getCampusName() {
		return this.campusName;
	}
	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

}
