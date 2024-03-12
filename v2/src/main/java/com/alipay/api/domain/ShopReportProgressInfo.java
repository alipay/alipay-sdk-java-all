package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺上报进程
 *
 * @author auto create
 * @since 1.0, 2023-01-11 11:02:27
 */
public class ShopReportProgressInfo extends AlipayObject {

	private static final long serialVersionUID = 4332891536483463196L;

	/**
	 * 当前上报进度阶段
	 */
	@ApiField("current_stage")
	private String currentStage;

	/**
	 * 上报进度在此阶段下的具体状态
	 */
	@ApiField("current_stage_status")
	private String currentStageStatus;

	/**
	 * 其他补充的描述信息，如风控结果信息等
	 */
	@ApiField("description")
	private String description;

	/**
	 * 上报结果
	 */
	@ApiField("report_result")
	private String reportResult;

	/**
	 * A+店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCurrentStage() {
		return this.currentStage;
	}
	public void setCurrentStage(String currentStage) {
		this.currentStage = currentStage;
	}

	public String getCurrentStageStatus() {
		return this.currentStageStatus;
	}
	public void setCurrentStageStatus(String currentStageStatus) {
		this.currentStageStatus = currentStageStatus;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getReportResult() {
		return this.reportResult;
	}
	public void setReportResult(String reportResult) {
		this.reportResult = reportResult;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
