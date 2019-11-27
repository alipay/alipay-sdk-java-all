package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 室内地图相关数据
 *
 * @author auto create
 * @since 1.0, 2018-10-19 16:05:10
 */
public class AmapIndoorData extends AlipayObject {

	private static final long serialVersionUID = 8877574566558152759L;

	/**
	 * 当前POI的父级POI
	 */
	@ApiField("cpid")
	private String cpid;

	public String getCpid() {
		return this.cpid;
	}
	public void setCpid(String cpid) {
		this.cpid = cpid;
	}

}
