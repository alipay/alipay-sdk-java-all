package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗饿了么fun卡资产扣减接口
 *
 * @author auto create
 * @since 1.0, 2024-12-25 10:47:54
 */
public class AlipayPcreditHuabeiPcreditbenefitFuncardassertReturnModel extends AlipayObject {

	private static final long serialVersionUID = 5469115474548765897L;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 扣减的花呗金个数，1个花呗金=1分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 业务操作编号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务场景
	 */
	@ApiField("scene")
	private String scene;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
