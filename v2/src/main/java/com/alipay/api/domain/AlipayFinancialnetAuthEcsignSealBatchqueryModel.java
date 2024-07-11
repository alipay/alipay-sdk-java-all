package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签呗电子签约印章列表查询服务
 *
 * @author auto create
 * @since 1.0, 2023-05-18 15:28:56
 */
public class AlipayFinancialnetAuthEcsignSealBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3562688745977363372L;

	/**
	 * 页，默认1，必须要大于0。
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 页面大小，默认200。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 印章ID，如果有则为唯一值，用于印章更新场景，在创建完和更新完均会返回该值。
	 */
	@ApiField("seal_id")
	private String sealId;

	/**
	 * 印章名称，无需唯一，用于印章命名，来源是用户自定义，模糊查询。
	 */
	@ApiField("seal_name")
	private String sealName;

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

	public String getSealId() {
		return this.sealId;
	}
	public void setSealId(String sealId) {
		this.sealId = sealId;
	}

	public String getSealName() {
		return this.sealName;
	}
	public void setSealName(String sealName) {
		this.sealName = sealName;
	}

}
