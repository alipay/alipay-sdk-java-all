package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配送完成反馈详情
 *
 * @author auto create
 * @since 1.0, 2020-12-21 14:24:21
 */
public class AssetDeliveryDetail extends AlipayObject {

	private static final long serialVersionUID = 8122981142782513227L;

	/**
	 * 配送数量
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 配送订单ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 由供应商自定义的分批反馈批次号，用于保持幂等，此值不传则需要按整批反馈.(由字母,数字,下划线组成)
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * JSON格式扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 物流单信息
	 */
	@ApiListField("logistics_infos")
	@ApiField("logistics_info")
	private List<LogisticsInfo> logisticsInfos;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public List<LogisticsInfo> getLogisticsInfos() {
		return this.logisticsInfos;
	}
	public void setLogisticsInfos(List<LogisticsInfo> logisticsInfos) {
		this.logisticsInfos = logisticsInfos;
	}

}
