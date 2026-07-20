package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改店铺结算信息
 *
 * @author auto create
 * @since 1.0, 2026-06-26 21:15:54
 */
public class AntMerchantExpandAstoreModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4556153443214469921L;

	/**
	 * 商家在支付宝平台内创建的一种营销业务的载体，可以支持发品、配券以及活动报名的id,它的来源是SAAS服务商来进件的时候,创建团购店铺的时候,生成的。
	 */
	@ApiField("a_store_id")
	private String aStoreId;

	/**
	 * 联系手机号(示例值是示范,正常填写不需要掩码)
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 异名结算的证明材料
	 */
	@ApiField("proof_info")
	private ProofInfo proofInfo;

	/**
	 * 结算信息
	 */
	@ApiField("settle_infos")
	private SettleInfoModel settleInfos;

	public String getaStoreId() {
		return this.aStoreId;
	}
	public void setaStoreId(String aStoreId) {
		this.aStoreId = aStoreId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public ProofInfo getProofInfo() {
		return this.proofInfo;
	}
	public void setProofInfo(ProofInfo proofInfo) {
		this.proofInfo = proofInfo;
	}

	public SettleInfoModel getSettleInfos() {
		return this.settleInfos;
	}
	public void setSettleInfos(SettleInfoModel settleInfos) {
		this.settleInfos = settleInfos;
	}

}
