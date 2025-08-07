package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拉取代理商下子户信息
 *
 * @author auto create
 * @since 1.0, 2025-07-22 10:22:01
 */
public class AlipayDataDataserviceAdPageprincipalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8359381487626185214L;

	/**
	 * 账户名称、账号、商户号模糊匹配
	 */
	@ApiField("key_word")
	private String keyWord;

	/**
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商家状态
	 */
	@ApiField("status")
	private String status;

	public String getKeyWord() {
		return this.keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
