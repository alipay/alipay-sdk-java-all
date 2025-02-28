package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户mcc信息查询
 *
 * @author auto create
 * @since 1.0, 2022-12-18 22:17:10
 */
public class AntMerchantExpandMccQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1245976555473145778L;

	/**
	 * 传入需要查询的code列表，以英文逗号分隔
	 */
	@ApiField("mcc_code_list")
	private String mccCodeList;

	public String getMccCodeList() {
		return this.mccCodeList;
	}
	public void setMccCodeList(String mccCodeList) {
		this.mccCodeList = mccCodeList;
	}

}
