package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料信息
 *
 * @author auto create
 * @since 1.0, 2020-12-21 14:24:48
 */
public class AssetInfoItem extends AlipayObject {

	private static final long serialVersionUID = 1437535711387989636L;

	/**
	 * 配送或者生产指令id.
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 由供应商自定义的分批反馈批次号，用于保持幂等，此值不传则需要按整批反馈.(由字母,数字,下划线组成)
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 物流公司code
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 物流单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 机具序列号
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 生产资料, 配送资料
	 */
	@ApiField("type")
	private String type;

	/**
	 * 格式按照type约定的类型传入, 约定参见物料平台openAPI文档.
	 */
	@ApiField("value")
	private String value;

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

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
