package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于查询操作员列表信息
 *
 * @author auto create
 * @since 1.0, 2024-11-12 18:03:46
 */
public class OperatorData extends AlipayObject {

	private static final long serialVersionUID = 4687376963774586476L;

	/**
	 * 头像链接
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 操作员id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人姓名
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 操作员openid
	 */
	@ApiField("operator_open_id")
	private String operatorOpenId;

	public String getAvatar() {
		return this.avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorOpenId() {
		return this.operatorOpenId;
	}
	public void setOperatorOpenId(String operatorOpenId) {
		this.operatorOpenId = operatorOpenId;
	}

}
