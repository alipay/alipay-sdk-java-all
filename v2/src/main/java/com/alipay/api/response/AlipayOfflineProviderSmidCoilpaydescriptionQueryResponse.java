package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.smid.coilpaydescription.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-26 17:19:01
 */
public class AlipayOfflineProviderSmidCoilpaydescriptionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3697985587178814688L;

	/** 
	 * 商家间连小蓝环交易情况的概括性描述，用于作业人员判断当前作业商户是否已经产生小蓝环交易。
	 */
	@ApiField("merchant_coil_pay_description")
	private String merchantCoilPayDescription;

	/** 
	 * 支付宝间连商户smid，值同接口传入的sub_merchant_id
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public void setMerchantCoilPayDescription(String merchantCoilPayDescription) {
		this.merchantCoilPayDescription = merchantCoilPayDescription;
	}
	public String getMerchantCoilPayDescription( ) {
		return this.merchantCoilPayDescription;
	}

	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}
	public String getSubMerchantId( ) {
		return this.subMerchantId;
	}

}
