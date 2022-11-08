package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.gift.contract.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-20 10:58:34
 */
public class AlipayInsMarketingGiftContractApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3152349738353269161L;

	/** 
	 * 合约编号，上游业务传入，原样返回
	 */
	@ApiField("contract_no")
	private String contractNo;

	/** 
	 * 保单止期
	 */
	@ApiField("effect_end_time")
	private Date effectEndTime;

	/** 
	 * 保单起期
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/** 
	 * 赠险产品码
	 */
	@ApiField("gift_prod_code")
	private String giftProdCode;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 蚂蚁保保险单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 赠险产品码
	 */
	@ApiField("right_no")
	private String rightNo;

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getContractNo( ) {
		return this.contractNo;
	}

	public void setEffectEndTime(Date effectEndTime) {
		this.effectEndTime = effectEndTime;
	}
	public Date getEffectEndTime( ) {
		return this.effectEndTime;
	}

	public void setEffectStartTime(Date effectStartTime) {
		this.effectStartTime = effectStartTime;
	}
	public Date getEffectStartTime( ) {
		return this.effectStartTime;
	}

	public void setGiftProdCode(String giftProdCode) {
		this.giftProdCode = giftProdCode;
	}
	public String getGiftProdCode( ) {
		return this.giftProdCode;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

	public void setRightNo(String rightNo) {
		this.rightNo = rightNo;
	}
	public String getRightNo( ) {
		return this.rightNo;
	}

}
