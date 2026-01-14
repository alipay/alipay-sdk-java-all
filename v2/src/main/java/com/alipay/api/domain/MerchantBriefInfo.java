package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用于服务商app查询营销内容
 *
 * @author auto create
 * @since 1.0, 2025-09-08 10:22:26
 */
public class MerchantBriefInfo extends AlipayObject {

	private static final long serialVersionUID = 6849522273872527746L;

	/**
	 * 支付宝的商户号列表
	 */
	@ApiListField("merchant_list")
	@ApiField("alipay_merchant_info")
	private List<AlipayMerchantInfo> merchantList;

	/**
	 * 服务商侧商户编号
	 */
	@ApiField("out_merchant_no")
	private String outMerchantNo;

	/**
	 * 设备绑定关系对列表，有设备时必传
	 */
	@ApiListField("sn_bind_pair_list")
	@ApiField("device_relation_pair")
	private List<DeviceRelationPair> snBindPairList;

	public List<AlipayMerchantInfo> getMerchantList() {
		return this.merchantList;
	}
	public void setMerchantList(List<AlipayMerchantInfo> merchantList) {
		this.merchantList = merchantList;
	}

	public String getOutMerchantNo() {
		return this.outMerchantNo;
	}
	public void setOutMerchantNo(String outMerchantNo) {
		this.outMerchantNo = outMerchantNo;
	}

	public List<DeviceRelationPair> getSnBindPairList() {
		return this.snBindPairList;
	}
	public void setSnBindPairList(List<DeviceRelationPair> snBindPairList) {
		this.snBindPairList = snBindPairList;
	}

}
