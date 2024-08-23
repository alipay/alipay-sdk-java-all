package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.creditphone.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-22 14:32:02
 */
public class AlipayCommerceAcommunicationCreditphoneOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2658374653861587639L;

	/** 
	 * 信用购主单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 单位为元。用户实际的冻结金额。
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/** 
	 * 用户页面订单id，一般用户客诉
	 */
	@ApiField("page_order_no")
	private String pageOrderNo;

	/** 
	 * 用户签约生效时间。未签约时返回为空。
	 */
	@ApiField("sign_time")
	private Date signTime;

	/** 
	 * 已支付
	 */
	@ApiField("status")
	private String status;

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	public String getFreezeAmount( ) {
		return this.freezeAmount;
	}

	public void setPageOrderNo(String pageOrderNo) {
		this.pageOrderNo = pageOrderNo;
	}
	public String getPageOrderNo( ) {
		return this.pageOrderNo;
	}

	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}
	public Date getSignTime( ) {
		return this.signTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
