package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 扩展参数
 *
 * @author auto create
 * @since 1.0, 2024-04-18 15:45:53
 */
public class FinAdditionArgs extends AlipayObject {

	private static final long serialVersionUID = 4455135344393645123L;

	/**
	 * 结束时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 选择的文件ID列表
	 */
	@ApiListField("selected_files")
	@ApiField("string")
	private List<String> selectedFiles;

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 标的列表
	 */
	@ApiListField("symbol_list")
	@ApiField("fin_symbol_detail")
	private List<FinSymbolDetail> symbolList;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public List<String> getSelectedFiles() {
		return this.selectedFiles;
	}
	public void setSelectedFiles(List<String> selectedFiles) {
		this.selectedFiles = selectedFiles;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public List<FinSymbolDetail> getSymbolList() {
		return this.symbolList;
	}
	public void setSymbolList(List<FinSymbolDetail> symbolList) {
		this.symbolList = symbolList;
	}

}
