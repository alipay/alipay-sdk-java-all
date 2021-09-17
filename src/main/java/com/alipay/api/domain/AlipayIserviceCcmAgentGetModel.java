package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询客服详情
 *
 * @author auto create
 * @since 1.0, 2020-12-10 14:22:09
 */
public class AlipayIserviceCcmAgentGetModel extends AlipayObject {

	private static final long serialVersionUID = 4635762571386363573L;

	/**
	 * 客服账号id，当user_channel=ALIPAY时，此id为支付宝2088id
external_user_id和user_channel必须配对使用
	 */
	@ApiField("external_user_id")
	private String externalUserId;

	/**
	 * 客服id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 客服工号
	 */
	@ApiField("job_number")
	private String jobNumber;

	/**
	 * 客服账号渠道, ALIPAY:支付宝账号
user_channel和external_user_id必须配对使用
	 */
	@ApiField("user_channel")
	private String userChannel;

	public String getExternalUserId() {
		return this.externalUserId;
	}
	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getJobNumber() {
		return this.jobNumber;
	}
	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	public String getUserChannel() {
		return this.userChannel;
	}
	public void setUserChannel(String userChannel) {
		this.userChannel = userChannel;
	}

}
