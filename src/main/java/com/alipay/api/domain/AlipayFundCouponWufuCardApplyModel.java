package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 五福获取惊喜福卡
 *
 * @author auto create
 * @since 1.0, 2021-01-06 13:28:32
 */
public class AlipayFundCouponWufuCardApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6135995961542649642L;

	/**
	 * 唯一请求码
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务场景
	 */
	@ApiField("sence_code")
	private String senceCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getSenceCode() {
		return this.senceCode;
	}
	public void setSenceCode(String senceCode) {
		this.senceCode = senceCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
