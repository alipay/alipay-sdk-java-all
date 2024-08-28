package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsSubOrderEmploymentDigest;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.common.groupendorse.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-25 16:36:54
 */
public class AlipayInsSceneCommonGroupendorseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5625599188718945572L;

	/** 
	 * 子批单的实付保费;单位分
	 */
	@ApiField("endorse_fee")
	private Long endorseFee;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 主批单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 子单数量
	 */
	@ApiField("sub_order_count")
	private Long subOrderCount;

	/** 
	 * 子单列表
	 */
	@ApiListField("sub_order_info_list")
	@ApiField("ins_sub_order_employment_digest")
	private List<InsSubOrderEmploymentDigest> subOrderInfoList;

	/** 
	 * 主批单号
	 */
	@ApiField("summary_endorse_order_no")
	private String summaryEndorseOrderNo;

	/** 
	 * 总保费;单位分
	 */
	@ApiField("summary_premium")
	private Long summaryPremium;

	public void setEndorseFee(Long endorseFee) {
		this.endorseFee = endorseFee;
	}
	public Long getEndorseFee( ) {
		return this.endorseFee;
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

	public void setSubOrderCount(Long subOrderCount) {
		this.subOrderCount = subOrderCount;
	}
	public Long getSubOrderCount( ) {
		return this.subOrderCount;
	}

	public void setSubOrderInfoList(List<InsSubOrderEmploymentDigest> subOrderInfoList) {
		this.subOrderInfoList = subOrderInfoList;
	}
	public List<InsSubOrderEmploymentDigest> getSubOrderInfoList( ) {
		return this.subOrderInfoList;
	}

	public void setSummaryEndorseOrderNo(String summaryEndorseOrderNo) {
		this.summaryEndorseOrderNo = summaryEndorseOrderNo;
	}
	public String getSummaryEndorseOrderNo( ) {
		return this.summaryEndorseOrderNo;
	}

	public void setSummaryPremium(Long summaryPremium) {
		this.summaryPremium = summaryPremium;
	}
	public Long getSummaryPremium( ) {
		return this.summaryPremium;
	}

}
