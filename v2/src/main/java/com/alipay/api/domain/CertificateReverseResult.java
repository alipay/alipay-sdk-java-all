package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证撤销核销结果
 *
 * @author auto create
 * @since 1.0, 2023-05-31 11:00:48
 */
public class CertificateReverseResult extends AlipayObject {

	private static final long serialVersionUID = 1152193471344896359L;

	/**
	 * 结果说明
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 撤销结果枚举
	 */
	@ApiField("result")
	private String result;

	/**
	 * 撤销接口传入的核销操作单号
	 */
	@ApiField("use_order_no")
	private String useOrderNo;

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getUseOrderNo() {
		return this.useOrderNo;
	}
	public void setUseOrderNo(String useOrderNo) {
		this.useOrderNo = useOrderNo;
	}

}
