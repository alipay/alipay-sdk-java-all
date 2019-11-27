package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BenefitGoods;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.benefit.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPcreditHuabeiBenefitItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5418251664869549253L;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 权益商品信息列表
	 */
	@ApiListField("benefit_list")
	@ApiField("benefit_goods")
	private List<BenefitGoods> benefitList;

	/** 
	 * 商户侧唯一请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setBenefitList(List<BenefitGoods> benefitList) {
		this.benefitList = benefitList;
	}
	public List<BenefitGoods> getBenefitList( ) {
		return this.benefitList;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
