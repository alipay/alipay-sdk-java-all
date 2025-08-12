package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店关联的支付宝类目
 *
 * @author auto create
 * @since 1.0, 2025-07-05 17:20:08
 */
public class BsMccInfo extends AlipayObject {

	private static final long serialVersionUID = 4515649827727781973L;

	/**
	 * 门店对应的一级类目编码
	 */
	@ApiField("mcc_code_1")
	private String mccCode1;

	/**
	 * 门店对应的二级类目编码
	 */
	@ApiField("mcc_code_2")
	private String mccCode2;

	/**
	 * 门店对应的一级类目名称
	 */
	@ApiField("mcc_name_1")
	private String mccName1;

	/**
	 * 门店对应的二级类目名称
	 */
	@ApiField("mcc_name_2")
	private String mccName2;

	public String getMccCode1() {
		return this.mccCode1;
	}
	public void setMccCode1(String mccCode1) {
		this.mccCode1 = mccCode1;
	}

	public String getMccCode2() {
		return this.mccCode2;
	}
	public void setMccCode2(String mccCode2) {
		this.mccCode2 = mccCode2;
	}

	public String getMccName1() {
		return this.mccName1;
	}
	public void setMccName1(String mccName1) {
		this.mccName1 = mccName1;
	}

	public String getMccName2() {
		return this.mccName2;
	}
	public void setMccName2(String mccName2) {
		this.mccName2 = mccName2;
	}

}
