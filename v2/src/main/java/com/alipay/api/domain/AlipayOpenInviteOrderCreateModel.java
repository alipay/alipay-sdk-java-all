package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV邀约即授权页面创建
 *
 * @author auto create
 * @since 1.0, 2023-02-07 16:47:32
 */
public class AlipayOpenInviteOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8481624845834247914L;

	/**
	 * ISV 业务系统的申请单 id。由 ISV 自定义，支付宝会将该值拼接在 isv_return_url 后返回，ISV 可据此做业务处理。
	 */
	@ApiField("isv_biz_id")
	private String isvBizId;

	/**
	 * ISV 平台的回跳地址。商户从 ISV 平台跳转至支付宝提交签约申请后，在结果页可以回跳至该页面。
	 */
	@ApiField("isv_return_url")
	private String isvReturnUrl;

	public String getIsvBizId() {
		return this.isvBizId;
	}
	public void setIsvBizId(String isvBizId) {
		this.isvBizId = isvBizId;
	}

	public String getIsvReturnUrl() {
		return this.isvReturnUrl;
	}
	public void setIsvReturnUrl(String isvReturnUrl) {
		this.isvReturnUrl = isvReturnUrl;
	}

}
