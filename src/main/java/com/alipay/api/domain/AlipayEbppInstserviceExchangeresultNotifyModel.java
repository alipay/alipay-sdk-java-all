package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商积分兑换结果通知
 *
 * @author auto create
 * @since 1.0, 2022-09-20 17:46:58
 */
public class AlipayEbppInstserviceExchangeresultNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 6435857269652673976L;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * S: 兑换成功
F: 兑换失败
	 */
	@ApiField("status")
	private String status;

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
