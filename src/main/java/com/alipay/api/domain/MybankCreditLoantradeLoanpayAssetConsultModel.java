package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 贷款支付单通道资产分期方案咨询
 *
 * @author auto create
 * @since 1.0, 2019-07-17 21:19:28
 */
public class MybankCreditLoantradeLoanpayAssetConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4613663146117835141L;

	/**
	 * 支付宝签约商户ID，如PARTNER_ALIBABA_CN, PARTNER_TAOBAO_ORDER
	 */
	@ApiField("alipay_partner_id")
	private String alipayPartnerId;

	/**
	 * 订单金额
	 */
	@ApiField("apply_amt")
	private MultiCurrencyMoneyVO applyAmt;

	/**
	 * 具体咨询扩展，一笔订单对应数组中一个元素
	 */
	@ApiListField("order_info")
	@ApiField("loan_pay_consult_order")
	private List<LoanPayConsultOrder> orderInfo;

	/**
	 * 收单销售产品码
	 */
	@ApiField("payment_sale_pd_code")
	private String paymentSalePdCode;

	/**
	 * 交易平台类型，如b2b, nongzi
	 */
	@ApiField("platform_type")
	private String platformType;

	/**
	 * 交易平台子类型，收单参数，如1688_hp
	 */
	@ApiField("sub_platform_type")
	private String subPlatformType;

	/**
	 * 用户信息	是
	 */
	@ApiField("user")
	private LoanPayUser user;

	public String getAlipayPartnerId() {
		return this.alipayPartnerId;
	}
	public void setAlipayPartnerId(String alipayPartnerId) {
		this.alipayPartnerId = alipayPartnerId;
	}

	public MultiCurrencyMoneyVO getApplyAmt() {
		return this.applyAmt;
	}
	public void setApplyAmt(MultiCurrencyMoneyVO applyAmt) {
		this.applyAmt = applyAmt;
	}

	public List<LoanPayConsultOrder> getOrderInfo() {
		return this.orderInfo;
	}
	public void setOrderInfo(List<LoanPayConsultOrder> orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getPaymentSalePdCode() {
		return this.paymentSalePdCode;
	}
	public void setPaymentSalePdCode(String paymentSalePdCode) {
		this.paymentSalePdCode = paymentSalePdCode;
	}

	public String getPlatformType() {
		return this.platformType;
	}
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

	public String getSubPlatformType() {
		return this.subPlatformType;
	}
	public void setSubPlatformType(String subPlatformType) {
		this.subPlatformType = subPlatformType;
	}

	public LoanPayUser getUser() {
		return this.user;
	}
	public void setUser(LoanPayUser user) {
		this.user = user;
	}

}
