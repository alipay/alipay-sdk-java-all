package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户卡状态同步-已申请
 *
 * @author auto create
 * @since 1.0, 2022-08-05 11:18:16
 */
public class DatadigitalFincloudFinsaasAccountAppliedSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8812523413984418199L;

	/**
	 * 标识用户活动数据的唯一id
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 申请时间
	 */
	@ApiField("gmt_applied")
	private Date gmtApplied;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public Date getGmtApplied() {
		return this.gmtApplied;
	}
	public void setGmtApplied(Date gmtApplied) {
		this.gmtApplied = gmtApplied;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
