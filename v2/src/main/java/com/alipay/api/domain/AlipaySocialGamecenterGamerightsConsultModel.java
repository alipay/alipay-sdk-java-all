package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 咨询游戏乐园发奖信息
 *
 * @author auto create
 * @since 1.0, 2025-05-08 23:37:53
 */
public class AlipaySocialGamecenterGamerightsConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7374492659674979984L;

	/**
	 * 咨询权益数量
	 */
	@ApiField("consult_right_num")
	private Long consultRightNum;

	/**
	 * 咨询权益类型
	 */
	@ApiField("consult_right_type")
	private String consultRightType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Long getConsultRightNum() {
		return this.consultRightNum;
	}
	public void setConsultRightNum(Long consultRightNum) {
		this.consultRightNum = consultRightNum;
	}

	public String getConsultRightType() {
		return this.consultRightType;
	}
	public void setConsultRightType(String consultRightType) {
		this.consultRightType = consultRightType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
