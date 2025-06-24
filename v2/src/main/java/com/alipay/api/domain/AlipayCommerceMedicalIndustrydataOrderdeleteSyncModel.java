package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单软删除接口
 *
 * @author auto create
 * @since 1.0, 2024-11-14 15:17:12
 */
public class AlipayCommerceMedicalIndustrydataOrderdeleteSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7219239563881866219L;

	/**
	 * 支付宝用户openId
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝问诊单id
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 支付宝用户userid
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 外部uid，无特殊校验
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * DELETE 删除
ROLLBACK_DELETE 撤销删除
	 */
	@ApiField("op_type")
	private String opType;

	/**
	 * 枚举
PLATFORM_INQUIRY_ORDER
PRESCRIPTION_ORDER
DRUG_ORDER
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 支付宝处方订单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 外部平台编号
	 */
	@ApiField("platform_code")
	private String platformCode;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getOpType() {
		return this.opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

}
