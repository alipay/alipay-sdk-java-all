package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流运单信息
 *
 * @author auto create
 * @since 1.0, 2024-04-11 15:30:52
 */
public class LogisticsWaybill extends AlipayObject {

	private static final long serialVersionUID = 6412475661451427446L;

	/**
	 * 物流公司编号
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 物流详情
	 */
	@ApiListField("steps")
	@ApiField("waybill_step")
	private List<WaybillStep> steps;

	/**
	 * 运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<WaybillStep> getSteps() {
		return this.steps;
	}
	public void setSteps(List<WaybillStep> steps) {
		this.steps = steps;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
