package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量券信息
 *
 * @author auto create
 * @since 1.0, 2022-12-12 11:36:14
 */
public class OpenBatchVoucher extends AlipayObject {

	private static final long serialVersionUID = 2232266516111545865L;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 支付宝用户ID(映射的openId)
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 发送对象
	 */
	@ApiField("user_id")
	private String userId;

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
