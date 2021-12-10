package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StallModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.stall.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringPosStallQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7262913491462482199L;

	/** 
	 * 未分配档口的菜品数目
	 */
	@ApiField("no_set_stall")
	private Long noSetStall;

	/** 
	 * 重复分配档口的菜品数目
	 */
	@ApiField("repeat_set_stall")
	private Long repeatSetStall;

	/** 
	 * 档口列表
	 */
	@ApiListField("stall_model_list")
	@ApiField("stall_model")
	private List<StallModel> stallModelList;

	public void setNoSetStall(Long noSetStall) {
		this.noSetStall = noSetStall;
	}
	public Long getNoSetStall( ) {
		return this.noSetStall;
	}

	public void setRepeatSetStall(Long repeatSetStall) {
		this.repeatSetStall = repeatSetStall;
	}
	public Long getRepeatSetStall( ) {
		return this.repeatSetStall;
	}

	public void setStallModelList(List<StallModel> stallModelList) {
		this.stallModelList = stallModelList;
	}
	public List<StallModel> getStallModelList( ) {
		return this.stallModelList;
	}

}
