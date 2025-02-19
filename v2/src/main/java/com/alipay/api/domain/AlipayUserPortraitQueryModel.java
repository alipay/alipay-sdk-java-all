package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询支付宝用户简要信息
 *
 * @author auto create
 * @since 1.0, 2018-11-22 16:51:57
 */
public class AlipayUserPortraitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8337964533327271542L;

	/**
	 * 1688端传递havanaId的列表过来，单次传递不超过2个
	 */
	@ApiListField("havana_id")
	@ApiField("string")
	private List<String> havanaId;

	public List<String> getHavanaId() {
		return this.havanaId;
	}
	public void setHavanaId(List<String> havanaId) {
		this.havanaId = havanaId;
	}

}
