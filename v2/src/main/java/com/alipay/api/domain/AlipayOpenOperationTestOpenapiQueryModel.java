package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openapi接口id_type映射测试
 *
 * @author auto create
 * @since 1.0, 2023-08-22 17:40:36
 */
public class AlipayOpenOperationTestOpenapiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7583459878789485112L;

	/**
	 * test
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * test
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 金额为元
	 */
	@ApiField("price_a")
	private String priceA;

	/**
	 * ,微信，
	 */
	@ApiField("test_b")
	private String testB;

	/**
	 * json
	 */
	@ApiField("test_c")
	private String testC;

	/**
	 * test
	 */
	@ApiField("u_test")
	private String uTest;

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPriceA() {
		return this.priceA;
	}
	public void setPriceA(String priceA) {
		this.priceA = priceA;
	}

	public String getTestB() {
		return this.testB;
	}
	public void setTestB(String testB) {
		this.testB = testB;
	}

	public String getTestC() {
		return this.testC;
	}
	public void setTestC(String testC) {
		this.testC = testC;
	}

	public String getuTest() {
		return this.uTest;
	}
	public void setuTest(String uTest) {
		this.uTest = uTest;
	}

}
