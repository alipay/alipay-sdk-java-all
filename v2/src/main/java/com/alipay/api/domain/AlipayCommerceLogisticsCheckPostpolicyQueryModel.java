package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流驿站小程序激励政策验收接口
 *
 * @author auto create
 * @since 1.0, 2023-07-07 11:32:50
 */
public class AlipayCommerceLogisticsCheckPostpolicyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6652856189671627482L;

	/**
	 * app_id_list是名下需要验收的小程序id列表，可从O站获取
	 */
	@ApiListField("app_id_list")
	@ApiField("string")
	private List<String> appIdList;

	public List<String> getAppIdList() {
		return this.appIdList;
	}
	public void setAppIdList(List<String> appIdList) {
		this.appIdList = appIdList;
	}

}
