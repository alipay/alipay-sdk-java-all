package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸识别扩展信息
 *
 * @author auto create
 * @since 1.0, 2018-11-20 14:55:51
 */
public class FaceExtParams extends AlipayObject {

	private static final long serialVersionUID = 7322464346575351134L;

	/**
	 * 业务类型：7，基于1:N人脸搜索的刷脸支付场景；8，基于姓名和身份证号的刷脸支付场景。
	 */
	@ApiField("biz_type")
	private String bizType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

}
