package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付子户退款申请
 *
 * @author auto create
 * @since 1.0, 2025-07-24 14:37:07
 */
public class AlipayCommerceLogisticsFreightflowSubaccountrefundApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7166754865271761181L;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 模式
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 网商银行应用id,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_app_id")
	private String mybankAppId;

	/**
	 * 网商解决方案CODE,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_scene_code")
	private String mybankSceneCode;

	/**
	 * 唯一性区分，业务幂等号；若需要多次退款或明确退款失败后重试请更换此字段值，其他情况请原单重试
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 如果mode为网商银行，则为网商银行分配
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 退款金额,单位分
	 */
	@ApiField("refund_amt")
	private String refundAmt;

	/**
	 * 运企付在到账通知时通知给商户消息中的sub_trans_no
	 */
	@ApiField("trans_no")
	private String transNo;

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

	public String getMybankSceneCode() {
		return this.mybankSceneCode;
	}
	public void setMybankSceneCode(String mybankSceneCode) {
		this.mybankSceneCode = mybankSceneCode;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRefundAmt() {
		return this.refundAmt;
	}
	public void setRefundAmt(String refundAmt) {
		this.refundAmt = refundAmt;
	}

	public String getTransNo() {
		return this.transNo;
	}
	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

}
