package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 3.0查询测试
 *
 * @author auto create
 * @since 1.0, 2022-12-27 10:30:13
 */
public class AlipayOpenAppTestQinyuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5781479845916557246L;

	/**
	 * 1
	 */
	@ApiField("oid")
	private String oid;

	public String getOid() {
		return this.oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}

}
