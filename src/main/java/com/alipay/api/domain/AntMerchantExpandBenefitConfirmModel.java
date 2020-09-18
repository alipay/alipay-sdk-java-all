package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商家开通权益发放凭证接口
 *
 * @author auto create
 * @since 1.0, 2019-03-12 12:15:46
 */
public class AntMerchantExpandBenefitConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 7496676876991455876L;

	/**
	 * 业务扩展信息
	 */
	@ApiField("biz_ext")
	private String bizExt;

	/**
	 * 用户跳转到外部页面1688系统发起的·确认发奖的外部业务时间
	 */
	@ApiField("out_biz_time")
	private Date outBizTime;

	/**
	 * 用户跳转外部1688页面时URL 带的 发放记录·ID
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizExt() {
		return this.bizExt;
	}
	public void setBizExt(String bizExt) {
		this.bizExt = bizExt;
	}

	public Date getOutBizTime() {
		return this.outBizTime;
	}
	public void setOutBizTime(Date outBizTime) {
		this.outBizTime = outBizTime;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
