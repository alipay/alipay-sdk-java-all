package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询安心充会员个人信息
 *
 * @author auto create
 * @since 1.0, 2022-10-26 20:06:18
 */
public class AntMerchantExpandMembercardUserinfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1175756926213948197L;

	/**
	 * 商家的安心充配置的唯一编号
	 */
	@ApiField("member_product_id")
	private String memberProductId;

	/**
	 * 查询的页数，从1开始，最大1000
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录条数，最小1，最大20
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getMemberProductId() {
		return this.memberProductId;
	}
	public void setMemberProductId(String memberProductId) {
		this.memberProductId = memberProductId;
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
