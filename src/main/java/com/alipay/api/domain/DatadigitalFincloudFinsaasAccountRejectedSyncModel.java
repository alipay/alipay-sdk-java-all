package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户卡状态同步-已驳回
 *
 * @author auto create
 * @since 1.0, 2022-08-05 11:17:54
 */
public class DatadigitalFincloudFinsaasAccountRejectedSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3389114982584514433L;

	/**
	 * 标识用户活动数据的唯一id
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 拒绝的时间
	 */
	@ApiField("gmt_rejected")
	private Date gmtRejected;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public Date getGmtRejected() {
		return this.gmtRejected;
	}
	public void setGmtRejected(Date gmtRejected) {
		this.gmtRejected = gmtRejected;
	}

}
