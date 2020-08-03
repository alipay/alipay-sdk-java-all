package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销方案批量查询
 *
 * @author auto create
 * @since 1.0, 2017-11-17 06:02:33
 */
public class KoubeiMarketingCampaignIntelligentPromoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6673876621547681898L;

	/**
	 * 操作员上下文信息
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 外部业务id，请保持足够的复杂，方便定位数据来源
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 活动拥有者信息
	 */
	@ApiField("owner_info")
	private PromoOperatorInfo ownerInfo;

	/**
	 * 分页信息
	 */
	@ApiField("page_info")
	private PromoPageInfo pageInfo;

	public PromoOperatorInfo getOperatorContext() {
		return this.operatorContext;
	}
	public void setOperatorContext(PromoOperatorInfo operatorContext) {
		this.operatorContext = operatorContext;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public PromoOperatorInfo getOwnerInfo() {
		return this.ownerInfo;
	}
	public void setOwnerInfo(PromoOperatorInfo ownerInfo) {
		this.ownerInfo = ownerInfo;
	}

	public PromoPageInfo getPageInfo() {
		return this.pageInfo;
	}
	public void setPageInfo(PromoPageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

}
