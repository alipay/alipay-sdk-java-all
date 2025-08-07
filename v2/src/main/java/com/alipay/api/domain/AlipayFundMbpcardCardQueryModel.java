package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预付卡查询卡详情
 *
 * @author auto create
 * @since 1.0, 2023-11-20 15:17:54
 */
public class AlipayFundMbpcardCardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6545561469885746179L;

	/**
	 * 支付宝账号
	 */
	@ApiField("alipay_identity_id")
	private String alipayIdentityId;

	/**
	 * 会员ID:ALIPAY_USER_ID
会员登陆ID:ALIPAY_LOGON_ID
	 */
	@ApiField("alipay_identity_type")
	private String alipayIdentityType;

	/**
	 * 卡片绑定人姓名，账号类型为登录号时必填
	 */
	@ApiField("bind_user_name")
	private String bindUserName;

	/**
	 * 指定查询卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 支付宝账号
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getAlipayIdentityId() {
		return this.alipayIdentityId;
	}
	public void setAlipayIdentityId(String alipayIdentityId) {
		this.alipayIdentityId = alipayIdentityId;
	}

	public String getAlipayIdentityType() {
		return this.alipayIdentityType;
	}
	public void setAlipayIdentityType(String alipayIdentityType) {
		this.alipayIdentityType = alipayIdentityType;
	}

	public String getBindUserName() {
		return this.bindUserName;
	}
	public void setBindUserName(String bindUserName) {
		this.bindUserName = bindUserName;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
