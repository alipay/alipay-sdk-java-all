package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 路由比例模型
 *
 * @author auto create
 * @since 1.0, 2022-09-08 15:54:22
 */
public class RoutingPercentDTO extends AlipayObject {

	private static final long serialVersionUID = 7546262535469912682L;

	/**
	 * 结束点差，闭区间
	 */
	@ApiField("end_bps_val")
	private Long endBpsVal;

	/**
	 * 境内路由金额绝对值
	 */
	@ApiField("onshore_abs_amount")
	private TransferAmount onshoreAbsAmount;

	/**
	 * 路由比例
	 */
	@ApiField("onshore_percent")
	private String onshorePercent;

	/**
	 * 起始点差，开区间
	 */
	@ApiField("start_bps_val")
	private Long startBpsVal;

	public Long getEndBpsVal() {
		return this.endBpsVal;
	}
	public void setEndBpsVal(Long endBpsVal) {
		this.endBpsVal = endBpsVal;
	}

	public TransferAmount getOnshoreAbsAmount() {
		return this.onshoreAbsAmount;
	}
	public void setOnshoreAbsAmount(TransferAmount onshoreAbsAmount) {
		this.onshoreAbsAmount = onshoreAbsAmount;
	}

	public String getOnshorePercent() {
		return this.onshorePercent;
	}
	public void setOnshorePercent(String onshorePercent) {
		this.onshorePercent = onshorePercent;
	}

	public Long getStartBpsVal() {
		return this.startBpsVal;
	}
	public void setStartBpsVal(Long startBpsVal) {
		this.startBpsVal = startBpsVal;
	}

}
