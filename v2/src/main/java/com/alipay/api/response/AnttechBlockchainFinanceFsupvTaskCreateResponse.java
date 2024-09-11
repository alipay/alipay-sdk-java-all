package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.fsupv.task.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:35:55
 */
public class AnttechBlockchainFinanceFsupvTaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7663738299627745578L;

	/** 
	 * 受理号。资金管控任务的执行实际为异步执行，在查询或消息推送时，会返回改号作为查询依据
	 */
	@ApiField("accepted_no")
	private String acceptedNo;

	/** 
	 * 授权跳转链接，成功时返回；用于授权开户协议
	 */
	@ApiField("authorization_link")
	private String authorizationLink;

	/** 
	 * 资金管控任务编号
	 */
	@ApiField("fund_supv_task_id")
	private String fundSupvTaskId;

	/** 
	 * 授权链接有效期
	 */
	@ApiField("link_expiry")
	private Date linkExpiry;

	public void setAcceptedNo(String acceptedNo) {
		this.acceptedNo = acceptedNo;
	}
	public String getAcceptedNo( ) {
		return this.acceptedNo;
	}

	public void setAuthorizationLink(String authorizationLink) {
		this.authorizationLink = authorizationLink;
	}
	public String getAuthorizationLink( ) {
		return this.authorizationLink;
	}

	public void setFundSupvTaskId(String fundSupvTaskId) {
		this.fundSupvTaskId = fundSupvTaskId;
	}
	public String getFundSupvTaskId( ) {
		return this.fundSupvTaskId;
	}

	public void setLinkExpiry(Date linkExpiry) {
		this.linkExpiry = linkExpiry;
	}
	public Date getLinkExpiry( ) {
		return this.linkExpiry;
	}

}
