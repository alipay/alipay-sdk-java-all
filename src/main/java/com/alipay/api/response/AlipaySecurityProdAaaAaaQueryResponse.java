package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AccountDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.aaa.aaa.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdAaaAaaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8695282921922882689L;

	/** 
	 * 账户详情
	 */
	@ApiField("account_detail")
	private AccountDetail accountDetail;

	/** 
	 * afda
	 */
	@ApiField("created")
	private Boolean created;

	/** 
	 * 111
	 */
	@ApiField("date")
	private Date date;

	/** 
	 * 支付宝昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/** 
	 * 111
	 */
	@ApiField("number")
	private Long number;

	/** 
	 * 11
	 */
	@ApiField("price")
	private String price;

	public void setAccountDetail(AccountDetail accountDetail) {
		this.accountDetail = accountDetail;
	}
	public AccountDetail getAccountDetail( ) {
		return this.accountDetail;
	}

	public void setCreated(Boolean created) {
		this.created = created;
	}
	public Boolean getCreated( ) {
		return this.created;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDate( ) {
		return this.date;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getNickName( ) {
		return this.nickName;
	}

	public void setNumber(Long number) {
		this.number = number;
	}
	public Long getNumber( ) {
		return this.number;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public String getPrice( ) {
		return this.price;
	}

}
