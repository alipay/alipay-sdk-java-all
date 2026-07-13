package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租安托订单派单接口
 *
 * @author auto create
 * @since 1.0, 2026-07-10 17:47:54
 */
public class AlipayCommerceRentZatSellerPublishModel extends AlipayObject {

	private static final long serialVersionUID = 1218897527969318952L;

	/**
	 * 交易组件订单Id，取值租赁下单接口返回的 orderId
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * create=指定二级商户，update=更新二级商户
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 支付宝二级商户编号(间连受理商户的支付宝商户编号，直付通场景下必传)
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 二级商户smid
	 */
	@ApiField("sub_smid")
	private String subSmid;

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public String getSubSmid() {
		return this.subSmid;
	}
	public void setSubSmid(String subSmid) {
		this.subSmid = subSmid;
	}

}
