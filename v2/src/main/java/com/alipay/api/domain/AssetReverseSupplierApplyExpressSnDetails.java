package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 该数据结构用于承载供应商发起未妥投对应的运单号和sn列表
 *
 * @author auto create
 * @since 1.0, 2023-11-24 16:04:59
 */
public class AssetReverseSupplierApplyExpressSnDetails extends AlipayObject {

	private static final long serialVersionUID = 2186939916336132698L;

	/**
	 * 物流信息
	 */
	@ApiField("logistics_infos")
	private LogisticsInfo logisticsInfos;

	/**
	 * sn列表
	 */
	@ApiListField("sn_records")
	@ApiField("string")
	private List<String> snRecords;

	public LogisticsInfo getLogisticsInfos() {
		return this.logisticsInfos;
	}
	public void setLogisticsInfos(LogisticsInfo logisticsInfos) {
		this.logisticsInfos = logisticsInfos;
	}

	public List<String> getSnRecords() {
		return this.snRecords;
	}
	public void setSnRecords(List<String> snRecords) {
		this.snRecords = snRecords;
	}

}
