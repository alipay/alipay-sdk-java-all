package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询预问诊病例是否存在
 *
 * @author auto create
 * @since 1.0, 2025-03-28 15:53:12
 */
public class AlipayCommerceMedicalMedinquiryRecordVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 3493237892193798692L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务侧的相关id 如挂号id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 用户id类型
	 */
	@ApiField("out_user_type")
	private String outUserType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getOutUserType() {
		return this.outUserType;
	}
	public void setOutUserType(String outUserType) {
		this.outUserType = outUserType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
