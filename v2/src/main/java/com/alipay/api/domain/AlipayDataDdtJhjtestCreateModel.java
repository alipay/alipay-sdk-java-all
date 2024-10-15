package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * jhj测试子场景
 *
 * @author auto create
 * @since 1.0, 2024-03-18 14:49:19
 */
public class AlipayDataDdtJhjtestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8887739114353365768L;

	/**
	 * 描述
	 */
	@ApiField("com_a")
	private PubNestPub comA;

	/**
	 * 123456222
	 */
	@ApiField("id")
	private String id;

	/**
	 * 123456
	 */
	@ApiField("id_openid")
	private String idOpenid;

	/**
	 * 老链路修改a_test_a老链路修改a_test_a老链路修改a_test_a 当前字段已废弃(废弃了的)
	 */
	@ApiField("input_a")
	@Deprecated
	private String inputA;

	/**
	 * 描述很长描述很长描述很长描述很长描述很长描述很长描述很长
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
	 * jhj测试子场景（修改）jhj测试子场景（修改）jhj测试子场景（修改）jhj测试子场景（修改）jhj测试子场景（修改）
	 */
	@ApiField("map_a_openid")
	private String mapAOpenid;

	public PubNestPub getComA() {
		return this.comA;
	}
	public void setComA(PubNestPub comA) {
		this.comA = comA;
	}

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
