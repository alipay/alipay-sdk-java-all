package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsSubOrderEmploymentDigest;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.employment.groupbatch.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:01:56
 */
public class AlipayInsSceneEmploymentGroupbatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1528134378384855856L;

	/** 
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 批次单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 子订单信息列表
	 */
	@ApiListField("sub_order_info_list")
	@ApiField("ins_sub_order_employment_digest")
	private List<InsSubOrderEmploymentDigest> subOrderInfoList;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
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

	public void setSubOrderInfoList(List<InsSubOrderEmploymentDigest> subOrderInfoList) {
		this.subOrderInfoList = subOrderInfoList;
	}
	public List<InsSubOrderEmploymentDigest> getSubOrderInfoList( ) {
		return this.subOrderInfoList;
	}

}
