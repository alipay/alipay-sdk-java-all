package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 提交还款申请
 *
 * @author auto create
 * @since 1.0, 2018-11-14 12:07:49
 */
public class AlipayPcreditLoanRepayApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6564616852588484272L;

	/**
	 * 回跳地址，即商户端地址
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 需要进行还款的贷款申请外部业务单号列表
	 */
	@ApiListField("loan_out_biz_no_list")
	@ApiField("string")
	private List<String> loanOutBizNoList;

	/**
	 * 还款申请业务标准外部订单号,代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 还款申请金额
	 */
	@ApiField("repay_amt")
	private String repayAmt;

	/**
	 * 还款类型，取值{CLEAR, OVD_AND_CURRENT}：CLEAR-结清, OVD_AND_CURRENT-逾期和当期
	 */
	@ApiField("repay_type")
	private String repayType;

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public List<String> getLoanOutBizNoList() {
		return this.loanOutBizNoList;
	}
	public void setLoanOutBizNoList(List<String> loanOutBizNoList) {
		this.loanOutBizNoList = loanOutBizNoList;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRepayAmt() {
		return this.repayAmt;
	}
	public void setRepayAmt(String repayAmt) {
		this.repayAmt = repayAmt;
	}

	public String getRepayType() {
		return this.repayType;
	}
	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}

}
