package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包查询余额接口
 *
 * @author auto create
 * @since 1.0, 2024-04-15 11:54:32
 */
public class AlipayCloudFundWalletConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1363234817766184524L;

	/**
	 * 查询不同场景信息
WALLET_INFO：查用户钱包
	 */
	@ApiField("search_type")
	private String searchType;

	/**
	 * user_wallet_id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public String getSearchType() {
		return this.searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
