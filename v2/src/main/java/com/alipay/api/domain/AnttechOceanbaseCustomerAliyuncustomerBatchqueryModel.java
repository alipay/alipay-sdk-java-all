package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询阿里云客户信息
 *
 * @author auto create
 * @since 1.0, 2025-04-21 09:59:47
 */
public class AnttechOceanbaseCustomerAliyuncustomerBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7414593219512351524L;

	/**
	 * 阿里云用户id列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public List<String> getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
