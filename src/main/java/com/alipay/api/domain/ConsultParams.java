package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * string k-v参数容器
 *
 * @author auto create
 * @since 1.0, 2021-03-22 20:48:51
 */
public class ConsultParams extends AlipayObject {

	private static final long serialVersionUID = 6379899446226928421L;

	/**
	 * 集团havana ID
	 */
	@ApiField("another_hid")
	private String anotherHid;

	public String getAnotherHid() {
		return this.anotherHid;
	}
	public void setAnotherHid(String anotherHid) {
		this.anotherHid = anotherHid;
	}

}
