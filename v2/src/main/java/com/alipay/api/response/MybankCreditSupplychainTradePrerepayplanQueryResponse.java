package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InstallmentRepayPlanVO;
import com.alipay.api.domain.BillTermAmountVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.trade.prerepayplan.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-10 14:42:10
 */
public class MybankCreditSupplychainTradePrerepayplanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4575594566388735536L;

	/** 
	 * 账单分期列表
	 */
	@ApiListField("installment_repay_plans")
	@ApiField("installment_repay_plan_v_o")
	private List<InstallmentRepayPlanVO> installmentRepayPlans;

	/** 
	 * 网商ip信息
	 */
	@ApiField("ip_id")
	private String ipId;

	/** 
	 * 网商iprole_id
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/** 
	 * 外部订单号, 同交易创建时一样
${isv_iprole_id}_${zhifutong_ar_no}拼接而成
isv_iprole_id机构iproleId, zhifutong_ar_no 直付通签约订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 融租销售产品code
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/** 
	 * 订单的状态， 正常，结清，逾期
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 订单全部分期的期数，默认M，代表月份
	 */
	@ApiField("terms")
	private Long terms;

	/** 
	 * 订单的全部金额： 本金+利息
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 订单明细，包含本金和利息
	 */
	@ApiField("total_detail")
	private BillTermAmountVO totalDetail;

	public void setInstallmentRepayPlans(List<InstallmentRepayPlanVO> installmentRepayPlans) {
		this.installmentRepayPlans = installmentRepayPlans;
	}
	public List<InstallmentRepayPlanVO> getInstallmentRepayPlans( ) {
		return this.installmentRepayPlans;
	}

	public void setIpId(String ipId) {
		this.ipId = ipId;
	}
	public String getIpId( ) {
		return this.ipId;
	}

	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}
	public String getIpRoleId( ) {
		return this.ipRoleId;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}
	public String getSalePdCode( ) {
		return this.salePdCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTerms(Long terms) {
		this.terms = terms;
	}
	public Long getTerms( ) {
		return this.terms;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTotalDetail(BillTermAmountVO totalDetail) {
		this.totalDetail = totalDetail;
	}
	public BillTermAmountVO getTotalDetail( ) {
		return this.totalDetail;
	}

}
