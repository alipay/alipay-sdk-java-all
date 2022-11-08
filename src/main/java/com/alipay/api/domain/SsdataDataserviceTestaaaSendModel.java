package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * dwdheuidh
 *
 * @author auto create
 * @since 1.0, 2022-09-25 16:30:02
 */
public class SsdataDataserviceTestaaaSendModel extends AlipayObject {

	private static final long serialVersionUID = 8559651333766479816L;

	/**
	 * 座机号码
	 */
	@ApiField("tes_1")
	private String tes1;

	/**
	 * 222
	 */
	@ApiField("test_2")
	private String test2;

	public String getTes1() {
		return this.tes1;
	}
	public void setTes1(String tes1) {
		this.tes1 = tes1;
	}

	public String getTest2() {
		return this.test2;
	}
	public void setTest2(String test2) {
		this.test2 = test2;
	}

}
