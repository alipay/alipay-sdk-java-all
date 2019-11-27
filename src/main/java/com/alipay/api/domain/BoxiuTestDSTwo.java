package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 2
 *
 * @author auto create
 * @since 1.0, 2017-04-25 10:25:44
 */
public class BoxiuTestDSTwo extends AlipayObject {

	private static final long serialVersionUID = 6312673382798859185L;

	/**
	 * aaa
	 */
	@ApiField("ds")
	private BoxiuTestDS ds;

	/**
	 * 1111
	 */
	@ApiField("out_no")
	private String outNo;

	/**
	 * miaoshu
	 */
	@ApiField("plain_two")
	private String plainTwo;

	public BoxiuTestDS getDs() {
		return this.ds;
	}
	public void setDs(BoxiuTestDS ds) {
		this.ds = ds;
	}

	public String getOutNo() {
		return this.outNo;
	}
	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	public String getPlainTwo() {
		return this.plainTwo;
	}
	public void setPlainTwo(String plainTwo) {
		this.plainTwo = plainTwo;
	}

}
