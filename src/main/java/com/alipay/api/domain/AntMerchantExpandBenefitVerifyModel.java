package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家服务-核销发放的权益
 *
 * @author auto create
 * @since 1.0, 2019-08-19 17:42:55
 */
public class AntMerchantExpandBenefitVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 4417328998793254888L;

	/**
	 * 业务扩展信息
	 */
	@ApiField("biz_ext")
	private String bizExt;

	/**
	 * 外部业务时间
	 */
	@ApiField("out_biz_time")
	private String outBizTime;

	/**
	 * 外部用户ID
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 权益发放记录ID
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

	public String getOutBizTime() {
		return this.outBizTime;
	}
	public void setOutBizTime(String outBizTime) {
		this.outBizTime = outBizTime;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
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
