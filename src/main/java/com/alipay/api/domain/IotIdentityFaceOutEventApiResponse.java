package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸出库事件状态查询详情
 *
 * @author auto create
 * @since 1.0, 2022-01-22 14:15:40
 */
public class IotIdentityFaceOutEventApiResponse extends AlipayObject {

	private static final long serialVersionUID = 7664242168569671513L;

	/**
	 * 错误的原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 状态，1处理中2成功3失败
	 */
	@ApiField("state")
	private Long state;

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public Long getState() {
		return this.state;
	}
	public void setState(Long state) {
		this.state = state;
	}

}
