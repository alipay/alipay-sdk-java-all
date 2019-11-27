package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Alipass同步业务信息返回结果
 *
 * @author auto create
 * @since 1.0, 2013-09-26 17:01:14
 */
public class AlipassBizResult extends AlipayObject {

	private static final long serialVersionUID = 3639232776335163982L;

	/**
	 * Alipass ID
	 */
	@ApiField("pass_id")
	private String passId;

	/**
	 * Alipass同步结果
	 */
	@ApiField("result")
	private String result;

	/**
	 * Alipass唯一业务标识，由商户确保其唯一性。在json返回结果中为serialNumber
	 */
	@ApiField("serial_number")
	private String serialNumber;

	public String getPassId() {
		return this.passId;
	}
	public void setPassId(String passId) {
		this.passId = passId;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

}
