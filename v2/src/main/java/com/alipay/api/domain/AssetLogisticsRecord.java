package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发货计划反馈信息
 *
 * @author auto create
 * @since 1.0, 2020-12-21 14:24:15
 */
public class AssetLogisticsRecord extends AlipayObject {

	private static final long serialVersionUID = 2255611216272821563L;

	/**
	 * 物流节点详情描述
	 */
	@ApiField("last_logistics_detail")
	private String lastLogisticsDetail;

	/**
	 * 物流公司Code
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 物流时间
	 */
	@ApiField("logistics_gmt_modified")
	private String logisticsGmtModified;

	/**
	 * 物流单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 物流状态
	 */
	@ApiField("logistics_status")
	private String logisticsStatus;

	/**
	 * 物流状态描述
	 */
	@ApiField("logistics_status_desc")
	private String logisticsStatusDesc;

	public String getLastLogisticsDetail() {
		return this.lastLogisticsDetail;
	}
	public void setLastLogisticsDetail(String lastLogisticsDetail) {
		this.lastLogisticsDetail = lastLogisticsDetail;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsGmtModified() {
		return this.logisticsGmtModified;
	}
	public void setLogisticsGmtModified(String logisticsGmtModified) {
		this.logisticsGmtModified = logisticsGmtModified;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public String getLogisticsStatus() {
		return this.logisticsStatus;
	}
	public void setLogisticsStatus(String logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}

	public String getLogisticsStatusDesc() {
		return this.logisticsStatusDesc;
	}
	public void setLogisticsStatusDesc(String logisticsStatusDesc) {
		this.logisticsStatusDesc = logisticsStatusDesc;
	}

}
