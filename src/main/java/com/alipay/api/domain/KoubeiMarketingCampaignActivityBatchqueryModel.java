package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑营销活动列表查询
 *
 * @author auto create
 * @since 1.0, 2017-09-29 18:12:38
 */
public class KoubeiMarketingCampaignActivityBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5483799432841315916L;

	/**
	 * 操作人id，必须和operator_type配对存在，不填时默认是商户
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型，不填默认为 MER（外部商户）。支持枚举值如下：
* MER：外部商户。
* MER_OPERATOR：外部商户操作员。
* PROVIDER：外部服务商。
* PROVIDER_STAFF：外部服务商员工。
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 页码，默认为1
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * 页大小，默认为20
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 查询条件
	 */
	@ApiListField("query_criterias")
	@ApiField("condition")
	private List<Condition> queryCriterias;

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
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

	public List<Condition> getQueryCriterias() {
		return this.queryCriterias;
	}
	public void setQueryCriterias(List<Condition> queryCriterias) {
		this.queryCriterias = queryCriterias;
	}

}
