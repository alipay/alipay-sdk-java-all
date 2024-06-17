package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金记账本信息查询
 *
 * @author auto create
 * @since 1.0, 2022-12-27 10:12:41
 */
public class AlipayCommerceYuntaskAccountbookQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4319142261996967956L;

	/**
	 * 记账本id
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 页码
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 页面大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 资金代扣签约时的出资方uid
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
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

}
