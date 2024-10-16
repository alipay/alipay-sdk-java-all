package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 封闭场景云端结果验证
 *
 * @author auto create
 * @since 1.0, 2022-12-28 19:25:15
 */
public class ZolozAuthenticationCustomerFtokenConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4587468161234714812L;

	/**
	 * ftoken信息
	 */
	@ApiListField("ftokens")
	@ApiField("ftoken_info_query")
	private List<FtokenInfoQuery> ftokens;

	public List<FtokenInfoQuery> getFtokens() {
		return this.ftokens;
	}
	public void setFtokens(List<FtokenInfoQuery> ftokens) {
		this.ftokens = ftokens;
	}

}
