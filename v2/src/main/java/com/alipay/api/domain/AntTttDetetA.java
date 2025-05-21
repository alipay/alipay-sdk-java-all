package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ant.prodpaas.ttt.detect测试
 *
 * @author auto create
 * @since 1.0, 2022-08-16 16:52:18
 */
public class AntTttDetetA extends AlipayObject {

	private static final long serialVersionUID = 7891269761571762362L;

	/**
	 * 描述地址
	 */
	@ApiField("addr")
	private String addr;

	public String getAddr() {
		return this.addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

}
