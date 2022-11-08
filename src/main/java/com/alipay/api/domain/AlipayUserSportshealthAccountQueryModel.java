package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付宝运动账户
 *
 * @author auto create
 * @since 1.0, 2022-10-24 15:09:47
 */
public class AlipayUserSportshealthAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2581868623819944753L;

	/**
	 * 外部渠道
	 */
	@ApiField("out_biz_channel")
	private String outBizChannel;

	public String getOutBizChannel() {
		return this.outBizChannel;
	}
	public void setOutBizChannel(String outBizChannel) {
		this.outBizChannel = outBizChannel;
	}

}
