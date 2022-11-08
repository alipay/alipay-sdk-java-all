package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * po累计预提余额信息
 *
 * @author auto create
 * @since 1.0, 2021-12-16 16:42:30
 */
public class PoCumAccruedBalanceAmtDTO extends AlipayObject {

	private static final long serialVersionUID = 6886832156188936373L;

	/**
	 * 会记期间
	 */
	@ApiField("account_period")
	private String accountPeriod;

	/**
	 * 预提余额详情列表
	 */
	@ApiListField("accrued_balance_detail_list")
	@ApiField("po_cum_accrued_balance_amt_detail_d_t_o")
	private List<PoCumAccruedBalanceAmtDetailDTO> accruedBalanceDetailList;

	/**
	 * 关账状态（对应会记期间是否已关账）
	 */
	@ApiField("close_accounted_status")
	private Boolean closeAccountedStatus;

	public String getAccountPeriod() {
		return this.accountPeriod;
	}
	public void setAccountPeriod(String accountPeriod) {
		this.accountPeriod = accountPeriod;
	}

	public List<PoCumAccruedBalanceAmtDetailDTO> getAccruedBalanceDetailList() {
		return this.accruedBalanceDetailList;
	}
	public void setAccruedBalanceDetailList(List<PoCumAccruedBalanceAmtDetailDTO> accruedBalanceDetailList) {
		this.accruedBalanceDetailList = accruedBalanceDetailList;
	}

	public Boolean getCloseAccountedStatus() {
		return this.closeAccountedStatus;
	}
	public void setCloseAccountedStatus(Boolean closeAccountedStatus) {
		this.closeAccountedStatus = closeAccountedStatus;
	}

}
