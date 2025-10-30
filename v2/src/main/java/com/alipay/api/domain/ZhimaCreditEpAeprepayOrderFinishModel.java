package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信AE提前收款服务订单完结通知
 *
 * @author auto create
 * @since 1.0, 2023-08-16 19:14:54
 */
public class ZhimaCreditEpAeprepayOrderFinishModel extends AlipayObject {

	private static final long serialVersionUID = 2666381297613294367L;

	/**
	 * 预留扩展
	 */
	@ApiField("ext_param")
	private ZmEpAePrepayExtParam extParam;

	/**
	 * 订单ID
	 */
	@ApiField("order_num")
	private String orderNum;

	/**
	 * 审核单创建时间戳
	 */
	@ApiField("order_time_millis")
	private String orderTimeMillis;

	/**
	 * 商家登陆id
	 */
	@ApiField("seller_login_id")
	private String sellerLoginId;

	public ZmEpAePrepayExtParam getExtParam() {
		return this.extParam;
	}
	public void setExtParam(ZmEpAePrepayExtParam extParam) {
		this.extParam = extParam;
	}

	public String getOrderNum() {
		return this.orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getOrderTimeMillis() {
		return this.orderTimeMillis;
	}
	public void setOrderTimeMillis(String orderTimeMillis) {
		this.orderTimeMillis = orderTimeMillis;
	}

	public String getSellerLoginId() {
		return this.sellerLoginId;
	}
	public void setSellerLoginId(String sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

}
