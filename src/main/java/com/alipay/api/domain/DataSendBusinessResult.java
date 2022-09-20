package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据发送业务处理结果信息
 *
 * @author auto create
 * @since 1.0, 2018-01-03 11:52:37
 */
public class DataSendBusinessResult extends AlipayObject {

	private static final long serialVersionUID = 4498864242712812747L;

	/**
	 * 数据发送业务处理结果码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 数据发送业务处理结果描述
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizMsg() {
		return this.bizMsg;
	}
	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}

}
