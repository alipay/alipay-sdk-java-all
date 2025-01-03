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
 * @since 1.0, 2024-11-26 10:25:38
 */
public class AlipayCommerceIotSnApplyBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6521847518426487472L;

	/** 
	 * 申请单列表
	 */
	@ApiListField("apply_list")
	@ApiField("sn_apply_info")
	private List<SnApplyInfo> applyList;

	/** 
	 * 历史sn生成成功的操作总数
	 */
	@ApiField("total")
	private Long total;

	public void setApplyList(List<SnApplyInfo> applyList) {
		this.applyList = applyList;
	}
	public List<SnApplyInfo> getApplyList( ) {
		return this.applyList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
