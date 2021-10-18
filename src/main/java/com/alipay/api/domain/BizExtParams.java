package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户业务信息生效回执给花芝时，带入的相关业务参数
 *
 * @author auto create
 * @since 1.0, 2020-01-01 21:08:16
 */
public class BizExtParams extends AlipayObject {

	private static final long serialVersionUID = 2383991285526381432L;

	/**
	 * 拼团场景下，所有参团人userid列表
	 */
	@ApiListField("groupon_partners")
	@ApiField("string")
	private List<String> grouponPartners;

	public List<String> getGrouponPartners() {
		return this.grouponPartners;
	}
	public void setGrouponPartners(List<String> grouponPartners) {
		this.grouponPartners = grouponPartners;
	}

}
