package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishSpecGroup;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.specgroup.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:26
 */
public class KoubeiCateringDishSpecgroupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4522116478934617693L;

	/** 
	 * 商户的在接入蚂蚁开放平台的user_id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 规格标签信息
	 */
	@ApiListField("spec_group_list")
	@ApiField("kbdish_spec_group")
	private List<KbdishSpecGroup> specGroupList;

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setSpecGroupList(List<KbdishSpecGroup> specGroupList) {
		this.specGroupList = specGroupList;
	}
	public List<KbdishSpecGroup> getSpecGroupList( ) {
		return this.specGroupList;
	}

}
