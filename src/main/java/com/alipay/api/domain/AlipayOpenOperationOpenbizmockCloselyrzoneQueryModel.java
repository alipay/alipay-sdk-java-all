package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试路由转发closelyrzone
 *
 * @author auto create
 * @since 1.0, 2022-10-10 18:44:41
 */
public class AlipayOpenOperationOpenbizmockCloselyrzoneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4413641919382848297L;

	/**
	 * 测试人员测试
	 */
	@ApiField("a")
	private String a;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

}
