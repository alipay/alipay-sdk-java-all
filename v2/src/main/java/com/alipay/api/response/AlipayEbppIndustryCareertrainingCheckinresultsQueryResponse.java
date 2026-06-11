package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CheckInRecordDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.checkinresults.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-01 13:37:49
 */
public class AlipayEbppIndustryCareertrainingCheckinresultsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7529432318812373398L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("check_in_record_d_t_o")
	private List<CheckInRecordDTO> list;

	/** 
	 * 总数量（条数）
	 */
	@ApiField("total")
	private Long total;

	public void setList(List<CheckInRecordDTO> list) {
		this.list = list;
	}
	public List<CheckInRecordDTO> getList( ) {
		return this.list;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
