package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资格申领
 *
 * @author auto create
 * @since 1.0, 2025-12-15 21:32:41
 */
public class AlipayMarketingQualificationApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3142538173459497811L;

	/**
	 * 业务场景信息
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务号，幂等ID
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 资格ID
	 */
	@ApiField("qual_id")
	private String qualId;

	/**
	 * 资格实例id
	 */
	@ApiField("qual_instance_id")
	private String qualInstanceId;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getQualId() {
		return this.qualId;
	}
	public void setQualId(String qualId) {
		this.qualId = qualId;
	}

	public String getQualInstanceId() {
		return this.qualInstanceId;
	}
	public void setQualInstanceId(String qualInstanceId) {
		this.qualInstanceId = qualInstanceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
