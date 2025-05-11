package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campus.paymentactivity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-20 19:28:44
 */
public class AlipayCommerceEducateCampusPaymentactivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6887592659317454336L;

	/** 
	 * 银行机构id列表
	 */
	@ApiListField("inst_id_list")
	@ApiField("string")
	private List<String> instIdList;

	/** 
	 * 是否报名校园支付银行优惠活动
	 */
	@ApiField("sign_up")
	private Boolean signUp;

	public void setInstIdList(List<String> instIdList) {
		this.instIdList = instIdList;
	}
	public List<String> getInstIdList( ) {
		return this.instIdList;
	}

	public void setSignUp(Boolean signUp) {
		this.signUp = signUp;
	}
	public Boolean getSignUp( ) {
		return this.signUp;
	}

}
