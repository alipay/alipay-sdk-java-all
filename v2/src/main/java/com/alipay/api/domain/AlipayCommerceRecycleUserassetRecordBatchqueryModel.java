package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询用户资产的流水
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:25:13
 */
public class AlipayCommerceRecycleUserassetRecordBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2562395338199721436L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 页数
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
