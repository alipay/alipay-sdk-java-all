package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线下门店服务人员信息
 *
 * @author auto create
 * @since 1.0, 2020-02-29 10:44:15
 */
public class ShopStaffInfo extends AlipayObject {

	private static final long serialVersionUID = 1516731143915272418L;

	/**
	 * 服务人员描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 工作人员名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务人员照片
	 */
	@ApiField("picture")
	private String picture;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return this.picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}

}
