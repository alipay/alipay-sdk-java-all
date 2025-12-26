package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运企付_收银台退款查询
 *
 * @author auto create
 * @since 1.0, 2025-12-22 10:24:22
 */
public class AlipayCommerceLogisticsFreightflowCloudfundrefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8515233963623192764L;

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
	 * 网商银行提供给商户的appId
	 */
	@ApiField("mybank_app_id")
	private String mybankAppId;

	/**
	 * 如果mode为网商银行代表网商银行分配的合作方机构号
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 发起退款申请时的业务流水号
	 */
	@ApiField("refund_biz_no")
	private String refundBizNo;

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

	public String getMybankAppId() {
		return this.mybankAppId;
	}
	public void setMybankAppId(String mybankAppId) {
		this.mybankAppId = mybankAppId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRefundBizNo() {
		return this.refundBizNo;
	}
	public void setRefundBizNo(String refundBizNo) {
		this.refundBizNo = refundBizNo;
	}

}
