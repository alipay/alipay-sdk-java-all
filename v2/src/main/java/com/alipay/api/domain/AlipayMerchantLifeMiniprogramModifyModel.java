package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * alipay.merchant.life.thirdparty.update
 *
 * @author auto create
 * @since 1.0, 2023-06-18 16:58:26
 */
public class AlipayMerchantLifeMiniprogramModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3878589434121683757L;

	/**
	 * extra:服务商创建小程序的扩展信息
	 */
	@ApiField("extra")
	private MiniProgramExtraInfo extra;

	/**
	 * reason：服务商创建小程序的结果描述，失败时需要添加失败描述
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * requestId: 我方颁发的流程ID，用于处理流程信息
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * status: 服务商小程序创建状态
	 */
	@ApiField("status")
	private String status;

	public MiniProgramExtraInfo getExtra() {
		return this.extra;
	}
	public void setExtra(MiniProgramExtraInfo extra) {
		this.extra = extra;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
