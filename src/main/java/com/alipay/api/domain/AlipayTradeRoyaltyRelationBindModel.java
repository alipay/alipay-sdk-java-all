package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分账关系绑定
 *
 * @author auto create
 * @since 1.0, 2021-09-26 17:05:29
 */
public class AlipayTradeRoyaltyRelationBindModel extends AlipayObject {

	private static final long serialVersionUID = 8472726927668191335L;

	/**
	 * 外部请求号，由商家自定义。32个字符以内，仅可包含字母、数字、下划线。需保证在商户端不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 分账接收方列表，单次传入最多20个
	 */
	@ApiListField("receiver_list")
	@ApiField("royalty_entity")
	private List<RoyaltyEntity> receiverList;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public List<RoyaltyEntity> getReceiverList() {
		return this.receiverList;
	}
	public void setReceiverList(List<RoyaltyEntity> receiverList) {
		this.receiverList = receiverList;
	}

}
