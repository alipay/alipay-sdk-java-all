package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试接口
 *
 * @author auto create
 * @since 1.0, 2016-11-15 14:12:57
 */
public class AlipayOpenAppTestModel extends AlipayObject {

	private static final long serialVersionUID = 1724334463575451459L;

	/**
	 * 22
	 */
	@ApiField("out_request_nos")
	private String outRequestNos;

	/**
	 * 1
	 */
	@ApiField("t")
	private Long t;

	/**
	 * 1
	 */
	@ApiField("tet")
	private String tet;

	public String getOutRequestNos() {
		return this.outRequestNos;
	}
	public void setOutRequestNos(String outRequestNos) {
		this.outRequestNos = outRequestNos;
	}

	public Long getT() {
		return this.t;
	}
	public void setT(Long t) {
		this.t = t;
	}

	public String getTet() {
		return this.tet;
	}
	public void setTet(String tet) {
		this.tet = tet;
	}

}
