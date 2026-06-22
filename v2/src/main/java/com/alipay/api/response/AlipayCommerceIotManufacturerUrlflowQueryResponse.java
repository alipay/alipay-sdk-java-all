package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FailSnDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.manufacturer.urlflow.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-10 10:32:45
 */
public class AlipayCommerceIotManufacturerUrlflowQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8514853219123291635L;

	/** 
	 * 失败列表
	 */
	@ApiListField("fail_sn_detail_list")
	@ApiField("fail_sn_detail")
	private List<FailSnDetail> failSnDetailList;

	/** 
	 * 流水号
	 */
	@ApiField("flow_no")
	private String flowNo;

	/** 
	 * 外部业务系统业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 状态描述
	 */
	@ApiField("status")
	private String status;

	public void setFailSnDetailList(List<FailSnDetail> failSnDetailList) {
		this.failSnDetailList = failSnDetailList;
	}
	public List<FailSnDetail> getFailSnDetailList( ) {
		return this.failSnDetailList;
	}

	public void setFlowNo(String flowNo) {
		this.flowNo = flowNo;
	}
	public String getFlowNo( ) {
		return this.flowNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
