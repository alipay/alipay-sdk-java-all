package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据用户ID与互助计划ID查询保单号列表
 *
 * @author auto create
 * @since 1.0, 2023-03-30 11:37:07
 */
public class AlipayInsUnderwriteMutualPolicyBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8782881514382593261L;

	/**
	 * 渠道来源
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 计划ID，宝贝计划(BAOBEI_PLAN)
	 */
	@ApiField("plan_no")
	private String planNo;

	/**
	 * 来源，如支付宝客户端(MOBILE_APP)
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getPlanNo() {
		return this.planNo;
	}
	public void setPlanNo(String planNo) {
		this.planNo = planNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
