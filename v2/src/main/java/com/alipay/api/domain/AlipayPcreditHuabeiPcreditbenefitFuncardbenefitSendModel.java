package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗饿了么fun卡权益发放接口
 *
 * @author auto create
 * @since 1.0, 2024-12-25 10:43:26
 */
public class AlipayPcreditHuabeiPcreditbenefitFuncardbenefitSendModel extends AlipayObject {

	private static final long serialVersionUID = 1527846791126525735L;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 发放的花呗金数量，花呗金单位 个，1个花呗金等价于1分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 外部业务单据id
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
