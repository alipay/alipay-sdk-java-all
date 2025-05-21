package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多主体信息，指定渠道贴息，相较于activityFundInfos补充资产和机构信息
 *
 * @author auto create
 * @since 1.0, 2025-04-30 10:34:56
 */
public class BFActivityFundInfoNew extends AlipayObject {

	private static final long serialVersionUID = 3497612438872226348L;

	/**
	 * 资产类型
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 多主体信息
	 */
	@ApiListField("fund_info_list")
	@ApiField("b_f_activity_fund_info")
	private List<BFActivityFundInfo> fundInfoList;

	/**
	 * 机构ID，没有机构ID时与资产类型保持一致
	 */
	@ApiField("inst_id")
	private String instId;

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public List<BFActivityFundInfo> getFundInfoList() {
		return this.fundInfoList;
	}
	public void setFundInfoList(List<BFActivityFundInfo> fundInfoList) {
		this.fundInfoList = fundInfoList;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
