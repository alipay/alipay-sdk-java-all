package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GreenEnergyLogsDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.item.greenenergy.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 14:51:36
 */
public class AlipayCommerceItemGreenenergyBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5611884353191636172L;

	/** 
	 * 能量领取流水
	 */
	@ApiListField("green_energy_logs")
	@ApiField("green_energy_logs_d_t_o")
	private List<GreenEnergyLogsDTO> greenEnergyLogs;

	/** 
	 * 第几页，默认1（从1开始计数）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页记录条数，默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setGreenEnergyLogs(List<GreenEnergyLogsDTO> greenEnergyLogs) {
		this.greenEnergyLogs = greenEnergyLogs;
	}
	public List<GreenEnergyLogsDTO> getGreenEnergyLogs( ) {
		return this.greenEnergyLogs;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
