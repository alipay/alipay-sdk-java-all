package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreditPayMoneyVO;
import com.alipay.api.domain.CreditPayChargePricingVO;
import com.alipay.api.domain.CreditPayIntPricingVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.payee.receivable.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-09 10:52:01
 */
public class MybankCreditLoantradePayeeReceivableQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1859283754649535387L;

	/** 
	 * 可保理收款金额
	 */
	@ApiField("factoring_amt")
	private CreditPayMoneyVO factoringAmt;

	/** 
	 * 保理费定价
	 */
	@ApiListField("factoring_fee_pricing")
	@ApiField("credit_pay_charge_pricing_v_o")
	private List<CreditPayChargePricingVO> factoringFeePricing;

	/** 
	 * 保理利率定价
	 */
	@ApiField("factoring_int_pricing")
	private CreditPayIntPricingVO factoringIntPricing;

	/** 
	 * 可提前收款订单数量
	 */
	@ApiField("receivable_cnt")
	private Long receivableCnt;

	/** 
	 * 赊呗应收列表支付宝小程序URL
	 */
	@ApiField("receivable_manage_url")
	private String receivableManageUrl;

	/** 
	 * 收款日，只有固定收款日期的会返回，表示每月的18号
	 */
	@ApiField("remit_date")
	private String remitDate;

	/** 
	 * 总计应收金额
	 */
	@ApiField("total_rcv_amt")
	private CreditPayMoneyVO totalRcvAmt;

	public void setFactoringAmt(CreditPayMoneyVO factoringAmt) {
		this.factoringAmt = factoringAmt;
	}
	public CreditPayMoneyVO getFactoringAmt( ) {
		return this.factoringAmt;
	}

	public void setFactoringFeePricing(List<CreditPayChargePricingVO> factoringFeePricing) {
		this.factoringFeePricing = factoringFeePricing;
	}
	public List<CreditPayChargePricingVO> getFactoringFeePricing( ) {
		return this.factoringFeePricing;
	}

	public void setFactoringIntPricing(CreditPayIntPricingVO factoringIntPricing) {
		this.factoringIntPricing = factoringIntPricing;
	}
	public CreditPayIntPricingVO getFactoringIntPricing( ) {
		return this.factoringIntPricing;
	}

	public void setReceivableCnt(Long receivableCnt) {
		this.receivableCnt = receivableCnt;
	}
	public Long getReceivableCnt( ) {
		return this.receivableCnt;
	}

	public void setReceivableManageUrl(String receivableManageUrl) {
		this.receivableManageUrl = receivableManageUrl;
	}
	public String getReceivableManageUrl( ) {
		return this.receivableManageUrl;
	}

	public void setRemitDate(String remitDate) {
		this.remitDate = remitDate;
	}
	public String getRemitDate( ) {
		return this.remitDate;
	}

	public void setTotalRcvAmt(CreditPayMoneyVO totalRcvAmt) {
		this.totalRcvAmt = totalRcvAmt;
	}
	public CreditPayMoneyVO getTotalRcvAmt( ) {
		return this.totalRcvAmt;
	}

}
