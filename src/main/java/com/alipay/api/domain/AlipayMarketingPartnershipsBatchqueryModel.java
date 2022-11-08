package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询合作关系列表
 *
 * @author auto create
 * @since 1.0, 2022-08-25 15:50:39
 */
public class AlipayMarketingPartnershipsBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2346433351889431188L;

	/**
	 * 授权给合作方的营销资源。
	 */
	@ApiField("authorized_data")
	private MarketingAuthorizedData authorizedData;

	/**
	 * 分页查询页码。 
限制: 
1.必须为大于0的整数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询单页数据条数。 
限制: 
1.必须为大于0的整数 
2.每页最大值为20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 合作方相关信息
	 */
	@ApiField("partner")
	private MarketingPartner partner;

	/**
	 * 合作状态，枚举值： 
ESTABLISHED：已建立 
TERMINATED：已终止
	 */
	@ApiField("status")
	private String status;

	public MarketingAuthorizedData getAuthorizedData() {
		return this.authorizedData;
	}
	public void setAuthorizedData(MarketingAuthorizedData authorizedData) {
		this.authorizedData = authorizedData;
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

	public MarketingPartner getPartner() {
		return this.partner;
	}
	public void setPartner(MarketingPartner partner) {
		this.partner = partner;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
