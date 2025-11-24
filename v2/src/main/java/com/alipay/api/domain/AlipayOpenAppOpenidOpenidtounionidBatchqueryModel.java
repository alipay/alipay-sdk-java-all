package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据应用openid批量获取同一应用分组下的unionid
 *
 * @author auto create
 * @since 1.0, 2024-05-27 11:42:47
 */
public class AlipayOpenAppOpenidOpenidtounionidBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6719486317491238715L;

	/**
	 * 待查询转换的openid列表
	 */
	@ApiListField("open_id_list")
	@ApiField("string")
	private List<String> openIdList;

	public List<String> getOpenIdList() {
		return this.openIdList;
	}
	public void setOpenIdList(List<String> openIdList) {
		this.openIdList = openIdList;
	}

}
