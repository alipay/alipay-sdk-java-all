package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户关系解绑
 *
 * @author auto create
 * @since 1.0, 2025-03-13 10:37:29
 */
public class AlipayTradeSettleDistributionrelationUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 6372555687355965536L;

	/**
	 * 外部请求号，幂等字段
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 需要解绑的商户关系列表
	 */
	@ApiListField("receiver_list")
	@ApiField("merchant_relation_entity")
	private List<MerchantRelationEntity> receiverList;

	/**
	 * 场景，目前只支持consignment
	 */
	@ApiField("scene")
	private String scene;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public List<MerchantRelationEntity> getReceiverList() {
		return this.receiverList;
	}
	public void setReceiverList(List<MerchantRelationEntity> receiverList) {
		this.receiverList = receiverList;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
