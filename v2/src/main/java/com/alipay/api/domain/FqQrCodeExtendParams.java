package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期码扩展字段
 *
 * @author auto create
 * @since 1.0, 2022-12-13 14:57:51
 */
public class FqQrCodeExtendParams extends AlipayObject {

	private static final long serialVersionUID = 8372529472974171741L;

	/**
	 * 分期数
	 */
	@ApiField("fq_num")
	private String fqNum;

	public String getFqNum() {
		return this.fqNum;
	}
	public void setFqNum(String fqNum) {
		this.fqNum = fqNum;
	}

}
