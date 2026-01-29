package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云高风险数据同步接口
 *
 * @author auto create
 * @since 1.0, 2024-07-05 12:05:10
 */
public class AlipayCloudTraasCloudriskRiskmetadataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8644998165241998593L;

	/**
	 * 风险元数据参数，包含元数据信息及操作类型
	 */
	@ApiListField("risk_meta_data_list")
	@ApiField("risk_meta_data")
	private List<RiskMetaData> riskMetaDataList;

	public List<RiskMetaData> getRiskMetaDataList() {
		return this.riskMetaDataList;
	}
	public void setRiskMetaDataList(List<RiskMetaData> riskMetaDataList) {
		this.riskMetaDataList = riskMetaDataList;
	}

}
