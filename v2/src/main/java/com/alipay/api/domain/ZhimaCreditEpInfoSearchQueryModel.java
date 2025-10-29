package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业模糊搜索接口
 *
 * @author auto create
 * @since 1.0, 2024-12-25 11:34:10
 */
public class ZhimaCreditEpInfoSearchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2841734443854488327L;

	/**
	 * 请输入标准工商注册的企业名称，在此之外的特殊不允许输入
	 */
	@ApiField("key_word")
	private String keyWord;

	/**
	 * 分页用参数，代表请求结果的起始位置，默认1
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 分页用参数，表示需要返回的结果条数，默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getKeyWord() {
		return this.keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
