package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * test
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:12
 */
public class AlipayUserCertifyTestZdpoModel extends AlipayObject {

	private static final long serialVersionUID = 6825449672191678882L;

	/**
	 * 111
	 */
	@ApiField("_test")
	private String Test;

	/**
	 * 111
	 */
	@ApiField("id")
	private String id;

	/**
	 * 333
	 */
	@ApiField("kmttt")
	private String kmttt;

	/**
	 * 111
	 */
	@ApiField("sdfasdfsadfdsafs")
	private String sdfasdfsadfdsafs;

	public String getTest() {
		return this.Test;
	}
	public void setTest(String Test) {
		this.Test = Test;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getKmttt() {
		return this.kmttt;
	}
	public void setKmttt(String kmttt) {
		this.kmttt = kmttt;
	}

	public String getSdfasdfsadfdsafs() {
		return this.sdfasdfsadfdsafs;
	}
	public void setSdfasdfsadfdsafs(String sdfasdfsadfdsafs) {
		this.sdfasdfsadfdsafs = sdfasdfsadfdsafs;
	}

}
