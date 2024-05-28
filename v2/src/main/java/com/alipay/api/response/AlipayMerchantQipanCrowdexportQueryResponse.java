package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CrowdExportData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.crowdexport.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-22 11:32:03
 */
public class AlipayMerchantQipanCrowdexportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5471796592468454746L;

	/** 
	 * 人群唯一键
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/** 
	 * 棋盘人群导出详情数据
	 */
	@ApiField("crowd_export_data")
	private CrowdExportData crowdExportData;

	/** 
	 * 外部创建导出任务时传入的业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 棋盘返回的导出任务流水号
	 */
	@ApiField("task_no")
	private String taskNo;

	/** 
	 * 导出任务状态
	 */
	@ApiField("task_status")
	private String taskStatus;

	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}
	public String getCrowdCode( ) {
		return this.crowdCode;
	}

	public void setCrowdExportData(CrowdExportData crowdExportData) {
		this.crowdExportData = crowdExportData;
	}
	public CrowdExportData getCrowdExportData( ) {
		return this.crowdExportData;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}
	public String getTaskNo( ) {
		return this.taskNo;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskStatus( ) {
		return this.taskStatus;
	}

}
