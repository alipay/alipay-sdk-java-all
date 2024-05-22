package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量处理结果
 *
 * @author auto create
 * @since 1.0, 2023-08-30 14:26:39
 */
public class BatchResultDTO extends AlipayObject {

	private static final long serialVersionUID = 6484536269769242688L;

	/**
	 * 是否全部成功
	 */
	@ApiField("all_succeeded")
	private Boolean allSucceeded;

	/**
	 * 单一发票处理结果列表
	 */
	@ApiListField("result_list")
	@ApiField("single_result_d_t_o")
	private List<SingleResultDTO> resultList;

	public Boolean getAllSucceeded() {
		return this.allSucceeded;
	}
	public void setAllSucceeded(Boolean allSucceeded) {
		this.allSucceeded = allSucceeded;
	}

	public List<SingleResultDTO> getResultList() {
		return this.resultList;
	}
	public void setResultList(List<SingleResultDTO> resultList) {
		this.resultList = resultList;
	}

}
