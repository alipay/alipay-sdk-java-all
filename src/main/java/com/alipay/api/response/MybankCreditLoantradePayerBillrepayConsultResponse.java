package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreditPayBillDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.payer.billrepay.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-09 10:51:44
 */
public class MybankCreditLoantradePayerBillrepayConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4566911212129787976L;

	/** 
	 * 账单详情视图列表
	 */
	@ApiListField("bill_details")
	@ApiField("credit_pay_bill_detail_v_o")
	private List<CreditPayBillDetailVO> billDetails;

	/** 
	 * 是否存在账单，只有为true，除repay_url外的其它字段，才会存在
	 */
	@ApiField("exist_bill")
	private Boolean existBill;

	/** 
	 * 还款链接
	 */
	@ApiField("repay_url")
	private String repayUrl;

	public void setBillDetails(List<CreditPayBillDetailVO> billDetails) {
		this.billDetails = billDetails;
	}
	public List<CreditPayBillDetailVO> getBillDetails( ) {
		return this.billDetails;
	}

	public void setExistBill(Boolean existBill) {
		this.existBill = existBill;
	}
	public Boolean getExistBill( ) {
		return this.existBill;
	}

	public void setRepayUrl(String repayUrl) {
		this.repayUrl = repayUrl;
	}
	public String getRepayUrl( ) {
		return this.repayUrl;
	}

}
