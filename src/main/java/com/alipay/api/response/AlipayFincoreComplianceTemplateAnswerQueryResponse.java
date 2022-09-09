package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TemplateAnswerDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.answer.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-18 15:21:53
 */
public class AlipayFincoreComplianceTemplateAnswerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4747269217813119892L;

	/** 
	 * 模版答题要素
	 */
	@ApiListField("answers")
	@ApiField("template_answer_d_t_o")
	private List<TemplateAnswerDTO> answers;

	public void setAnswers(List<TemplateAnswerDTO> answers) {
		this.answers = answers;
	}
	public List<TemplateAnswerDTO> getAnswers( ) {
		return this.answers;
	}

}
