package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * jhj测试子场景
 *
 * @author auto create
 * @since 1.0, 2024-01-31 14:24:13
 */
public class AlipayDataDdtJhjtestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7415346145425465227L;

	/**
	 * 123456
	 */
	@ApiField("id")
	private String id;

	/**
	 * 123456
	 */
	@ApiField("id_openid")
	private String idOpenid;

	/**
	 * aa
	 */
	@ApiField("input_a")
	private String inputA;

	/**
	 * aa
	 */
	@ApiField("input_b")
	private String inputB;

	/**
	 * aa
	 */
	@ApiField("input_c")
	private String inputC;

	/**
	 * aa
	 */
	@ApiField("input_d")
	private String inputD;

	/**
	 * aa
	 */
	@ApiField("input_ee")
	private String inputEe;

	/**
	 * aa
	 */
	@ApiField("map_a_openid")
	private String mapAOpenid;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIdOpenid() {
		return this.idOpenid;
	}
	public void setIdOpenid(String idOpenid) {
		this.idOpenid = idOpenid;
	}

	public String getInputA() {
		return this.inputA;
	}
	public void setInputA(String inputA) {
		this.inputA = inputA;
	}

	public String getInputB() {
		return this.inputB;
	}
	public void setInputB(String inputB) {
		this.inputB = inputB;
	}

	public String getInputC() {
		return this.inputC;
	}
	public void setInputC(String inputC) {
		this.inputC = inputC;
	}

	public String getInputD() {
		return this.inputD;
	}
	public void setInputD(String inputD) {
		this.inputD = inputD;
	}

	public String getInputEe() {
		return this.inputEe;
	}
	public void setInputEe(String inputEe) {
		this.inputEe = inputEe;
	}

	public String getMapAOpenid() {
		return this.mapAOpenid;
	}
	public void setMapAOpenid(String mapAOpenid) {
		this.mapAOpenid = mapAOpenid;
	}

}
