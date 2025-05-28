package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.isv.importedbill.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:52
 */
public class AlipayEbppIsvImportedbillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7345372182441273618L;

	/** 
	 * 解析失败数量
	 */
	@ApiField("analysis_fail_count")
	private Long analysisFailCount;

	/** 
	 * 解析成功数量
	 */
	@ApiField("analysis_suc_count")
	private Long analysisSucCount;

	/** 
	 * 写入失败数量
	 */
	@ApiField("import_fail_count")
	private Long importFailCount;

	/** 
	 * 写入成功数量
	 */
	@ApiField("import_suc_count")
	private Long importSucCount;

	/** 
	 * 导入账单总数量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAnalysisFailCount(Long analysisFailCount) {
		this.analysisFailCount = analysisFailCount;
	}
	public Long getAnalysisFailCount( ) {
		return this.analysisFailCount;
	}

	public void setAnalysisSucCount(Long analysisSucCount) {
		this.analysisSucCount = analysisSucCount;
	}
	public Long getAnalysisSucCount( ) {
		return this.analysisSucCount;
	}

	public void setImportFailCount(Long importFailCount) {
		this.importFailCount = importFailCount;
	}
	public Long getImportFailCount( ) {
		return this.importFailCount;
	}

	public void setImportSucCount(Long importSucCount) {
		this.importSucCount = importSucCount;
	}
	public Long getImportSucCount( ) {
		return this.importSucCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
