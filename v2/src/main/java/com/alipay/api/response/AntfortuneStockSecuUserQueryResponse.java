package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SecuUserList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.secu.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-27 10:57:40
 */
public class AntfortuneStockSecuUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4299884412289139576L;

	/** 
	 * 用户证券签约协议号、昵称、头像地址和投资宣言信息组成的对象数组
	 */
	@ApiListField("secu_user_list")
	@ApiField("secu_user_list")
	private List<SecuUserList> secuUserList;

	public void setSecuUserList(List<SecuUserList> secuUserList) {
		this.secuUserList = secuUserList;
	}
	public List<SecuUserList> getSecuUserList( ) {
		return this.secuUserList;
	}

}
