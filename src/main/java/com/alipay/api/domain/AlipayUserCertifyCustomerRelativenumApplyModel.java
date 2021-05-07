package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展客户的认证关联数
 *
 * @author auto create
 * @since 1.0, 2021-03-18 16:47:31
 */
public class AlipayUserCertifyCustomerRelativenumApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3245372575853958982L;

	/**
	 * 业务单据号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
