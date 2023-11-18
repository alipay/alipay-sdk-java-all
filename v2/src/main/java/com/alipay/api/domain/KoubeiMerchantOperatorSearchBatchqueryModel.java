package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 操作员批量分页查询
 *
 * @author auto create
 * @since 1.0, 2022-06-17 16:46:37
 */
public class KoubeiMerchantOperatorSearchBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2635164865294386415L;

	/**
	 * 授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 当前页码，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * T - "已激活"
U - "已锁定"
W - "未激活"
	 */
	@ApiListField("status")
	@ApiField("string")
	private List<String> status;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
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

	public List<String> getStatus() {
		return this.status;
	}
	public void setStatus(List<String> status) {
		this.status = status;
	}

}
