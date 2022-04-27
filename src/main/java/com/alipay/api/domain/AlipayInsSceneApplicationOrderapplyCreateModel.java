package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单信息同步创建存储
 *
 * @author auto create
 * @since 1.0, 2022-03-08 13:30:28
 */
public class AlipayInsSceneApplicationOrderapplyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2481487935624369564L;

	/**
	 * 业务字段
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 赔付政策类型
	 */
	@ApiListField("claim_strategy_list")
	@ApiField("claim_strategy")
	private List<ClaimStrategy> claimStrategyList;

	/**
	 * havana_id
	 */
	@ApiField("havana_id")
	private String havanaId;

	/**
	 * 订单信息
	 */
	@ApiField("order_info")
	private InsOrderInfo orderInfo;

	/**
	 * 外部业务号(幂等单号)
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 产品号
	 */
	@ApiField("prod_code")
	private String prodCode;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public List<ClaimStrategy> getClaimStrategyList() {
		return this.claimStrategyList;
	}
	public void setClaimStrategyList(List<ClaimStrategy> claimStrategyList) {
		this.claimStrategyList = claimStrategyList;
	}

	public String getHavanaId() {
		return this.havanaId;
	}
	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}

	public InsOrderInfo getOrderInfo() {
		return this.orderInfo;
	}
	public void setOrderInfo(InsOrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}
