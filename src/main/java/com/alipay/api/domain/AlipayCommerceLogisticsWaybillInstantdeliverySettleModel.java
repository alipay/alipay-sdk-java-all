package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 即时配送运单结算
 *
 * @author auto create
 * @since 1.0, 2021-02-07 11:46:47
 */
public class AlipayCommerceLogisticsWaybillInstantdeliverySettleModel extends AlipayObject {

	private static final long serialVersionUID = 6615839514647569886L;

	/**
	 * 即时配送公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 支付宝订单流水号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 结算请求流水号
	 */
	@ApiField("out_settle_request_no")
	private String outSettleRequestNo;

	/**
	 * 即时配送运单编号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	/**
	 * 即时配送运单状态
	 */
	@ApiField("waybill_status")
	private String waybillStatus;

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutSettleRequestNo() {
		return this.outSettleRequestNo;
	}
	public void setOutSettleRequestNo(String outSettleRequestNo) {
		this.outSettleRequestNo = outSettleRequestNo;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

	public String getWaybillStatus() {
		return this.waybillStatus;
	}
	public void setWaybillStatus(String waybillStatus) {
		this.waybillStatus = waybillStatus;
	}

}
