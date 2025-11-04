package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿里云查询医疗积分
 *
 * @author auto create
 * @since 1.0, 2025-04-09 10:45:28
 */
public class AlipayCommerceMedicalPromoPointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7482642712426755586L;

	/**
	 * LM配置商品价格时填的客户业务值（权益id），医疗用来区分代币种类
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 阿里云侧的客户业务 ID，运营新增活动时会新增
	 */
	@ApiField("biz_id")
	private String bizId;

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

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
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
