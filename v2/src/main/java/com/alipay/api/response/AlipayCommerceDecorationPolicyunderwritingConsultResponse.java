package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.decoration.policyunderwriting.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-16 14:17:40
 */
public class AlipayCommerceDecorationPolicyunderwritingConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1836244965645371447L;

	/** 
	 * 消息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 订单号，处理成功时必传
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 保障截止日期
格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("policy_end_date")
	private Date policyEndDate;

	/** 
	 * 保障生效日期
格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("policy_start_date")
	private Date policyStartDate;

	/** 
	 * 保单状态 PENDING-核保受理 
UNDERWRITING_SUCCESS-核保成功 UNDERWRITING_FAILURE-核保失败 POLICY_ISSUED_SUCCESS-承保成功 POLICY_ISSUED_FAILURE-承保失败
	 */
	@ApiField("policy_status")
	private String policyStatus;

	/** 
	 * 应付保费，单位为分
	 */
	@ApiField("premium")
	private Long premium;

	/** 
	 * 子订单列表
	 */
	@ApiListField("sub_order_no_list")
	@ApiField("sub_order_v_o")
	private List<SubOrderVO> subOrderNoList;

	/** 
	 * 总保费，单位:分
	 */
	@ApiField("total_premium")
	private Long totalPremium;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setPolicyEndDate(Date policyEndDate) {
		this.policyEndDate = policyEndDate;
	}
	public Date getPolicyEndDate( ) {
		return this.policyEndDate;
	}

	public void setPolicyStartDate(Date policyStartDate) {
		this.policyStartDate = policyStartDate;
	}
	public Date getPolicyStartDate( ) {
		return this.policyStartDate;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public String getPolicyStatus( ) {
		return this.policyStatus;
	}

	public void setPremium(Long premium) {
		this.premium = premium;
	}
	public Long getPremium( ) {
		return this.premium;
	}

	public void setSubOrderNoList(List<SubOrderVO> subOrderNoList) {
		this.subOrderNoList = subOrderNoList;
	}
	public List<SubOrderVO> getSubOrderNoList( ) {
		return this.subOrderNoList;
	}

	public void setTotalPremium(Long totalPremium) {
		this.totalPremium = totalPremium;
	}
	public Long getTotalPremium( ) {
		return this.totalPremium;
	}

}
