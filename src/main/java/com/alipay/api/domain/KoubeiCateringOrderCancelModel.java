package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑点餐订单后付商户冲正
 *
 * @author auto create
 * @since 1.0, 2018-11-02 15:30:29
 */
public class KoubeiCateringOrderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4214528148944922836L;

	/**
	 * 扩展信息，json对象格式，key和value都为字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 口碑端订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * BUSY(店铺太忙，无法接待)/DUPLICATE_ORDER(重复订单)/SHOP_CLOSE(店铺已打烊)/SELL_OUT(菜品售完)/OTHER_REASON(其他原因)/TABLE_NOT_EXIST(桌号不存在)
	 */
	@ApiField("reason")
	private String reason;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
