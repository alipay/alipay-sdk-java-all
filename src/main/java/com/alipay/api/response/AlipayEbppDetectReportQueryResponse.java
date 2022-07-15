package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.detect.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-13 16:10:58
 */
public class AlipayEbppDetectReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6473587634129333585L;

	/** 
	 * 注意：该字段废弃。
	 */
	@ApiField("audit_done")
	private Boolean auditDone;

	/** 
	 * 注意：该字段废弃。
	 */
	@ApiField("audit_pass")
	private Boolean auditPass;

	/** 
	 * 检测详情报告地址
	 */
	@ApiField("detail_report")
	private String detailReport;

	/** 
	 * 检测结果详情。JSON数组字符串。列出每个检测项的检测详情。
	 */
	@ApiField("detect_detail")
	private String detectDetail;

	/** 
	 * 检测结果详情，案例过长，可查看 https://yuque.antfin-inc.com/docs/share/dc6d16d3-08c1-46d2-a1ed-c0ca6bbba07d?# 或联系 @温酒 @赵旭敏
	 */
	@ApiField("detect_result")
	private String detectResult;

	/** 
	 * 检测类型+检测项详细检出数据及部分统计数据
	 */
	@ApiListField("detect_result_detail_list")
	@ApiField("string")
	private List<String> detectResultDetailList;

	/** 
	 * 检测状态.
 * 0-未查到报告(检测未开始或检测异常)
 * 1-检测中
 * 2-检测结束并生成检测报告
	 */
	@ApiField("detect_status")
	private Long detectStatus;

	/** 
	 * 注意：该字段废弃
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 注意：该字段废弃。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 整体检测是否通过.
只有当detectStatus=2时才会有值.
 * true-检测通过
 * false-检测不通过
	 */
	@ApiField("pass")
	private Boolean pass;

	/** 
	 * 检测结果一句话描述
	 */
	@ApiField("summary")
	private String summary;

	public void setAuditDone(Boolean auditDone) {
		this.auditDone = auditDone;
	}
	public Boolean getAuditDone( ) {
		return this.auditDone;
	}

	public void setAuditPass(Boolean auditPass) {
		this.auditPass = auditPass;
	}
	public Boolean getAuditPass( ) {
		return this.auditPass;
	}

	public void setDetailReport(String detailReport) {
		this.detailReport = detailReport;
	}
	public String getDetailReport( ) {
		return this.detailReport;
	}

	public void setDetectDetail(String detectDetail) {
		this.detectDetail = detectDetail;
	}
	public String getDetectDetail( ) {
		return this.detectDetail;
	}

	public void setDetectResult(String detectResult) {
		this.detectResult = detectResult;
	}
	public String getDetectResult( ) {
		return this.detectResult;
	}

	public void setDetectResultDetailList(List<String> detectResultDetailList) {
		this.detectResultDetailList = detectResultDetailList;
	}
	public List<String> getDetectResultDetailList( ) {
		return this.detectResultDetailList;
	}

	public void setDetectStatus(Long detectStatus) {
		this.detectStatus = detectStatus;
	}
	public Long getDetectStatus( ) {
		return this.detectStatus;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPass(Boolean pass) {
		this.pass = pass;
	}
	public Boolean getPass( ) {
		return this.pass;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getSummary( ) {
		return this.summary;
	}

}
