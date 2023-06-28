package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsGroupOrderBatchDigest;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.common.grouporder.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:26:50
 */
public class AlipayInsSceneCommonGrouporderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4544777938149991325L;

	/** 
	 * 批次信息列表
	 */
	@ApiListField("batch_info_list")
	@ApiField("ins_group_order_batch_digest")
	private List<InsGroupOrderBatchDigest> batchInfoList;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 子单数量
	 */
	@ApiField("sub_order_count")
	private Long subOrderCount;

	/** 
	 * 总保费
	 */
	@ApiField("summary_order_premium")
	private Long summaryOrderPremium;

	public void setBatchInfoList(List<InsGroupOrderBatchDigest> batchInfoList) {
		this.batchInfoList = batchInfoList;
	}
	public List<InsGroupOrderBatchDigest> getBatchInfoList( ) {
		return this.batchInfoList;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setSubOrderCount(Long subOrderCount) {
		this.subOrderCount = subOrderCount;
	}
	public Long getSubOrderCount( ) {
		return this.subOrderCount;
	}

	public void setSummaryOrderPremium(Long summaryOrderPremium) {
		this.summaryOrderPremium = summaryOrderPremium;
	}
	public Long getSummaryOrderPremium( ) {
		return this.summaryOrderPremium;
	}

}
