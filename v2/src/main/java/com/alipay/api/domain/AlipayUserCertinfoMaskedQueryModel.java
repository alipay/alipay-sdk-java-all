package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝用户脱敏姓名查询接口
 *
 * @author auto create
 * @since 1.0, 2019-01-26 16:33:40
 */
public class AlipayUserCertinfoMaskedQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6713755934174187224L;

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
