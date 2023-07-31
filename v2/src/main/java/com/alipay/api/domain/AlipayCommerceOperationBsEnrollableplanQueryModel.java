package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 联营-报名-可报名计划列表-商户
 *
 * @author auto create
 * @since 1.0, 2023-04-18 15:56:30
 */
public class AlipayCommerceOperationBsEnrollableplanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4628141324789832442L;

	/**
	 * 联营报名渠道，请咨询产品提供方
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 过滤条件：联营计划的商家权益类型。
为空则查询全部类型。
	 */
	@ApiListField("merchant_benefit_types")
	@ApiField("string")
	private List<String> merchantBenefitTypes;

	/**
	 * 分页查询页码，默认1，从1开始
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 分页大小，最大20，默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 搜索条件，联营计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 查询可报名的联营计划方案编码
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public List<String> getMerchantBenefitTypes() {
		return this.merchantBenefitTypes;
	}
	public void setMerchantBenefitTypes(List<String> merchantBenefitTypes) {
		this.merchantBenefitTypes = merchantBenefitTypes;
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

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

}
