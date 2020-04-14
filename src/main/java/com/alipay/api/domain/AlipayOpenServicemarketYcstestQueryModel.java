package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 时劼的测试api
 *
 * @author auto create
 * @since 1.0, 2018-10-18 18:56:08
 */
public class AlipayOpenServicemarketYcstestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2868277932579255748L;

	/**
	 * aaaa
	 */
	@ApiField("in_1")
	private String in1;

	/**
	 * 222
	 */
	@ApiField("in_2")
	private Boolean in2;

	/**
	 * 333
	 */
	@ApiField("in_3")
	private Date in3;

	/**
	 * 444
	 */
	@ApiField("in_4")
	private Long in4;

	/**
	 * 55
	 */
	@ApiField("in_5")
	private String in5;

	/**
	 * 66666
	 */
	@ApiField("in_6")
	private XwbTestData in6;

	public String getIn1() {
		return this.in1;
	}
	public void setIn1(String in1) {
		this.in1 = in1;
	}

	public Boolean getIn2() {
		return this.in2;
	}
	public void setIn2(Boolean in2) {
		this.in2 = in2;
	}

	public Date getIn3() {
		return this.in3;
	}
	public void setIn3(Date in3) {
		this.in3 = in3;
	}

	public Long getIn4() {
		return this.in4;
	}
	public void setIn4(Long in4) {
		this.in4 = in4;
	}

	public String getIn5() {
		return this.in5;
	}
	public void setIn5(String in5) {
		this.in5 = in5;
	}

	public XwbTestData getIn6() {
		return this.in6;
	}
	public void setIn6(XwbTestData in6) {
		this.in6 = in6;
	}

}
