package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.accountbook.notify.subscribe response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:54
 */
public class AlipayFundAccountbookNotifySubscribeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1341169132331999286L;

	/** 
	 * 记账本ID
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/** 
	 * 响应code。 成功为10000； 业务异常为40004；
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 响应描述。 成功为Success； 业务异常为Business Failed；
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 订阅关系状态， VALID：有效的； INVALID：失效的；
	 */
	@ApiField("subscribe_status")
	private String subscribeStatus;

	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}
	public String getAccountBookId( ) {
		return this.accountBookId;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setSubscribeStatus(String subscribeStatus) {
		this.subscribeStatus = subscribeStatus;
	}
	public String getSubscribeStatus( ) {
		return this.subscribeStatus;
	}

}
