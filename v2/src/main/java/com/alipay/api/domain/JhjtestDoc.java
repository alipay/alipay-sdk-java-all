package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文档修改迭代测试用
 *
 * @author auto create
 * @since 1.0, 2024-06-28 13:54:22
 */
public class JhjtestDoc extends AlipayObject {

	private static final long serialVersionUID = 4694798256931656564L;

	/**
	 * 1
	 */
	@ApiField("a_open_id")
	private Long aOpenId;

	/**
	 * 测试测试
	 */
	@ApiField("com_a")
	private RegressionPublic comA;

	/**
	 * 1
	 */
	@ApiField("para_a")
	private Long paraA;

	/**
	 * 1
	 */
	@ApiField("para_b")
	private String paraB;

	/**
	 * 11
	 */
	@ApiField("para_c")
	private String paraC;

	/**
	 * 1
	 */
	@ApiField("para_d")
	private String paraD;

	public Long getaOpenId() {
		return this.aOpenId;
	}
	public void setaOpenId(Long aOpenId) {
		this.aOpenId = aOpenId;
	}

	public RegressionPublic getComA() {
		return this.comA;
	}
	public void setComA(RegressionPublic comA) {
		this.comA = comA;
	}

	public Long getParaA() {
		return this.paraA;
	}
	public void setParaA(Long paraA) {
		this.paraA = paraA;
	}

	public String getParaB() {
		return this.paraB;
	}
	public void setParaB(String paraB) {
		this.paraB = paraB;
	}

	public String getParaC() {
		return this.paraC;
	}
	public void setParaC(String paraC) {
		this.paraC = paraC;
	}

	public String getParaD() {
		return this.paraD;
	}
	public void setParaD(String paraD) {
		this.paraD = paraD;
	}

}
