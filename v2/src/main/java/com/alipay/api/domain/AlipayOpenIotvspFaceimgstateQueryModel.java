package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 刷脸图片上传状态查询
 *
 * @author auto create
 * @since 1.0, 2024-03-18 15:54:20
 */
public class AlipayOpenIotvspFaceimgstateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6351732324618968222L;

	/**
	 * 刷脸产生的ftoken
	 */
	@ApiField("ftoken")
	private String ftoken;

	public String getFtoken() {
		return this.ftoken;
	}
	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

}
