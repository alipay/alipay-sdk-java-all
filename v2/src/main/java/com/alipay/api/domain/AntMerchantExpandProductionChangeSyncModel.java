package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产线节点变化信息回传
 *
 * @author auto create
 * @since 1.0, 2023-02-06 14:19:10
 */
public class AntMerchantExpandProductionChangeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1877676736984891351L;

	/**
	 * 幂等批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 完成当前产线阶段的时间，格式:
yyyy-MM-dd HH：mm:ss
	 */
	@ApiField("complete_date")
	private String completeDate;

	/**
	 * 工序（产线阶段），如：印刷/模切/品检/装配
	 */
	@ApiField("production_phase")
	private String productionPhase;

	/**
	 * 项目单号（供应商维度）
	 */
	@ApiField("project_no")
	private String projectNo;

	/**
	 * 良品数
	 */
	@ApiField("success_amount")
	private String successAmount;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getCompleteDate() {
		return this.completeDate;
	}
	public void setCompleteDate(String completeDate) {
		this.completeDate = completeDate;
	}

	public String getProductionPhase() {
		return this.productionPhase;
	}
	public void setProductionPhase(String productionPhase) {
		this.productionPhase = productionPhase;
	}

	public String getProjectNo() {
		return this.projectNo;
	}
	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getSuccessAmount() {
		return this.successAmount;
	}
	public void setSuccessAmount(String successAmount) {
		this.successAmount = successAmount;
	}

}
