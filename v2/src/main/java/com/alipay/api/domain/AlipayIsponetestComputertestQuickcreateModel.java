package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 这是一个测试接口测试
 *
 * @author auto create
 * @since 1.0, 2023-09-12 17:43:27
 */
public class AlipayIsponetestComputertestQuickcreateModel extends AlipayObject {

	private static final long serialVersionUID = 7724923173986495584L;

	/**
	 * 3
	 */
	@ApiField("sssss")
	private Long sssss;

	/**
	 * sss
	 */
	@ApiField("xxxtest")
	private String xxxtest;

	public Long getSssss() {
		return this.sssss;
	}
	public void setSssss(Long sssss) {
		this.sssss = sssss;
	}

	public String getXxxtest() {
		return this.xxxtest;
	}
	public void setXxxtest(String xxxtest) {
		this.xxxtest = xxxtest;
	}

}
