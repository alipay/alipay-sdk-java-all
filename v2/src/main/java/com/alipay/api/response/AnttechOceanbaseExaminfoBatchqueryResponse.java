package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExamInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.examinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-26 15:57:22
 */
public class AnttechOceanbaseExaminfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7461249264625193552L;

	/** 
	 * 用户认证考试信息List
	 */
	@ApiListField("exam_infos")
	@ApiField("exam_info_d_t_o")
	private List<ExamInfoDTO> examInfos;

	public void setExamInfos(List<ExamInfoDTO> examInfos) {
		this.examInfos = examInfos;
	}
	public List<ExamInfoDTO> getExamInfos( ) {
		return this.examInfos;
	}

}
