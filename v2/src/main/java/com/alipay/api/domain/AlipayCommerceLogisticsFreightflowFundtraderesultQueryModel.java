package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付收银台资金支付结果查询
 *
 * @author auto create
 * @since 1.0, 2025-07-01 13:45:38
 */
public class AlipayCommerceLogisticsFreightflowFundtraderesultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2434892384962563723L;

	/**
	 * 创单时的biz_no
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 与运企付约定的物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 银行管理模式
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 交易号，创建交易单时返回
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 网商银行分配的合作方机构号
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
