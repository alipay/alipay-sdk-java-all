package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保函中标通知
 *
 * @author auto create
 * @since 1.0, 2022-08-24 17:39:16
 */
public class MybankCreditLoantradeGuarletterBidwinNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5382942875882521895L;

	/**
	 * 标的明细
	 */
	@ApiField("bid_detail")
	private BidDetailVO bidDetail;

	/**
	 * 方案合约号
	 */
	@ApiField("scheme_ar_no")
	private String schemeArNo;

	/**
	 * 中标人信息
	 */
	@ApiField("winer_user_info")
	private EnterpriseCustomerInfoVO winerUserInfo;

	public BidDetailVO getBidDetail() {
		return this.bidDetail;
	}
	public void setBidDetail(BidDetailVO bidDetail) {
		this.bidDetail = bidDetail;
	}

	public String getSchemeArNo() {
		return this.schemeArNo;
	}
	public void setSchemeArNo(String schemeArNo) {
		this.schemeArNo = schemeArNo;
	}

	public EnterpriseCustomerInfoVO getWinerUserInfo() {
		return this.winerUserInfo;
	}
	public void setWinerUserInfo(EnterpriseCustomerInfoVO winerUserInfo) {
		this.winerUserInfo = winerUserInfo;
	}

}
