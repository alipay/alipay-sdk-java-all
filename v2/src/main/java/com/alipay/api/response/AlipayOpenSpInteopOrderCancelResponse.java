package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InteopSubTaskOpInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.inteop.order.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-21 17:07:41
 */
public class AlipayOpenSpInteopOrderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5832121237161187393L;

	/** 
	 * 一体化作业主单号
	 */
	@ApiField("inteop_order_no")
	private String inteopOrderNo;

	/** 
	 * 一体化作业任务操作信息
	 */
	@ApiListField("sub_task_op_infos")
	@ApiField("inteop_sub_task_op_info_v_o")
	private List<InteopSubTaskOpInfoVO> subTaskOpInfos;

	public void setInteopOrderNo(String inteopOrderNo) {
		this.inteopOrderNo = inteopOrderNo;
	}
	public String getInteopOrderNo( ) {
		return this.inteopOrderNo;
	}

	public void setSubTaskOpInfos(List<InteopSubTaskOpInfoVO> subTaskOpInfos) {
		this.subTaskOpInfos = subTaskOpInfos;
	}
	public List<InteopSubTaskOpInfoVO> getSubTaskOpInfos( ) {
		return this.subTaskOpInfos;
	}

}
