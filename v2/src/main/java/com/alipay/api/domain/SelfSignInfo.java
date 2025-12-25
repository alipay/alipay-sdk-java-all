package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户自签名信息
 *
 * @author auto create
 * @since 1.0, 2025-10-29 11:06:49
 */
public class SelfSignInfo extends AlipayObject {

	private static final long serialVersionUID = 1539594695562687984L;

	/**
	 * 签名值
	 */
	@ApiField("signature")
	private String signature;

	/**
	 * 请求时间戳
	 */
	@ApiField("time_stamp")
	private Long timeStamp;

	/**
	 * verifyMethod唯一标识
	 */
	@ApiField("vm_id")
	private String vmId;

	public String getSignature() {
		return this.signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Long getTimeStamp() {
		return this.timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getVmId() {
		return this.vmId;
	}
	public void setVmId(String vmId) {
		this.vmId = vmId;
	}

}
