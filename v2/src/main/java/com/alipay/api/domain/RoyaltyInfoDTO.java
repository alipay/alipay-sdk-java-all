package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账信息
 *
 * @author auto create
 * @since 1.0, 2023-03-06 17:54:02
 */
public class RoyaltyInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5532595637966465618L;

	/**
	 * 分账明细的信息，可以描述多条分账指令，json数组。
	 */
	@ApiField("royalty_detail_infos")
	private RoyaltyDetailInfoDTO royaltyDetailInfos;

	/**
	 * 分账类型 卖家的分账类型，目前只支持传入ROYALTY（普通分账类型）
	 */
	@ApiField("royalty_type")
	private String royaltyType;

	public RoyaltyDetailInfoDTO getRoyaltyDetailInfos() {
		return this.royaltyDetailInfos;
	}
	public void setRoyaltyDetailInfos(RoyaltyDetailInfoDTO royaltyDetailInfos) {
		this.royaltyDetailInfos = royaltyDetailInfos;
	}

	public String getRoyaltyType() {
		return this.royaltyType;
	}
	public void setRoyaltyType(String royaltyType) {
		this.royaltyType = royaltyType;
	}

}
