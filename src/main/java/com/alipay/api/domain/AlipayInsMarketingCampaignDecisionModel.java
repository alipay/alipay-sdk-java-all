package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险营销标的活动列表查询
 *
 * @author auto create
 * @since 1.0, 2019-08-26 17:23:48
 */
public class AlipayInsMarketingCampaignDecisionModel extends AlipayObject {

	private static final long serialVersionUID = 5616134676752547329L;

	/**
	 * 描述营销活动涉及的业务类型
1：平台险业务
	 */
	@ApiField("business_type")
	private Long businessType;

	/**
	 * 营销市场列表
	 */
	@ApiListField("market_types")
	@ApiField("number")
	private List<Long> marketTypes;

	/**
	 * 保险营销平台营销标的标识
	 */
	@ApiField("mkt_obj_id")
	private String mktObjId;

	/**
	 * 保险营销平台的营销标的类型
1：淘宝商品
	 */
	@ApiField("mkt_obj_type")
	private Long mktObjType;

	/**
	 * 请求流水id
	 */
	@ApiField("request_id")
	private String requestId;

	public Long getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(Long businessType) {
		this.businessType = businessType;
	}

	public List<Long> getMarketTypes() {
		return this.marketTypes;
	}
	public void setMarketTypes(List<Long> marketTypes) {
		this.marketTypes = marketTypes;
	}

	public String getMktObjId() {
		return this.mktObjId;
	}
	public void setMktObjId(String mktObjId) {
		this.mktObjId = mktObjId;
	}

	public Long getMktObjType() {
		return this.mktObjType;
	}
	public void setMktObjType(Long mktObjType) {
		this.mktObjType = mktObjType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
