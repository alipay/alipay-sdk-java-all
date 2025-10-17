package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分账明细
 *
 * @author auto create
 * @since 1.0, 2024-05-13 14:22:15
 */
public class RentRoyaltyDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 3488938685976283625L;

	/**
	 * 每个阶段对应的分账计划
	 */
	@ApiListField("royalties")
	@ApiField("royalty_d_t_o")
	private List<RoyaltyDTO> royalties;

	/**
	 * 阶段号，举例1、2、3.......
	 */
	@ApiField("stage_no")
	private Long stageNo;

	public List<RoyaltyDTO> getRoyalties() {
		return this.royalties;
	}
	public void setRoyalties(List<RoyaltyDTO> royalties) {
		this.royalties = royalties;
	}

	public Long getStageNo() {
		return this.stageNo;
	}
	public void setStageNo(Long stageNo) {
		this.stageNo = stageNo;
	}

}
