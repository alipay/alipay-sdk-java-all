package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InstallmentRepayPlanVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.trade.prerepayplan.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-29 15:08:25
 */
public class MybankCreditSupplychainTradePrerepayplanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1667795737721118269L;

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
	 * 网商iprole
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/** 
	 * ${isv_iprole_id}_${zhifutong_ar_no}
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 融租销售产品code
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

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

}
