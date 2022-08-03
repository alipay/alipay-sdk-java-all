package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.bind.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-20 17:51:48
 */
public class AntMerchantExpandIndirectBindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3781537891158946559L;

	/** 
	 * 商户ID
若传入smid返回。为空表示没有
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * smid列表
若传入partner_id返回。为空表示没有
	 */
	@ApiListField("smid")
	@ApiField("string")
	private List<String> smid;

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setSmid(List<String> smid) {
		this.smid = smid;
	}
	public List<String> getSmid( ) {
		return this.smid;
	}

}
