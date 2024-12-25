package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐饮pos业务订单账单取消
 *
 * @author auto create
 * @since 1.0, 2022-07-01 16:27:02
 */
public class KoubeiCateringOrderBillCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4755598454461979167L;

	/**
	 * 取消类型：RENEW-退款并重新生成新订单（反结场景），REFUND-仅退款不生成新订单（先付撤销、外卖退款场景）
	 */
	@ApiField("action")
	private String action;

	/**
	 * 取消时间
	 */
	@ApiField("cancel_time")
	private Date cancelTime;

	/**
	 * pos业务订单外部主键信息
	 */
	@ApiField("pos_order_key")
	private PosOrderKey posOrderKey;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public Date getCancelTime() {
		return this.cancelTime;
	}
	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	public PosOrderKey getPosOrderKey() {
		return this.posOrderKey;
	}
	public void setPosOrderKey(PosOrderKey posOrderKey) {
		this.posOrderKey = posOrderKey;
	}

}
