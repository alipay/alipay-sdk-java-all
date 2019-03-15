package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部机构对用户的通知接口
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:55:47
 */
public class AlipayEbppCommonNotifySendModel extends AlipayObject {

	private static final long serialVersionUID = 2815865826958238343L;

	/**
	 * 水电燃等机构为用户分配的户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型的缩写：
JF-缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构的缩写
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 特定通知类型可能需要提供扩展信息，用JSON字符串描述
	 */
	@ApiField("extend_data")
	private String extendData;

	/**
	 * 机构为用户发送通知的类型，需要与支付宝协商确定
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 子业务类型英文名称:
ELECTRIC-电力
GAS-燃气
WATER-水
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 支付宝用户id，可空，用于特定场景下向指定用户发送通知
	 */
	@ApiField("user_id")
	private String userId;

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getExtendData() {
		return this.extendData;
	}
	public void setExtendData(String extendData) {
		this.extendData = extendData;
	}

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
