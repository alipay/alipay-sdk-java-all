package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商行业手机号标签同步
 *
 * @author auto create
 * @since 1.0, 2026-02-04 09:32:42
 */
public class AlipayCommerceAcommunicationMobileTagSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2848991371173144426L;

	/**
	 * 是否绑定了AI
	 */
	@ApiField("bind_ai")
	private Boolean bindAi;

	/**
	 * 是否绑定了云回看
	 */
	@ApiField("bind_replay")
	private Boolean bindReplay;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 是否有设备
	 */
	@ApiField("has_device")
	private Boolean hasDevice;

	/**
	 * 加密后的手机号
	 */
	@ApiField("mobile_hash")
	private String mobileHash;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	public Boolean getBindAi() {
		return this.bindAi;
	}
	public void setBindAi(Boolean bindAi) {
		this.bindAi = bindAi;
	}

	public Boolean getBindReplay() {
		return this.bindReplay;
	}
	public void setBindReplay(Boolean bindReplay) {
		this.bindReplay = bindReplay;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public Boolean getHasDevice() {
		return this.hasDevice;
	}
	public void setHasDevice(Boolean hasDevice) {
		this.hasDevice = hasDevice;
	}

	public String getMobileHash() {
		return this.mobileHash;
	}
	public void setMobileHash(String mobileHash) {
		this.mobileHash = mobileHash;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
