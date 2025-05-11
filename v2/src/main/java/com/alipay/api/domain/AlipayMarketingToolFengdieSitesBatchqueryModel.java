package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取云凤蝶站点列表
 *
 * @author auto create
 * @since 1.0, 2021-01-06 16:27:10
 */
public class AlipayMarketingToolFengdieSitesBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2871441481832669675L;

	/**
	 * 作为当前操作者的空间成员用户名， 值为 origin_user_id（即创建空间成员接口的入参）
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 当前页数，默认为1
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * 每页记录数，不能超过50，默认为10
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 欲查询的云凤蝶业务空间 ID
	 */
	@ApiField("space_id")
	private String spaceId;

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getSpaceId() {
		return this.spaceId;
	}
	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}

}
