package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物料生产订单物流详情, 包括物流订单号, 物流公司名称等信息
 *
 * @author auto create
 * @since 1.0, 2025-07-24 17:18:28
 */
public class ItemDeliveryDetail extends AlipayObject {

	private static final long serialVersionUID = 8634423556269476329L;

	/**
	 * 已生产数量, 分批反馈时候必传.
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 订单明细ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 由供应商自定义的分批反馈批次号，用于保持幂等，此值不传则需要按整批反馈.(由字母,数字,下划线组成)
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 物料版本信息
	 */
	@ApiField("item_version_info")
	private AssetItemVersion itemVersionInfo;

	/**
	 * 物流公司code, 比如: SF-顺丰, POST-中国邮政, CAINIAO-菜鸟.
	 */
	@ApiField("logistic_code")
	private String logisticCode;

	/**
	 * 物流公司名称
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	/**
	 * 物流订单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 选配物料信息
	 */
	@ApiListField("optional_item_infos")
	@ApiField("optional_item_info")
	private List<OptionalItemInfo> optionalItemInfos;

	/**
	 * 供应商传入库存动销明细对应的凭证日期
	 */
	@ApiField("voucher_time")
	private String voucherTime;

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

	public AssetItemVersion getItemVersionInfo() {
		return this.itemVersionInfo;
	}
	public void setItemVersionInfo(AssetItemVersion itemVersionInfo) {
		this.itemVersionInfo = itemVersionInfo;
	}

	public String getLogisticCode() {
		return this.logisticCode;
	}
	public void setLogisticCode(String logisticCode) {
		this.logisticCode = logisticCode;
	}

	public String getLogisticsName() {
		return this.logisticsName;
	}
	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public List<OptionalItemInfo> getOptionalItemInfos() {
		return this.optionalItemInfos;
	}
	public void setOptionalItemInfos(List<OptionalItemInfo> optionalItemInfos) {
		this.optionalItemInfos = optionalItemInfos;
	}

	public String getVoucherTime() {
		return this.voucherTime;
	}
	public void setVoucherTime(String voucherTime) {
		this.voucherTime = voucherTime;
	}

}
