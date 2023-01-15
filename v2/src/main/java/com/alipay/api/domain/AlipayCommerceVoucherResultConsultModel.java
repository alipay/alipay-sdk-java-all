package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前置优惠咨询
 *
 * @author auto create
 * @since 1.0, 2021-08-09 19:21:25
 */
public class AlipayCommerceVoucherResultConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7567782783619587474L;

	/**
	 * isv的商户pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 咨询商品信息
	 */
	@ApiField("item_consult_list")
	private ItemConsultRequest itemConsultList;

	/**
	 * 核销门店的pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 订单金额（如同时享受商户自有优惠请先扣除后传入），单位为元，最多2位小数
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public ItemConsultRequest getItemConsultList() {
		return this.itemConsultList;
	}
	public void setItemConsultList(ItemConsultRequest itemConsultList) {
		this.itemConsultList = itemConsultList;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
