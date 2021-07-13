package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自建推广页列表批量查询
 *
 * @author auto create
 * @since 1.0, 2021-05-08 11:45:17
 */
public class AlipayDataDataserviceAdPromotepageBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1583281347245868651L;

	/**
	 * 代理商访问灯火平台的token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 分页参数之页数，从1开始
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页参数之每页大小，最大1000
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商家标志
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 推广页类型：COLLECT_INFO -  免费留资；TRADE - 付费留资； OPERATION_PAID - 运营商付费留资；待扩展
	 */
	@ApiField("type")
	private String type;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
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

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
