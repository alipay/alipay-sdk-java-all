package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付开通进度查询
 *
 * @author auto create
 * @since 1.0, 2024-08-20 18:01:36
 */
public class AlipayCommerceMerchantcardOpenprocessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5424252499124997452L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户id
	 */
	@ApiField("pid")
	private String pid;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
