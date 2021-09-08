package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝脱敏登录名查询接口
 *
 * @author auto create
 * @since 1.0, 2019-01-26 16:32:49
 */
public class AlipayUserLogonidMaskedQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4244995126579875581L;

	/**
	 * 蚂蚁统一会员ID，不可为空，一次最多传10个
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
