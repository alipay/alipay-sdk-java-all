package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SnApplyInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.sn.apply.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-26 14:32:09
 */
public class AlipayCommerceIotSnApplyBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2228569788972581593L;

	/** 
	 * 申请单列表
	 */
	@ApiField("apply_list")
	private SnApplyInfo applyList;

	/** 
	 * 历史sn生成成功的操作总数
	 */
	@ApiListField("total")
	@ApiField("number")
	private List<Long> total;

	public void setApplyList(SnApplyInfo applyList) {
		this.applyList = applyList;
	}
	public SnApplyInfo getApplyList( ) {
		return this.applyList;
	}

	public void setTotal(List<Long> total) {
		this.total = total;
	}
	public List<Long> getTotal( ) {
		return this.total;
	}

}
