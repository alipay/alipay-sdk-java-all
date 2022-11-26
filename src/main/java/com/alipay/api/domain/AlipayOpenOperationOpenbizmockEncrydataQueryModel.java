package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试专用_此接口类型为强制加密接口
 *
 * @author auto create
 * @since 1.0, 2022-11-21 14:26:33
 */
public class AlipayOpenOperationOpenbizmockEncrydataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3369679686473375834L;

	/**
	 * 测试
	 */
	@ApiField("biz_no")
	private String bizNo;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

}
