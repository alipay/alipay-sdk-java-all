package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * NFC链接查询码值信息
 *
 * @author auto create
 * @since 1.0, 2026-08-13 13:56:51
 */
public class AntMerchantExpandNfcInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5547353522967476959L;

	/**
	 * NFC链接URL列表
	 */
	@ApiListField("nfc_url_list")
	@ApiField("string")
	private List<String> nfcUrlList;

	public List<String> getNfcUrlList() {
		return this.nfcUrlList;
	}
	public void setNfcUrlList(List<String> nfcUrlList) {
		this.nfcUrlList = nfcUrlList;
	}

}
