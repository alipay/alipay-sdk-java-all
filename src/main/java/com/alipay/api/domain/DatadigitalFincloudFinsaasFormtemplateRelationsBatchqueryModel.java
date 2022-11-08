package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 表单模板与营销类型关联关系批量查询
 *
 * @author auto create
 * @since 1.0, 2022-07-21 21:07:27
 */
public class DatadigitalFincloudFinsaasFormtemplateRelationsBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7532567899112694739L;

	/**
	 * marketing_type + 关联关系查询 + 前端。
	 */
	@ApiField("marketing_type")
	private String marketingType;

	/**
	 * page_num + 关联关系查询 + 前端
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * page_size + 关联关系查询 + 前端
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getMarketingType() {
		return this.marketingType;
	}
	public void setMarketingType(String marketingType) {
		this.marketingType = marketingType;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
