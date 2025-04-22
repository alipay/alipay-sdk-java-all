package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客账本信息查询
 *
 * @author auto create
 * @since 1.0, 2023-10-16 14:53:51
 */
public class AlipayCommerceCommonAccountbookQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6854315383847263124L;

	/**
	 * 商户账本id
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 页码，默认1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小，默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 签约账户id
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	/**
	 * 签约账户openId
	 */
	@ApiField("sign_user_open_id")
	private String signUserOpenId;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSignUserId() {
		return this.signUserId;
	}
	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}

	public String getSignUserOpenId() {
		return this.signUserOpenId;
	}
	public void setSignUserOpenId(String signUserOpenId) {
		this.signUserOpenId = signUserOpenId;
	}

}
