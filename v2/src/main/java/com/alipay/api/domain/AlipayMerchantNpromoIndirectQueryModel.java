package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家营销内容咨询接口
 *
 * @author auto create
 * @since 1.0, 2025-09-12 19:53:11
 */
public class AlipayMerchantNpromoIndirectQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5541542334966556772L;

	/**
	 * 当前登录用户对应的服务商商户号，可能有多个
	 */
	@ApiListField("merchant_brief_list")
	@ApiField("merchant_brief_info")
	private List<MerchantBriefInfo> merchantBriefList;

	public List<MerchantBriefInfo> getMerchantBriefList() {
		return this.merchantBriefList;
	}
	public void setMerchantBriefList(List<MerchantBriefInfo> merchantBriefList) {
		this.merchantBriefList = merchantBriefList;
	}

}
