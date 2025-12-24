package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户Mcc信息
 *
 * @author auto create
 * @since 1.0, 2024-09-05 11:58:30
 */
public class MccInfo extends AlipayObject {

	private static final long serialVersionUID = 4648129815899864357L;

	/**
	 * 调用方内部定义的MCC编号
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * 和mcc_code对应的中文名称
	 */
	@ApiField("mcc_name")
	private String mccName;

	public String getMccCode() {
		return this.mccCode;
	}
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public String getMccName() {
		return this.mccName;
	}
	public void setMccName(String mccName) {
		this.mccName = mccName;
	}

}
