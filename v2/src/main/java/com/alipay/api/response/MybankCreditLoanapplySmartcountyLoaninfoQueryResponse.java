package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.smartcounty.loaninfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 20:55:22
 */
public class MybankCreditLoanapplySmartcountyLoaninfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3357927235752811319L;

	/** 
	 * 前准入状态
	 */
	@ApiField("admited")
	private Boolean admited;

	/** 
	 * 用户所在的县域编码列表，如果一个用户在三个县域中都有，则返回三个县域编码集
	 */
	@ApiListField("county_area")
	@ApiField("string")
	private List<String> countyArea;

	/** 
	 * 是否是网商贷的用户
	 */
	@ApiField("mybank_user")
	private Boolean mybankUser;

	/** 
	 * 是否展示入口, 降级时候为 false
	 */
	@ApiField("show_entrance")
	private Boolean showEntrance;

	public void setAdmited(Boolean admited) {
		this.admited = admited;
	}
	public Boolean getAdmited( ) {
		return this.admited;
	}

	public void setCountyArea(List<String> countyArea) {
		this.countyArea = countyArea;
	}
	public List<String> getCountyArea( ) {
		return this.countyArea;
	}

	public void setMybankUser(Boolean mybankUser) {
		this.mybankUser = mybankUser;
	}
	public Boolean getMybankUser( ) {
		return this.mybankUser;
	}

	public void setShowEntrance(Boolean showEntrance) {
		this.showEntrance = showEntrance;
	}
	public Boolean getShowEntrance( ) {
		return this.showEntrance;
	}

}
